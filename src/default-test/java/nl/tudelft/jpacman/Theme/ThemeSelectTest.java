package nl.tudelft.jpacman.Theme;

import nl.tudelft.jpacman.ui.MainmenuUI;
import nl.tudelft.jpacman.ui.ThemeSelect;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ThemeSelectTest {
    private ThemeSelect themeSelect;

    @Before
    public void setUp() {
        themeSelect = new ThemeSelect();
    }

    @After
    public void tearDown() throws InterruptedException {
        themeSelect.dispose();
        Thread.sleep(1000);
    }

    @Test
    public void testThemeBtn1() throws InterruptedException {
        themeSelect.themeBtn1.doClick(); // Simulate a click on the "Start" button
        Thread.sleep(1000);
    }

    @Test
    public void testThemeBtn2() throws InterruptedException {
        themeSelect.themeBtn2.doClick(); // Simulate a click on the "Start" button
        Thread.sleep(1000);
}

    @Test
    public void testThemeBtn3() throws InterruptedException{
        themeSelect.themeBtn3.doClick(); // Simulate a click on the "Start" button
        Thread.sleep(1000);
    }

    @Test
    public void testThemeBtn4() throws InterruptedException{
        themeSelect.themeBtn4.doClick(); // Simulate a click on the "Start" button
        Thread.sleep(1000);
    }

    @Test
    public void testThemeBtn5() throws InterruptedException{
        Thread.sleep(1000);
        themeSelect.themeBtn5.doClick(); // Simulate a click on the "Start" button
        Thread.sleep(1000);
    }

    @Test
    public void testBack() throws InterruptedException{
        Thread.sleep(1000);
        themeSelect.btnBackMain.doClick(); // Simulate a click on the "Start" button
        Thread.sleep(1000);
    }


    @Test
    public void testMainMenuSize(){
        int w = themeSelect.getWidth();
        int h = themeSelect.getHeight();
        assertEquals(800,w);
        assertEquals(800,h);
    }

    @Test
    public void testTheme1ButtonSize(){
        int w = themeSelect.themeBtn1.getWidth();
        int h =  themeSelect.themeBtn1.getHeight();
        assertEquals(150,w);
        assertEquals(150,h);
    }

    @Test
    public void testTheme1XY(){
        int x = themeSelect.themeBtn1.getX();
        int y =  themeSelect.themeBtn1.getY();
        assertEquals(80,x);
        assertEquals(230,y);
    }

    @Test
    public void testTheme2ButtonSize(){
        int w = themeSelect.themeBtn2.getWidth();
        int h =  themeSelect.themeBtn2.getHeight();
        assertEquals(150,w);
        assertEquals(150,h);
    }

    @Test
    public void testTheme2XY(){
        int x = themeSelect.themeBtn2.getX();
        int y =  themeSelect.themeBtn2.getY();
        assertEquals(320,x);
        assertEquals(230,y);
    }

    @Test
    public void testTheme3ButtonSize(){
        int w = themeSelect.themeBtn3.getWidth();
        int h =  themeSelect.themeBtn3.getHeight();
        assertEquals(150,w);
        assertEquals(150,h);
    }

    @Test
    public void testTheme3XY(){
        int x = themeSelect.themeBtn3.getX();
        int y =  themeSelect.themeBtn3.getY();
        assertEquals(560,x);
        assertEquals(230,y);
    }

    @Test
    public void testTheme4ButtonSize(){
        int w = themeSelect.themeBtn4.getWidth();
        int h =  themeSelect.themeBtn4.getHeight();
        assertEquals(150,w);
        assertEquals(150,h);
    }

    @Test
    public void testTheme4XY(){
        int x = themeSelect.themeBtn4.getX();
        int y =  themeSelect.themeBtn4.getY();
        assertEquals(80,x);
        assertEquals(450,y);
    }

    @Test
    public void testTheme5ButtonSize(){
        int w = themeSelect.themeBtn5.getWidth();
        int h =  themeSelect.themeBtn5.getHeight();
        assertEquals(150,w);
        assertEquals(150,h);
    }

    @Test
    public void testTheme5XY(){
        int x = themeSelect.themeBtn5.getX();
        int y =  themeSelect.themeBtn5.getY();
        assertEquals(320,x);
        assertEquals(450,y);
    }



}
