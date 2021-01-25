package com.cybertek.tests.Utilities;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TesnGMethods {

WebDriver driver;

    @BeforeMethod
    public void classSetupMethods() {
       //setup methods
        driver = WebDriverFActory.getDriver("chrome");
        driver.get("");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

    }

    @AfterMethod
    public void teardown () throws InterruptedException {
        Thread.sleep(3);
        driver.quit();
    }
}
