package com.webgen;

import com.webgen.css.Style;
import com.webgen.css.StyleFile;
import com.webgen.html.HtmlFile;
import com.webgen.js.Script;
import com.webgen.js.ScriptFile;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public abstract class Browser {
    //private String directory = System.getProperty("user.home");
    private String directory = System.getProperty("user.dir");
    private String rootFolder = "public_html";

    public Browser() { // default root folder: public_html
    }

    public Browser(String folder) {
        this.rootFolder = folder;
    }

    public Browser(String directory, String folder) {
        this.directory = directory;
        this.rootFolder = folder;
    }

    public abstract void open(String url);

    public String getRootFolder() {
        File file = new File(directory, rootFolder);
        if (!file.exists()) file.mkdir();
        createIndexHTML(file);
        return file.getAbsolutePath();
    }

    private String getOS() {
        return System.getProperty("os.name").toLowerCase();
    }

    public boolean isWindows() {
        return getOS().contains("win");
    }

    public boolean isLinux() {
        return getOS().contains("nix") || getOS().contains("nux");
    }

    public boolean isMac() {
        return getOS().contains("mac");
    }

    private void createIndexHTML(File dir) {
        String index = "index.html";
        File file = new File(dir, index);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {}
        }
    }

    public void createHtml(HtmlFile html) {
        createHtml("index.html", html);
    }

    public void createHtml(String name, HtmlFile html) {
        createHtml(getRootFolder(), name, html);
    }

    public void createHtml(String path, String name, HtmlFile html) {
        File file = new File(path, name);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {}
        }
        try {
            FileWriter writer = new FileWriter(file);
            String text = "";
            for (String line : html.getArrays()) {
                text += line + '\n';
            }
            writer.write(text);
            writer.close();
        } catch (IOException e) {}
    }

    public void createStyle(StyleFile style) {
        createStyle("index.css", style);
    }

    public void createStyle(String name, StyleFile style) {
        createStyle(getRootFolder(), name, style);
    }

    public void createStyle(String path, String name, StyleFile style) {
        File file = new File(path, name);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {}
        }
        try {
            FileWriter writer = new FileWriter(file);
            StringBuilder sb = new StringBuilder();
            for (Style s : style.getStyle().getStyles()) {
                sb.append(s.selector()).append(" {").append("\n");
                for (String p : s.propertyValues()) {
                    if (!p.endsWith(";")) p = p + ";";
                    sb.append("    " + p).append("\n");
                }
                sb.append("}").append("\n").append("\n");
            }
            String text = sb.toString();
            if (text.endsWith("\n")) text = text.substring(0, text.length()-1);
            writer.write(text);
            writer.close();
        } catch (IOException e) {}
    }

    public void createScript(ScriptFile script) {
        createScript("index.js", script);
    }

    public void createScript(String name, ScriptFile script) {
        createScript(getRootFolder(), name, script);
    }

    public void createScript(String path, String name, ScriptFile script) {
        File file = new File(path, name);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {}
        }
        try {
            FileWriter writer = new FileWriter(file);
            StringBuilder sb = new StringBuilder();
            for (Script s : script.getScript().getScripts()) {
                if (s.functionName() != null) {
                    sb.append("\n");
                    sb.append("function ").append(s.functionName()).append(" {").append("\n");
                    for (String stat : s.statements()) {
                        if (!stat.endsWith(";")) stat = stat + ";";
                        sb.append("    ").append(stat).append("\n");
                    }
                    sb.append("}").append("\n");
                } else {
                    sb.append("\n");
                    sb.append(s.statement());
                }
            }
            String text = sb.toString();
            if (text.endsWith("\n")) text = text.substring(0, text.length()-1);
            writer.write(text);
            writer.close();
        } catch (IOException e) {}
    }

    public void createFile(String name, TextLiteral text) {
        createFile(getRootFolder(), name, text);
    }

    public void createFile(String path, String name, TextLiteral text) {
        File file = new File(path, name);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {}
        }
    }

}
