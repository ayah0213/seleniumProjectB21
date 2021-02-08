package com.cybertek.pages;

import com.cybertek.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicLoad_Page7 {

    public DynamicLoad_Page7() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    //#1- locate the message
    @FindBy(id = "alert")
    public WebElement infoMessage;

    //#2- locate the image
    @FindBy(xpath = "//img[@alt='square pants']")
    public WebElement spongeBobImage;
}