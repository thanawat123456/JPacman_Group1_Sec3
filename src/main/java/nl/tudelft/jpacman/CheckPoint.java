package nl.tudelft.jpacman;

import nl.tudelft.jpacman.ui.MainmenuUI;
import nl.tudelft.jpacman.ui.ThemeSelect;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckPoint extends JFrame {

    private JLabel bgPac;
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
    public  static String board;

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

        // Set the layout manager for the frame
        setLayout(new BorderLayout());

        // Create a panel for the buttons
        JPanel buttonPanel = new JPanel();

        //Image Bg
        ImageIcon classicIcon = new ImageIcon(getClass().getResource("/sprite/bgJPacman.png"));
        bgPac = new JLabel(classicIcon);
        buttonPanel.add(bgPac);
        bgPac.setBounds(0, 0, 400, 350);

        //Start Button
        ImageIcon bg1 = new ImageIcon(getClass().getResource("/sprite/btnStart.png"));
        check1 = new JButton("Map 1");
        check1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        check1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new ThemeSelect();
                setCheckpoint(1);
                board = "/board.txt";
                dispose();
            }
        });
        add(check1);
        check1.setBounds(128, 100, 130, 40);

        // Create the Exit button
        ImageIcon exitBtn = new ImageIcon(getClass().getResource("/sprite/btnExit.png"));
        check2 = new JButton("Map 2");
        check2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        check2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new ThemeSelect();
                setCheckpoint(2);
                board = "/board2.txt";
                dispose();
            }
        });
        add(check2);
        check2.setBounds(128, 150, 130, 40);

        // Create the Exit button
        ImageIcon bg2 = new ImageIcon(getClass().getResource("/sprite/btnExit.png"));
        check3 = new JButton("Map 3");
        check3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        check3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new ThemeSelect();
                setCheckpoint(4);
                board = "/board2.txt";
                dispose();
            }
        });
        add(check3);
        check3.setBounds(128, 200, 130, 40);

        // Create the Exit button
        ImageIcon bg4 = new ImageIcon(getClass().getResource("/sprite/btnExit.png"));
        check4 = new JButton("Map 4");
        check4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        check4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new ThemeSelect();
                setCheckpoint(4);
                board = "/board4.txt";
                dispose();
            }
        });
        add(check4);
        check4.setBounds(128, 250, 130, 40);


        // Create the Exit button
        ImageIcon bg5 = new ImageIcon(getClass().getResource("/sprite/btnExit.png"));
        check5 = new JButton("Map 5");
        check5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        check5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new ThemeSelect();
                setCheckpoint(5);
                board = "/board5.txt";
                dispose();
            }
        });
        add(check5);
        check5.setBounds(128, 300, 130, 40);

        // Add the button panel to the center of the frame
        add(buttonPanel, BorderLayout.CENTER);

        // Set the size and center the frame on the screen
        setSize(400, 400);
        setLocationRelativeTo(null);

        ImageIcon btnMainmenu = new ImageIcon(getClass().getResource("/sprite/btnMainmenu.png"));
        JButton btnBackMain = new JButton(btnMainmenu);
        btnBackMain.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnBackMain.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new MainmenuUI();
                dispose();
            }
        });
        add(btnBackMain, BorderLayout.SOUTH);


        // Set the close operation and make the frame visible
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

//        setLayout(new FlowLayout(FlowLayout.CENTER,100,10));
//        buttonPanel.setPreferredSize(new Dimension(100,300));
//        buttonPanel.setBackground(Color.GRAY);
        buttonPanel.setLayout(new FlowLayout());

    }
}
