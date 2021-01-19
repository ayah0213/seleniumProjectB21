package com.cybertek.tests.OwnTests;

import com.cybertek.tests.day3_cssSelector_xpath.WebDriverFActory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class T4_Delete_50FindElements {
    public static void main(String[] args) {
        //TC #3: PracticeCybertek.com_AddRemoveElements WebElement verification
        // 1. Open Chrome browser
        WebDriver driver = WebDriverFActory.getDriver("chrome");
        // 2. Go to http://practice.cybertekschool.com/add_remove_elements
        driver.get("http://practice.cybertekschool.com/add_remove_elements");
        // 3. Click to “Add Element” button 50 times
//        List<WebElement> listOfAddElement = driver.findElements(By.xpath("//*[@onclick='addElement()']"));
        WebElement addElement = driver.findElement(By.xpath("//*[@onclick='addElement()']"));
        for ( int i = 1; i <= 50 ; i++){
            addElement.click();
        }
        // 4. Verify 50 “Delete” button is displayed after clicking.
        List<WebElement> deleteButtons = driver.findElements(By.xpath("//*[@onclick='deleteElement()']"));
        int count = 0;
       for (WebElement eachDelete : deleteButtons){

           if (eachDelete.isDisplayed()){
                count++;
            }
        }
       if (count==50){
           System.out.println("Passed!");
       }
       // 5. Click to ALL “Delete” buttons to delete them.
        WebElement deleteButton = driver.findElement(By.xpath("//button[.='Delete']"));
        for (int i = 1 ; i <= 50; i++){
            driver.findElement(By.xpath("//button[.='Delete']")).click();
        }
        // 6. Verify “Delete” button is NOT displayed after clicking.
        WebElement parentOfDelete = driver.findElement(By.xpath("//*[@id='elements']"));
        if (!parentOfDelete.getText().contains("Delete")) System.out.println("Delete button is NOT displayed after clicking! Verification PASSED!");
        else System.out.println("Delete button is displayed after clicking! Verification FAILED!");
        driver.close();

        // USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS
        // Hint: Need to use findElements method.

    }

}

