package nl.tudelft.jpacman;

import nl.tudelft.jpacman.ui.MainmenuUI;
import nl.tudelft.jpacman.ui.ThemeSelect;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckPoint extends JFrame {
    private JLabel bgPac;
    private JLabel logoPac;
    private JButton startButton;
    private JButton exitButton;
    private JTextField textField1;

    private JButton check1;
    private JButton check2;
    private JButton check3;
    private JButton check4;
    private JButton check5;
    public static int checkpoint ;

    public static int getCheckpoint() {
        return checkpoint;
    }
    public  static String board="/board.txt";

    public static String getBoard() {
        return board;
    }

    public static void setBoard(String board) {
        CheckPoint.board = board;
    }

    public static void setCheckpoint(int checkpoint) {
        CheckPoint.checkpoint = checkpoint;
    }

    public CheckPoint() {
        super("Pacman Main Menu");

        // Create a panel for the buttons
        JFrame mainPanel = new JFrame();

        //Start Button
        ImageIcon startbBtn = new ImageIcon(getClass().getResource("/panel_theme/map select/111.png"));
        startButton = new JButton(startbBtn);
        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new ThemeSelect();
                setCheckpoint(1);
                board = "/board.txt";
                dispose();
            }
        });
        //hide background of JButton
        startButton.setBorderPainted(false);
        startButton.setContentAreaFilled(false);
        startButton.setFocusPainted(false);
        startButton.setOpaque(false);
        startButton.setBounds(290, 300, 205, 68);
        startButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        mainPanel.add(startButton);

        // Create the Exit button
        ImageIcon exitBtn = new ImageIcon(getClass().getResource("/panel_theme/map select/22.png"));
        check2 = new JButton(exitBtn);
        check2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new ThemeSelect();
                setCheckpoint(2);
                board = "/board2.txt";
                dispose();
            }
        });
        //hide background of JButton
        check2.setBorderPainted(false);
        check2.setContentAreaFilled(false);
        check2.setFocusPainted(false);
        check2.setOpaque(false);
        check2.setBounds(290, 380, 205, 68);
        check2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        mainPanel.add(check2);


        ImageIcon bgcheck2 = new ImageIcon(getClass().getResource("/panel_theme/map select/33.png"));
        check3 = new JButton(bgcheck2);
        check3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new ThemeSelect();
                setCheckpoint(3);
                board = "/board3.txt";
                dispose();
            }
        });
        //hide background of JButton
        check3.setBorderPainted(false);
        check3.setContentAreaFilled(false);
        check3.setFocusPainted(false);
        check3.setOpaque(false);
        check3.setBounds(290, 460, 205, 68);
        check3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        mainPanel.add(check3);


        ImageIcon bgcheck4 = new ImageIcon(getClass().getResource("/panel_theme/map select/44.png"));
        check4 = new JButton(bgcheck4);
        check4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new ThemeSelect();
                setCheckpoint(4);
                board = "/board4.txt";
                dispose();
            }
        });
        //hide background of JButton
        check4.setBorderPainted(false);
        check4.setContentAreaFilled(false);
        check4.setFocusPainted(false);
        check4.setOpaque(false);
        check4.setBounds(290, 540, 205, 68);
        check4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        mainPanel.add(check4);


        ImageIcon bgcheck5 = new ImageIcon(getClass().getResource("/panel_theme/map select/55.png"));
        check5 = new JButton(bgcheck5);
        check5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new ThemeSelect();
                setCheckpoint(5);
                board = "/board5.txt";
                dispose();
            }
        });
        //hide background of JButton
        check5.setBorderPainted(false);
        check5.setContentAreaFilled(false);
        check5.setFocusPainted(false);
        check5.setOpaque(false);
        check5.setBounds(290, 620, 205, 68);
        check5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        mainPanel.add(check5);






        // Create the Exit buttonIcon
        ImageIcon exitBtnIcon = new ImageIcon(getClass().getResource("/panel_theme/main menu/quit.png"));
        JButton exitIcon = new JButton(exitBtnIcon);
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



        ImageIcon btnMainmenu = new ImageIcon(getClass().getResource("/panel_theme/theme select/back.png"));
        Image btnMain = btnMainmenu.getImage();
        Image btnMainMenu = btnMain.getScaledInstance(205, 68, java.awt.Image.SCALE_SMOOTH);
        btnMainmenu = new ImageIcon(btnMainMenu);
        JButton btnBackMain = new JButton(btnMainmenu);
        btnBackMain.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnBackMain.setBounds(290, 730, 205, 68);
        btnBackMain.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new MainmenuUI();
                dispose();
            }
        });
        //hide background of JButton
        btnBackMain.setBorderPainted(false);
        btnBackMain.setContentAreaFilled(false);
        btnBackMain.setFocusPainted(false);
        btnBackMain.setOpaque(false);
        mainPanel.add(btnBackMain);

        //Image Bg
        //ImageIcon classicIcon = new ImageIcon(getClass().getResource("/sprite/bgJPacman.png"));
        ImageIcon classicIcon = new ImageIcon(getClass().getResource("/panel_theme/bg.png"));
        bgPac = new JLabel(classicIcon);
        bgPac.setSize(800,800);

        //Image Logo
        ImageIcon logo = new ImageIcon(getClass().getResource("/panel_theme/logo.png"));
        logoPac = new JLabel(logo);
        logoPac.setBounds(150, 20, 470,288);
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
