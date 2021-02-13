package com.cybertek.tests.day11_ExplicitWaitPractices;

import com.cybertek.Utilities.ConfigurationReader;
import com.cybertek.Utilities.Driver;
import com.cybertek.pages.DynamicLoad_1Page;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ExplicitWaitPractices {

    @Test
    public void dynamic_Load_page1(){
        /*
        TC#41 : Dynamically Loaded Page Elements 1
1. Go to http://practice.cybertekschool.com/dynamic_loading/1
2. Click to start
3. Wait until loading bar disappears
4. Assert username inputbox is displayed
5. Enter username: tomsmith
6. Enter password: incorrectpassword
7. Click to Submit button
8. Assert "Your password is invalid!" text is displayed.
Note: Follow POM Design Pattern
         */
        String url= ConfigurationReader.getProperty("dynamicLoadUrl");
        Driver.getDriver().get(url);
        DynamicLoad_1Page dynamicLoadPage= new DynamicLoad_1Page();
        dynamicLoadPage.startButton.click();
        // to be able to wait untill loading bar disapears we will use Wedriver class
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),5);

        // using the object we will create our Expected condition
        wait.until(ExpectedConditions.invisibilityOf(dynamicLoadPage.loadingBAr));

        Assert.assertTrue(dynamicLoadPage.username.isDisplayed());
        dynamicLoadPage.username.sendKeys("tomsmith");
        dynamicLoadPage.password.sendKeys("blabla");
        dynamicLoadPage.submitButton.click();

        Assert.assertTrue(dynamicLoadPage.wrongMsgText.isDisplayed());




    }
}
