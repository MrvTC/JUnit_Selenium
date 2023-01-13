package Day7_Iframe_WindowHandles;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import utilities.BaseTest;

import java.util.List;

public class WindowHandleTask extends BaseTest {

    @Override
    @After
    public void tearDown() {

    }

    @Test
    public void windowhandleTest() {

        //  Go to URL: https://testproject.io/
        driver.get("https://testproject.io/");

        //  Selenium’s 4 newWindow() method to open a new Window for TestProject’s Blog page.

        //  https://blog.testproject.io/

        driver.switchTo().newWindow(WindowType.WINDOW).get(" https://blog.testproject.io/");





    }
}
