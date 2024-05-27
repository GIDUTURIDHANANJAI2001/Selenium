package com.covalense.selenium.TheHostller;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class fill_dates_apply_coupon extends SelectRooms{



    static  String price_before_apply_coupon;

    static  String price_after_apply_coupon;

    public static void filldates_and_applycoupon()
    {
        try {

            WebElement reviewbooking = driver.findElement(By.xpath("//button[text()='REVIEW BOOKING']"));
            //            assertion
            Assertions.Validate_Visiable_Element(reviewbooking);
            executor.executeScript("arguments[0].click();", reviewbooking);



            WebElement first_name = driver.findElement(By.xpath("//input[@id='first_name']"));
            first_name.sendKeys(propertyReader.getProperty("first_name"));

            WebElement last_name = driver.findElement(By.xpath("//input[@id='last_name']"));
            last_name.sendKeys(propertyReader.getProperty("last_name"));

            WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
            email.sendKeys(propertyReader.getProperty("email"));

            WebElement phone = driver.findElement(By.xpath("//input[@id='phone']"));
            phone.sendKeys(propertyReader.getProperty("phone_number"));

            Thread.sleep(Duration.ofSeconds(6));
//        total price before clicking on coupon
            WebElement totalprice  = driver.findElement(By.xpath("//p[@class='font-extrabold ml-auto px-2 font-roboto text-2xl']/span"));
            price_before_apply_coupon =totalprice.getText();
            System.out.println("price before applying coupon is : " +price_before_apply_coupon);



            Thread.sleep(Duration.ofSeconds(8));

//        applying coupon
            WebElement coupon = driver.findElement(By.xpath("//input[@id='helper-radio-0']"));
            executor.executeScript("arguments[0].click();", coupon);
            Assertions.ButtonValidation(coupon);
            System.out.println("SUCCESS: user applied coupon successfully");

            Thread.sleep(Duration.ofSeconds(8));
//      total price before clicking on coupon

            WebElement totalprice1  = driver.findElement(By.xpath("//p[@class='font-extrabold ml-auto px-2 font-roboto text-2xl']/span"));

            price_after_apply_coupon = totalprice1.getText();
            System.out.println("price after applying coupon is : " +price_after_apply_coupon);


        }
        catch (Exception E)
        {
            E.printStackTrace();
        }



    }

}
