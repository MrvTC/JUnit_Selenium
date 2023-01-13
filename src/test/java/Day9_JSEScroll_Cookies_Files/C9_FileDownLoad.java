package Day9_JSEScroll_Cookies_Files;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverListener;
import utilities.BaseTest;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C9_FileDownLoad extends BaseTest {

//   Go to URL: https://opensource-demo.orangehrmlive.com/
//   Login page valid credentials.
//   Download sample CSV file.
//   Verify if the file downloaded successfully.

    @Override
    @After
    public void tearDown() {

    }

    @Test
    public void fileDownload() throws InterruptedException {

        driver.get("https://opensource-demo.orangehrmlive.com/");

        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("Admin");

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("admin123");

        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));

        loginButton.click();

        // Indirilecek dosyaya gitmek icin gerekli adimlar
        WebElement PIM = driver.findElement(By.xpath("(//a[@class='oxd-main-menu-item'])[2]"));
        PIM.click();

        WebElement configurationTab = driver.findElement(By.xpath("//span[text()='Configuration ']"));
        configurationTab.click();

        WebElement dataImport = driver.findElement(By.linkText("Data Import"));
        dataImport.click();

        // Indirilen dosyamizin path i
        WebElement downloadLink = driver.findElement(By.className("download-link"));
        downloadLink.click();


        Thread.sleep(5000); // Ne olur ne olmaz dosyanin inmesi icin bekliyoruz

        // Dosyanin indirildigini kontrol ediyoruz
        String downloadPath="C:\\Users\\merve\\Downloads\\importData.csv";
        Assert.assertTrue("indirilen dosya bulunamadı", Files.exists(Paths.get(downloadPath)));










    }
}
