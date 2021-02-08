package com.cybertek.tests.day5_testNG_intro_dropDown;

import com.cybertek.Utilities.WebDriverFActory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T2_CheckBox_Verification {
    public static void main(String[] args) {
         //TC	#2:	SeleniumEasy	CheckboxVerification–Section	1
         //1.Open	Chrome	browser
        //  2.Go	to	https://www.seleniumeasy.com/test/basic-checkbox-demo.html
        WebDriver driver = WebDriverFActory.getDriver("chrome");
        driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        // 3.Verify	“Success	–Check	box	is	checked”	message	is	NOTdisplayed.
        //Using Xpath and Id attribute value to locate succesMasge
        WebElement succesMsg = driver.findElement(By.xpath("//div[@id='txtAge']"));
        //Locating checkBox
        WebElement chechkBox1 = driver.findElement(By.xpath("//input[@id='isAgeSelected']"));
        if (!chechkBox1.isSelected() && !succesMsg.isDisplayed()){
            System.out.println("Check box isnt selected. Message is not displpayed.Verification passed!");
        }else {
            System.out.println("FAIL");
        }
        // 4.Click	to	checkbox	under	“Single	Checkbox	Demo”	section
        chechkBox1.click();

        // 5.Verify	“Success	–Check	box	is	checked”	message	isdisplayed.
        if (chechkBox1.isSelected() && succesMsg.isDisplayed()){
            System.out.println("Check box isnt selected. Message is not displpayed.Verification passed!");
        }else {
            System.out.println("FAIL");
        }
    }
}
