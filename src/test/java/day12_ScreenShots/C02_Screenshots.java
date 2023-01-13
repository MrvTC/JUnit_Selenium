package day12_ScreenShots;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.io.FileHandler;
import utilities.BaseTest;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class C02_Screenshots extends BaseTest {


    @Test
    public void getPageScreenshot() throws IOException {

        driver.get("https://www.n11.com/");

        //Screenshot umuzu File class indan bir objeye aliyoruz
        File kaynak = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        // Aldigimiz screenshot istedigimiz path e kaydediyoruz
        FileHandler.copy(kaynak, new File("test-output/Screenshots/n11PageScreenshot.png"));


    }

    @Test
    public void getElementScreenshot() throws IOException {

        driver.get("https://opensource-demo.orangehrmlive.com/");


        //screenshot alınacak element locate edildi
        WebElement logo = driver.findElement(By.className("orangehrm-login-branding"));

        //elemnet üzerinden screenshot ı aldık
        File logoScreenshot = logo.getScreenshotAs(OutputType.FILE);

        //özel isimler olabilmesi için date i dosya isimlerinin yanına ekledik
        String date = new SimpleDateFormat("yyyy-MM-dd/hh-mm-ss").format(new Date());

        String path = "test-output\\Screenshots\\logoScreenshot" + date + ".png";

        // Dosyamizi kaydettik
        FileUtils.copyFile(logoScreenshot, new File(path));


    }
}
