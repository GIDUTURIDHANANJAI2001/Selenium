package com.covalense.selenium.TheHostller;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class Nearest_price extends Choosing_Dates {
    static class ClosestResult {
        int closestNumber;
        int index;

        ClosestResult(int closestNumber, int index) {
            this.closestNumber = closestNumber;
            this.index = index;
        }
    }

    // Method to convert room prices from web elements to integers
    public static List<Integer> convertPricesToIntegers(List<WebElement> elements) {
        List<Integer> prices = new ArrayList<>();
        for (WebElement element : elements) {
            String priceText = element.getText().replaceAll("[^\\d]", ""); // Extracts only digits
            if (!priceText.isEmpty()) {
                prices.add(Integer.parseInt(priceText));
            }
        }
        return prices;
    }

    // Method to find the closest room price to a target amount
    public static ClosestResult findClosestPriceWithIndex(List<Integer> prices, int target) {

                // Locating room prices

        if (prices.isEmpty()) {
            throw new IllegalArgumentException("No room prices found.");
        }

        int closestPrice = prices.get(0);
        int minDiff = Math.abs(closestPrice - target);
        int closestIndex = 0;

        for (int i = 0; i < prices.size(); i++) {
            int price = prices.get(i);
            int diff = Math.abs(price - target);
            if (diff < minDiff) {
                closestPrice = price;
                minDiff = diff;
                closestIndex = i;
            }
        }
        return new ClosestResult(closestPrice, closestIndex);
    }

    static ClosestResult result;
    public static void Nearest_price(int finalinputtarget)
    {
        List<WebElement> priceElements = driver.findElements(By.xpath("//span[@class='font-mulish font-extrabold']"));

        // Converting room prices to integers
        List<Integer> prices = convertPricesToIntegers(priceElements);

        // Defining the target amount
        int targetAmount = finalinputtarget;


        try {
            result = findClosestPriceWithIndex(prices, targetAmount);

//            System.out.println("Closest room price to " + targetAmount + " is: " + result.closestNumber +
//                    " at index: " + result.index);
            Assertions.Notnull(result.closestNumber);
            Assertions.Notnull(result.index);
            System.out.println("SUCCESS: nearest price taken and Closest room price to" + targetAmount +  " is: " + result.closestNumber +
                  " at index: " + result.index);
        }
        catch (Exception E)
        {
            E.printStackTrace();
        }
    }

}
