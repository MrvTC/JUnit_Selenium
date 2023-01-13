package Day7_Iframe_WindowHandles;

import org.junit.Test;
import org.openqa.selenium.By;

import utilities.BaseTest;

import java.util.Iterator;
import java.util.Set;

public class WindowHandleTask01 extends BaseTest {


    @Override
    public void tearDown() {

    }


    @Test
    public void test() {

        //  Go to URL: https://demoqa.com/browser-windows

        driver.get("https://demoqa.com/browser-windows");

        String homePage = driver.getWindowHandle();

        //  Click on the windows - "WindowButton"

        driver.findElement(By.id("tabButton")).click();

        driver.findElement(By.id("windowButton"));

        driver.findElement(By.id("messageWindowButton"));

        //  Click on all the child windows.
        //  Print the text present on all the child windows in the console.

        Set<String> windows=driver.getWindowHandles();
        Iterator<String> i= windows.iterator();

        while (i.hasNext()){

            driver.switchTo().window(i.next());

            if(driver.getWindowHandle().equals(homePage)){
                continue;
            }
            System.out.println("Text on the child window: "+
                    driver.findElement(By.tagName("body")).getText());
            }

        //  Print the heading of the parent window in the console.

        driver.switchTo().window(homePage);
        System.out.println("homepage title: "+driver.getTitle());


        }


    }

