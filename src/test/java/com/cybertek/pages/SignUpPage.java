package com.cybertek.pages;

import com.cybertek.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {


    public SignUpPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(name = "full_name")
    public WebElement fullName;

    @FindBy(name = "email")
    public WebElement email;

    @FindBy(name = "wooden_spoon")
    public WebElement signUpbutton;


}
