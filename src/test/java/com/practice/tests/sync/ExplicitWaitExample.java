package com.practice.tests.sync;

import com.practice.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExplicitWaitExample {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
        driver = WebDriverFactory.getDriver("chrome");

    }

    @AfterMethod
    public void afterMethod() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void test1()throws InterruptedException {
        driver.get("https://practice.expandtesting.com/dynamic-controls");

        //click start button
        driver.findElement(By.xpath("//button[contains(text(),'Enable')]")).click();

        //locate username inputbox
        WebElement usernameInputbox = driver.findElement(By.xpath("//input[@type='text']"));
        //HOW TO WAIT EXPLICITLY ?
        //Create Explicit wait object
        WebDriverWait wait = new WebDriverWait(driver,10);


        //calling until method from wait object
        wait.until(ExpectedConditions.elementToBeClickable(usernameInputbox));

        usernameInputbox.sendKeys("MikeSmith");

    }

    @Test
    public void checkbox(){
        driver.get("https://practice.expandtesting.com/dynamic-controls");

        //click enable
        driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected();
        driver.findElement(By.xpath("//button[contains(text(),'Remove')]")).click();
        WebDriverWait wait =  new WebDriverWait(driver,10);

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("message")));








    }

}
