package com.practice.tests.actions_jsexecutor;

import com.practice.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JavaScriptExecutorDemo {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
        driver = WebDriverFactory.getDriver("chrome");

    }

    @AfterMethod
    public void afterMethod() throws InterruptedException {
        Thread.sleep(4000);
        driver.quit();
    }

    @Test
    public void clickWithJS() throws InterruptedException {
        driver.get("https://practice.cydeo.com/dropdown");

        WebElement dropdown = driver.findElement(By.id("dropdown"));
        //clicking with JavascriptExecutor
        //create js executor object
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        //use executeScript
        jse.executeScript("arguments[0].click();",dropdown);

    }

    @Test
    public void type(){
        driver.get("https://practice.cydeo.com/dynamic_controls");

        WebElement inputbox = driver.findElement(By.cssSelector("#input-example>input"));

        JavascriptExecutor jse = (JavascriptExecutor) driver;

        String str = "Hello disable input";
        jse.executeScript("arguments[0].setAttribute('value', '"+str+"')",inputbox);
    }

    @Test
    public void scrollDownandUp() throws InterruptedException {
        driver.get("https://practice.cydeo.com/infinite_scroll");
        driver.manage().window().maximize();
        JavascriptExecutor jse = (JavascriptExecutor) driver;



        for (int i = 0; i < 10; i++) {
            Thread.sleep(500);
            jse.executeScript("window.scrollBy(0, 250);");

        }

        for (int i = 0; i < 10; i++) {
            Thread.sleep(500);
            jse.executeScript("window.scrollBy(0, -250);");

        }


    }

}
