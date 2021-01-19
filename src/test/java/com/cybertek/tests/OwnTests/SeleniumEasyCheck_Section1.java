package com.cybertek.tests.OwnTests;

import com.cybertek.tests.day3_cssSelector_xpath.WebDriverFActory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumEasyCheck_Section1 {
    public static void main(String[] args) {

        //TC#2:	SeleniumEasy	CheckboxVerification–Section	1
        // 1.Open	Chrome	browser
        //2.Go	to	https://www.seleniumeasy.com/test/basic-checkbox-demo.html
        WebDriver driver = WebDriverFActory.getDriver("chrome");
        driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
        // 3.Verify	“Success	–Check	box	is	checked”	message	is	NOTdisplayed.
        if(driver.findElement(By.xpath("//div[contains(@style, 'none')]")).isEnabled()){
            System.out.println("Verification Success – Check box is checked message is NOT displayed is PASSED!!!");
        }else{
            System.out.println("Verification FAILED!!!");
        }
        // 4.Click	to	checkbox	under	“Single	Checkbox	Demo”	section
        WebElement singleCheckbox = driver.findElement(By.xpath("//input[@id='isAgeSelected']"));
        singleCheckbox.click();
        // 5.Verify	“Success	–Check	box	is	checked”	message	isdisplayed
        WebElement successMsgIsChecked= driver.findElement(By.xpath("//div[@id='txtAge']"));
        if (successMsgIsChecked.isDisplayed()){
            System.out.println("Success–Check box is checked” message isdisplayed, PASSED");
        }else {
            System.out.println("Success–Check box is checked” message is NOT displayed, FAILED");
        }
        driver.close();

    }
    }

