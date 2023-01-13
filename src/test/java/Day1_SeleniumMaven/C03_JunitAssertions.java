package Day1_SeleniumMaven;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.By.className;

public class C03_JunitAssertions {


    //    Go to Amazon homepage.
//    Do the following tasks by creating 3 different test methods.
//    1- Test if the URL contains Amazon.
//    2- Test if the title does not contain Facebook.
//    3- Test that the Amazon logo appears in the upper left corner.

    //    assertEquals
//    assertTrue
//    assertFalse
//    assertNull
//    assertNotNull
//    assertSame
//    assertNotSame
//    assertArrayEquals

    WebDriver driver;

    @Before
    public void before() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
    }

    @After
    public void after() {
        driver.quit();
    }

    @Test
    public void URLTest() {
        driver.get("https://www.amazon.com/");
        String currentUrl = driver.getCurrentUrl();

        // URL amazon kelimesini iceriyor mu kontrol saglaniyor
        Assert.assertTrue("URL 'amazon' icermiyor", currentUrl.contains("amazon"));
    }

    @Test
    public void titleTest() {
        String title = driver.getTitle();
        Assert.assertFalse("title 'Facebook' içeriyor", title.contains("Facebook"));

    }


//    3- Test that the Amazon logo appears in the upper left corner.

    @Test
    public void logoAppear() {

        WebElement logoTest = driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));

        Assert.assertTrue(logoTest.isDisplayed());

        //boolean logoTest = driver.findElement(By.xpath("//a[@id='nav-logo-sprites']")).isDisplayed();

    }


}
