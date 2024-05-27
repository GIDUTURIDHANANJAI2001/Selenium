package com.covalense.selenium.TheHostller;

//
//1.Go to The Hosteller website.(
//        https://www.thehosteller.com/
//        )
//
//        2.Navigate to the login page.
//
//        3.Log in as a user.
//
//        4.Go to the destination page.
//
//        5.Select a city.
//
//        6.Choose a preferred hotel.
//
//        7.Choose dates (at least 7 days).
//
//        8.Choose beds.
//
//        9.Navigate to the review page.
//
//        10.Fill in your details and apply a coupon.
//
//        11.Validate the price (before and after applying the coupon).

import java.util.Scanner;

public class The_Hostller extends Validate_coupon_ammmount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter your destination : ");
        String destination = sc.nextLine();
        System.out.println("enter your price:");
        int price = sc.nextInt();


        DriverSetup.Driver_setup();
        NavigateToLoginPage.navigate_to_login_page();
        Login.user_login();
        NavigateToDestination.nav_to_Destination();
        Choosing_city.choose_city(destination);
        Booknow.choose_booknow();
        Choosing_Dates.chose_dates1();
        Nearest_price.Nearest_price(price);
        SelectRooms.Select_Rooms();
        fill_dates_apply_coupon.filldates_and_applycoupon();
        Validate_coupon_ammmount.validate_coupon_amount();

        driver.quit();





    }
}
