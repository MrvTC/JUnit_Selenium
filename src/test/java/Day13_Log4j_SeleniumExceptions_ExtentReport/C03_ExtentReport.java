package Day13_Log4j_SeleniumExceptions_ExtentReport;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.BaseTestReport;

public class C03_ExtentReport extends BaseTestReport {

@Test
    public void test(){

    //testi yapacak olan hertürlü mesajı geçip kaldığını belirtecek extent test obj oluşturuyoruz
    extentTest=extentReports.createTest("My test","bu bir açıklamadır");

    extentTest.info("amazona gidiliyor...");

    driver.get("https://www.amazon.com.tr");

    WebElement searchBox=driver.findElement(By.id("twotabsearchtextbox"));

    extentTest.info("arama kısmına log4j yazılıyor");

    searchBox.sendKeys("log4j");

    extentTest.pass("test geçerli");

    extentTest.fail("test geçersiz");

    extentTest.skip("test skip edildi.");














}











}
