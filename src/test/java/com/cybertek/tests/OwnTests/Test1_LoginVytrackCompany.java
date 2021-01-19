package com.cybertek.tests.OwnTests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1_LoginVytrackCompany {
    public static void main(String[] args) throws InterruptedException {

    // open browser
        WebDriverManager.chromedriver().setup();
        // go to facebook.com
        WebDriver driver= new ChromeDriver();
        driver.get("https://vytrack.com/");
        // open full screen
        driver.manage().window().maximize();
        Thread.sleep(3000);
        //click to Login button on Right Top
        driver.findElement(By.linkText("LOGIN")).click();
        Thread.sleep(3000);
        // enter credentials username
        driver.findElement(By.name("_username")).sendKeys("user33");
        driver.findElement(By.name("_password")).sendKeys("UserUser123");
        driver.findElement(By.name("_submit")).click();
        Thread.sleep(3000);


        String expectedTitle= "Fleet Management";
        String actualTitle= driver.getTitle();
        if (actualTitle.equals(expectedTitle)){
            System.out.println("Passed actuall title matched");
        }else {
            System.out.println("Failed title didnt matched");
        }

        driver.close();

}
 }