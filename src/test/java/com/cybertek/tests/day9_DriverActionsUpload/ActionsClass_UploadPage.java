package com.cybertek.tests.day9_DriverActionsUpload;

import com.cybertek.Utilities.BrowserUtils;
import com.cybertek.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActionsClass_UploadPage {
    //TC #14: UploadTest1.Go tohttp://practice.cybertekschool.com/upload
    // 2.Find some small file from your computer, and get the path of it.
    // 3.Upload the file.
    // 4.Assert: -Fileuploaded text is displayed on the page

   @Test
    public void uploadFile(){
       Driver.getDriver().get("http://practice.cybertekschool.com/upload");
       String path="C:\\Users\\Ayah\\Documents\\nextbase1.png";
       WebElement chooseFile=Driver.getDriver().findElement(By.id("file-upload"));
       WebElement uploadButton=Driver.getDriver().findElement(By.id("file-submit"));
       BrowserUtils.sleep(3);
       chooseFile.sendKeys(path);
       uploadButton.click();

       WebElement fileUploadMessage=Driver.getDriver().findElement(By.tagName("h3"));

       Assert.assertTrue(fileUploadMessage.isDisplayed());

   }
}
