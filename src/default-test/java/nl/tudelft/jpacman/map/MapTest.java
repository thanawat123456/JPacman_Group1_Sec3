package nl.tudelft.jpacman.map;

import nl.tudelft.jpacman.CheckPoint;
import nl.tudelft.jpacman.ui.MainmenuUI;
import nl.tudelft.jpacman.ui.ThemeSelect;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

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
        Thread.sleep(1500);
    }

    @Test
    public void testMap1() throws InterruptedException {
        Thread.sleep(1000);
        checkPoint.check1.doClick(); // Simulate a click on the "Start" button
        Thread.sleep(1500);
    }

    @Test
    public void testMap2() throws InterruptedException {
        Thread.sleep(1000);
        checkPoint.check2.doClick(); // Simulate a click on the "Start" button
        Thread.sleep(1500);
    }

    @Test
    public void testMap3() throws InterruptedException{
        Thread.sleep(1000);
        checkPoint.check3.doClick(); // Simulate a click on the "Start" button
        Thread.sleep(1500);
    }

    @Test
    public void testMap4() throws InterruptedException{
        Thread.sleep(1000);
        checkPoint.check4.doClick(); // Simulate a click on the "Start" button
        Thread.sleep(1500);
    }

    @Test
    public void testMap5() throws InterruptedException{
        Thread.sleep(1000);
        checkPoint.check5.doClick(); // Simulate a click on the "Start" button
        Thread.sleep(1500);
    }

    @Test
    public void testBack() throws InterruptedException{
        Thread.sleep(1000);
        checkPoint.btnBackMain.doClick(); // Simulate a click on the "Start" button
        Thread.sleep(1500);
    }

}
