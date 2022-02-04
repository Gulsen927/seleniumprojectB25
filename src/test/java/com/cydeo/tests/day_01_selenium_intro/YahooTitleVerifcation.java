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

        driver.manage().window().maximize();

        driver.get("https://www.yahoo.com");
        String expectedTitle=driver.getTitle();
        String actualTitle="Yahoo | Mail, Weather, Search, News, Finance, Sports, Shopping, Entertainment, Video";

      if(actualTitle.equals(expectedTitle)){
          System.out.println("Title is as expected. Verification PASED!");
      }else{
          System.out.println("Title is NOT as expected. Verification FAILED!");
      }






    }
}
