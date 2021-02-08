package com.cybertek.tests.day8_testBase_propertises_driver;

import com.cybertek.tests.Base.TestBase;
import com.cybertek.Utilities.BrowserUtils;
import com.cybertek.Utilities.WebOrderUtils;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class WebTablePractices extends TestBase {


    @Test
    public void verify_order_test() throws IOException {
        //create #1 Properties class object
        Properties properties = new Properties();

        //#2 Open the file in JVM MEmory an dpass the path of the file
        String path="configuration.properties";// for wuindows copy patc->copy path from content root

        FileInputStream file= new FileInputStream(path);

        //#3 Load the opened file into the Properties object
        properties.load(file);

        String url= properties.getProperty("webOrderUrl");
        driver.get(url);


        WebOrderUtils.loginSmartBear(driver);
        BrowserUtils.sleep(3);
        //verify name Mark Smith is in the list
        WebOrderUtils.verifyOrder(driver,"Mark Smith");
    }
}