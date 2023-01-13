package Day8_WindowHandles_Actions;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.BaseTest;

public class C04_Actions extends BaseTest {

    @Override
    @After
    public void tearDown() {

    }

    @Test
    public void dragAndDropOffSet(){

        driver.get("https://rangeslider.js.org/");

//slider locate ediliyor
        WebElement slider=driver.findElement(By.xpath("//div[@class='rangeslider__handle']"));

        Actions actions=new Actions(driver);

        //sağa taşıma işlemleri için xoffset + olmalı, sola taşıma işlemleri için xoffset - olmalı
        //aynı zamanda dikey eksende hareket olmasını engellemek için yoffset 0 olarak belirlenmelidir.
        actions.dragAndDropBy(slider,-100,0).perform();


    }











}
