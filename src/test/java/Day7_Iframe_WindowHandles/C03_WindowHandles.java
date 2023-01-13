package Day7_Iframe_WindowHandles;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v102.network.model.ClientSecurityState;
import org.openqa.selenium.support.ui.Select;
import utilities.BaseTest;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class C03_WindowHandles extends BaseTest {

    @Test
    public void windowHandles(){

//    Go to URL: https://www.toolsqa.com/selenium-webdriver/window-handle-in-selenium/

        driver.get(" https://www.toolsqa.com/selenium-webdriver/window-handle-in-selenium/");


//    Print the existing windowHandles ids by clicking all the links on the page.

        //daha sonra kullanabilmek için anasayfa id mizi sakladık
        String homePageId=driver.getWindowHandle();

//    Click on the links that open a new page.

        //yeni sekmeler oluşturmak için target=_blank olan linklerden 2 tanesine tıklıyoruz
        List<WebElement>links=driver.findElements(By.xpath("//a[@target='_blank']"));

        links.get(0).click();
        links.get(1).click();

//    Close other pages other than the home page.

        //iterate etmek için(gezinmek içn)tüm tab ve window id lerini bir set içinde saklıyoruz
        Set<String> window=driver.getWindowHandles();

        //gezinme işlemi için iterator obj oluşturuyoruz
        Iterator<String>iterator=window.iterator();

        //gezinme işlemi
        while (iterator.hasNext()){

            //herbir gezinilen id kullanılarak o anki sekmeye switch ediyoruz
            driver.switchTo().window(iterator.next());

            //switch ettiğimiz sayfanın ana sayfa olup olmadığını kontrol ediyoruz.
            // ana sayfa ise sekmeyi kapatmıyorz değlse kapatıyoruz
            if (driver.getWindowHandle().equals(homePageId)){

                //driver.close u es geçiyoruz
                continue;
            }

            //sekmeyi kapatıyoruz
            driver.close();
        }

//    Set the driver back to the main page.


    }

}
