package com.cybertek.tests.day4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class linkTextAndPartialLinkText {

    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("Chrome");

        driver.get("https://demo.guru99.com/test/link.html");

        WebElement link1 = driver.findElement(By.linkText("click here"));

        link1.click();
        driver.navigate().back();

        WebElement link2 = driver.findElement(By.xpath("//a[@href=\"http://www.fb.com\"]"));
        link2.click();


        driver.close();


    }
}
