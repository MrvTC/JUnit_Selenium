package Day4_LocatorPractice;

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

import static org.junit.Assert.assertEquals;

public class Task01 {

    //https://id.heroku.com/login sayfasına gidiniz.
//Bir mail adresi giriniz.
//Bir password giriniz.
//Login butonuna tıklayınız.
//"There was a problem with your login." text görünür ise "Kayıt Yapılamadı" yazdırınız.
//Eğer yazı görünür değilse "Kayıt Yapıldı" yazdırınız.
//Tüm sayfaları kapatınız.

    WebDriver driver;

    @Before
    public void setup() {
        //Driver ile ilgili her turlu initial(baslangic) islemi burada yapilir
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() {
        // test sonrasinda driver kapatmak (varsa raporlari dosyalamak) icin kullanilir.
        // driver.quit();
    }

    @Test
    public void test01() {
        //https://id.heroku.com/login sayfasına gidiniz.
        driver.get("https://id.heroku.com/login");

        //Bir mail adresi giriniz.
        WebElement email = driver.findElement(By.xpath("//input[@autofocus='true']"));

        email.sendKeys("merve@com");

        //Bir password giriniz.
        WebElement password = driver.findElement(By.xpath("//input[@autocomplete='off']"));

        password.sendKeys("password");


        //Login butonuna tıklayınız.

        driver.findElement(By.xpath("//button[@name='commit']")).click();


        //"There was a problem with your login." text görünür ise "Kayıt Yapılamadı" yazdırınız.

        WebElement result = driver.findElement(By.xpath("//div[@role='alert']"));

      //  Assert.assertFalse("kayıt yapılamadı", result.isDisplayed());

       //Eğer yazı görünür değilse "Kayıt Yapıldı" yazdırınız.

      //  Assert.assertTrue("Kayıt Yapıldı", result.isDisplayed());


        Assert.assertTrue("düzgün çalışmıyor",result.getText().contains("There was a problem with your login."));




    }


}
