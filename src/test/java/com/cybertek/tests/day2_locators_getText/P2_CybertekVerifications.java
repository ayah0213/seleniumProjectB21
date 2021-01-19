package com.cybertek.tests.day2_locators_getText;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P2_CybertekVerifications {
    public static void main(String[] args) {
        //TC #2: Cybertek verifications
//1. Open Chrome browser
        // set up my driver
        WebDriverManager.chromedriver().setup();
        //open browser
        WebDriver driver = new ChromeDriver();
//2. Go to http://practice.cybertekschool.com
        driver.get("http://practice.cybertekschool.com");
//3. Verify URL contains
//Expected: cybertekschool
        // url contains : cybertekSchool
        String expectedUrl = "cybertekschool";
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.contains(expectedUrl)){
            System.out.println("Actual result contained expected URL");
        }else{
            System.out.println("URL verifications failed.");
        }
        // verify title:
        // expected result:
        String expectedTitle = "Practice";
        String actualTitle=driver.getTitle();

        if (expectedTitle.equals(actualTitle)){
            System.out.println("TOtle verification passed");
        }else{
            System.out.println("Title verification failed EROR");
        }
        driver.close();
//4. Verify title:
//Expected: Practice
    }


}
