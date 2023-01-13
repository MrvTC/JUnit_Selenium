package Day9_JSEScroll_Cookies_Files;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.BaseTest;

import java.awt.*;
import java.awt.event.KeyEvent;

public class RobotClassTask extends BaseTest {

    @Override
    @After
    public void tearDown() {

    }

    @Test
    public void RobotTest() throws AWTException, InterruptedException {

        //  https://api.jquery.com/ sitesine gidelim

        driver.get("https://api.jquery.com/");

        //  arama alanina json yazalim

        WebElement search = driver.findElement(By.name("s"));
        search.sendKeys("json");

        //  Enter islemini robot class kullanrak yapalim

        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);


    }
}
