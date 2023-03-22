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
    public void tearDown() {
        themeSelect.dispose();
    }

    @Test
    public void testStartButton() {
        themeSelect.themeBtn1.doClick(); // Simulate a click on the "Start" button

    }

    @Test
    public void testStartButton2() {
        themeSelect.themeBtn2.doClick(); // Simulate a click on the "Start" button

    }

    @Test
    public void testStartButton3() {
        themeSelect.themeBtn3.doClick(); // Simulate a click on the "Start" button

    }

    @Test
    public void testStartButton4() {
        themeSelect.themeBtn4.doClick(); // Simulate a click on the "Start" button

    }

    @Test
    public void testStartButton5() {
        themeSelect.themeBtn5.doClick(); // Simulate a click on the "Start" button

    }


}
