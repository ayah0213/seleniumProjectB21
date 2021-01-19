package com.cybertek.tests.OwnTests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1_FacebookVErification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        String expRes = "Facebook - Log In or Sign Up";
        String actRes = driver.getTitle();
        if (actRes.equals(expRes)) {
            System.out.println("Congrats you passed test");
        } else {
            System.out.println("Sorry failed.");
            System.out.println("Expected result should be " + expRes + "; but your actual result is:" + actRes);
        }
        driver.close();


        class TC2_FacebookIncorrectLoginTitleVErification {
            public void main(String[] args) {
                WebDriverManager.chromedriver().setup();
                WebDriver driver = new ChromeDriver();
                driver.get("https://www.facebook.com");
                driver.findElement(By.name("email")).sendKeys("kardelen");
                driver.findElement(By.name("pass")).sendKeys("KardelenKAR9");
                driver.findElement(By.name("login")).click();
                String expectedRes2 = "Log into Facebook | Facebook";
                String actRes2 = driver.getTitle();
                if (expectedRes2.equals(actRes2)) {
                    System.out.println("Congrats u passed!!!!");
                } else {
                    System.out.println("FAiLL.");
                    System.out.println("Expcted result is:Log into Facebook | Facebook is:" + actRes2);
                }
                driver.close();


            }
        }
   }
}



    /*
    TC #1: Facebook title verification1.Open Chrome browser
    2.Go to https://www.facebook.com
    3.Verify title: Expected: “Facebook -Log In or Sign Up
     */
