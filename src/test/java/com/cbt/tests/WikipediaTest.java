package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WikipediaTest {
    public static void main(String[] args) {
        /*Test case 3
Go to wikipedia.org (Links to an external site.)
enter search term `selenium webdriver`
click on search button
click on search result `Selenium (software)`
verify url ends with `Selenium_(software)'*/
        WebDriver driver= BrowserFactory.getDriver("chrome");
        driver.get("https://www.wikipedia.org/");
        driver.findElement(By.xpath("//input[@id=\"searchInput\"]")).sendKeys("selenium webdriver");
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
        driver.findElement(By.xpath("//a[@href=\"/wiki/Selenium_(software)\"]")).click();
        if (driver.getCurrentUrl().endsWith("Selenium_(software)"))
        {
            System.out.println("PASS");
        }else
        {
            System.out.println("FAIL");
        }
        driver.quit();
    }
}
