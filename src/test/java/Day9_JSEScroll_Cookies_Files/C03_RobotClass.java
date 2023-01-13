package Day9_JSEScroll_Cookies_Files;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.BaseTest;

import java.awt.*;
import java.awt.event.KeyEvent;

public class C03_RobotClass extends BaseTest {

    @Override
    @After
    public void tearDown() {

    }

    @Test
    public void Test() throws AWTException, InterruptedException {

        driver.get("https://demo.guru99.com/test/upload/");

        WebElement input = driver.findElement(By.id("uploadfile_0"));
        input.sendKeys("C:\\Users\\merve\\IdeaProjects\\CWJunitSelenium\\src\\test\\java\\resources\\robot.txt");

        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);//keyPress tuşa basılı tutar, ctrl ye bastık
        robot.keyPress(KeyEvent.VK_S);//s tuşuna bastık
        Thread.
                sleep(2000);

        robot.keyRelease(KeyEvent.VK_CONTROL);//keyRealese tuşu serbest bırakır
        robot.keyRelease(KeyEvent.VK_S);//keyRealese tuşu serbest bırakır
        Thread.sleep(2000);

        robot.keyPress(KeyEvent.VK_ENTER);//enter tuşuna bastık
        robot.keyRelease(KeyEvent.VK_ENTER);

robot.keyPress(KeyEvent.VK_LEFT);
robot.keyPress(KeyEvent.VK_ENTER);
robot.keyRelease(KeyEvent.VK_LEFT);
robot.keyRelease(KeyEvent.VK_ENTER);
Thread.sleep(2000);





    }
}
