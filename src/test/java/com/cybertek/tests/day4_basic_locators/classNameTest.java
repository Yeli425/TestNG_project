package com.cybertek.tests.day4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class classNameTest {

    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://practice.expandtesting.com/xpath-css-tester");

        WebElement homeLink = driver.findElement(By.className("form-control"));
        homeLink.sendKeys("asdas@gmail.com");

        driver.get("https://practice.expandtesting.com/radio-buttons");

        //print multipe buttons title
        System.out.println(driver.findElement(By.xpath("//div[@class='col-md-3 mb-2'][1]/div/div/div")).getText());

    }
}
