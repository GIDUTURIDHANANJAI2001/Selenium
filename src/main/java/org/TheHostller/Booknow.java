package com.covalense.selenium.TheHostller;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Booknow extends Choosing_city{
    public static void choose_booknow()
    {
        String TitleBefore = driver.getCurrentUrl();
        WebElement boknow = driver.findElement(By.xpath("//div[@class='ml-auto pt-5 ']//a"));
        Assertions.Validate_Visiable_Element(boknow);


        executor.executeScript("arguments[0].click();", boknow);
        String TitleAfter = driver.getCurrentUrl();

//        Assertion

        Assertions.validate_with_titles(TitleBefore,TitleAfter);
        System.out.println("SUCCESS: user clicked on BOOKNOW Successfully");
    }
}
