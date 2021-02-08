package com.cybertek.tests.day3_cssSelector_xpath;

import com.cybertek.Utilities.WebDriverFActory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Xpath_Prcatice {

    public static void main(String[] args) throws InterruptedException {


    // go to this link http://practice.cybertekschool.com/multiple_buttons

    WebDriver driver= WebDriverFActory.getDriver("chrome");
    driver.get("http://practice.cybertekschool.com/multiple_buttons");

    //Locate button2 by Using XPAth Locator]
        System.out.println("Ayjeren nnurjanova gets driver off ");

        // 1324633752228Ayjeren nur"");
        System.out.println("A");










      WebElement button2 =  driver.findElement(By.xpath("(//button[@class='btn btn-primary'])[2]"));
      button2.click();
      Thread.sleep(2000);

}
       }