package com.cybertek.tests.Utilities;

public class BrowserUtils {
    // we will create UTILITY MEthods for repetitive steps
    // that can be used in browsers and stored in this class
    public static void sleep(int seconds) {
        seconds *= 1000;
        try {
            Thread.sleep(seconds);
        } catch (InterruptedException e) {
            System.out.println("Something happened in the sleep method");
        }

    }
}
