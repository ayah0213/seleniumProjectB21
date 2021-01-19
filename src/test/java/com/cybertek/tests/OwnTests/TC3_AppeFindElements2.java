package com.cybertek.tests.OwnTests;

import com.cybertek.tests.day3_cssSelector_xpath.WebDriverFActory;
import org.openqa.selenium.WebDriver;

public class TC3_AppeFindElements2 {
    public static void main(String[] args) {
        // TC #03: FINDELEMENTS_APPLE
        // 1.Open Chrome browser
         //2.Go to https://www.apple.com
        WebDriver driver= WebDriverFActory.getDriver("chrome");
             driver.get("https://www.apple.com");
        // 3.Click to all of the headers one by onea.Mac, iPad, iPhone, Watch, TV, Music, Support
        // 4.Printout how many links on each pagewiththe titles of the pages
        // 5.Loop through all
        // 6.Print out how many link is missing textTOTAL
        // 7.Print out how many link has textTOTAL
        // 8.Print out how many total linkTOTALi love xpath more than CCs
    }
}
