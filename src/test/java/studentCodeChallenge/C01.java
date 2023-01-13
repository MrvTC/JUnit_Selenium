package studentCodeChallenge;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class C01 {

    //1-->git->"https://amazon.com"
//2-->arama kutusundan "Electronic" seç
//3-->"tv" yazdır
//4-->"2. sayfaya" git
//5-->tv  sepete ekle
//6-->sepete git
//7-->Proceed to checkout' a tıkla
//8-->"Email or mobile phone number" gir
//9-->"continue" butonuna tıkla
//10--->"There was a problem" yazısının görüntülendiğini kontrol et
//11-->Taraycı kapat


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
    public void test(){

        driver.get("\"https://amazon.com\"");
        Select select=new Select(driver.findElement(By.cssSelector("#searchDropdownBox")));
        select.selectByValue("search-alias");






    }
}
