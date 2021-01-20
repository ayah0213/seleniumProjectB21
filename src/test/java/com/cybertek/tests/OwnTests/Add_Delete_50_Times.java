package com.cybertek.tests.OwnTests;

import com.cybertek.tests.Utilities.WebDriverFActory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Add_Delete_50_Times {
    public static void main(String[] args) {
        //XPATH PRACTICESDO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
        // TC #3: PracticeCybertek.com_AddRemoveElements WebElement verification
        // 1. Open Chrome browser
        // 2. Go to http://practice.cybertekschool.com
        WebDriver driver = WebDriverFActory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/add_remove_elements/");
        // /add_remove_elements
        // 3. Click to “Add Element” button 50 times
        WebElement addAllButton = driver.findElement(By.xpath("//button[.='Add Element']"));

        for (int i = 1; i <= 50; i++) {
            addAllButton.click();
        }
        // 4. Verify 50 “Delete” button is displayed after clicking.
        List<WebElement> deleteButton = driver.findElements(By.xpath("//button[.='Delete']"));
        int count =0;
        for (WebElement eachDelete : deleteButton) {
            if (eachDelete.isDisplayed()) {
                count++;
                System.out.println("verification is PASSED: " + eachDelete.getText());
                eachDelete.click();
            }
            // 5. Click to ALL “Delete” buttons to delete them.
                List<WebElement> eachDELETE = driver.findElements(By.xpath("//button[@class='added-manually']"));
            for (WebElement eachClick : eachDELETE)
                if (eachClick.isDisplayed()){
                    System.out.println("Verification PASSED, DELETE button ISN'T displayed ");

                }else {
                    System.out.println("Verification FAILED, DELETE button IS displayed ");

                }
            }driver.close();


//
//           List<WebElement> deleteButtonsDelete=driver.findElements(By.xpath("//button[.='Delete']"));
//           for (WebElement eachButtonDelete : deleteButtonsDelete){
//               if (!eachDelete.isDisplayed()){
//               }else {

                // 6. Verify “Delete” button is NOT displayed after clicking.
                // USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS Hint: Need to use findElements method
//

                //System.out.println("Verification FAILED, DELETE button IS displayed ");
            }


        }










