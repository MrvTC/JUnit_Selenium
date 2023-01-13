package amazonSenaryosu;

import com.github.javafaker.Faker;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import utilities.BaseTest;

import java.security.Key;
import java.util.List;

public class task01 extends BaseTest {





    @Override
    @After
    public void tearDown() {

    }

    @Test
    public void name() throws InterruptedException {

        //  https://www.amazon.com.tr/ sitesi açılır.
        driver.get("https://www.amazon.com.tr/");

        String homePage = driver.getWindowHandle();

        //  Ana sayfanın açıldığı kontrol edilir.

        Assert.assertTrue(driver.getCurrentUrl().contains("https://www.amazon.com.tr/"));

        //  Çerez tercihlerinden Çerezleri kabul et seçilir.

        WebElement cookiesControl = driver.findElement(By.className("a-button-inner"));
        cookiesControl.click();

        //  Siteye login olunur.

        Actions action = new Actions(driver);

        WebElement loginHoverPoint = driver.findElement(By.id("nav-link-accountList-nav-line-1"));

        Thread.sleep(1000);

        action.moveToElement(loginHoverPoint)//: Fare işaretçisini hedef konumun merkezine taşımak için

                .click(driver.findElement(By.xpath("//span[@class='nav-action-inner']")))

                .perform();

        WebElement emailInput = driver.findElement(By.id("ap_email"));

        emailInput.sendKeys("mail" + Keys.ENTER);
        WebElement continueButton = driver.findElement(By.id("continue"));
        continueButton.click(); //mail adresi doğru girilmediği için sifre adımına kadar ilerlenemedi..

        // Login işlemi kontrol edilir. [ mail adresi doğru girilmediği için login işlemi olmadı...]

        driver.navigate().to("https://www.amazon.com.tr/");

        //  Arama butonu yanındaki kategoriler tabından bilgisayar seçilir.
        WebElement catagories = driver.findElement(By.tagName("select"));

        Select select = new Select(catagories);

        catagories.click();

        WebElement computers = driver.findElement(By.xpath("//option[@value='search-alias=computers']"));

        computers.click();

        select.selectByValue("search-alias=computers");

        //  Bilgisayar kategorisi seçildiği kontrol edilir.

        Assert.assertTrue(computers.getText().contains("Bilgisayarlar"));


        //  Arama alanına MSI yazılır ve arama yapılır.
        WebElement searchButton = driver.findElement(By.id("twotabsearchtextbox"));
        searchButton.sendKeys("MSI");
        driver.findElement(By.id("nav-search-submit-button")).click();

        //  Arama yapıldığı kontrol edilir.

        Assert.assertTrue(driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']")).isDisplayed());

       //  Arama sonuçları sayfasından 2. sayfa açılır.

        driver.findElement(By.xpath("//span[@class='a-size-medium-plus a-color-base a-text-normal']"));

        WebElement ikinciSayfa = driver.findElement(By.xpath("//a[@aria-label='2 sayfasına git']"));
        ikinciSayfa.click();

        //  2. sayfanın açıldığı kontrol edilir.

        Assert.assertTrue(driver.findElement(By.xpath("//span[@aria-label='Geçerli sayfa, sayfa 2']")).isDisplayed());

        //  Sayfadaki 2. ürün favorilere eklenir.

        //2 sayfadaki ürünler listeye atıldı 2.ürün seçildi
        List<WebElement> searchResult = driver.findElements(By.xpath("//div[@data-component-type='s-search-result']"));
searchResult.get(1).click();



    // driver.findElement(By.xpath("//div[@class='a-button-stack']")).click();//email hesabı olmadığı için sepete ekledim

        //  2. Ürünün favorilere eklendiği kontrol edilir.

      // Assert.assertEquals(driver.findElement(By.xpath("//span[@class='div[@data-component-type='s-search-result']']")).getText(),text);

        //   Hesabım > Favori Listem sayfasına gidilir.

    //  “Favori Listem” sayfası açıldığı kontrol edilir.
    //  Eklenen ürün favorilerden silinir.
    //  Silme işleminin gerçekleştiği kontrol edilir.
    //  Üye çıkış işlemi yapılır.
    //  Çıkış işleminin yapıldığı kontrol edilir.



    }


}
