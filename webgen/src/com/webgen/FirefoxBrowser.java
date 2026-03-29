package com.webgen;

import java.awt.*;
import java.net.URI;

public class FirefoxBrowser extends Browser {

    public FirefoxBrowser() {
        super();
    }

    public FirefoxBrowser(String folder) {
        super(folder);
    }

    @Override
    public void open(String url) {
        try {
            if (isWindows()) Runtime.getRuntime().exec(new String[] {"cmd", "/c", "start", "chrome", url});
            else if (isLinux()) Runtime.getRuntime().exec(new String[] {"google-chrome", url});
            else if (isMac()) Runtime.getRuntime().exec(new String[] {"open", "-a", "Google Chrome", url});
            else throw new Exception("OS tidak dikenali");
        } catch (Exception e) {
            try {
                if (Desktop.isDesktopSupported()) {
                    Desktop.getDesktop().browse(new URI(url));
                }
            } catch (Exception ex) {
            }
        }
    }

}
