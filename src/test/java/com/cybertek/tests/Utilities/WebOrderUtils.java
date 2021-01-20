package com.cybertek.tests.Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebOrderUtils {

// make the method STATIC so we dont have to create a instance var. of the class
 public static void loginSmartBear(WebDriver driver){
        WebElement userNAme=driver.findElement(By.xpath("//input[@name='ctl00$MainContent$username']"));
        userNAme.sendKeys("Tester");
        // 4.Enter password: “test”
        WebElement password= driver.findElement(By.xpath("//input[@name='ctl00$MainContent$password']"));
        password.sendKeys("test");
        // 5.Click to Login button
        WebElement loginButton= driver.findElement(By.xpath("//input[@name='ctl00$MainContent$login_button']"));
        loginButton.click();
    }


    }

