package com.cbt.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.Locale;

public class BrowserFactory {

    public static WebDriver getDriver(String browser){
         WebDriver driver=null;

         if (browser.toLowerCase().equals("chrome"))
         {

             WebDriverManager.chromedriver().setup();
           return new ChromeDriver();


         }if(browser.toLowerCase().equals("firefox")){

             WebDriverManager.firefoxdriver().setup();
       return new FirefoxDriver();

         }
         if (browser.toLowerCase().equals("edge")&& System.getProperty("os.name").contains("Windows")){

             WebDriverManager.edgedriver().setup();
             return new EdgeDriver();


         }
         if (browser.toLowerCase().equals("safari")&&System.getProperty("os.name").contains("Mac")){

       return new SafariDriver();
         }else{
             return driver;
         }









    }


}
