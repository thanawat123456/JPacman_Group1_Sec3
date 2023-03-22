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
import static org.junit.jupiter.api.Assertions.assertEquals;

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
        Thread.sleep(1000);
        mainMenu.startButton.doClick(); // Simulate a click on the "Start" button
        Thread.sleep(1000);
    }

    @Test
    public void testMainMenuSize(){
        int w = mainMenu.getWidth();
        int h = mainMenu.getHeight();
        assertEquals(800,w);
        assertEquals(800,h);
    }

    @Test
    public void testStartButtonSize(){
        int w = mainMenu.startButton.getWidth();
        int h =  mainMenu.startButton.getHeight();
        assertEquals(205,w);
        assertEquals(68,h);
    }

    @Test
    public void testExitButtonSize(){
        int w = mainMenu.exitButton.getWidth();
        int h =  mainMenu.exitButton.getHeight();
        assertEquals(205,w);
        assertEquals(68,h);
    }
}
