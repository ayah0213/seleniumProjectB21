package com.cybertek.tests.day10_pom_synchronization_jsExecutor;

import com.cybertek.Utilities.BrowserUtils;
import com.cybertek.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Prcatice {
    /*
    TC	#16:	Double	ClickTest1.Go	to	https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2
    2.Switch	to	iframe.
    3.Double	click	on	the	text	“Double-click	me	to	change	my	text	color.”
    4.Assert:	Text’s	“style”	attribute	value	co
     */

    @Test
    public void p2_double_click_test() {
        Driver.getDriver().get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2");

        Driver.getDriver().switchTo().frame("iframeResult"); // finding Iframe

        WebElement textToDoubleClick = Driver.getDriver().findElement(By.id("demo"));

        Actions actions = new Actions(Driver.getDriver());
        actions.doubleClick(textToDoubleClick).perform();
        String expected = "red";
        String actual = textToDoubleClick.getAttribute("style");
        Assert.assertTrue(actual.contains(expected));

    }
        @Test
                public  void drag_and_drop(){
            //TC	#16:	Hover	Test
            // 1.Go	to	https://demos.telerik.com/kendo-ui/dragdrop/index
            Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");
            // 2.Drag	and	drop	the	small	circle	to	bigger	circle.
WebElement smallCircle = Driver.getDriver().findElement(By.id("draggable"));
WebElement bigBlue = Driver.getDriver().findElement(By.xpath("//div[@id='droptarget']"));
WebElement CookiepopUp=Driver.getDriver().findElement(By.xpath("//button[.='Accept Cookies']"));
CookiepopUp.click();
BrowserUtils.sleep(3);
Actions actions =new Actions(Driver.getDriver());
actions.dragAndDrop(smallCircle,bigBlue).perform();
BrowserUtils.sleep(5);
 // 3.Assert:	-Text	in	big	circle	changedto:	“You	did	great
            String expectedRes="You did great!";
            String actualRes= bigBlue.getText();
            Assert.assertEquals(actualRes, expectedRes);


        }



    @AfterMethod
    public void tearDown(){
        BrowserUtils.sleep(5);
        Driver.closeDriver();
    }
}
