package com.covalense.selenium.TheHostller;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.time.Duration;

public class DriverSetup{

    static WebDriver driver;
    static JavascriptExecutor executor;

    static String Title_before_click;

    static String Title_after_click;

    public static void Driver_setup()
    {
        FirefoxOptions options = new FirefoxOptions();
        driver = new FirefoxDriver(options);
        driver.manage().window().maximize(); //maximizing the window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //implicit wait of 10sec
//        for click action
        executor = (JavascriptExecutor)driver;
//        setting link
        driver.get("https://www.thehosteller.com/");

        System.out.println("SUCCESS: user driver setup done");


    }
}
