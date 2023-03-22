package nl.tudelft.jpacman.ui;

import nl.tudelft.jpacman.CheckPoint;
import nl.tudelft.jpacman.Launcher;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ThemeSelect extends JFrame {
    public JLabel bgTheme;
    public JLabel logoPac;
    public JButton themeBtn1;
    public JButton themeBtn2;
    public JButton themeBtn3;
    public JButton themeBtn4;
    public JButton themeBtn5;
    public JButton themeBtn6;
    public JButton btnBackMain;
    public JButton exitIcon;
    public static int themeNo;

    public void setThemeNo(int themeNo){
        this.themeNo = themeNo;
    }
    public static int getThemeNo() {
        return themeNo;
    }

    public ThemeSelect() {

        // Create a panel
        JFrame themePanel = new JFrame();
        themePanel.setTitle("THEME Test");


        // Create the Start button
        ImageIcon classicIcon = new ImageIcon(getClass().getResource("/sprite/theme1.png"));
        Image img = classicIcon.getImage();
        Image newImg = img.getScaledInstance(150,150, java.awt.Image.SCALE_SMOOTH);
        classicIcon = new ImageIcon(newImg);

        themeBtn1 = new JButton(classicIcon);
        themeBtn1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        themeBtn1.setBounds(80, 230, 150, 150);
        themeBtn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setThemeNo(1);
                new Launcher().launch();
                dispose();
            }
        });

        // Add the Start button and label to the Start panel
        themePanel.add(themeBtn1);

        // Create the Start button
        ImageIcon classicIcon2 = new ImageIcon(getClass().getResource("/sprite/theme2.png"));
        Image img2 = classicIcon2.getImage();
        Image newImg2 = img2.getScaledInstance(150,150, java.awt.Image.SCALE_SMOOTH);
        classicIcon2 = new ImageIcon(newImg2);
        themeBtn2 = new JButton(classicIcon2);
        themeBtn2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        themeBtn2.setBounds(320, 230, 150, 150);
        themeBtn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setThemeNo(2);
                new Launcher().launch();
                themePanel.dispose();
            }
        });

        // Add the Start button and label to the Start panel
        themePanel.add(themeBtn2);

        // Create the Theme 3 button
        ImageIcon classicIcon3 = new ImageIcon(getClass().getResource("/sprite/theme3.png"));
        Image img3 = classicIcon3.getImage();
        Image newImg3 = img3.getScaledInstance(150,150, java.awt.Image.SCALE_SMOOTH);
        classicIcon3 = new ImageIcon(newImg3);
        themeBtn3 = new JButton(classicIcon3);
        themeBtn3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        themeBtn3.setBounds(560, 230, 150, 150);
        themeBtn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setThemeNo(3);
                new Launcher().launch();
                themePanel.dispose();
            }
        });
        themePanel.add(themeBtn3);

        // Create the Theme 4 button
        ImageIcon classicIcon4 = new ImageIcon(getClass().getResource("/sprite/theme4.png"));
        Image img4 = classicIcon4.getImage();
        Image newImg4 = img4.getScaledInstance(150,150, java.awt.Image.SCALE_SMOOTH);
        classicIcon4 = new ImageIcon(newImg4);
        themeBtn4 = new JButton(classicIcon4);
        themeBtn4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        themeBtn4.setBounds(80, 450, 150, 150);
        themeBtn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setThemeNo(4);
                new Launcher().launch();
                themePanel.dispose();
            }
        });
        themePanel.add(themeBtn4);

        // Create the Theme 5 button
        ImageIcon classicIcon5 = new ImageIcon(getClass().getResource("/sprite/theme5.png"));
        Image img5 = classicIcon5.getImage();
        Image newImg5 = img5.getScaledInstance(150,150, java.awt.Image.SCALE_SMOOTH);
        classicIcon5 = new ImageIcon(newImg5);
        themeBtn5 = new JButton(classicIcon5);
        themeBtn5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        themeBtn5.setBounds(320, 450, 150, 150);
        themeBtn5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setThemeNo(5);
                new Launcher().launch();
                themePanel.dispose();
            }
        });
        // Add the Start button and label to the Start panel
        themePanel.add(themeBtn5);

        // Create the Theme 6 button
        ImageIcon classicIcon6 = new ImageIcon(getClass().getResource("/sprite/theme6.png"));
        Image img6 = classicIcon6.getImage();
        Image newImg6 = img6.getScaledInstance(150,150, java.awt.Image.SCALE_SMOOTH);
        classicIcon6 = new ImageIcon(newImg6);
        themeBtn6 = new JButton(classicIcon6);
        themeBtn6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        themeBtn6.setBounds(560, 450, 150, 150);
        themeBtn6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setThemeNo(6);
                new Launcher().launch();
                themePanel.dispose();
            }
        });
        themePanel.add(themeBtn6);

        ImageIcon btnMainmenu = new ImageIcon(getClass().getResource("/panel_theme/theme select/back.png"));
        Image btnMain = btnMainmenu.getImage();
        Image btnMainMenu = btnMain.getScaledInstance(205, 68, java.awt.Image.SCALE_SMOOTH);
        btnMainmenu = new ImageIcon(btnMainMenu);
        btnBackMain = new JButton(btnMainmenu);
        btnBackMain.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnBackMain.setBounds(290, 650, 205, 68);
        btnBackMain.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new CheckPoint();
                themePanel.dispose();
            }
        });
        //hide background of JButton
        btnBackMain.setBorderPainted(false);
        btnBackMain.setContentAreaFilled(false);
        btnBackMain.setFocusPainted(false);
        btnBackMain.setOpaque(false);

        themePanel.add(btnBackMain);

        //Image Logo
        ImageIcon logo = new ImageIcon(getClass().getResource("/panel_theme/logo.png"));
        Image logoImg = logo.getImage();
        Image LogoPic = logoImg.getScaledInstance(235,144, java.awt.Image.SCALE_SMOOTH);
        logo = new ImageIcon(LogoPic);
        logoPac = new JLabel(logo);
        logoPac.setBounds(270, 10, 235,144);
        themePanel.add(logoPac);

        //Theme Text
        ImageIcon themeText = new ImageIcon(getClass().getResource("/panel_theme/theme select/theme select.png"));
//        Image headText = themeText.getImage();
//        Image textTheme = headText.getScaledInstance(235,144, java.awt.Image.SCALE_SMOOTH);
//        themeText = new ImageIcon(textTheme);
        logoPac = new JLabel(themeText);
        logoPac.setBounds(240, 160, 297,33);
        themePanel.add(logoPac);

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
        themePanel.add(exitIcon);

        //Image Bg
        ImageIcon themeBg = new ImageIcon(getClass().getResource("/panel_theme/bg.png"));
        bgTheme = new JLabel(themeBg);
        bgTheme.setSize(800,800);
        themePanel.add(bgTheme);

        themePanel.setUndecorated(true); // <-- the title bar is removed here
        themePanel.setSize(800,800);
        themePanel.setLocationRelativeTo(null);
        themePanel.setLayout(null);
        themePanel.setVisible(true);
        themePanel.setDefaultCloseOperation(themePanel.EXIT_ON_CLOSE);
        themePanel.setResizable(false);


    }

}
