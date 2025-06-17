package com.practice.tests.webdriver_basics;

import com.practice.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class callWebDriverFactory {

    public static void main(String[] args) {


        WebDriver driver = WebDriverFactory.getDriver("chRome");

        driver.get("https://the-internet.herokuapp.com/");
    }
}
