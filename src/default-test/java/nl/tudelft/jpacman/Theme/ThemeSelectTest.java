package nl.tudelft.jpacman.Theme;

import nl.tudelft.jpacman.ui.MainmenuUI;
import nl.tudelft.jpacman.ui.ThemeSelect;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ThemeSelectTest {
    private ThemeSelect themeSelect;

    @Before
    public void setUp() {
        themeSelect = new ThemeSelect();
    }

    @After
    public void tearDown() throws InterruptedException {
        themeSelect.dispose();
        Thread.sleep(1500);
    }

    @Test
    public void testStartButton() throws InterruptedException {
        themeSelect.themeBtn1.doClick(); // Simulate a click on the "Start" button
        Thread.sleep(1500);
    }

    @Test
    public void testStartButton2() throws InterruptedException {
        themeSelect.themeBtn2.doClick(); // Simulate a click on the "Start" button
        Thread.sleep(1500);
}

    @Test
    public void testStartButton3() throws InterruptedException{
        themeSelect.themeBtn3.doClick(); // Simulate a click on the "Start" button
        Thread.sleep(1500);
    }

    @Test
    public void testStartButton4() throws InterruptedException{
        themeSelect.themeBtn4.doClick(); // Simulate a click on the "Start" button
        Thread.sleep(1500);
    }

    @Test
    public void testStartButton5() throws InterruptedException{
        themeSelect.themeBtn5.doClick(); // Simulate a click on the "Start" button
        Thread.sleep(1500);
    }


}
