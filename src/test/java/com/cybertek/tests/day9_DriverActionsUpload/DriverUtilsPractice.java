package com.cybertek.tests.day9_DriverActionsUpload;

import com.cybertek.Utilities.ConfigurationReader;
import com.cybertek.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DriverUtilsPractice {

    @Test
    public void simple_google_search_test(){
//Go to google.com
//Search for a value
//Assert title contains the value
        String url = ConfigurationReader.getProperty("googleUrl");
        Driver.getDriver().get(url);

        WebElement searchBox = Driver.getDriver().findElement(By.name("q"));
        String searchValue=ConfigurationReader.getProperty("searchValue");
        searchBox.sendKeys(searchValue+ Keys.ENTER);
        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(searchValue));







    }
}
