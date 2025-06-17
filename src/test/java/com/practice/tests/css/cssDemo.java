package com.practice.tests.css;

import com.practice.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class cssDemo {

    public static void main(String[] args) {


        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/multiple_buttons");


        WebElement dontClick =  driver.findElement(By.cssSelector("button#disappearing_button"));

        driver.findElement(By.id("asdasda"));

        System.out.println(dontClick.getText());

        driver.quit();
    }
}
