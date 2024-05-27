package com.covalense.selenium.TheHostller;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SelectRooms extends Nearest_price {
    public static void Select_Rooms()
    {
        String xpath = "(//button[@class='bg-black text-white p-2 px-6 md:px-8 mt-2 rounded-md ml-auto'] " +
                    "| //p[@class='text-red-600 font-semibold px-3 mt-2 font-poppins rounded-md ml-auto'])['"+result.index+1+"']";
            List<WebElement> elements = driver.findElements(By.xpath(xpath));
            if (Nearest_price.result.index >= 0 && result.index < elements.size()) {
                // Get the element at the specified index
                WebElement element1 = elements.get(result.index);
                System.out.println("SUCCESS: user selected room as " + element1.getText() + "with index of " + result.index);

                if (element1.getText().equalsIgnoreCase("Add Bed" ) || element1.getText().equalsIgnoreCase("Add Room"))
                {
                    executor.executeScript("arguments[0].click();", element1);
                }
                else {
                    System.out.println("FAILURE : beds are soldout");

                }

            } else {
                System.out.println("FAILURE : Index out of bounds. with" + result.index);
            }

    }
}
