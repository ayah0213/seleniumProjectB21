package com.cybertek.tests.day10_pom_synchronization_jsExecutor;

import com.cybertek.Utilities.Driver;
import com.cybertek.pages.DynamicLoad_Page7;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebDriverWaitsPractices {


        @Test
        public void dynamic_load_7() {
            // TC#40: Dynamically Loaded Page Elements 7
            // 1.Go to http://practice.cybertekschool.com/dynamic_loading/7
            Driver.getDriver().get("http://practice.cybertekschool.com/dynamic_loading/7");

            // 2.Wait until title is "Dynamic title"

            //#1- create WebDriverWait instance
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

            //2- create explicit wait condition. Create expected condition on title.
            wait.until(ExpectedConditions.titleIs("Dynamic title"));


            DynamicLoad_Page7 dynamicLoad7Page = new DynamicLoad_Page7();

            // 3.Assert : Message "Done" is displayed.
            Assert.assertTrue(dynamicLoad7Page.alertMsg.isDisplayed());

            // 4.Assert : Image is displayed.
            Assert.assertTrue(dynamicLoad7Page.spongeBobImage.isDisplayed());

            // Note: Follow POM
        }
    }


