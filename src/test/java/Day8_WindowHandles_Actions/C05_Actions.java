package Day8_WindowHandles_Actions;

import com.beust.ah.A;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.BaseTest;

public class C05_Actions extends BaseTest {

    @Override
    @After
    public void tearDown() {

    }

    @Test
    public void hoverOver(){

        driver.get("https://www.amazon.com.tr");

        WebElement accountsAndLists=driver.findElement(By.id("nav-link-accountList"));

        Actions actions=new Actions(driver);

        actions.
                moveToElement(accountsAndLists).
                click(driver.findElement(By.id("nav_prefetch_yourorders"))).perform();

        Assert.assertEquals("Amazon Giriş Yap",driver.getTitle());




    }
}
