package com.cybertek.tests.day7_AlertIframesWindows;

import com.cybertek.tests.Utilities.WebDriverFActory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class windowHandlePractice {

    WebDriver driver;

    @BeforeMethod
    public void classSetup() {
        //TC	#	:	Window	Handlepractice
        // 1.Create	a	new	class	called:	WindowHandlePractice
        // 2.Create	new	test	and	make	set	ups
        // 3.Go	to	:	http://practice.cybertekschool.com/windows
        driver = WebDriverFActory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/windows");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

    }
        @Test
         public void windwo_handling_test(){
            // 4.Assert:	Title	is	“”
            String actualTitleis = driver.getTitle();
            String expectedTitleis="Practice";

            Assert.assertEquals(actualTitleis,expectedTitleis);

            // 5.Click	to:	“Click	Here”text
            WebElement clickButton = driver.findElement(By.xpath("//a[.='Click Here']"));
            clickButton.click();
            //check title after changing webpage
            String titleAfterClick= driver.getTitle();
            System.out.println("Title after clickin: "+titleAfterClick);

           // to see whats is WindowHandle?
            String mainHandle = driver.getWindowHandle();
            System.out.println("MianHAndle: "+mainHandle);

            // Similar to ArrayList but SET can only store UNIQUE Value
            Set<String> windowHAndles =  driver.getWindowHandles();

            // 6.Switch	to	new	Window.
            for (String each : driver.getWindowHandles()){
                driver.switchTo().window(each);

                System.out.println("Current title while Switching : "+driver.getTitle());
            }
             // 7.Assert:	Title	is	“New	Window”
            String finalActuallTitle = driver.getTitle();
            String finalExpectedTitle="New Window";
            Assert.assertEquals(finalActuallTitle, finalExpectedTitle);


            // if i wanted to switch back to  main page back again
            driver.switchTo().window(mainHandle);

        }




    @AfterMethod
    public void teardown () throws InterruptedException {
        Thread.sleep(3);
        driver.quit();
    }

}
