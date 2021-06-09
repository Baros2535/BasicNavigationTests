package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EbaySearchTest {
    /*Test case 1
Go to Ebay
enter search term
click on search button
print number of results

*/

    public static void main(String[] args) {
       WebDriver driver= BrowserFactory.getDriver("chrome");
        driver.get("https://www.ebay.com/");
    WebElement locationOfSearchBox=driver.findElement(By.xpath("//input[@class=\"gh-tb ui-autocomplete-input\"]"));
       locationOfSearchBox.sendKeys("apple");
       driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
        System.out.println(driver.findElement(By.xpath("//h1/span")).getText());
      driver.quit();
    }

}
