package Day6_Dropdown_SeleniumWaits;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import utilities.BaseTest;

public class MultipleSelectTask extends BaseTest {

    @Override
    @After
    public void tearDown() {

    }

    @Test
    public void isMultiple() {

        //  - https://demoqa.com/select-menu sitesine gidin
        driver.get("https://demoqa.com/select-menu");


        //  - Multiple select yapabileceginiz <select> elementini locate edin

        Select select = new Select(driver.findElement(By.id("cars")));


        //  - Birden fazla secim yapip secimlerinizi DOGRULAyin

        System.out.println(select.isMultiple());
        select.selectByValue("volvo");
        select.selectByValue("saab");
        select.getAllSelectedOptions().forEach(t -> System.out.println("seçimler: " + t.getText()));


    }
}
