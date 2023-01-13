package Day8_WindowHandles_Actions;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.BaseTest;

public class C02_Actions extends BaseTest {


    @Override
    @After
    public void tearDown() {

    }

    @Test
    public void doubleClick() {

        driver.get("https://demoqa.com/buttons");

        WebElement doubleClickButton = driver.findElement(By.id("doubleClickBtn"));

        Actions actions = new Actions(driver);

        actions.doubleClick(doubleClickButton).perform();

        Assert.assertTrue(driver.findElement(By.id("doubleClickMessage")).isDisplayed());

    }

    @Test
    public void rightClick() {

        driver.get("https://demoqa.com/buttons");

        WebElement rightClickBtn = driver.findElement(By.id("rightClickBtn"));

        Actions actions = new Actions(driver);

        actions.contextClick(rightClickBtn).build().perform();

        WebElement rightClickMessage = driver.findElement(By.id("rightClickMessage"));
        Assert.assertTrue(rightClickMessage.isDisplayed());
    }

    @Test
    public void click() {

        driver.get("https://demoqa.com/buttons");

        WebElement clickBtn = driver.findElement(By.xpath("//Button[.='Click Me']"));

        Actions actions = new Actions(driver);

        actions.click(clickBtn).perform();

        WebElement dynamicClickMessage=driver.findElement(By.id("dynamicClickMessage"));
        Assert.assertTrue(dynamicClickMessage.isDisplayed());


    }


}
