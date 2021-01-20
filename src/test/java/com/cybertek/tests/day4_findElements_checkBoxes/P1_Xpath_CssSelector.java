package com.cybertek.tests.day4_findElements_checkBoxes;

import com.cybertek.tests.Utilities.WebDriverFActory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P1_Xpath_CssSelector {
    public static void main(String[] args) {
        // XPATHand CSSSelectorPRACTICESDO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
        // TC#1:PracticeCybertek.com_ForgotPassword WebElement verification
        // 1. Open Chrome browser
        WebDriver driver = WebDriverFActory.getDriver("chrome");
        // 2. Go to http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");
        // 3. Locate all the WebElements on the page using XPATH and/or CSSlocator only (total of 6)
        // a. “Home” link
       WebElement homeLink =  driver.findElement(By.xpath("//a[.='Home']"));
       // another unique xpath WebElement using different attribute values--> //a[@class='nav-link']

        // b. “Forgot password” header
        WebElement forgotPassword = driver.findElement(By.xpath("//h2[.='Forgot Password']"));
        // also we can use locating Element usingits TEXT with XPATH:  //label[@for='email']

         // c. “E-mail” text
        WebElement emailtext= driver.findElement(By.xpath("//label[.='E-mail']"));

        // d. E-mail input box
        WebElement emailInputBox = driver.findElement(By.cssSelector("input[name='email']"));
       // by using XPATH --> By.xpath("//input[@name='email']"

        // e. “Retrieve password” button
        WebElement retrievePasswordButton = driver.findElement(By.cssSelector("button[id='form_submit']"));
        // by using XPATH --> (By.xpath("//i[@class='icon-2x icon-signin']")

        // f. “Powered byCybertek School” text
        WebElement poweredByCybertekSchooltext = driver.findElement(By.xpath("//div[@style='text-align: center;']"));

        // 4. Verify all WebElements are displayed.
        if (homeLink.isDisplayed() && forgotPassword.isDisplayed()
                && emailInputBox.isDisplayed()
                && emailtext.isDisplayed()
                && retrievePasswordButton.isDisplayed()
                && poweredByCybertekSchooltext.isDisplayed()) {
            System.out.println("All WebElements ARE DISPLAYED VERIFICATION PASSED");
        }else {
            System.out.println("Some or more Verification INST DISPLAYED < TEST FAILED!!!");
        }
        driver.close();
    }
}
