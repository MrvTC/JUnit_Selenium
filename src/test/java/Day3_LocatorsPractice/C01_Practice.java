package Day3_LocatorsPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_Practice {

    //    Go to https://www.linkedin.com/
//    When we write an e-mail without the @ sign in the e-mail box and press enter.
//    Let's test the "Invalid email address" warning.

    WebDriver driver;

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @After
    public void tearDown() {
        // driver.quit();
    }

    @Test
    public void xpathPractice() {

        driver.get("https://linkedin.com");

        //When we write an e-mail without the @ sign in the e-mail box and press enter.
        driver.findElement(By.xpath("//input[@id='session_key']")).sendKeys("mervetascava" + Keys.ENTER);
        //    Let's test the "Invalid email address" warning.

        WebElement alertMessage = driver.findElement(By.xpath("//p[@class='alert-content']"));

        Assert.assertTrue(alertMessage.isDisplayed());

//Assert.assertEquals(True,alertMessage.isDisplayed());
        //Assert.assertFalse(!alertMessage.isDisplayed());


    }


}

















