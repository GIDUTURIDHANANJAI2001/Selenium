package com.covalense.selenium.TheHostller;

public class Validate_coupon_ammmount extends fill_dates_apply_coupon {
    public static void  validate_coupon_amount()
    {

        if (price_before_apply_coupon.equalsIgnoreCase(price_after_apply_coupon))
        {
            System.out.println("FAIL: couopn is not applied ");
        }
        else
        {
            System.out.println("SUCCESS: coupon is applied");
        }
    }
}
