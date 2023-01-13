package Day6_Dropdown_SeleniumWaits;

import com.github.javafaker.Faker;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.BaseTest;

import java.util.List;

public class dropDownFakerTask extends BaseTest {
    @Override
    @After
    public void tearDown() {

    }


    @Test
    public void dropDownFaker() {

        //   Go to URL: https://opensource-demo.orangehrmlive.com/
        driver.get("https://opensource-demo.orangehrmlive.com/");


        //   Login with Username: Admin

        Faker faker = new Faker();

        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("Admin");

        //   Login with Password: admin123
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("admin123");


        //   Click login button
        WebElement loginClick = driver.findElement(By.xpath("//button[@type='submit']"));
        loginClick.click();

        //   Click on PIM
        WebElement PIMClick = driver.findElement(By.xpath("//li[@class='oxd-main-menu-item-wrapper'][2]"));
        PIMClick.click();

        //   Click on Employee List

        WebElement employeeListClick = driver.findElement(By.xpath("//a[@class='oxd-topbar-body-nav-tab-item']"));
        employeeListClick.click();

        //   Employee Name -> Use Faker Class

        WebElement fname=driver.findElement(By.xpath("//input[@placeholder='Type for hints...']"));

        fname.sendKeys(faker.name().firstName());

        //   ID -> Use Faker Class

        WebElement fID=driver.findElement(By.xpath("((//div[@class='oxd-table-filter']//input)[2])"));
        fID.sendKeys(faker.idNumber().valid());


        //   Supervisor Name -> Use Faker Class

        WebElement fSupervisor=driver.findElement(By.xpath("((//div[@class='oxd-table-filter']//input)[3])"));
        fSupervisor.sendKeys(faker.name().fullName());


        //   Click search button
        WebElement searchButton=driver.findElement(By.xpath("//button[@type='submit']"));

        searchButton.click();

        WebElement noRecordText = driver.findElement(By.xpath("(//span[@class='oxd-text oxd-text--span'])[1]"));
        Assert.assertTrue(noRecordText.isDisplayed());


    }


}