package com.cybertek.tests.day2_locators_getText;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P5_SmartBearLoginVerification {
    public static void main(String[] args) {

       // TC#5:	Basic	login	authentication1-Open	a	chrome	browser
        // 2-Go	to:http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        // 3-Verify title	equals:Expected:	Web	Orders	Login
        // 4-Enter username:	Tester
        // 	5-Enter	password:	test
        // 	6-Click	“Sign	In”	button
        // 	7-Verify	titleequals:Expected:	Web	Orders

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        String expectedTitle = "Web Orders Login";
        String actuallTitle = driver.getTitle();

        if (actuallTitle.equals(expectedTitle)){
            System.out.println("Actuall Title 1 is equal to expected Title= "+actuallTitle);
        }else {
            System.out.println("Faileddidnt match with Expected Title");
        }

        driver.findElement(By.name("ctl00$MainContent$username")).sendKeys("Tester");
        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
        driver.findElement(By.id("ctl00_MainContent_login_button")).click();

        String expected2Title = "Web Orders";
        String actual2ResultTitle= driver.getTitle();

        if (actual2ResultTitle.equals(expected2Title)){
            System.out.println("Pass Actuall Title 2 Result matched same as Expected = "+ actual2ResultTitle);
        }
        else {
            System.out.println("FAiled actuall Title didnt match as Expected Titled ");
        }
        driver.close();

    }
}
