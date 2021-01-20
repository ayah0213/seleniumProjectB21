package com.cybertek.tests.OwnTests;

import com.cybertek.tests.Utilities.WebDriverFActory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SeleniumEasyCheck_Section2 {
    public static void main(String[] args) {

        //TC	#3:	SeleniumEasy	Checkbox	Verification	–Section	2
        // 1.Open	Chrome	browser
        // 2.Go	to	https://www.seleniumeasy.com/test/basic-checkbox-demo.html
        WebDriver driver = WebDriverFActory.getDriver("chrome");
        driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
        // 3.Verify	“Check	All”	button	text	is	“Check	All”
        WebElement checkAllButton= driver.findElement(By.xpath("//input[@value='Check All']"));

        String checkAllButtonTextVErif= checkAllButton.getText();
        if (checkAllButtonTextVErif.equalsIgnoreCase("“Check All”")){
            System.out.println("Check All” button text is “Check All , Test PASSED");
        }else {
            System.out.println("Check All” button text is “Check All , Test FAIED");
        }
        // 4.Click	to	“Check	All”	button
        checkAllButton.click();
        // 5.Verify	all	check	boxes	are	checked

        List<WebElement> allCheckBox = driver.findElements(By.xpath("//input[@type='checkbox']"));
        boolean alBoxChecked = true;
        for (WebElement each : allCheckBox){
          if (alBoxChecked){
              System.out.println("All  check boxes are checked, PASSED");
          }else {
              System.out.println("All  check boxes are checked, FAILED");
          }
        }
        // 6.Verify	button	text	changed	to	“Un
        WebElement unChangedButtonText = driver.findElement(By.xpath("//input[@value='Uncheck All']"));
        boolean checkcButtonChnaged=true;
        if (unChangedButtonText.equals(checkcButtonChnaged)){
            System.out.println("Checked button changed into UNchecked, Test PAssed");
        }else {
            System.out.println("Checked button changed into UNchecked, Test FAILED");
        }
        driver.close();
    }
}
