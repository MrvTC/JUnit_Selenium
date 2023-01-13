package Day9_JSEScroll_Cookies_Files;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.BaseTest;


public class scrollTask extends BaseTest {


    @Override
    @After
    public void tearDown() {

    }

    @Test
    public void test() {


        //  Launch browser
        //  Navigate to url 'http://automationexercise.com'

        driver.get("http://automationexercise.com");

        //  Verify that home page is visible successfully

        String homePage = driver.getWindowHandle();

        Assert.assertEquals("https://automationexercise.com/",driver.getCurrentUrl());

        //  Scroll down page to bottom
        Actions actions=new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).perform();


        //  Verify 'SUBSCRIPTION' is visible

        WebElement subscription = driver.findElement(By.xpath("//div[@class='single-widget']"));

        Assert.assertTrue(subscription.isDisplayed());

        //  Scroll up page to top

        actions.sendKeys(Keys.PAGE_UP).perform();

        //  Verify that page is scrolled up and 'Full-Fledged practice website for Automation Engineers' text is visible on screen


        WebElement textisDisplayed = driver.findElement(By.xpath("//div[@class='col-sm-6']//span[text()='Automation']"));

        Assert.assertTrue(textisDisplayed.isDisplayed());



    }

}
