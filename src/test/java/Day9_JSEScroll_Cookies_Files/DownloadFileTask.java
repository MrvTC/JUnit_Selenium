package Day9_JSEScroll_Cookies_Files;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.BaseTest;

import java.io.File;

public class DownloadFileTask extends BaseTest {

    @Override
    @After
    public void tearDown() {

    }

    @Test
    public void test() {

        // Go to https://the-internet.herokuapp.com/download
        driver.get("https://the-internet.herokuapp.com/download");

        //  Download sample.png file

        WebElement downloadFile = driver.findElement(By.linkText("sample.png"));
        downloadFile.click();

        //  Then verify if the file downloaded successfully

        String fullPath = "C:\\Users\\merve\\Downloads\\sample.png";

        File sampleImg = new File(fullPath);

        Assert.assertTrue("File not found", sampleImg.exists());


    }
}
