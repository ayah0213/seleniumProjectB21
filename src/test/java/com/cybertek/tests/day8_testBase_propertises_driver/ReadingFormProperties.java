package com.cybertek.tests.day8_testBase_propertises_driver;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingFormProperties {
    @Test
    public void reading_form_propertiesfile() throws IOException {
        //create #1 Properties class object
        Properties properties = new Properties();

        //#2 Open the file in JVM MEmory an dpass the path of the file
        String path="configuration.properties";// for wuindows copy patc->copy path from content root

        FileInputStream file= new FileInputStream(path);

        //#3 Load the opened file into the Properties object
        properties.load(file);

        //read some values from teh file
        System.out.println("properties.getProperty(\"browser\") = " + properties.getProperty("browser"));


        // write a statemenet that is returning johndoe
        System.out.println("properties.getProperty(\"username\") = " + properties.getProperty("username"));
    }
}
