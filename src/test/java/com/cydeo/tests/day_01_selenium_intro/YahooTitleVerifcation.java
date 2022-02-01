package com.cydeo.tests.day_01_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
TC #1: Yahoo Title Verification
1. Open Chrome browser
2. Go to https://www.yahoo.com 3. Verify title:
Expected: Yahoo
 */
public class YahooTitleVerifcation {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.yahoo.com");
        String currentTitle=driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);


    }
}
