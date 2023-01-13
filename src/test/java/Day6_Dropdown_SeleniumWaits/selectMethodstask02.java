package Day6_Dropdown_SeleniumWaits;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.BaseTest;

public class selectMethodstask02 extends BaseTest {


    @Override
    @After
    public void tearDown() {

    }

    @Test
    public void selectMethod() {

        // Launch the browser.
        // Open "https://demoqa.com/select-menu".

        driver.get("https://demoqa.com/select-menu");

        // Select the Standard Multi-Select using the element id.

        Select select = new Select(driver.findElement(By.id("cars")));

        // Verifying that the element is multi-select.

        Assert.assertTrue(select.isMultiple());

        // Select 'Opel' using the index and deselect the same using index.
        select.selectByIndex(2);
        select.deselectByIndex(2);

        // Select 'Saab' using value and deselect the same using value.

        select.selectByValue("saab");
        select.deselectByValue("saab");

        // Deselect all the options.
        select.deselectAll();

        // Close the browser.
        driver.close();

    }


}
