package com.cybertek.tests.day4_findElements_checkBoxes;

import com.cybertek.tests.Utilities.WebDriverFActory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P3_CheckBox_Practices {
    public static void main(String[] args) throws InterruptedException {

        //Practice: Cybertek Checkboxes
//1. Go to http://practice.cybertekschool.com/checkboxes
        WebDriver driver = WebDriverFActory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/checkboxes");
// Locatint WebElements
        WebElement checkbox1 = driver.findElement(By.xpath("//input[@type='checkbox'][1]"));
        WebElement checkbox2 = driver.findElement(By.xpath("//input[@type='checkbox'][2]"));
//2. Confirm checkbox #1 is NOT selected by default
        if (!checkbox1.isSelected()){
            System.out.println("Check box 1 is NOT selected by efault Verification PASSED!");
        }else System.out.println("Check box 1 is selected by default Verification FAILED!");
//3. Confirm checkbox #2 is SELECTED by default.
        if (checkbox2.isSelected()){
            System.out.println("Check box 2 is selected by deafult. Verification Passed!");
        }else {
            System.out.println("Check box 2 is NOT selected by deafult. Verification FAILED!");
        }
        Thread.sleep(2000);
//4. Click checkbox #1 to select it.
        checkbox1.click();
        Thread.sleep(2000);
//5. Click checkbox #2 to deselect it.
        checkbox2.click();
//6. Confirm checkbox #1 is SELECTED.
        if (checkbox1.isSelected()){
            System.out.println("Check box 1 is selected. Verification Passed!");
        }else {
            System.out.println("Check box 1 isn't selected. Verification FAILED!");
        }
//7. Confirm checkbox #2 is NOT selected.
        if (checkbox2.isDisplayed()){
            System.out.println("Check box 2 isn't selected. Verification Passed!");
        }else {
            System.out.println("Check box 2 is selected. Verification FAILED!");
        }
        driver.findElement(By.linkText("Home")).click();
        Thread.sleep(2000);
        driver.navigate().back();

        // refreshing the webElement cause I will get Staling Exception in Console after navig back
        // and my Selenium won't find a CheckBox #1 again I have to give a poit into it by providing webelement
        checkbox1 = driver.findElement(By.xpath("//input[@type='checkbox'][1]"));
        checkbox1.click();
        driver.quit();
    }

}

