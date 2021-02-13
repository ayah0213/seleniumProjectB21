package com.cybertek.tests.day11_ExplicitWaitPractices;

import com.cybertek.Utilities.ConfigurationReader;
import com.cybertek.Utilities.Driver;
import com.cybertek.pages.SignUpPage;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class JSExecutorPractice {

    @Test
    public void fill_form_using_JS() {
        String url = ConfigurationReader.getProperty("cybertekParcticeUrl");
        Driver.getDriver().get(url);

        // CReate instance of JSExecutor and cast our Webdriver type to it
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        SignUpPage page = new SignUpPage();

        // USe  .setAtribute function from AjvaScripExecutor to send KEys
        js.executeScript("arguments[0].setAttribute('value','jane doe')", page.fullName);

        // Using JS sendind email send keys
        js.executeScript("arguments[0].setAttribute('value','blabla@gmail.com')", page.email);

        js.executeScript("arguments[0].click()", page.signUpbutton);

    }
    @Test
    public  void opening_tabs_using_jsExecutor(){

        Driver.getDriver().get("https://www.amazon.com");

       ((JavascriptExecutor)Driver.getDriver()).executeScript("window.open('https:google.com','_blank');");
        ((JavascriptExecutor)Driver.getDriver()).executeScript("window.open('https:facebook.com','_blank');");
        ((JavascriptExecutor)Driver.getDriver()).executeScript("window.open('https:ebay.com','_blank');");







    }
}
