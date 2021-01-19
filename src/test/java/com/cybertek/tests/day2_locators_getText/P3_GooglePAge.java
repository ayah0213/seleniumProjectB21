package com.cybertek.tests.day2_locators_getText;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P3_GooglePAge {
    public static void main(String[] args) throws InterruptedException {

        // open chrome browser
        WebDriverManager.chromedriver().setup();
        // go to GOogle.com
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        // open full screen
        driver.manage().window().maximize();
        Thread.sleep(3000);
        // click to Gmail on the top Right
        driver.findElement(By.linkText("Gmail")).click();
        Thread.sleep(3000);
        //verify title contains:
        // expected Gmail.com
        String expectedTitle = "Gmail";
        String actualTiotle=driver.getTitle();

        if (actualTiotle.contains(expectedTitle)){
            System.out.println("Title evrification Passed!!");
        }else {
            System.out.println("Title verification Failed!!");
        }

        driver.navigate().back();
        driver.equals("Google");
        String expectedTitle2 = "Google";
        String actualTitle2= driver.getTitle();
        if (actualTitle2.equals(expectedTitle2)){
            System.out.println("Verification Of Google title is passed");
        }else{
            System.out.println("Verification os Google title is Failed");
        }
        driver.close();

    }
}
