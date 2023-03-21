package nl.tudelft.jpacman.ui;

import nl.tudelft.jpacman.Launcher;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class DiePanel extends JFrame {

    private JLabel bgTheme;
    private JLabel logoPac;
    private JButton againBtn;
    private JButton backBtn;
    private JButton exitIcon;

    public DiePanel() {

        // Create a panel
        JFrame diePanel = new JFrame();
        diePanel.setTitle("Die Test");

        // Create the Again button
        ImageIcon classicIcon = new ImageIcon(getClass().getResource("/panel_theme/complete & lose/again.png"));
        Image img = classicIcon.getImage();
        Image newImg = img.getScaledInstance(205,68, java.awt.Image.SCALE_SMOOTH);
        classicIcon = new ImageIcon(newImg);
        againBtn = new JButton(classicIcon);
        againBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        againBtn.setBounds(80, 650, 205,68);
        againBtn.setBorderPainted(false);
        againBtn.setContentAreaFilled(false);
        againBtn.setFocusPainted(false);
        againBtn.setOpaque(false);
        againBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Launcher().launch();
                diePanel.dispose();
            }
        });
        diePanel.add(againBtn);

        // Create the back button
        ImageIcon classicIcon2 = new ImageIcon(getClass().getResource("/panel_theme/complete & lose/back.png"));
        Image img2 = classicIcon2.getImage();
        Image newImg2 = img2.getScaledInstance(205,68, java.awt.Image.SCALE_SMOOTH);
        classicIcon2 = new ImageIcon(newImg2);
        backBtn = new JButton(classicIcon2);
        backBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        backBtn.setBounds(500, 650, 205,68);
        backBtn.setBorderPainted(false);
        backBtn.setContentAreaFilled(false);
        backBtn.setFocusPainted(false);
        backBtn.setOpaque(false);
        backBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new MainmenuUI();
                diePanel.dispose();
            }
        });
        diePanel.add(backBtn);

        //Image Logo
        ImageIcon logo = new ImageIcon(getClass().getResource("/panel_theme/logo.png"));
        Image logoImg = logo.getImage();
        Image LogoPic = logoImg.getScaledInstance(313,192, java.awt.Image.SCALE_SMOOTH);
        logo = new ImageIcon(LogoPic);
        logoPac = new JLabel(logo);
        logoPac.setBounds(235, 10, 313,192);
        diePanel.add(logoPac);

        //Image Lose
        ImageIcon lose = new ImageIcon(getClass().getResource("/panel_theme/complete & lose/lose.png"));
        Image loseImg = lose.getImage();
        Image losePic = loseImg.getScaledInstance(576,316, java.awt.Image.SCALE_SMOOTH);
        lose = new ImageIcon(losePic);
        logoPac = new JLabel(lose);
        logoPac.setBounds(100, 250, 576,316);
        diePanel.add(logoPac);

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
        diePanel.add(exitIcon);

        //Image Bg
        ImageIcon themeBg = new ImageIcon(getClass().getResource("/panel_theme/bg.png"));
        bgTheme = new JLabel(themeBg);
        bgTheme.setSize(800,800);
        diePanel.add(bgTheme);


        diePanel.setUndecorated(true); // <-- the title bar is removed here
        diePanel.setSize(800,800);
        diePanel.setLocationRelativeTo(null);
        diePanel.setLayout(null);
        diePanel.setVisible(true);
        diePanel.setDefaultCloseOperation(diePanel.EXIT_ON_CLOSE);
        diePanel.setResizable(false);


    }
    public static void main(String[] args) throws IOException {
        //new Launcher().launch();
        new DiePanel();
    }



}
