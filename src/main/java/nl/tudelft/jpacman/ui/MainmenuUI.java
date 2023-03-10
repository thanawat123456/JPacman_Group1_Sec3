package nl.tudelft.jpacman.ui;

import nl.tudelft.jpacman.Launcher;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainmenuUI extends JFrame {
    private JButton startButton;
    private JButton themeButton;
    private JButton exitButton;
    private JTextField textField1;

    public MainmenuUI() {
        super("Pacman Main Menu");

        // Set the layout manager for the frame
        setLayout(new BorderLayout());

        // Create a panel for the buttons
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));


        ImageIcon classicIcon = new ImageIcon(getClass().getResource("/sprite/dead.png"));
        startButton = new JButton(classicIcon);
        startButton.setPreferredSize(new Dimension(100, 100));
        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Code to start the classic game
            }
        });
        buttonPanel.add(startButton);

        // Create the Start button
        startButton = new JButton("Start Game");
        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Launcher().launch();
            }
        });
        buttonPanel.add(startButton);

        themeButton = new JButton("Theme Select");
        themeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new ThemeSelect();
            }
        });
        buttonPanel.add(themeButton);

        // Create the Exit button
        exitButton = new JButton("Exit");
        exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        buttonPanel.add(exitButton);

        // Add the button panel to the center of the frame
        add(buttonPanel, BorderLayout.CENTER);

        // Set the size and center the frame on the screen
        setSize(400, 400);
        setLocationRelativeTo(null);

        // Set the close operation and make the frame visible
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }


}
