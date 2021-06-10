package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homework1 {

    public static void main(String[] args) {

        testCas1();
        testCas2();
        testCas3();

    }

    private static void testCas1() {
        WebDriver driver= BrowserFactory.getDriver("chrome");
        driver.get("https://www.ebay.com/");
        WebElement locationOfSearchBox=driver.findElement(By.xpath("//input[@class=\"gh-tb ui-autocomplete-input\"]"));
        locationOfSearchBox.sendKeys("apple");
        driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
        System.out.println(driver.findElement(By.xpath("//h1/span")).getText());
        driver.quit();
    }

    private static void testCas2() {
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

    private static void testCas3() {
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
