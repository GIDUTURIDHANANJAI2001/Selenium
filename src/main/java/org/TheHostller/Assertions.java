package com.covalense.selenium.TheHostller;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions extends Validate_coupon_ammmount {

    @Test
    public static  void validate_with_titles(String actualValue, String expectedValue)
    {
        try {
            Assert.assertNotEquals(actualValue, expectedValue);

        }
        catch (AssertionError e)
        {
            System.out.println("ASSERTION FAIL: user not directed to new page");
            throw e;


        }

    }

    @Test
    public static void Validate_Visiable_Element(WebElement element)
    {
        try {

            Assert.assertTrue(element.isDisplayed(), "Element is not visible");

        }
        catch (AssertionError e)
        {
            throw e;
        }

    }

    @Test
    public  static void Validate_two_Elements(String expectedTitle , String actualTitle)
    {

        try {
            Assert.assertEquals(expectedTitle, actualTitle);
        }
        catch (AssertionError e)
        {
            System.out.println("ASSERTION FAIL: Both values are not equal");
            throw e;


        }
    }

    @Test
    public static void Notnull(int value)
    {

        try {
            Assert.assertNotNull(value);
        }
        catch (AssertionError e)
        {
            System.out.println("ASSERTION FAIL: Both values are not equal");
            throw e;


        }
    }

    @Test
    public static void ButtonValidation(WebElement element)
    {
        try {
            Assert.assertTrue(element.isEnabled());
        }
        catch (AssertionError e)
        {
            System.out.println("ASSERTION FAIL: Both values are not equal");
            throw e;


        }
    }
}
