package com.cybertek.tests.day4_findElements_checkBoxes;

import com.cybertek.Utilities.WebDriverFActory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class PO_FindElements_Practice1 {
    public static void main(String[] args) {

        //#1- Open chrome browser and go to: http://practice.cybertekschool.com/forgot_password
        WebDriver driver = WebDriverFActory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//#2- Locate all of the LINKS on the page, and print out all the texts
        // first we need to find the locators that is returning the Links in the page
        // we found a list of WebElements by == xpath = //body//a
        // second store all links in to a LISt of WebElements
        List<WebElement> webElementList = driver.findElements(By.xpath("//body//a"));
        // third create java logic to print all of texts of all links
        for (WebElement eachlink : webElementList){
            System.out.println(eachlink.getText());
        }

//#3- Print out how many links on the page
        int numberOfLinks = webElementList.size();
        System.out.println("numbers of links : "+numberOfLinks);
driver.close();

    }
}
