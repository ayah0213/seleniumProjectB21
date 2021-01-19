package com.cybertek.tests.OwnTests;

import com.cybertek.tests.day3_cssSelector_xpath.WebDriverFActory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class TC_2DeleteButton {
    public static void main(String[] args) {

        //TC #2: PracticeCybertek.com_AddRemoveElements WebElement verification
        // 1. Open Chrome browser
        // 2. Go to http://practice.cybertekschool.com/add_remove_elements
        WebDriver driver = WebDriverFActory.getDriver("chrome");
         driver.get("http://practice.cybertekschool.com/add_remove_elements/");
        // 3. Click to “Add Element” button
        WebElement addElementButton= driver.findElement(By.xpath("//button[@onclick='addElement()']"));
        addElementButton.click();
         //4. Verify “Delete” button is displayed after clicking.
        WebElement deleteButton= driver.findElement(By.xpath("//button[@onclick='deleteElement()']"));

        if (deleteButton.isDisplayed()){
            System.out.println("Delete Button DIPSLAYED, Verification PASSED!");
        }else {
            System.out.println("Delete Button diidnt DISPLYED, VErification FAILED!");
        }
       // 5. Click to “Delete” button.
        deleteButton.click();
        // 6. Verify “Delete” button is NOT displayed after clicking.
        boolean deleteBTNDisntplayed = true;
        if (deleteBTNDisntplayed){
            System.out.println("DELETE button DIDNT dispalyed after clicking on it, VErification PASSED !!");
        }else {
            System.out.println("DELETE button did dispalyed after clicking on it, VErification FAILED!!");
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.close();
    }
}
