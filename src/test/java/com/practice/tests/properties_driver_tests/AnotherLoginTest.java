package com.practice.tests.properties_driver_tests;

import com.practice.tests.TestBase;
import com.practice.utilities.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class AnotherLoginTest extends TestBase {

    @Test
    public void test1(){
        driver.get(ConfigurationReader.get("url"));
        String username = ConfigurationReader.get("driver_username");
        String password = ConfigurationReader.get("driver_password");

        driver.findElement(By.id("prependedInput")).sendKeys(username);
        driver.findElement(By.id("prependedInput2")).sendKeys(password+ Keys.ENTER);


    }
}
