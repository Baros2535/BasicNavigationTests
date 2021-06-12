package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AmazonHomework {

    public static void main(String[] args) {
        WebDriver driver= BrowserFactory.getDriver("chrome");
        driver.get("https://www.amazon.com/");
        driver.findElement(By.xpath("//div[@class=\"a-section a-spacing-none fluid-image-container\"]/img[@alt=\"Find your ideal TV\"]")).click();
        driver.quit();
    }
}
