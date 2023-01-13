package Day6_Dropdown_SeleniumWaits;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.BaseTest;

public class dropDownTask extends BaseTest {


    @Override
    @After
    public void tearDown() {

    }

    @Test
    public void drpDown() {

        //   Go to URL: https://the-internet.herokuapp.com/dropdown

        driver.get("https://the-internet.herokuapp.com/dropdown");

        selectByIndexTest();
        selectByValueTest();
        selectByVisibleTextTest();
        printAllTest();
        printFirstSelectedOptionTest();

        //   Verify the dropdown has Option 2 text.

        Select select = new Select(driver.findElement(By.id("dropdown")));

        Assert.assertTrue(select.getOptions().get(1).isDisplayed());

        //   Find the size of the dropdown, Print "Expected Is Not Equal Actual" if there are not 3 elements in the dropdown.

        Assert.assertEquals("Expected Is Not Equal Actual", select.getOptions().size(), 3);

    }

    //   Create method selectByIndexTest and Select Option 1 using index .
    public void selectByIndexTest() {

        Select select = new Select(driver.findElement(By.id("dropdown")));
        select.selectByIndex(0);

    }

    //   Create method selectByValueTest Select Option 2 by value.
    public void selectByValueTest() {

        Select select = new Select(driver.findElement(By.id("dropdown")));
        select.selectByValue("2");

    }

    //   Create method selectByVisibleTextTest Select Option 1 value by visible text.
    public void selectByVisibleTextTest() {

        Select select = new Select(driver.findElement(By.id("dropdown")));
        select.selectByVisibleText("Option 1");

    }

    //   Create method printAllTest Print all dropdown value.
    public void printAllTest() {

        Select select = new Select(driver.findElement(By.id("dropdown")));
        select.getOptions().forEach(t -> System.out.println(t.getText()));

    }

    //   Create method printFirstSelectedOptionTest Print first selected option.
    public void printFirstSelectedOptionTest() {

        System.out.println();
        Select select = new Select(driver.findElement(By.id("dropdown")));
        select.selectByVisibleText("Option 1");
        select.selectByIndex(1);
        System.out.println("first selected option: " + select.getFirstSelectedOption().getText());

    }

}
