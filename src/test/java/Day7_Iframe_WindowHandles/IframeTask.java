package Day7_Iframe_WindowHandles;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.BaseTest;

import java.util.List;

public class IframeTask extends BaseTest {

    @Override
    @After
    public void tearDown() {

    }

    @Test
    public void iframeTest() {

        //   Go to URL: http://demo.guru99.com/test/guru99home/

        driver.get("http://demo.guru99.com/test/guru99home/");
        String mainPageId=driver.getWindowHandle();

        //   Find the number of iframes on the page.

        List<WebElement> iframeElements = driver.findElements(By.xpath("//iframe"));
        System.out.println("the number of iframes: " + iframeElements.size());

        //   Link to the fourth iframe (JMeter Made Easy) (https://www.guru99.com/live selenium project.html) click here.

        driver.switchTo().frame("a077aa5e");
        driver.findElement(By.xpath("//img[@src='Jmeter720.png']")).click();

        //   Exit the iframe and return to the main page.

        driver.switchTo().defaultContent();
        driver.switchTo().window(mainPageId);

    }


}
