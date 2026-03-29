package test;

import javax.swing.*;
import java.io.*;

public class SimpleBrowser {

    public static void main(String[] args) throws Exception {

        JFrame frame = new JFrame("Mini Browser");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JEditorPane editor = new JEditorPane();
        editor.setEditable(false);

        // Load HTML file
        File file = new File("public_html", "index.html");
        System.out.println("File: " + file);
        editor.setPage(file.toURI().toURL());

        JScrollPane scroll = new JScrollPane(editor);
        frame.add(scroll);

        frame.setVisible(true);
    }
}
