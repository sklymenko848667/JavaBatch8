package com.syntax.utils;

import com.syntax.testbase.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import java.util.concurrent.TimeUnit;

public class CommonMethods extends BaseClass {







/*
   protected static WebDriver driver;
    */
/**
     * this method will open a browser, set up configuration and navigate to the URL
     *//*

    public static void setUp() {

        ConfigsReader.readProperties("C:\\Users\\SK\\IntelliJ\\SeleniumBatch8\\src\\configs\\configuration.properties");
        switch (ConfigsReader.getPropertyValue("browser").toLowerCase()) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
                driver = new ChromeDriver();
                break;
            case "firefox":
                System.setProperty("webdriver.gecko.driver", "drivers/geckodriver");
                driver = new FirefoxDriver();
                break;
            default:
                throw new RuntimeException("Ivalid browser");
        }
        driver.get(ConfigsReader.getPropertyValue("url"));
        //driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    */
/**
     * this method will close any open browser
     *//*

    public static void tearDown(){
        if(driver!=null){
            driver.quit();
        }
    }

*/



}
