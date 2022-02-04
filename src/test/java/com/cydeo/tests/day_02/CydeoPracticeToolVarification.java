package com.cydeo.tests.day_02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
TC #1: Cydeo practice tool verifications
1. Open Chrome browser
2. Go to https://practice.cydeo.com
3. Verify URL contains
Expected: cydeo
4. Verify title:
       Expected: Practice

 */
public class CydeoPracticeToolVarification {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://practice.cydeo.com");

        String actualURL = driver.getCurrentUrl();
        String expectedUrl = "cydeo";
        if (actualURL.contains(expectedUrl)) {
            System.out.println("URL verification PASSED!");
        } else {
            System.out.println("URL verification FAILED!");
        }


        String actualTitle = driver.getTitle();
        String expectedTitle = "Practice";

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title verification Passed!");
        } else {
            System.out.println("Title verification Failed!");
        }
        driver.close();

    }
}
