package Day6_Dropdown_SeleniumWaits;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.BaseTest;

import java.util.List;
import java.util.stream.Collectors;

public class SelectGetMethodsTask extends BaseTest {

    @After
    public void tearDown() {

    }

    @Test
    public void selectGetMethods() {

        //    - https://demoqa.com/select-menu sitesine gidin
        driver.get("https://demoqa.com/select-menu");

        //    - multiple <select> elementini locate edin
        WebElement dropDown = driver.findElement(By.id("cars"));
        Select select = new Select(dropDown);

        //    - getOptions(), getFirstSelectedOption(), getAllSelected() methodlarini kullanmak adina
        //* Farkli secimler yaparak methodlarinizi kullanin ve Assertion yapmayi unutmayin


        select.selectByValue("volvo");
        select.selectByIndex(2);
        select.selectByValue("audi");

        //getFirstSelectedOption() methodu ile
        System.out.println("getFirstSelectedOption() methodu ile: " + select.getFirstSelectedOption().getText());
        Assert.assertTrue(select.getFirstSelectedOption().isSelected());
        System.out.println();


        //getOptions() methodu ile
        System.out.println("getOptions() methodu ile: ");
        select.getOptions().forEach(t -> System.out.print(t.getText() + ","));
        List<WebElement> options = select.getOptions();
        Assert.assertTrue(options.get(0).isSelected());
        Assert.assertFalse(options.get(1).isSelected());
        Assert.assertTrue(options.get(2).isSelected());
        Assert.assertTrue(options.get(3).isSelected());
        System.out.println("\n");

         //getAllSelected() methodu ile

        System.out.println("getAllSelected() methodu ile: ");
        select.getAllSelectedOptions().forEach(t -> System.out.print(t.getText() + ","));

        List<WebElement> tumsecimler = select.getOptions();

        Assert.assertTrue(tumsecimler.get(0).isSelected());
        Assert.assertFalse(tumsecimler.get(1).isSelected());
        Assert.assertTrue(tumsecimler.get(2).isSelected());


    }
}
