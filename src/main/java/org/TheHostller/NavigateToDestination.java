package com.covalense.selenium.TheHostller;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class NavigateToDestination extends Login{
    public static void nav_to_Destination()
    {

        WebElement destinations = driver.findElement(By.xpath("//a[text()='Destinations']"));
        destinations.click();


        //        assertion
        Assertions.Validate_Visiable_Element(destinations);
        System.out.println("SUCCESS: user navigated to Destination Successfully");

    }

}
