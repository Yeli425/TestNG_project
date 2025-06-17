package com.practice.tests.properties_driver_tests;

import com.practice.utilities.ConfigurationReader;
import org.testng.annotations.Test;

public class PropertiesTest {

    @Test
    public void test1(){

        String browser = ConfigurationReader.get("browser");
        System.out.println("browser = " + browser);

        System.out.println(ConfigurationReader.get("driver_username"));
        System.out.println(ConfigurationReader.get("url"));


    }
}
