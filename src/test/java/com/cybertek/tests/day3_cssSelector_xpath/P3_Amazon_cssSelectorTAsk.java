package com.cybertek.tests.day3_cssSelector_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P3_Amazon_cssSelectorTAsk {
    public static void main(String[] args) throws InterruptedException {

       // TC #3: Amazon link number verification
        // 1. Open Chrome browser
        WebDriver driver = WebDriverFActory.getDriver("chrome");
        // 2. Go to https://www.amazon.com
        driver.get("https://www.amazon.com");
        // 3. Enter search term (use cssSelectorto locate search box)
        WebElement amazonSearchBar= driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));
        amazonSearchBar.sendKeys("Apple"+ Keys.ENTER);
        Thread.sleep(3000);
        // 4. Verify title contains search term
        String actuallTitle = "Apple";
        String expectedTitle = driver.getTitle();

        if (actuallTitle.equals(expectedTitle)){
            System.out.println("Test Pass");
        }else {
            System.out.println("Test FAILED");
            System.out.println("Expected result: "+expectedTitle);
            System.out.println("Actuall result: "+actuallTitle);
        }

        driver.close();

    }
}
