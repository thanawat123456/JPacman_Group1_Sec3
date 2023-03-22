package nl.tudelft.jpacman.MainMenu;

import nl.tudelft.jpacman.CheckPoint;
import nl.tudelft.jpacman.ui.MainmenuUI;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;


import java.awt.event.ActionEvent;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class MainMenuTest {

    private MainmenuUI mainMenu;

    @Before
    public void setUp() {
        mainMenu = new MainmenuUI();
    }

    @After
    public void tearDown() {
        mainMenu.dispose();
    }

    @Test
    public void testStartButton() throws InterruptedException {
        Thread.sleep(1500);
        mainMenu.startButton.doClick(); // Simulate a click on the "Start" button
        Thread.sleep(1500);
    }

    @Test
    public void testExitButton() throws InterruptedException {
        ActionEvent event = new ActionEvent(mainMenu.exitButton, ActionEvent.ACTION_PERFORMED, ""); // Create an ActionEvent for the "Exit" button
        Thread.sleep(1500);
        mainMenu.exitButton.getActionListeners()[0].actionPerformed(event); // Simulate a click on the "Exit" button

        Assert.assertFalse(mainMenu.isVisible()); // Check if the MainmenuUI has been closed

    }
}
