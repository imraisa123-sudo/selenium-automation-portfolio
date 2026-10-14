package com.qa.portfolio;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumTest {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://www.saucedemo.com/");

            String actualTitle = driver.getTitle();

            System.out.println("Page title: " + actualTitle);

            if (actualTitle.equals("Swag Labs")) {
                System.out.println("TEST PASSED");
            } else {
                System.out.println("TEST FAILED");
            }

        } finally {
            driver.quit();
        }
    }
}