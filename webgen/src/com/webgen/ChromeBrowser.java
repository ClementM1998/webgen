package com.webgen;

import java.awt.*;
import java.io.File;
import java.net.URI;

public class ChromeBrowser extends Browser {
    private Process chromeProcess; // simpan process Chrome

    public ChromeBrowser() {
        super();
    }

    public ChromeBrowser(String folder) {
        super(folder);
    }

    @Override
    public void open(String url) {
        try {
            if (isWindows()) chromeProcess = Runtime.getRuntime().exec(new String[] {"cmd", "/c", "start", "chrome", url});
            else if (isLinux()) chromeProcess = Runtime.getRuntime().exec(new String[] {"google-chrome", url});
            else if (isMac()) chromeProcess = Runtime.getRuntime().exec(new String[] {"open", "-a", "Google Chrome", url});
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
