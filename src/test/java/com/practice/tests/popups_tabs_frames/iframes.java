package com.practice.tests.popups_tabs_frames;

import com.practice.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class iframes {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
        driver = WebDriverFactory.getDriver("chrome");

    }

    @AfterMethod
    public void afterMethod() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void test1() throws InterruptedException {
        driver.get("https://practice.expandtesting.com/iframe");

        //how to switch frames
        //1.Switch USING BY NAME OR ID attribute of iframe
        driver.switchTo().frame("mce_0_ifr");


        driver.switchTo().defaultContent();
        Thread.sleep(1000);

        //2.USING INDEX
        int size =  driver.findElements(By.tagName("iframe")).size();
        System.out.println(size);
//        driver.switchTo().frame(1);
//        //clear before sendkeys
//        driver.findElement(By.id("tinymce")).clear();
//        driver.findElement(By.id("tinymce")).sendKeys("Mike Smith WITH INDEX");

        //second way to switch parent
        driver.switchTo().parentFrame();
//
//        //3.USING WEBELEMENT
//        //locating iframe with any valid locator
//        WebElement iframeElement = driver.findElement(By.tagName("iframe"));
//
//        driver.switchTo().frame(iframeElement);
//        Thread.sleep(2000);
//
//        driver.findElement(By.id("tinymce")).clear();
//        driver.findElement(By.id("tinymce")).sendKeys("Mike Smith WITH WEBELEMENT");
    }


    @Test
    public void test2(){

        driver.get("http://practice.cybertekschool.com/nested_frames");

        //switching to frame top
        driver.switchTo().frame("frame-top");
        //top has 3 children left middle right
        driver.switchTo().frame("frame-middle");

        System.out.println(driver.findElement(By.id("content")).getText());

        //switch to parent --frame top
        driver.switchTo().parentFrame();

        //switch to right frame
        driver.switchTo().frame(2);
        System.out.println(driver.findElement(By.tagName("body")).getText());


        //to switch main html we can use default content
        driver.switchTo().defaultContent();

        //switch to bottom
        driver.switchTo().frame("frame-bottom");
        System.out.println(driver.findElement(By.tagName("body")).getText());


    }





}
