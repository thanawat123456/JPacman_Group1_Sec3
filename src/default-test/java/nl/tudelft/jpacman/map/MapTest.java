package nl.tudelft.jpacman.map;

import nl.tudelft.jpacman.CheckPoint;
import nl.tudelft.jpacman.ui.MainmenuUI;
import nl.tudelft.jpacman.ui.ThemeSelect;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MapTest {
    private CheckPoint checkPoint;
    private ThemeSelect themeSelect;

    @Before
    public void setUp2() {
        themeSelect = new ThemeSelect();
    }

    @Before
    public void setUp() {
        checkPoint = new CheckPoint();
    }

    @After
    public void tearDown() throws InterruptedException {
        checkPoint.dispose();
        Thread.sleep(1000);
    }

    @Test
    public void testMap1() throws InterruptedException {
        Thread.sleep(1000);
        checkPoint.check1.doClick(); // Simulate a click on the "Start" button
        Thread.sleep(1000);
    }

    @Test
    public void testMap2() throws InterruptedException {
        Thread.sleep(1000);
        checkPoint.check2.doClick(); // Simulate a click on the "Start" button
        Thread.sleep(1000);
    }

    @Test
    public void testMap3() throws InterruptedException{
        Thread.sleep(1000);
        checkPoint.check3.doClick(); // Simulate a click on the "Start" button
        Thread.sleep(1000);
    }

    @Test
    public void testMap4() throws InterruptedException{
        Thread.sleep(1000);
        checkPoint.check4.doClick(); // Simulate a click on the "Start" button
        Thread.sleep(1000);
    }

    @Test
    public void testMap5() throws InterruptedException{
        Thread.sleep(1000);
        checkPoint.check5.doClick(); // Simulate a click on the "Start" button
        Thread.sleep(1000);
    }

    @Test
    public void testBack() throws InterruptedException{
        Thread.sleep(1000);
        checkPoint.btnBackMain.doClick(); // Simulate a click on the "Start" button
        Thread.sleep(1000);
    }

    @Test
    public void testMapSize() throws InterruptedException{
        int w = checkPoint.getWidth();
        int h =  checkPoint.getHeight();
        assertEquals(800,w);
        assertEquals(800,h);
    }

    @Test
    public void testBtnMap1Size() throws InterruptedException{
        int w = checkPoint.check1.getWidth();
        int h =  checkPoint.check1.getHeight();
        assertEquals(205,w);
        assertEquals(68,h);
    }

    @Test
    public void testBtnMap1XY() throws InterruptedException{
        int x = checkPoint.check1.getX();
        int y =  checkPoint.check1.getY();
        assertEquals(290,x);
        assertEquals(300,y);
    }

    @Test
    public void testBtnMap2Size() throws InterruptedException{
        int w = checkPoint.check1.getWidth();
        int h =  checkPoint.check1.getHeight();
        assertEquals(205,w);
        assertEquals(68,h);
    }

    @Test
    public void testBtnMap2XY() throws InterruptedException{
        int x = checkPoint.check2.getX();
        int y =  checkPoint.check2.getY();
        assertEquals(290,x);
        assertEquals(380,y);
    }

    @Test
    public void testBtnMap3Size() throws InterruptedException{
        int w = checkPoint.check1.getWidth();
        int h =  checkPoint.check1.getHeight();
        assertEquals(205,w);
        assertEquals(68,h);
    }

    @Test
    public void testBtnMap3XY() throws InterruptedException{
        int x = checkPoint.check3.getX();
        int y =  checkPoint.check3.getY();
        assertEquals(290,x);
        assertEquals(460,y);
    }


    @Test
    public void testBtnMap4Size() throws InterruptedException{
        int w = checkPoint.check1.getWidth();
        int h =  checkPoint.check1.getHeight();
        assertEquals(205,w);
        assertEquals(68,h);
    }

    @Test
    public void testBtnMap4XY() throws InterruptedException{
        int x = checkPoint.check4.getX();
        int y =  checkPoint.check4.getY();
        assertEquals(290,x);
        assertEquals(540,y);
    }

    @Test
    public void testBtnMap5Size() throws InterruptedException{
        int w = checkPoint.check1.getWidth();
        int h =  checkPoint.check1.getHeight();
        assertEquals(205,w);
        assertEquals(68,h);
    }

    @Test
    public void testBtnMap5XY() throws InterruptedException{
        int x = checkPoint.check5.getX();
        int y =  checkPoint.check5.getY();
        assertEquals(290,x);
        assertEquals(540,y);
    }



}
