package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homework2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");
        By locationOfHome= By.xpath("/html/body/nav/ul/li/a");
        By locationOfHeader=By.xpath("//h2[\"Forgot Pasword\"]");
        By locationOfEmailText=By.xpath("//label[@for=\"email\"]");
        By locationOfEmailTextBox=By.xpath("//input[@name=\"email\"]");
        By locationOfButton=By.xpath("//button[@id=\"form_submit\"]");
        System.out.println(driver.findElement(locationOfHome).getText());
        System.out.println(driver.findElement(locationOfHeader).getText());
        System.out.println(driver.findElement(locationOfEmailText).getText());
        driver.findElement(locationOfEmailTextBox).sendKeys("brsaltn.25@gmail.com");
        System.out.println(driver.findElement(locationOfButton).getText());
        Thread.sleep(3000);
        driver.quit();

    }
}
