package Day6_Dropdown_SeleniumWaits;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.BaseTest;

import java.util.List;

public class selectMethodstask01 extends BaseTest {

    @Override
    @After
    public void tearDown() {

    }

    @Test
    public void selectMethod(){

        // - https://demoqa.com/select-menu sitesine gidin

        driver.get("https://demoqa.com/select-menu");

        // - <select> elementini locate edin

        WebElement drpDown= driver.findElement(By.id("oldSelectMenu"));
        Select select=new Select(drpDown);

        //  - <select> elementinin seceneklerini yazdirin
        List<WebElement>options=select.getOptions();
        options.forEach(t-> System.out.println(t.getText()));

        //  - Sirasiyla selectByIndex, selectByValue, selectByVisibleText methodlarini kullanarak;
        // * Yellow (index)
        // * Purple (value)
        // * Black  (text)
        //   seceneklerini secin

        select.selectByIndex(3);
        select.selectByValue("4");
        select.selectByVisibleText("Black");

    }

}
