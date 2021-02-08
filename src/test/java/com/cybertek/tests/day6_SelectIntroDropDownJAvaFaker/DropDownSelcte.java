package com.cybertek.tests.day6_SelectIntroDropDownJAvaFaker;

import com.cybertek.Utilities.WebDriverFActory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DropDownSelcte {
WebDriver driver;


//OPENING TEST
    @BeforeMethod
public void setupMetod(){
        //TC #2: Selecting state from State dropdown and verifyingresult
        //1.Open Chrome browser
        //2.Go to http://practice.cybertekschool.com/dropdown
       driver = WebDriverFActory.getDriver("chrome");
       driver.get("http://practice.cybertekschool.com/dropdown");
        // maximizepage
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

    }

    // CREATING TEST
    @Test
    public void test2_verify_state_dropdown() throws InterruptedException {
// First to be able to select a drop down we need a find WebElement
        Select stateDropDown = new Select(driver.findElement(By.xpath("//select[@id='state']")));
        //    3.Select Illinois
        stateDropDown.selectByVisibleText("Illinois");
        Thread.sleep(2000);
        //    4.Select Virginia
        stateDropDown.selectByVisibleText("Virginia");
        Thread.sleep(2000);
        //    5.Select California
        stateDropDown.selectByVisibleText("California");
        Thread.sleep(2000);
//    6.Verify final selected option is California.
        String expectedOption="California";
        String finalVerifiedOption = stateDropDown.getFirstSelectedOption().getText();
        // we can use if else and COMARE 2 results or
//        if (expectedOption.equalsIgnoreCase(finalVerifiedOption)) {
//            System.out.println("Congrats, Test PASSED your final selected option is: "+finalVerifiedOption);
//        }else {
//            System.out.println("Sorry your test , Failed.");
//        }

        // USE Assrtions
        Assert.assertEquals(finalVerifiedOption, expectedOption);
        Thread.sleep(2000);
        //    Use all Select options.(visible text, value, index)
    }




    @Test
    public void test_3dateDropDownVerification() throws InterruptedException {
         //TC #3: Selecting date on dropdown and verifying
        // 1.Open Chrome browser
        // 2.Go to http://practice.cybertekschool.com/dropdown
        // 3.Select “December 1st, 1921” and verify it is selected.

        // Select year using: visible text
        Select year = new Select(driver.findElement(By.xpath("//select[@id='year']")));
        year.selectByVisibleText("1922");
        Thread.sleep(3000);

        // Select month using : value attribute
        Select months = new Select(driver.findElement(By.xpath("//select[@id='month']")));
        months.selectByValue("11");
        Thread.sleep(3000);

        // Select day using: index number
        Select day= new Select (driver.findElement(By.xpath("//select[@id='day']")));
        day.selectByIndex(0);
        Thread.sleep(3000);


        String expectedMonth="December";
        String expectedDay="1";
        String expectedYEar="1922";


       String actualMonth= months.getFirstSelectedOption().getText();
       String actualyear= year.getFirstSelectedOption().getText();
       String actualDay= day.getFirstSelectedOption().getText();
       Assert.assertTrue(true, actualDay);
       Assert.assertTrue(actualMonth.equals(expectedMonth));
       Assert.assertTrue(true,actualyear);
    }

    @Test
    public void test_4_Multiple_select_dropdown() throws InterruptedException {
        //TC #4: Selecting value from multiple select dropdown
        // 1.Open Chrome browser
        // 2.Go to http://practice.cybertekschool.com/dropdown
        // 3.Select all the options from multiple select dropdown.
        Select languagesDropdown = new Select(driver.findElement(By.xpath("//select[@name='Languages']")));
        Thread.sleep(20000);

        // 4.Print out all selected values.
        List<WebElement> allLanguagesTextOptions=languagesDropdown.getOptions();
        Thread.sleep(2000);
        for (WebElement eachOptions: allLanguagesTextOptions){
            eachOptions.click();
            System.out.println("Selected languages: "+eachOptions.getText());
            // verifying that each Language was selected
            Assert.assertTrue(eachOptions.isSelected(), "The option :"+eachOptions.getText()+" is not selected");
        }
        // 5.Deselect all values.
        Thread.sleep(2000);
        languagesDropdown.deselectAll();

        for (WebElement eachLanguage : allLanguagesTextOptions){
            Assert.assertTrue(!eachLanguage.isSelected());
        }


    }
    @Test
    public void test5_non_select_value() throws InterruptedException {
        //TC #5: Selecting value from non-select dropdown
        // 1.Open Chrome browser
        // 2.Go to http://practice.cybertekschool.com/dropdown
        // 3.Click to non-select dropdown
        //we need locate non-select webelement
        WebElement websiteDropDown = driver.findElement(By.xpath("//a[@id='dropdownMenuLink']"));
        websiteDropDown.click();
        Thread.sleep(2000);
        // 4.Select Facebook from dropdown
        WebElement facebookLink = driver.findElement(By.xpath("//a[@href='https://www.facebook.com/']"));
        facebookLink.click();

        // 5.Verify title is “Facebook -Log In or Sign Up”
        String expectedTitle="Facebook - Log In or Sign Up";
        String actualTitle=driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);


    }

//closing wach time Test
    @AfterMethod
    public void tearDownMethod() throws InterruptedException {
        Thread.sleep(3);
        driver.close();
    }

}
