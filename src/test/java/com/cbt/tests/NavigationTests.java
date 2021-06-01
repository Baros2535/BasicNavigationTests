package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.WebDriver;

public class NavigationTests {
    public static void main(String[] args) {
       testSafari();
      testChrome();
     testFirefox();
    }

    private static void testFirefox() {
        WebDriver driver= BrowserFactory.getDriver("firefox");
        driver.get("https://www.google.com/");
        String googleTitle=driver.getTitle();
        driver.get("https://www.etsy.com/");
        String etsyTitle=driver.getTitle();
        driver.navigate().back();
        String actualGoogleTitle=driver.getTitle();
        StringUtility.verifyEquals(googleTitle,actualGoogleTitle);
        driver.navigate().forward();
        String etsyActualTitle= driver.getTitle();
        StringUtility.verifyEquals(etsyTitle,etsyActualTitle);
        driver.quit();
    }

    private static void testChrome() {
        WebDriver driver= BrowserFactory.getDriver("chrome");
        driver.navigate().to("https://www.google.com/");
        String googleTitle=driver.getTitle();
        driver.get("https://www.etsy.com/");
        String etsyTitle=driver.getTitle();
        driver.navigate().back();
        String actualGoogleTitle=driver.getTitle();
        StringUtility.verifyEquals(googleTitle,actualGoogleTitle);
        driver.navigate().forward();
        String etsyActualTitle= driver.getTitle();
        StringUtility.verifyEquals(etsyTitle,etsyActualTitle);
        driver.quit();
    }

    private static void testSafari() {
    WebDriver driver= BrowserFactory.getDriver("safari");
    driver.get("https://www.google.com/");
    String googleTitle=driver.getTitle();
    driver.get("https://www.etsy.com/");
    String etsyTitle=driver.getTitle();
    driver.navigate().back();
    String actualGoogleTitle=driver.getTitle();
        StringUtility.verifyEquals(googleTitle,actualGoogleTitle);
        driver.navigate().forward();
        String etsyActualTitle= driver.getTitle();
        StringUtility.verifyEquals(etsyTitle,etsyActualTitle);
        driver.quit();

    }
}
