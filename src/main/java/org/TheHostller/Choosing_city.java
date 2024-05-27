package com.covalense.selenium.TheHostller;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Choosing_city extends NavigateToDestination {
    public static String choose_city(String city)
    {
        List<WebElement> cities = driver.findElements(By.xpath("//p[@class='md:text-base font-semibold text-sm text-black font-poppins']"));
        boolean cityClicked = false;
        for (WebElement webElement : cities) {
            String singlecit = webElement.getText();
            if (singlecit.equals(city)) {
                executor.executeScript("arguments[0].click();", webElement);
                cityClicked = true;
                Assertions.Validate_two_Elements(city,singlecit);
                System.out.println("SUCCESS: user clicked on " +singlecit +" city as destination ");
                break;

            }
        }
        if (!cityClicked) {
            System.out.println("FAIL :city is not there in list");
        }
        return city;
    }
}
