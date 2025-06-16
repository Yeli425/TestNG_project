package com.cybertek.tests.webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAndQuit {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/");
        //wait 2 seconds
        Thread.sleep(2000);

        //close the current tab/window
        driver.close();


        driver = new ChromeDriver();

        driver.get("https://www.selenium.dev/documentation/webdriver/interactions/windows/");

        Thread.sleep(5000);

        //close all tabs doesnt matter one or more
        driver.quit();


    }
}
