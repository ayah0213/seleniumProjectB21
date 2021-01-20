package com.cybertek.tests.day7_AlertIframesWindows;

import com.cybertek.tests.Utilities.WebDriverFActory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AllertIntro {
    WebDriver driver;

    @BeforeMethod
    public void classSetup() {
        //TC #1: Information alert practice1.Open browser
        // 2.Go to website: http://practice.cybertekschool.com/javascript_alerts
        driver = WebDriverFActory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/javascript_alerts");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @Test
    public void p1_information_allert() {
        // 3.Click to “Click for JS Alert”button
        WebElement jsAlert = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
        jsAlert.click();
        // 4.Click to OK button from the alert
        Alert alert = driver.switchTo().alert();
        alert.accept();

        // 5.Verify “You successfulyclicked an alert”text is displayed.
        WebElement succedsMSg= driver.findElement(By.xpath("//p[@id='result']"));
        String actualTxt = succedsMSg.getText();
        String expected = "You successfuly clicked an alert";
        Assert.assertEquals(actualTxt, expected);
    }

    @Test
    public void p2_confirmation_alert_practice(){
        //3.Click to “Click for JS Confirm” button
         WebElement jsAlertClik= driver.findElement(By.xpath("//button[.='Click for JS Confirm']"));
               jsAlertClik.click();
        // 4.Click to OK button from the alert
        Alert alert=driver.switchTo().alert();
        alert.accept();
        WebElement succedsMSg= driver.findElement(By.id("result"));
        String actualRes = succedsMSg.getText();
        String expectRes="You clicked: Ok";
        // 5.Verify “You clicked: Ok” text is displayed
          Assert.assertEquals(actualRes,expectRes);


    }
    @Test
    public void p3_confirmation_alert_practice() {
        //3.Click to “Click for JS Confirm” button
        WebElement jsAlertPrompt = driver.findElement(By.xpath("//button[.='Click for JS Prompt']"));
        jsAlertPrompt.click();
        // 4.Click to OK button from the alert
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("blabla");
        WebElement succMsg = driver.findElement(By.id("result"));
        String actualRes = succMsg.getText();
        String expectRes = "You entered: dn";
        // 5.Verify “You clicked: Ok” text is displayed
        Assert.assertEquals(actualRes, expectRes);
    }
    @AfterMethod
    public void teardown() throws InterruptedException {
        Thread.sleep(1000);
        driver.close();

    }
}