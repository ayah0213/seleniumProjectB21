package com.cybertek.tests.day6_SelectIntroDropDownJAvaFaker;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JavaFakerExamples {
    @Test
    public void java_faker_tes1(){
        //we need to create an object of the JAvaFAker
        Faker faker = new Faker();
        String fNAme=faker.name().firstName();
        String lNAme=faker.name().lastName();
        System.out.println(fNAme+" "+lNAme);
        String adress=faker.address().fullAddress();
        String aress2=faker.address().buildingNumber();
        String finance = faker.finance().creditCard();
        System.out.println(aress2+", "+adress+","+"bankc inoofr: "+finance);
        String getQuote = faker.gameOfThrones().quote();
        System.out.println(getQuote);
        String kardashian = faker.chuckNorris().fact();
        System.out.println(kardashian);
        String ssn= faker.idNumber().ssnValid();
        System.out.println(ssn);
    }
}
