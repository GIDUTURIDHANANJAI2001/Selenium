package com.covalense.selenium.TheHostller;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Choosing_Dates extends Booknow {
    public static void chose_dates1()
    {
        try
        {
            WebElement chooosedates = driver.findElement(By.xpath("//div[@class='text-center bg-ht-100 font-semibold text-base font-poppins p-2 md:p-3 rounded-full md:text-xl ml-auto md:flex-row w-[21rem] md:w-96 shadow-lg cursor-pointer']"));
            Thread.sleep(Duration.ofSeconds(5));
            executor.executeScript("arguments[0].click();", chooosedates);
//            chooosedates.submit();


//    dates 12 th to 19th

//        12th aug webelement

            Actions actions = new Actions(driver);


            WebElement source = driver.findElement(By.xpath("//div[@class='rdrMonth'][2]//div[@class='rdrDays']//child::span[text()='12']"));
            String date1 = source.getText();
            Assertions.Validate_two_Elements(date1,"12");
            actions.moveToElement(source);
            Thread.sleep(Duration.ofSeconds(2));
            actions.click().build().perform();


            WebElement destionation = driver.findElement(By.xpath("//div[@class='rdrMonth'][1]//div[@class='rdrDays']//child::span[text()='19']"));
            String date2 = destionation.getText();
            Assertions.Validate_two_Elements(date2,"19");
            actions.moveToElement(destionation);
            Thread.sleep(Duration.ofSeconds(2));
            actions.click().build().perform();


            System.out.println("SUCCESS: user clicked dates on " + date1 + " to " + date2);

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
