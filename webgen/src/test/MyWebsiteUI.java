package test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyWebsiteUI {

    public static void main(String[] args) {

        // Frame utama (window)
        JFrame frame = new JFrame("My Website UI");
        frame.setSize(800, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // ===== HEADER =====
        JLabel header = new JLabel("My Website", JLabel.CENTER);
        header.setFont(new Font("Arial", Font.BOLD, 24));
        header.setOpaque(true);
        header.setBackground(Color.DARK_GRAY);
        header.setForeground(Color.WHITE);
        header.setPreferredSize(new Dimension(800, 60));
        frame.add(header, BorderLayout.NORTH);

        // ===== SIDEBAR =====
        JPanel sidebar = new JPanel();
        sidebar.setLayout(new GridLayout(5, 1));
        sidebar.setBackground(Color.LIGHT_GRAY);

        String[] menu = {"Home", "Profile", "Settings", "About", "Logout"};

        for (String item : menu) {
            JButton btn = new JButton(item);
            sidebar.add(btn);
        }

        frame.add(sidebar, BorderLayout.WEST);

        // ===== CONTENT =====
        JPanel content = new JPanel();
        content.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        JLabel label = new JLabel("Masukkan Nama:");
        JTextField textField = new JTextField(15);
        JButton submitBtn = new JButton("Submit");

        gbc.gridx = 0;
        gbc.gridy = 0;
        content.add(label, gbc);

        gbc.gridx = 1;
        content.add(textField, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        content.add(submitBtn, gbc);

        // Action button
        submitBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = textField.getText();
                JOptionPane.showMessageDialog(frame, "Hello " + name);
            }
        });

        frame.add(content, BorderLayout.CENTER);

        // ===== FOOTER =====
        JLabel footer = new JLabel("© 2026 My App", JLabel.CENTER);
        footer.setPreferredSize(new Dimension(800, 40));
        footer.setOpaque(true);
        footer.setBackground(Color.GRAY);
        footer.setForeground(Color.WHITE);

        frame.add(footer, BorderLayout.SOUTH);

        // Show
        frame.setVisible(true);
    }
}
