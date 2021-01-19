package com.cybertek.tests.day2_locators_getText;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P4_GoogleSearchVerification {
    public static void main(String[] args) {

        // open a chrome browser setup
        WebDriverManager.chromedriver().setup();
        // gp to http://google.com
        WebDriver driver =new ChromeDriver();

        driver.get("http://google.com");
        driver.manage().window().maximize();

        // write "apple" in search box
        // clicks on Enter search button
        driver.findElement(By.name("q")).sendKeys("apple"+ Keys.ENTER);
        // verify title:
        // EXpected result
        String expectedREsult="apple";
        String actualResult=driver.getTitle();

        if (actualResult.startsWith(expectedREsult)){
            System.out.println("expected Title= "+expectedREsult);
        }else {
            System.out.println("Title verification Failed!!");
            System.out.println("expectedTitle = "+expectedREsult);
            System.out.println("actual title = "+actualResult);
        }
        driver.close();





    }
}
