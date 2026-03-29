package com.webgen;

import java.awt.*;

public class WebGen {

    public static void launch(Browser browser) {
        int port = 5500;
        launch(browser, port);
    }

    public static void launch(Browser browser, int port) {
        try {
            String rootDir = browser.getRootFolder();

            LiveServer server = new LiveServer(port, rootDir);
            server.start();
            browser.open("http://localhost:" + port);
        } catch (Exception e) {
            System.out.println("Can't execute something wrong!");
        }
    }

}
