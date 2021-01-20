package com.cybertek.tests.OwnTests;

import com.cybertek.tests.Utilities.WebDriverFActory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC1_TC2_StateSelection {

    WebDriver driver;


    @Test
    public void settupClass() {
        //TC#1: Verifying “Simple dropdown” and “State selection” dropdown default values
        //1.Open Chrome browser
        //2.Go to http://practice.cybertekschool.com/dropdown
        WebDriver driver = WebDriverFActory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        // 3.Verify “Simple dropdown” default selected value is correctExpected: “Please select an option"
        WebElement defaultSelected = driver.findElement(By.id("//select[@id='dropdown']"));
        String actualREsult = defaultSelected.getText();
        String correctExpected = "Please select an option";
        Assert.assertEquals(actualREsult, correctExpected,"Verification Passed");
        // 4.Verify“State selection” default selected value is correctExpected: “Select a State”
//        WebElement selectedState = driver.findElement(By.xpath("//select[@id='state']"));
//        String correctExpectedSate = "Select a State";
//        Assert.assertEquals(selectedState, correctExpectedSate, "Verification of State Selection Passed");
        driver.close();
    }


//       @Test()
//    public void testCase2_StateDropDown() throws InterruptedException {
//           // 3.Select Illinois
//          WebElement illinois = driver.findElement(By.xpath("//option[@value='IL']"));
//          illinois.click();
//           Thread.sleep(3000);
//           // 4.Select Virginia
//           WebElement virginia = driver.findElement(By.xpath("//option[@value='VA']"));
//           virginia.click();
//            Thread.sleep(3000);
//           // 5.Select California
//           WebElement california=driver.findElement(By.xpath("//option[@value='CA']"));
//           california.click();
//           // 6.Verify final selected option is California.Use all Select options.(visible text, value, index)
////           String finalSelectedOption = california.getText();
////           if (finalSelectedOption.equals(illinois)){
////               System.out.println("Wrong selection: "+illinois.getText());
////           }else if (finalSelectedOption.equals(virginia)){
////               System.out.println("Wrong selection: "+virginia.getText());
////           }else {
////               System.out.println(california.getText());
////           }
//           Assert.assertEquals(illinois,california, "Wrong selection not same");
//           Assert.assertEquals(virginia.getText(), california.getText()," Wrong Selection ");
//           Assert.assertEquals(california.getText(),california.getText(),"Verification Passed");
////
//
//
//    }
//


    }

