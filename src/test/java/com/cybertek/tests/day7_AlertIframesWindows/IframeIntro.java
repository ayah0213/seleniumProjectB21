package com.cybertek.tests.day7_AlertIframesWindows;

import com.cybertek.tests.Utilities.WebDriverFActory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class IframeIntro {

    WebDriver driver;

    @BeforeMethod
    public void classSetup() {
        //TC #4: Iframe practice
        // 1.Create a new class called: IframePractice
        // 2.Create new test and make set ups
        // 3.Go to: http://practice.cybertekschool.com/iframe
        driver = WebDriverFActory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/iframe");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @Test
    public void iframe_test(){
        // We have to change focus of Driver into iframe_test();
        // 1- Locate as WebElement
        driver.switchTo().frame("mce_0_ifr");
        WebElement youurContentGoesHEreTExt= driver.findElement(By.xpath("//p"));
        // 4.Assert: “Your content goes here.” Text is displayed.
        Assert.assertTrue(youurContentGoesHEreTExt.isDisplayed());

        //locating headerTExt
        driver.switchTo().parentFrame();

        WebElement headerText= driver.findElement(By.xpath("h3"));
        // 5.Assert: “An iFrame containing the TinyMCEWYSIWYG Editor
        //Assert.assertEquals();
    }



    @AfterMethod
    public void teardown() throws InterruptedException {
        Thread.sleep(1000);
        driver.close();

    }
}
