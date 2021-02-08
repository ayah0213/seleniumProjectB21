package com.cybertek.tests.day3_cssSelector_xpath;

import com.cybertek.Utilities.WebDriverFActory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P2_ZeroBankVerification {
    public static void main(String[] args) {

       // TC #1: Zero Bank title verification
        //1.Open Chrome browser.Go to http://zero.webappsecurity.com/login.html
        // we re calling DriverFactory method from another DriverFactory class
        WebDriver driver = WebDriverFActory.getDriver("chrome");
        // 2: Zero Bank link text verification1.Open Chrome browser
        driver.get("http://zero.webappsecurity.com/login.html");
        // 3.Verify link text from top left:Expected: “Zero Bank”
        WebElement zeroBAnkBankLink= driver.findElement(By.className("brand"));
        // Expected :"Zero Bank"  and Actuall result:?
        //verify "Zero Bank" is displayed link
        String expectedLink = "Zero Bank";
        String actuallResultLink = zeroBAnkBankLink.getText();

        if (actuallResultLink.equals(expectedLink)){
            System.out.println("Link TEXT verification passed");
        }else{
            System.out.println("Link TEXT verification FAILED");
            System.out.println("actual results: "+actuallResultLink);
            System.out.println("expected results: "+expectedLink);
        }
        // 4.Verify link href attribute value contains:
        // Expected: “index.html”•
        String expectedIndexHtml= "index.html";
        String actualIndexHtml= zeroBAnkBankLink.getAttribute("href");
        if (actualIndexHtml.contains(expectedIndexHtml)){
            System.out.println("Test passed");
        }else {
            System.out.println("Test failed");
            System.out.println("Actual result :"+actualIndexHtml);
            System.out.println("Expected result :"+expectedIndexHtml);
        }
        driver.close();

        // Create new classfor each task.•There are some tipsin the 2ndpagefor whoever needs it.
        // •Please try to solve yourself first before moving to the tips.
    }
}
