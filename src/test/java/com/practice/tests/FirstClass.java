package com.practice.tests;

import com.github.javafaker.Faker;

public class FirstClass {

    public static void main(String[] args) {
        System.out.println("Hello World");
        //type Faker and hit OPTION+ENTER or ALT+ENTER
        Faker faker = new Faker();

        System.out.println(faker.name().fullName());
        System.out.println(faker.harryPotter().character());
        System.out.println(faker.overwatch().hero());

    }
}
