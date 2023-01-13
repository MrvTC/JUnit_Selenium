package Day13_Log4j_SeleniumExceptions_ExtentReport;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.BaseTestReport;

public class Log4JHomework extends BaseTestReport {


    @Test
    public void test() {

        //   Tasktaki her bir step icin lutfen log mesajlarini yazdirarak ilerleyiniz :)

        PropertyConfigurator.configure("log4j.properties");

        Logger logger = Logger.getLogger(C02_Log4jDemo.class.getName());

        //   Go to URL: https://healthunify.com/bmicalculator/

        driver.get("https://healthunify.com/bmicalculator/");

        //   Entring weight

        WebElement weight = driver.findElement(By.name("wg"));

        weight.sendKeys("70");

        logger.info("weight e değer giriyoruz");

        //   Selecting kilograms

        WebElement selectBirim = driver.findElement(By.name("opt1"));

        Select select = new Select(selectBirim);

        select.selectByValue("kilograms");

        logger.info("weight birim giriyoruz");

        //   Selecting height in feet

        WebElement heightBirim = driver.findElement(By.name("opt2"));

        Select select1 = new Select(heightBirim);

        select1.selectByValue("1");

        logger.info("height feet cinsinden seçiyoruz");

        //   Selecting height in inchs

        WebElement inchs = driver.findElement(By.name("opt3"));

        Select select2 = new Select(inchs);

        select2.selectByValue("5");

        logger.info("height inch degeri girdik");

        //   Clicking on calculate

        WebElement calculateButton = driver.findElement(By.name("cc"));

        calculateButton.click();

        logger.info("calculate tıklandı");

        //   Getting SIUnit value

        WebElement SIUnitValue = driver.findElement(By.name("si"));

        logger.info("SIUnitValue değeri alınıyor");

        System.out.println("SIUnit Value değeri " + SIUnitValue.getAttribute("value"));

        logger.error("SIUnit Value okunamıyor");

        //   Getting USUnit value

        WebElement SUnitvalue = driver.findElement(By.name("us"));

        logger.info("USUnit value değeri alınıyor");

        System.out.println("USUnit value değeri " + SUnitvalue.getAttribute("value"));

        logger.error("USUnit value okunamıyor");

        //   Getting UKUnit value

        WebElement UKUnitvalue = driver.findElement(By.name("uk"));

        logger.info("UKUnit value değeri alınıyor");

        System.out.println("UKUnit Value değeri " + UKUnitvalue.getAttribute("value"));

        logger.error("UKUnit Value okunamıyor");

        //   Getting overall description

        WebElement overallDescription = driver.findElement(By.name("desc"));

        logger.info("overall description değeri alınıyor");

        System.out.println("overallDescription değeri " + overallDescription.getAttribute("value"));

        logger.error("overall Description okunamıyor");

    }

}
