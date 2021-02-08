package com.cybertek.tests.day10_pom_synchronization_jsExecutor;


import com.cybertek.Utilities.BrowserUtils;
import com.cybertek.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;




public class JS_Executer {

    @Test
    public void scroll_using_jsExceture() {

        Driver.getDriver().get("http://practice.cybertekschool.com/infinite_scroll");

        //create instance of JS excetor and cast our driver type to it

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        // we can use js to reach JavaExecutor methodsa
        // creating the loop just to be ble scroll 750pixels 3times
        for (int i = 0; i < 3; i++) {
            BrowserUtils.sleep(1);
            js.executeScript("window.scrollBy(0,750)");// we re saying move down 750pixels suing Js function
        }
        for (int i = 0; i < 3; i++) {
            BrowserUtils.sleep(1);
            js.executeScript("window.scrollBy(0,-750)");// we re saying move up 750pixels suing Js function

            //  arguments[0].scrollIntoView(true); used to scroll specifically somethiing


        }
    }

    @Test
    public void scroll_using_jsExcetur_test2(){

        JavascriptExecutor js= (JavascriptExecutor) Driver.getDriver().findElements(By.linkText(""));
        // use "js" with different javascript methods
        js.executeScript("arguments[0].scrollIntoView(true)");

    }






}
