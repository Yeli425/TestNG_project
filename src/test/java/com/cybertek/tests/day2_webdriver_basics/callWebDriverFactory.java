package com.cybertek.tests.day2_webdriver_basics;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class callWebDriverFactory {

    public static void main(String[] args) {


        WebDriver driver = WebDriverFactory.getDriver("chRome");

        driver.get("https://the-internet.herokuapp.com/");
    }
}
