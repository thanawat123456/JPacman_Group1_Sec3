package nl.tudelft.jpacman.ui;

import nl.tudelft.jpacman.Launcher;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class WinPanel extends JFrame {

    private JLabel bgTheme;
    private JLabel logoPac;
    private JButton continueBtn;
    private JButton backBtn;
    private JButton exitIcon;

    public WinPanel() {

        // Create a panel
        JFrame winPanel = new JFrame();
        winPanel.setTitle("Win Test");

        // Create the continueBtn button
        ImageIcon classicIcon = new ImageIcon(getClass().getResource("/panel_theme/complete & lose/continue.png"));
        Image img = classicIcon.getImage();
        Image newImg = img.getScaledInstance(205,68, Image.SCALE_SMOOTH);
        classicIcon = new ImageIcon(newImg);
        continueBtn = new JButton(classicIcon);
        continueBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        continueBtn.setBounds(80, 650, 205,68);
        continueBtn.setBorderPainted(false);
        continueBtn.setContentAreaFilled(false);
        continueBtn.setFocusPainted(false);
        continueBtn.setOpaque(false);
        continueBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new MainmenuUI();
                winPanel.dispose();
            }
        });
        winPanel.add(continueBtn);

        // Create the back button
        ImageIcon classicIcon2 = new ImageIcon(getClass().getResource("/panel_theme/complete & lose/back.png"));
        Image img2 = classicIcon2.getImage();
        Image newImg2 = img2.getScaledInstance(205,68, Image.SCALE_SMOOTH);
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
                winPanel.dispose();
            }
        });
        winPanel.add(backBtn);

        //Image Logo
        ImageIcon logo = new ImageIcon(getClass().getResource("/panel_theme/logo.png"));
        Image logoImg = logo.getImage();
        Image LogoPic = logoImg.getScaledInstance(313,192, Image.SCALE_SMOOTH);
        logo = new ImageIcon(LogoPic);
        logoPac = new JLabel(logo);
        logoPac.setBounds(235, 10, 313,192);
        winPanel.add(logoPac);

        //Image complete
        ImageIcon complete = new ImageIcon(getClass().getResource("/panel_theme/complete & lose/complete.png"));
        Image completeImg = complete.getImage();
        Image completePic = completeImg.getScaledInstance(576,316, Image.SCALE_SMOOTH);
        complete = new ImageIcon(completePic);
        logoPac = new JLabel(complete);
        logoPac.setBounds(100, 250, 576,316);
        winPanel.add(logoPac);

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
        winPanel.add(exitIcon);

        //Image Bg
        ImageIcon themeBg = new ImageIcon(getClass().getResource("/panel_theme/bg.png"));
        bgTheme = new JLabel(themeBg);
        bgTheme.setSize(800,800);
        winPanel.add(bgTheme);


        winPanel.setUndecorated(true); // <-- the title bar is removed here
        winPanel.setSize(800,800);
        winPanel.setLocationRelativeTo(null);
        winPanel.setLayout(null);
        winPanel.setVisible(true);
        winPanel.setDefaultCloseOperation(winPanel.EXIT_ON_CLOSE);
        winPanel.setResizable(false);


    }
    public static void main(String[] args) throws IOException {
        //new Launcher().launch();
        new WinPanel();
    }



}
