package com.cybertek.tests.day9_DriverActionsUpload;

import com.cybertek.Utilities.BrowserUtils;
import com.cybertek.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;

public class Actions_HoverOver {

    /*
TC #15:   Hover  Test
1.Go   to http://practice.cybertekschool.com/hovers
2.Hover    over   to first  image
3.Assert:
    a."name:   user1" is displayed
4.Hover    over   to second image
5.Assert:
    a."name:   user2" is displayed
6.Hover    over   to third  image
7.Confirm:
    a."name:   user3" is d
 */

@Test(description = "hover over practice")
    public void hoverOver(){

   Driver.getDriver().get("http://practice.cybertekschool.com/hovers");
   WebElement pic1 = Driver.getDriver().findElement(By.xpath("(//img[@alt='User Avatar'])[1]"));
    WebElement pic2 = Driver.getDriver().findElement(By.xpath("(//img[@alt='User Avatar'])[2]"));
    WebElement pic3 = Driver.getDriver().findElement(By.xpath("(//img[@alt='User Avatar'])[3]"));
    Actions actions= new Actions(Driver.getDriver());
    actions.moveToElement(pic1);
    actions.click().build().perform();
    BrowserUtils.sleep(3);

    actions.moveToElement(pic2);
    actions.click().build().perform();
    BrowserUtils.sleep(3);

    actions.moveToElement(pic3);
    actions.click().build().perform();
    BrowserUtils.sleep(3);

    Driver.getDriver().close();
}


@Test
public void hoverOver2(){

 Driver.getDriver().get("http://practice.cybertekschool.com/hovers");
 List<WebElement> pictures = Driver.getDriver().findElements(By.xpath("//img[@alt='User Avatar']"));
 List<WebElement> users= Driver.getDriver().findElements(By.xpath("//h5"));

 Actions actions= new Actions(Driver.getDriver());
 String eachUSER="";

 for (WebElement each: pictures){
  actions.click().build().perform();
  actions.moveToElement(each);
   for (WebElement eachUser : users){
    if (eachUser.getText().equals(each))
     System.out.println(eachUser);

   }

  }
 BrowserUtils.sleep(3);
  Driver.getDriver().close();





}
}
