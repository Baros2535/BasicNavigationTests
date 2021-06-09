package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EbaySearchSelenium {
    public static void main(String[] args) {
        /*Test case 2
Go to Ebay
search Selenium
click on search button
verify title contains Selenium*/
        WebDriver driver= BrowserFactory.getDriver("chrome");
        driver.get("https://www.ebay.com/");
        WebElement locationOfSearchBox=driver.findElement(By.xpath("//input[@class=\"gh-tb ui-autocomplete-input\"]"));
        locationOfSearchBox.sendKeys("Selenium");
        driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
        if (   driver.getTitle().contains("Selenium"))
        {
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }
       driver.quit();
    }
}
