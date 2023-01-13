package day12_ScreenShots;

import org.apache.commons.io.FileUtils;
import org.bson.BsonString;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import utilities.BaseTest;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class WebelementScreenshotTask extends BaseTest {

    @Override
    @After
    public void tearDown() {

    }

    @Test
    public void test() throws IOException {

        // Go to URL: https://opensource-demo.orangehrmlive.com/

        driver.get("https://opensource-demo.orangehrmlive.com/");

        // Getting screenshot of  Orange HRM Page Section.

        WebElement pageSection = driver.findElement(By.xpath("//div[@class='orangehrm-login-layout']"));

        File pageScreenshot = pageSection.getScreenshotAs(OutputType.FILE);

        // Save the screenshot with format 'screenshotname_yyyy_MM_dd_hh_mm_ss.png'

        String date = new SimpleDateFormat("yyyy-MM-dd/hh-mm-ss").format(new Date());

        String path = "test-output\\Screenshots\\logoScreenshot1" + date + ".png";

        FileUtils.copyFile(pageScreenshot,new File(path));

    }
}
