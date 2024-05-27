package com.covalense.selenium.TheHostller;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class NavigateToLoginPage extends  DriverSetup {

    static  String parenthandle;

    static String parentTitle;
    public static void navigate_to_login_page()
    {

        WebElement element = driver.findElement(By.xpath("//a[text()='LOGIN']"));
        element.click();


//        assertion
        Assertions.Validate_Visiable_Element(element);
        System.out.println("SUCCESS: user navigated to Login page");

        parenthandle = driver.getWindowHandle();
        parentTitle = driver.getTitle();


    }
}
