package com.cybertek.tests.day2_locators_getText;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P1_FacebookTitleVerifiction {
    public static void main(String[] args) {



//TC #1: Facebook Title Verification
            //1. Open Chrome browser
            //Setup the browser driver
         WebDriverManager.chromedriver().setup();
             // use Wedbriver instnce to open the browser
            // this is line thaat is opening the browser we select
        WebDriver driver = new ChromeDriver();
           //2. Go to https://www.facebook.com'
        driver.get("https://www.facebook.com");
         //3. Verify title:
        //Expected: Facebook - Log In or Sign Up
        // Actual we need to get it from browser using selenium

        String expectedTitle="Facebook - Log In or Sign Up";
        String actalTitle= driver.getTitle();// gets title

        //doing verification by creating simple of condition belo'
        if (actalTitle.equalsIgnoreCase(expectedTitle)){
            System.out.println("Title verification PASSED!");
        }else{
            System.out.println("Title verification FAILED!");
        }

        driver.close();




}
}