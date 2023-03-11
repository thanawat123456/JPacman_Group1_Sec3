package nl.tudelft.jpacman.ui;

import nl.tudelft.jpacman.Launcher;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainmenuUI extends JFrame {
    private JLabel bgPac;
    private JButton startButton;
    private JButton exitButton;
    private JTextField textField1;

    public MainmenuUI() {
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
        ImageIcon startbBtn = new ImageIcon(getClass().getResource("/sprite/btnStart.png"));
        startButton = new JButton(startbBtn);
        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new ThemeSelect();
                dispose();
            }
        });
        add(startButton);
        startButton.setBounds(128, 130, 130, 40);

        // Create the Exit button
        ImageIcon exitBtn = new ImageIcon(getClass().getResource("/sprite/btnExit.png"));
        exitButton = new JButton(exitBtn);
        exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        add(exitButton);
        exitButton.setBounds(128, 200, 130, 40);

        // Add the button panel to the center of the frame
        add(buttonPanel, BorderLayout.CENTER);

        // Set the size and center the frame on the screen
        setSize(400, 400);
        setLocationRelativeTo(null);


        // Set the close operation and make the frame visible
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

//        setLayout(new FlowLayout(FlowLayout.CENTER,100,10));
//        buttonPanel.setPreferredSize(new Dimension(100,300));
//        buttonPanel.setBackground(Color.GRAY);
        buttonPanel.setLayout(new FlowLayout());
        setResizable(false);
    }


}
