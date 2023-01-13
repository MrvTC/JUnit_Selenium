package Day9_JSEScroll_Cookies_Files;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.BaseTest;

public class UploadFileTask extends BaseTest {


    @Override
    @After
    public void tearDown() {

    }

    @Test
    public void test() {


        //  Go to URL: https://www.monsterindia.com/seeker/registration

        driver.get("https://www.monsterindia.com/seeker/registration");

        //  Upload file.

        WebElement chooseCVButton=driver.findElement(By.id("file-upload"));
        chooseCVButton.sendKeys("C:\\Users\\merve\\Desktop\\file.docx");

        WebElement registraionDetails = driver.findElement(By.id("registrationDetails"));
        Assert.assertEquals("file.docx" , registraionDetails.getText());


    }
}