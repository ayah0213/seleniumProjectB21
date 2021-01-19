package com.cybertek.tests.day5_testNG_intro_dropDown;


import org.testng.Assert;
import org.testng.annotations.*;

public class TestNG_Introduction {

    @BeforeMethod
    public void setupMethod(){
        System.out.println("Before method is running");
    }

    @AfterMethod
    public void tearDownMethod(){
        System.out.println("After method is running");
    }

    /*
        @BeforeClass will make the method run once before everything else in the class.
         */
    @BeforeClass
    public void setupClass(){
        System.out.println("Before class is running...");
    }

    /*
     @AfterClass will make the method run once after everything else in the class.
      */
    @AfterClass
    public void teardownClass(){
        System.out.println("After class is running...");
    }


    @Test
    public void test1(){
        System.out.println("Running test 1...");

    }

    @Test
    public void test2(){
        System.out.println("Running test 2...");
    }

    @Test
    public void test3(){
        String str1 ="hello";
        String str2 ="hello1";
        String str3= "hello";

        // assertTrue :  expects a boolean value to be passed
        Assert.assertTrue(str1.equals(str2), "Self Note for ourselves if Failed I know its Failed");


        // try to use AssertEqual: expects to accept 2 arguments of the same type example: String vs String
        Assert.assertEquals(str1, str3,"Asserting with assertequals on line 57");

        // the last string argument will be  accepted as "failure message"
    }
}
