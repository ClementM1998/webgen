package com.webgen;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.nio.file.*;

public class UIBrowser extends Browser {
    private JFrame frame;
    private JEditorPane editor;
    private String rootFolder;
    private String currentURL;

    public UIBrowser() {
        super();
        this.rootFolder = getRootFolder();
        initUI();
        startFileWatcher();
    }

    public UIBrowser(String folder) {
        super(folder);
        this.rootFolder = getRootFolder();
        initUI();
        startFileWatcher();
    }

    @Override
    public void open(String url) {
        this.currentURL = url;
        loadPage(url);
    }

    private void loadPage(String url) {
        SwingUtilities.invokeLater(() -> {
            try {
                String fullURL = url;
                if (!url.startsWith("file:")) {
                    fullURL += (url.contains("?") ? "&" : "?") + "reload=" + System.currentTimeMillis();
                }
                editor.setPage(new URL(fullURL));
            } catch (IOException e) {
                editor.setText("<h1>Error loading page: " + url + "</h1>");
            }
        });
    }

    private void initUI() {
        frame = new JFrame("WebGen UI Browser");
        frame.setSize(1000, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        editor = new JEditorPane();
        editor.setEditable(false);
        editor.setContentType("text/html");

        JScrollPane scroll = new JScrollPane(editor);
        frame.add(scroll, BorderLayout.CENTER);
        frame.setVisible(true);
    }

    private void startFileWatcher() {
        Thread watcherThread = new Thread(() -> {
            try {
                WatchService watchService = FileSystems.getDefault().newWatchService();
                Path rootPath = Paths.get(rootFolder);
                registerAll(rootPath, watchService);

                while (true) {
                    WatchKey key = watchService.take();
                    boolean changedRelevantFile = false;
                    for (WatchEvent<?> event : key.pollEvents()) {
                        Path changed = rootPath.resolve((Path) event.context());
                        String fileName = changed.toString().toLowerCase();
                        if (fileName.endsWith(".html") || fileName.endsWith(".css") || fileName.endsWith(".js")) {
                            System.out.println("File changed: " + fileName + " -> Reloading...");
                            changedRelevantFile = true;
                        }
                    }
                    if (changedRelevantFile && currentURL != null) {
                        loadPage(currentURL);
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
