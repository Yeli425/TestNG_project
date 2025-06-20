package com.practice.tests.webelement_intro;

import com.practice.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class verifyUrlNotChanged {

    public static void main(String[] args) {

        /**
         * open chrome browser
         * go to http://practice.cybertekschool.com/forgot_password Links to an external site.
         * click on Retrieve password
         * verify that url did not change
         */

        //open chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //go to http://practice.cybertekschool.com/forgot_password Links to an external site.
        driver.get("http://practice.cybertekschool.com/forgot_password");

        //save url before we click retrieve password button
        String expectedUrl = driver.getCurrentUrl();

        //click on Retrieve password
        //WebElement -->Interface that represent elements on the webpage
        //findElement-->method used to find element on a webpage
        WebElement retrievePasswordButton = driver.findElement(By.id("form_submit"));

        //click()--> clicking web element
        retrievePasswordButton.click();

        //verify that url did not change

        //we save the url after we click button
        String actualUrl = driver.getCurrentUrl();

        //verify that url did not change
        if(actualUrl.equals(expectedUrl)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }


        //close browser after everything
        driver.quit();


    }
}
