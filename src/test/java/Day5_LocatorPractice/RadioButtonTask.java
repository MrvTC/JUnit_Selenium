package Day5_LocatorPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;
import java.util.TreeMap;

public class RadioButtonTask {

    //Go to URL: https://demoqa.com/radio-button
//Soruya verilen 3 seçeneğin de seçilme durumlarını doğrulayınız.
//Her bir seçenek seçildiğinde aşağıda çıkan text’leri konsolda yazdırınız.

    WebDriver driver;

    @Before
    public void setup() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() {

        //driver.quit();
    }

    @Test
    public void radioButton() {

        //Go to URL: https://demoqa.com/radio-button
        driver.get("https://demoqa.com/radio-button");


        //Soruya verilen 3 seçeneğin de seçilme durumlarını doğrulayınız.
        //Her bir seçenek seçildiğinde aşağıda çıkan text’leri konsolda yazdırınız.

        WebElement yesRadio = driver.findElement(By.xpath("//label[@for='yesRadio']"));
        if (!yesRadio.isSelected()) {
            yesRadio.click();
        }
        Assert.assertFalse(yesRadio.isSelected());
        WebElement yesRadioText = driver.findElement(By.xpath("//p[text()='You have selected ']"));
        System.out.println("yes text: " + yesRadioText.getText());



        WebElement impressiveRadio = driver.findElement(By.xpath("//label[@for='impressiveRadio']"));
        if (!impressiveRadio.isSelected()) {
            impressiveRadio.click();
        }
        Assert.assertFalse(impressiveRadio.isSelected());
        WebElement impressiverRadioText = driver.findElement(By.xpath("//p[text()='You have selected ']"));
        System.out.println("impressive text: " + impressiverRadioText.getText());



        WebElement noRadioButtonKontrol = driver.findElement(By.xpath("//label[@for='noRadio']"));
        Assert.assertTrue(noRadioButtonKontrol.isEnabled());


    }

}