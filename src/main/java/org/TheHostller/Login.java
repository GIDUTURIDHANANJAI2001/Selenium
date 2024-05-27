package com.covalense.selenium.TheHostller;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class Login extends NavigateToLoginPage{

    public static void user_login()
    {
        try
        {


        propertyReader pro = new propertyReader();

//        frame handling
        WebElement iframe = driver.findElement(By.id("ps-push-frame"));
        driver.switchTo().frame(iframe);


//        skip notifications
        WebElement notifications_later = driver.findElement(By.xpath("//button[@id='ps-pn-disallow-button']"));
        executor.executeScript("arguments[0].click();", notifications_later);

//        switch back to parent window
        driver.switchTo().window(parenthandle);

//        email element
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys(pro.getProperty("username"));


//        password
        WebElement passwords = driver.findElement(By.id("password"));
        passwords.sendKeys(pro.getProperty("password"));



//       submit
        WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
        submit.click();

//        assertion
        Assertions.Validate_Visiable_Element(submit);
        System.out.println("SUCCESS:user login successfully");


        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
