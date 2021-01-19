package com.cybertek.tests.day4_findElements_checkBoxes;

import com.cybertek.tests.day3_cssSelector_xpath.WebDriverFActory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class P2_FindElement_Practice2 {
    public static void main(String[] args) {

        //1. Open Chrome browser
        WebDriver driver = WebDriverFActory.getDriver("chrome");
//2. Go to https://www.merriam-webster.com/
        driver.get("https://www.merriam-webster.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//3. Print out the texts of all links
        List<WebElement> allLinks = driver.findElements(By.xpath("//body//a"));
        //4. Print out how many link is missing text
        //5. Print out how many link has text
        int numberOfMissingTxt = 0;
        int numberofExistingTxt =0;

         for (WebElement eachLink : allLinks) {
             String textOfEachLink = eachLink.getText();
             System.out.println(textOfEachLink);

             if (textOfEachLink.isEmpty()) {
                 numberOfMissingTxt++;
             } else {
                 numberofExistingTxt++;
             }
         }
             // Print out how many link is having text
             System.out.println("Links with text: "+ numberofExistingTxt);
            // Print out how many link is missing text

             System.out.println("links which missing links: "+numberOfMissingTxt);
             // number of total Links

             int numOfAllLinks = allLinks.size();
             System.out.println("Total number of links: "+numOfAllLinks);



    driver.close();
}


}
