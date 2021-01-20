package com.cybertek.tests.Utilities;

import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class OpeningBrowser {

    public void setupMetod(){
        //TC #2: Selecting state from State dropdown and verifyingresult
        //1.Open Chrome browser
        //2.Go to http://practice.cybertekschool.com/dropdown
        WebDriver driver = WebDriverFActory.getDriver("chrome");
        driver.get("");
        // maximizepage
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }
}
