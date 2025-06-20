package com.practice.tests.types_of_elements;

import com.practice.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DisabledElements {

    @Test
    public void test1(){
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://practice.expandtesting.com/radio-buttons");

        WebElement greenRadioButton = driver.findElement(By.xpath("//input[@id='green' and @class ='form-check-input']"));

        //how to check webelement is enabled or not ?
        System.out.println("Is element enabled: "+greenRadioButton.isEnabled());
        Assert.assertFalse(greenRadioButton.isEnabled(),"Verify Black is NOT enabled");

       // greenRadioButton.click();
    }

    @Test
    public void test2(){

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/dynamic_controls");

        WebElement inputbox = driver.findElement(By.cssSelector("#input-example>input"));

        inputbox.sendKeys("Mike");


    }

}
