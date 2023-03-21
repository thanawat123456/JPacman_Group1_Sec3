package nl.tudelft.jpacman.ui;

import nl.tudelft.jpacman.CheckPoint;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainmenuUI extends JFrame {
    private JLabel bgPac;
    private JLabel logoPac;
    private JButton startButton;
    private JButton exitButton;
    private JButton exitIcon;

    public MainmenuUI() {
        super("Pacman Main Menu");

        // Create a panel for the buttons
        JFrame mainPanel = new JFrame();

        //Start Button
        ImageIcon startbBtn = new ImageIcon(getClass().getResource("/panel_theme/main menu/start.png"));
        startButton = new JButton(startbBtn);
        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new CheckPoint();
                mainPanel.dispose();
            }
        });
        //hide background of JButton
        startButton.setBorderPainted(false);
        startButton.setContentAreaFilled(false);
        startButton.setFocusPainted(false);
        startButton.setOpaque(false);
        startButton.setBounds(290, 400, 205, 68);
        startButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        mainPanel.add(startButton);

        // Create the Exit button
        ImageIcon exitBtn = new ImageIcon(getClass().getResource("/panel_theme/main menu/exit.png"));
        exitButton = new JButton(exitBtn);
        exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        //hide background of JButton
        exitButton.setBorderPainted(false);
        exitButton.setContentAreaFilled(false);
        exitButton.setFocusPainted(false);
        exitButton.setOpaque(false);
        exitButton.setBounds(290, 550, 205, 68);
        exitButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        mainPanel.add(exitButton);

        // Create the Exit buttonIcon
        ImageIcon exitBtnIcon = new ImageIcon(getClass().getResource("/panel_theme/main menu/quit.png"));
        exitIcon = new JButton(exitBtnIcon);
        exitIcon.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        //hide background of JButton
        exitIcon.setBorderPainted(false);
        exitIcon.setContentAreaFilled(false);
        exitIcon.setFocusPainted(false);
        exitIcon.setOpaque(false);

        exitIcon.setBounds(720, 30, 50, 53);
        exitIcon.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        mainPanel.add(exitIcon);

        //Image Bg
        //ImageIcon classicIcon = new ImageIcon(getClass().getResource("/sprite/bgJPacman.png"));
        ImageIcon classicIcon = new ImageIcon(getClass().getResource("/panel_theme/bg.png"));
        bgPac = new JLabel(classicIcon);
        bgPac.setSize(800,800);

        //Image Logo
        ImageIcon logo = new ImageIcon(getClass().getResource("/panel_theme/logo.png"));
        logoPac = new JLabel(logo);
        logoPac.setBounds(150, 70, 470,288);
        mainPanel.add(logoPac);

//        mainPanel.setTitle("MAIN TEST");
        mainPanel.setUndecorated(true); // <-- the title bar is removed here
        mainPanel.setSize(800,800);
        mainPanel.setLocationRelativeTo(null);
        mainPanel.setLayout(null);
        mainPanel.setVisible(true);
        mainPanel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainPanel.setResizable(false);
        mainPanel.add(bgPac);

    }


}
