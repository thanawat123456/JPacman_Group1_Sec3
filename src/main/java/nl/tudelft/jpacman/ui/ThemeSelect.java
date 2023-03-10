package nl.tudelft.jpacman.ui;

import nl.tudelft.jpacman.Launcher;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ThemeSelect extends JFrame {
    private JLabel bgTheme;
    private JButton themeBtn1;
    private JButton themeBtn2;
    private JButton themeBtn3;
    private JButton themeBtn4;
    private JButton btnBackMain;
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
        JPanel buttonPanel = new JPanel();

        //Image Bg
        ImageIcon themeBg = new ImageIcon(getClass().getResource("/sprite/bgJPacmanTheme.png"));
        bgTheme = new JLabel(themeBg);
        buttonPanel.add(bgTheme);
        bgTheme.setBounds(0, 0, 400, 350);

        // Create the Start panel
        JPanel startPanel = new JPanel(new BorderLayout());

        // Create the Start button
        ImageIcon classicIcon = new ImageIcon(getClass().getResource("/sprite/theme1.png"));
        Image img = classicIcon.getImage();
        Image newImg = img.getScaledInstance(200, 200, java.awt.Image.SCALE_SMOOTH);
        classicIcon = new ImageIcon(newImg);

        themeBtn1 = new JButton(classicIcon);
        themeBtn1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        themeBtn1.setBounds(100, 80, 100, 100);
        themeBtn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setThemeNo(1);
                new Launcher().launch();
                dispose();
            }
        });

// Add the Start button and label to the Start panel
        add(themeBtn1);

        // Create the Start panel
        JPanel startPanel2 = new JPanel(new BorderLayout());
// Create the Start button
        ImageIcon classicIcon2 = new ImageIcon(getClass().getResource("/sprite/theme2.png"));
        Image img2 = classicIcon2.getImage();
        Image newImg2 = img2.getScaledInstance(200, 200, java.awt.Image.SCALE_SMOOTH);
        classicIcon2 = new ImageIcon(newImg2);
        themeBtn2 = new JButton(classicIcon2);
        themeBtn2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        themeBtn2.setBounds(100, 210, 100, 100);
        themeBtn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setThemeNo(2);
                new Launcher().launch();
                dispose();
            }
        });

        // Add the Start button and label to the Start panel
        add(themeBtn2);

        // Create the Theme 3 button
        ImageIcon classicIcon3 = new ImageIcon(getClass().getResource("/sprite/theme1.png"));
        Image img3 = classicIcon3.getImage();
        Image newImg3 = img3.getScaledInstance(200, 200, java.awt.Image.SCALE_SMOOTH);
        classicIcon3 = new ImageIcon(newImg3);
        themeBtn3 = new JButton(classicIcon3);
        themeBtn3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        themeBtn3.setBounds(120, 80, 100, 100);
        themeBtn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setThemeNo(3);
                new Launcher().launch();
                dispose();
            }
        });
        add(themeBtn3);

        // Create the Theme 4 button
        JPanel startPanel4 = new JPanel(new BorderLayout());
        ImageIcon classicIcon4 = new ImageIcon(getClass().getResource("/sprite/theme1.png"));
        Image img4 = classicIcon4.getImage();
        Image newImg4 = img4.getScaledInstance(200, 200, java.awt.Image.SCALE_SMOOTH);
        classicIcon4 = new ImageIcon(newImg4);
        themeBtn4 = new JButton(classicIcon4);
        themeBtn4.setPreferredSize(new Dimension(100, 100));
        themeBtn4.setMaximumSize(new Dimension(100, 100));
        themeBtn4.setMinimumSize(new Dimension(100, 100));
        themeBtn4.setBorderPainted(false);
        themeBtn4.setFocusPainted(false);
        themeBtn4.setContentAreaFilled(false);
        themeBtn4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        themeBtn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setThemeNo(4);
                new Launcher().launch();
                dispose();
            }
        });
        buttonPanel.add(themeBtn4);

        // Add the button panel to the center of the frame
        add(buttonPanel, BorderLayout.CENTER);
        JLabel startLabel4 = new JLabel("Theme 4", themeBtn4.CENTER);
        startLabel4.setFont(new Font("Arial", Font.PLAIN, 14));
        startPanel4.add(startLabel4, BorderLayout.SOUTH);

// Add the Start button and label to the Start panel
        startPanel4.add(themeBtn4, BorderLayout.CENTER);

// Add the Start panel to the button panel
        buttonPanel.add(startPanel4);

        // Set the size and center the frame on the screen
        setSize(400, 400);
        setLocationRelativeTo(null);

        // Set the close operation and make the frame visible
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);


        // Create the Theme Select title label

        btnBackMain = new JButton("Main Menu");
        btnBackMain.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new MainmenuUI();
                dispose();
            }
        });
        add(btnBackMain, BorderLayout.SOUTH);



    }

}
