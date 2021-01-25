package com.cybertek.tests.day8_testBase_propertises_driver;

import com.cybertek.tests.Base.TestBase;
import com.cybertek.tests.Utilities.BrowserUtils;
import com.cybertek.tests.Utilities.WebOrderUtils;
import org.testng.annotations.Test;

public class WebTablePractices extends TestBase {


    @Test
    public void verify_order_test() {
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete12%2fWebOrders%2fDefault.aspx");
        WebOrderUtils.loginSmartBear(driver);
        BrowserUtils.sleep(3000);
        //verify name Mark Smith is in the list
        WebOrderUtils.verifyOrder(driver,"Mark Smith");
    }
}