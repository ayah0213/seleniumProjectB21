package com.cybertek.tests.day3_cssSelector_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WT_CybertekLinkVerification {

    public static void main(String[] args) {




       // TC #3: PracticeCybertek/ForgotPassword URL verification1.Open Chrome browser

        WebDriverManager.chromedriver().setup();
        // create an intsance of browser
        WebDriver driver =new ChromeDriver();
        // 2.Go to http://practice.cybertekschool.com/forgot_password
        driver.get(" http://practice.cybertekschool.com/forgot_password");
       // 3.Enter any email into input box
        driver.findElement(By.name("email")).sendKeys("anything@anydomain.com");
       // 4.Click on Retrieve password
        driver.findElement(By.id("form_submit")).click();
        //5. Verify URL contains: Expected: “email_sent”
        String expectedURL = "email_sent";
        String actualURL = driver.getCurrentUrl();
        if (actualURL.contains(expectedURL)){
            System.out.println("URL verification Test passed");
        }else {
            System.out.println("Test failed");
            System.out.println("Expected result :"+expectedURL+", and actual result is: "+actualURL);
        }
        // 6.Verify textbox displayed the content as expected.Expected:
        // “Your e-mail’s been sent!”Hint: You need to use getText method for this practice
        WebElement  confirmation_message = driver.findElement(By.name("confirmation_message"));
        // first verification is to check if it is displayed on the page or not

        if (confirmation_message.isDisplayed()){
            System.out.println("Confirmation message is dipslayed. Pass");
        }else {
            System.out.println("Confirmation is NOT dipslayed. Fail");
        }

        // second verification is to check content of the comfiramtion_mesage of webElement
        //expected :"Your e-mail’s been sent!”"
        String expectedMessage = "Your e-mail's been sent!";
        String actualMessage = confirmation_message.getText();

        if (actualMessage.equals(expectedMessage)){
            System.out.println("Message verification passed ");
        }else {
            System.out.println("Message verification is FAiled");
            System.out.println("expected msg: "+ expectedMessage);
            System.out.println("actual msg: "+actualMessage);
        }



    }
}
