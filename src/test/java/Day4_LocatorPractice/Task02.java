package Day4_LocatorPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class Task02 {

    //Navigate to https://testpages.herokuapp.com/styled/index.html
    // Click on Calculate under Micro Apps.
    // Type any number in the first input.
    // Type any number in the second input.
    // Click on Calculate.
    // Get the result.
    // Print the result.

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
    public void test02() {

        //Navigate to https://testpages.herokuapp.com/styled/index.html

        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");

    // Click on Calculate under Micro Apps.

        driver.findElement(By.id("calculatetest")).click();

    // Type any number in the first input.

        driver.findElement(By.id("number1")).sendKeys("5425" + Keys.ENTER);


    // Type any number in the second input.

        driver.findElement(By.id("number2")).sendKeys("475" + Keys.ENTER);

    // Click on Calculate.

        driver.findElement(By.id("calculate")).click();

    // Get the result.

        WebElement result = driver.findElement(By.id("answer"));
        String resultText=result.getText();

    // Print the result.

        System.out.println(resultText);


    }


}
