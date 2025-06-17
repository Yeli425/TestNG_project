package com.practice.tests.popups_tabs_frames;

import com.practice.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class MultipleWindows {
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
    public void switchWindowsTest() throws InterruptedException {

        driver.get("https://practice.expandtesting.com/windows");

        //get title
        System.out.println("Title before new window: "+driver.getTitle());
        //click click here link
        Thread.sleep(1000);
        driver.findElement(By.linkText("Click Here")).click();
        //get title again
        Thread.sleep(1000);

        System.out.println("Title after new window: "+driver.getTitle());

        String currentWindowHandle = driver.getWindowHandle();
        System.out.println(currentWindowHandle);

        //we will switch to new window
        Set<String> windowHandles = driver.getWindowHandles();

        System.out.println("windowHandles = " + windowHandles.size());

        for (String handle : windowHandles) {
            if(!handle.equals(currentWindowHandle)){
                driver.switchTo().window(handle);
            }
        }

        System.out.println("Title after switching window: "+driver.getTitle());

    }

    @Test
    public void moreThan2Window(){
        driver.get("https://practice.cydeo.com//windows");

        driver.findElement(By.linkText("Click Here")).click();

        Set<String> windowHandles = driver.getWindowHandles();

        System.out.println("Before switch: "+driver.getTitle());


        //loop through each window
        for (String handle : windowHandles) {
            //one by one change it
            driver.switchTo().window(handle);

            //whenever your title equals to your expected window title
            if(driver.getTitle().equals("New Window")){
                //stop on that window
                break;
            }
        }

        System.out.println("After switch: "+driver.getTitle());

        System.out.println(driver.findElement(By.tagName("h3")).getText());


    }

    @Test
    public void moreThan2Window_way2(){
        driver.get("https://practice.cydeo.com//windows");

        driver.findElement(By.linkText("Click Here")).click();

     List<String> tabs =  new ArrayList(driver.getWindowHandles());

        System.out.println("Before switch: "+driver.getTitle());

       driver.switchTo().window(tabs.get(1));
        System.out.println("After switch: "+driver.getTitle());


    }

}
