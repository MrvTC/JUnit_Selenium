package Day9_JSEScroll_Cookies_Files;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Cookie;
import utilities.BaseTest;

import java.util.Set;

public class CookiesTask extends BaseTest {

    @Override
    @After
    public void tearDown() {

    }

    @Test
    public void cookiesTest() {

       // Go to URL: http://facebook.com
        driver.get("http://facebook.com");

       // getCookies,

        System.out.println("test get cookies");

        Set<Cookie> cerezim=driver.manage().getCookies();

        cerezim.forEach(t-> System.out.println(t.getName().toString()));

       // addCookie,

        System.out.println();
        Cookie cookie1 = new Cookie("ebik","gabık");
        driver.manage().addCookie(cookie1);
        Assert.assertEquals(cookie1.getValue(), driver.manage().getCookieNamed(cookie1.getName()).getValue());
        Set<Cookie>  allCookies = driver.manage().getCookies();
        System.out.println("allCookies = " + allCookies.size());

       // deleteCookieNamed,

        driver.manage().deleteCookie(cookie1);
        Set<Cookie>  kalanCookies= driver.manage().getCookies();
       System.out.println("allCookies = " + kalanCookies.size());
        cerezim.forEach(t-> System.out.println(t.getName().toString()));

       // deleteAllCookies.

        driver.manage().deleteAllCookies();
        allCookies = driver.manage().getCookies();
        System.out.println("allCookies = " + allCookies.size());








    }
}
