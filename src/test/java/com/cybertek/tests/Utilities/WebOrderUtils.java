package com.cybertek.tests.Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

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

/*
PRACTICE #4:
 Method: verifyOrder•Create a method named verify Order in SmartBearUtils class.
•Methodtakes WebDriver object and String(name).
•Methodshould verify if given name exists in orders.
•This method should simply accepts a name(String), and assert whether given name is in the list or not.
•Create a new TestNG test to test if the method is working as expected.
 */
public static void verifyOrder(WebDriver driver, String expectedName){
    //Create alocator taht is returning all of names inside this table
    List<WebElement> allNAmes= driver.findElements(By.xpath("(//table)[2]//tr//td[2]"));
    // we need to loop through allNames list of webElements and make sure expc name is there
    for (WebElement each: allNAmes){
        if (each.getText().equals(expectedName)){
            Assert.assertTrue(each.getText().equals(expectedName));
            return;// exit the method, return- from method
            //break; from If statement, return from Method, system exit from program
        }
    }
    Assert.fail("The name wasnt in the list");
}

    }

