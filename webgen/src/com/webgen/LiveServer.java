package com.webgen;

import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;

import java.io.*;
import java.net.InetSocketAddress;
import java.nio.file.*;
import java.util.concurrent.Executors;

public class LiveServer {
    private int port;
    private String rootDir;
    private volatile boolean hasChanged = false;

    public LiveServer(int port, String rootDir) {
        this.port = port;
        this.rootDir = rootDir;
    }

    public void start() throws Exception {
        startHttpServer();
        startFileWatcher();
        System.out.println("LiveServer jalan: http://localhost:" + port);
    }

    private void startHttpServer() throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(port), 0);
        server.createContext("/", new HttpHandler() {
            @Override
            public void handle(HttpExchange exchange) throws IOException {
                String path = exchange.getRequestURI().getPath();
                if (path.equals("/")) path = "/index.html";

                File file = new File(rootDir + path);
                if (!file.exists()) {
                    String response = "404 Not Found";
                    exchange.sendResponseHeaders(404, response.length());
                    exchange.getResponseBody().write(response.getBytes());
                    exchange.close();
                    return;
                }

                byte[] bytes = Files.readAllBytes(file.toPath());
                if (path.endsWith(".html")) {
                    String html = new String(bytes);
                    String script =
                            "<script>" +
                                    "setInterval(() => {" +
                                    "  fetch('/reload')" +
                                    "  .then(r => r.text())" +
                                    "  .then(f => {" +
                                    "    if (f === 'reload') location.reload();" +
                                    "  });" +
                                    "}, 1000);" +
                            "</script>";
                    html = html.replace("</body>", script + "</body>");
                    bytes = html.getBytes();
                }

                exchange.sendResponseHeaders(200, bytes.length);
                exchange.getResponseBody().write(bytes);
                exchange.getResponseBody().close();
            }
        });

        server.createContext("/reload", exchange -> {
            String response = hasChanged ? "reload" : "ok";
            hasChanged = false;
            exchange.sendResponseHeaders(200, response.length());
            exchange.getResponseBody().write(response.getBytes());
            exchange.close();
        });

        server.setExecutor(Executors.newCachedThreadPool());
        server.start();
    }

    private void startFileWatcher() {
        Thread watcherThread = new Thread(() -> {
            try {
                WatchService watchService = FileSystems.getDefault().newWatchService();
                Path rootPath = Paths.get(rootDir);
                registerAll(rootPath, watchService);
                while (true) {
                    WatchKey key = watchService.take();
                    for (WatchEvent<?> event : key.pollEvents()) {
                        Path changed = (Path) event.context();
                        String fileName = changed.toString();
                        if (fileName.endsWith(".html") ||
                            fileName.endsWith(".css") ||
                            fileName.endsWith(".js")) {
                            System.out.println("Reload: " + fileName);
                            hasChanged = true;
                        }
                    }
                    key.reset();
                }
            } catch (Exception e) {}
        });
        watcherThread.setDaemon(true);
        watcherThread.start();
    }

    private void registerAll(Path start, WatchService watchService) throws IOException {
        Files.walk(start)
                .filter(Files::isDirectory)
                .forEach(path -> {
                    try {
                        path.register(
                                watchService,
                                StandardWatchEventKinds.ENTRY_MODIFY,
                                StandardWatchEventKinds.ENTRY_CREATE,
                                StandardWatchEventKinds.ENTRY_DELETE
                        );
                    } catch (IOException e) {}
                });
    }

}
