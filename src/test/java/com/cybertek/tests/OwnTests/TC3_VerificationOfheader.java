package com.cybertek.tests.OwnTests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC3_VerificationOfheader {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        String expectedHeader="Connect with friends and the world around you on Facebook.";
        String actualHeader=driver.findElement(By.className("_8eso")).getText();
        if (expectedHeader.equals(actualHeader)){
            System.out.println("Test passed");
        }else{
            System.out.println("test Failed");
            System.out.println("XEpected resuly is: "+expectedHeader+", your actual result is: "+actualHeader);
        }


//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://www.facebook.com");
//        String expectedResRegForm = "registration_form";
//        String actualResultRegForm= driver.findElement(By.linkText("registration_form")).getAttribute("/pages/create/?ref_type=registration_form");
//        if (expectedResRegForm.contains(actualResultRegForm)){
//            System.out.println("Test passed");
//        }else{
//            System.out.println("Test Failed");
//            System.out.println("Expected result is: "+expectedResRegForm);
//            System.out.println("Actual result is: "+actualResultRegForm);
//            driver.close();
//            // #4- driver.findElement(By.linkText("GMAIL")).getAttribute("href");
//            // <a href="/pages/create/?ref_type=registration_form" class="_8esh">Create a Page</a>
//        }
    }
}
