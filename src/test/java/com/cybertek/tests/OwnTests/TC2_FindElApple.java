package com.cybertek.tests.OwnTests;

import com.cybertek.tests.day3_cssSelector_xpath.WebDriverFActory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TC2_FindElApple {

    public static void main(String[] args) {
    //TC #02: FINDELEMENTS_APPLE1.Open Chrome browser
   // 2.Go to
     WebDriver driver = WebDriverFActory.getDriver("chrome");
     driver.get(" https://www.apple.com");
     //3 Click to iPhone
        WebElement clickApple= driver.findElement(By.xpath("//h2[.='iPhone 12']"));
        clickApple.click();
     //4.Print out the texts of all links
        List<WebElement> allLinksApple = driver.findElements(By.xpath("//body//a"));
        String allLinkNAmes=" ";
        for (WebElement eachAppleLink : allLinksApple){
            allLinkNAmes=eachAppleLink.getText();
            System.out.println("Test Passed.");
            System.out.println("Here you List of all Textxs in link:");
            System.out.println(allLinkNAmes);
        }
        //5.Print out how many link is missing text
    //6.Print out how many link has text7.Print out how many total link
driver.close();
}
 }