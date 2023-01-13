package Day2_WebElementLocators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01_Locators {

    WebDriver driver;

@Before
   public void setup(){

    //driver oluşturuldu
    WebDriverManager.chromedriver().setup();
    //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver=new ChromeDriver();
    //linkedin sitesine gidildi
    driver.get("https://www.linkedin.com");
    driver.manage().window().maximize();


   }
   @After
   public void tearDown(){
//driver.quit();

   }

    @Test
    public void idLocator(){

    //id locator -->> session_key

      WebElement email=  driver.findElement(By.id("session_key"));
email.sendKeys("Claruswy selenium dersinden selamlar");

    }

    @Test
    public void nameLocator(){

    //name locator --> session_password

       WebElement password= driver.findElement(By.name("session_password"));

password.sendKeys("sifre");


    }

    @Test
    public void classLocator(){

    //class locator --> input__input

        WebElement email=driver.findElement(By.className("input__input"));

        email.sendKeys("class locator test");


    }

    @Test
    public void tagLocator(){

    //tag locator --> "input"

        List<WebElement> emailList=driver.findElements(By.tagName("input"));

        WebElement email=emailList.get(1);
        email.sendKeys("tag locator test");
    }
@Test
    public void linkTextLocator(){

    //link text --> Şifrenizi mi unuttunuz?

    WebElement forgotPwd=driver.findElement(By.linkText("Şifrenizi mi unuttunuz?"));
    forgotPwd.click();

}
@Test
    public void partialLinkTextLocator(){

        //link text --> Şifrenizi mi unuttunuz?

        WebElement forgotPwd=driver.findElement(By.partialLinkText("Şifrenizi mi unuttunuz?"));
        forgotPwd.click();

    }

    @Test
    public void absoluteXpath(){

    WebElement email=driver.findElement(By.xpath("/html/body/main/section[1]/div/div/form/div[2]/div[1]/input"));
email.sendKeys("merve gayet başarılı :) ");
    }

    @Test
    public void relativeXpath(){

        // xpath locator -> //input[@name='session_key']

        WebElement email = driver.findElement(By.xpath("//input[@name='session_key']"));
        email.sendKeys("merve relative xpath konusunu gayet basirili tamamladi");

    }

    @Test
    public void containsXpath(){

        // xpath locator -> //input[contains (@ id,'session')]

        WebElement email = driver.findElement(By.xpath("//input[contains (@ id,'session')]"));
        email.sendKeys("merve containsXpath konusunu gayet basirili tamamladi");

    }

    @Test
    public void multipleAttributeXpath(){

        // xpath locator -> //input[@class='input__input'][@name='session_key']
        WebElement email = driver.findElement(By.xpath("//input[@class='input__input'][@name='session_key']"));
        email.sendKeys("merve multipleAttributeXpath konusunu gayet basirili tamamladi");

    }

    @Test
    public void andOrXpath(){

        // xpath locator -> //input[@class='input__input' and @name='session_key']

        WebElement email = driver.findElement(By.xpath("//input[@class='input__input' and @name='session_key']"));
        email.sendKeys("merve andOrXpath konusunu gayet basirili tamamladi");

    }

    @Test
    public void textXpath(){

        // xpath locator -> //button[contains(text(),'Oturum açın' )]

        WebElement email = driver.findElement(By.xpath("//button[contains(text(),'Oturum açın' )]"));
        email.sendKeys("merve textXpath konusunu gayet basirili tamamladi");

    }



}
