package com.cybertek.tests.types_of_elements2;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DisplayDemoTest {

    @Test
    public void test1() throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://practice.expandtesting.com/dynamic-loading/1");

        WebElement message = driver.findElement(By.xpath("//h4[contains(text(), 'Hello World!')]"));

        System.out.println("message.isDisplayed() = " + message.isDisplayed());

        //TASK
        //verify that username not displayed in the screen
        Assert.assertFalse(message.isDisplayed(),"Verify message not displayed");
        //click start button
        //we locate and click at the same time
         driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
         //wait until it appears
        Thread.sleep(6000);
        //verify username displayed on the screen
        Assert.assertTrue(message.isDisplayed(),"verify username input displayed");



    }
}
