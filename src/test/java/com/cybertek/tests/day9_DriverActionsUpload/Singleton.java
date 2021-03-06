package com.cybertek.tests.day9_DriverActionsUpload;

public class Singleton {


    // by making the constructor private, limiting creating object from this class
    private Singleton(){}

    // by making teh String, we can only reach this using getter method
    private static String word;

    // by creating 'getter' method we will allow user to reach to String in the way we allow them to
    public static String getWord(){

        if (word== null){
            System.out.println("First time call. Word object is null+" +
                    "Assigning value to it now.");
            word="something";
        }else {
            System.out.println("word already has value");
        }
        return word;

    }
}
