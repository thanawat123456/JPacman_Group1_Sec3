package nl.tudelft.jpacman.ui;

import nl.tudelft.jpacman.Launcher;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ThemeSelect extends JFrame {
    private JButton startButton;
    private JButton startButton2;
    private JButton startButton3;
    private JButton startButton4;

    public static int themeNo;

    public void setThemeNo(int themeNo){
        this.themeNo = themeNo;
    }
    public static int getThemeNo() {
        return themeNo;
    }

    public ThemeSelect() {
        super("Pacman Main Menu");

        // Set the layout manager for the frame
        setLayout(new BorderLayout());

        // Create a panel for the buttons
        JPanel buttonPanel = new JPanel(new GridLayout(2, 2, 10, 10));

        // Create the Theme Select title label
        JLabel titleLabel = new JLabel("Theme Selectttt", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        add(titleLabel, BorderLayout.NORTH);



        // Create the Start panel
        JPanel startPanel = new JPanel(new BorderLayout());

// Create the Start button
        ImageIcon classicIcon = new ImageIcon(getClass().getResource("/sprite/theme1.png"));
        Image img = classicIcon.getImage();
        Image newImg = img.getScaledInstance(200, 200, java.awt.Image.SCALE_SMOOTH);
        classicIcon = new ImageIcon(newImg);

        startButton = new JButton(classicIcon);
        startButton.setPreferredSize(new Dimension(100, 100));
        startButton.setMaximumSize(new Dimension(100, 100));
        startButton.setMinimumSize(new Dimension(100, 100));
        startButton.setBorderPainted(false);
        startButton.setFocusPainted(false);
        startButton.setContentAreaFilled(false);
        startButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ThemeSelect themeSelect = new ThemeSelect();
                themeSelect.setThemeNo(1);
                new Launcher().launch();
            }
        });

// Create the Start button label
        JLabel startLabel = new JLabel("Theme 1", startButton.CENTER);
        startLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        startPanel.add(startLabel, BorderLayout.SOUTH);

// Add the Start button and label to the Start panel
        startPanel.add(startButton, BorderLayout.CENTER);

// Add the Start panel to the button panel
        buttonPanel.add(startPanel);


        // Create the Start panel
        JPanel startPanel2 = new JPanel(new BorderLayout());
// Create the Start button
        ImageIcon classicIcon2 = new ImageIcon(getClass().getResource("/sprite/theme1.png"));
        Image img2 = classicIcon2.getImage();
        Image newImg2 = img2.getScaledInstance(200, 200, java.awt.Image.SCALE_SMOOTH);
        classicIcon2 = new ImageIcon(newImg2);

        startButton2 = new JButton(classicIcon2);
        startButton2.setPreferredSize(new Dimension(100, 100));
        startButton2.setMaximumSize(new Dimension(100, 100));
        startButton2.setMinimumSize(new Dimension(100, 100));
        startButton2.setBorderPainted(false);
        startButton2.setFocusPainted(false);
        startButton2.setContentAreaFilled(false);
        startButton2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        startButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setThemeNo(2);
                new Launcher().launch();
            }
        });

// Create the Start button label
        JLabel startLabel2 = new JLabel("Theme 2", startButton2.CENTER);
        startLabel2.setFont(new Font("Arial", Font.PLAIN, 14));
        startPanel2.add(startLabel2, BorderLayout.SOUTH);

// Add the Start button and label to the Start panel
        startPanel2.add(startButton2, BorderLayout.CENTER);

// Add the Start panel to the button panel
        buttonPanel.add(startPanel2);


//        // Create the Start panel
//        JPanel startPanel3 = new JPanel(new BorderLayout());
//// Create the Start button
//        ImageIcon classicIcon3 = new ImageIcon(getClass().getResource("/sprite/theme1.png"));
//        Image img3 = classicIcon3.getImage();
//        Image newImg3 = img3.getScaledInstance(200, 200, java.awt.Image.SCALE_SMOOTH);
//        classicIcon3 = new ImageIcon(newImg3);
//
//        JButton startButton3 = new JButton(classicIcon3);
//        startButton3.setPreferredSize(new Dimension(100, 100));
//        startButton3.setMaximumSize(new Dimension(100, 100));
//        startButton3.setMinimumSize(new Dimension(100, 100));
//        startButton3.setBorderPainted(false);
//        startButton3.setFocusPainted(false);
//        startButton3.setContentAreaFilled(false);
//        startButton3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
//        startButton3.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                // Code to start the game
//            }
//        });
//
//// Create the Start button label
//        JLabel startLabel3 = new JLabel("Click to Start", startButton3.CENTER);
//        startLabel3.add(startLabel3, BorderLayout.SOUTH);
//
//// Add the Start button and label to the Start panel
//        startPanel3.add(startButton3, BorderLayout.CENTER);
//
//// Add the Start panel to the button panel
//        buttonPanel.add(startPanel3);


        // Create the Theme 2 button
        JPanel startPanel3 = new JPanel(new BorderLayout());
        ImageIcon classicIcon3 = new ImageIcon(getClass().getResource("/sprite/theme1.png"));
        Image img3 = classicIcon3.getImage();
        Image newImg3 = img3.getScaledInstance(200, 200, java.awt.Image.SCALE_SMOOTH);
        classicIcon3 = new ImageIcon(newImg3);
        startButton3 = new JButton(classicIcon3);
        startButton3.setPreferredSize(new Dimension(100, 100));
        startButton3.setMaximumSize(new Dimension(100, 100));
        startButton3.setMinimumSize(new Dimension(100, 100));
        startButton3.setBorderPainted(false);
        startButton3.setFocusPainted(false);
        startButton3.setContentAreaFilled(false);
        startButton3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        startButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setThemeNo(3);
            }
        });
        buttonPanel.add(startButton3);

        // Add the button panel to the center of the frame
        add(buttonPanel, BorderLayout.CENTER);
        JLabel startLabel3 = new JLabel("Theme 3", startButton3.CENTER);
        startLabel3.setFont(new Font("Arial", Font.PLAIN, 14));
        startPanel3.add(startLabel3, BorderLayout.SOUTH);

// Add the Start button and label to the Start panel
        startPanel3.add(startButton3, BorderLayout.CENTER);

// Add the Start panel to the button panel
        buttonPanel.add(startPanel3);


        // Create the Theme 2 button
        JPanel startPanel4 = new JPanel(new BorderLayout());
        ImageIcon classicIcon4 = new ImageIcon(getClass().getResource("/sprite/theme1.png"));
        Image img4 = classicIcon4.getImage();
        Image newImg4 = img3.getScaledInstance(200, 200, java.awt.Image.SCALE_SMOOTH);
        classicIcon4 = new ImageIcon(newImg4);
        startButton4 = new JButton(classicIcon4);
        startButton4.setPreferredSize(new Dimension(100, 100));
        startButton4.setMaximumSize(new Dimension(100, 100));
        startButton4.setMinimumSize(new Dimension(100, 100));
        startButton4.setBorderPainted(false);
        startButton4.setFocusPainted(false);
        startButton4.setContentAreaFilled(false);
        startButton4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        startButton4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setThemeNo(4);
            }
        });
        buttonPanel.add(startButton4);

        // Add the button panel to the center of the frame
        add(buttonPanel, BorderLayout.CENTER);
        JLabel startLabel4 = new JLabel("Theme 4", startButton4.CENTER);
        startLabel4.setFont(new Font("Arial", Font.PLAIN, 14));
        startPanel4.add(startLabel4, BorderLayout.SOUTH);

// Add the Start button and label to the Start panel
        startPanel4.add(startButton4, BorderLayout.CENTER);

// Add the Start panel to the button panel
        buttonPanel.add(startPanel4);


        JLabel titleLabel2 = new JLabel("Theme Selasdfsdfect", SwingConstants.CENTER);
        titleLabel2.setFont(new Font("Arial", Font.BOLD, 24));
        add(titleLabel2, BorderLayout.LINE_END);

        // Set the size and center the frame on the screen
        setSize(500, 500);
        setLocationRelativeTo(null);


        // Set the close operation and make the frame visible
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);






    }

}
