package Day6_Dropdown_SeleniumWaits;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.BaseTest;

public class AlertsTask extends BaseTest {


    @Override
    @After
    public void tearDown() {

    }

    @Test
    public void alertsTest() throws InterruptedException {

        //  Go to URL: http://demo.automationtesting.in/Alerts.html

        driver.get("http://demo.automationtesting.in/Alerts.html");

        //  Click "Alert with OK" and click 'click the button to display an alert box:’
        //  Accept Alert(I am an alert box!) and print alert on console.

        WebElement clickButton = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));

        clickButton.click();

        System.out.println(driver.switchTo().alert().getText());

        driver.switchTo().alert().accept();

        //  Click "Alert with OK & Cancel" and click 'click the button to display a confirm box’

        WebElement clickButton2 = driver.findElement(By.xpath("//a[.='Alert with OK & Cancel ']"));

        clickButton2.click();

        WebElement clickButtonConfirmBox = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));

        clickButtonConfirmBox.click();

        //  Cancel Alert  (Press a Button !)

        driver.switchTo().alert().dismiss();

        //  Click "Alert with Textbox" and click 'click the button to demonstrate the prompt box’

        WebElement clickButton3 = driver.findElement(By.xpath("//a[.='Alert with Textbox ']"));
clickButton3.click();

        WebElement clickButtonPromptBox = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
clickButtonPromptBox.click();

        //  And then sendKeys «BootcampCamp» (Please enter your name)

        driver.switchTo().alert().sendKeys("BootcampCamp");
        Thread.sleep(2000);

        driver.switchTo().alert().accept();


        //  Finally print on console this message "Hello BootcampCamp How are you today" assertion these message.

        WebElement message = driver.findElement(By.xpath("  //p[@id='demo1']"));
        Assert.assertEquals("Hello BootcampCamp How are you today",message.getText());
        System.out.println(message.getText());

    }


}
