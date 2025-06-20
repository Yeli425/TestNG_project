package com.practice.tests.types_of_elements2;

import com.practice.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class SelectClassTest {

    @Test
    public void test1(){
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://practice.expandtesting.com/dropdown");

        //1.locate your dropdown just like any other weblement with unique locator
        WebElement dropdownElement = driver.findElement(By.id("country"));

        //2.create Select object by passing that element as a constructor
        Select stateDropdown = new Select(dropdownElement);

        //getOptions --> returns all the available options from the dropdown list
        List<WebElement> options = stateDropdown.getOptions();


        //print size of the options
        System.out.println("options.size() = " + options.size());
        System.out.println(options.get(5).getText());
        //print options one by one
        for (WebElement option : options) {

            System.out.println(option.getText());
        }
    }

    @Test
    public void test2() throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://practice.expandtesting.com/dropdown");

        //1.locate your dropdown just like any other weblement with unique locator
        WebElement dropdownElement = driver.findElement(By.id("country"));

        //2.create Select object by passing that element as a constructor
        Select stateDropdown = new Select(dropdownElement);

        //verify that first selection is Select a state
        String expectedOption = "Select country";
        String actualOption = stateDropdown.getFirstSelectedOption().getText();
        Assert.assertEquals(actualOption,expectedOption,"verify first selection");

        //HOW TO SELECT OPTIONS FROM DROPDOWN ?
        //1.SELECT USING VISIBLE TEXT
        Thread.sleep(2000);
        stateDropdown.selectByVisibleText("Japan");

        expectedOption = "Japan";
        actualOption = stateDropdown.getFirstSelectedOption().getText();
        Assert.assertEquals(actualOption,expectedOption);

        //2.SELECT USING INDEX
        Thread.sleep(2000);
        stateDropdown.selectByIndex(111);

        expectedOption = "Japan";
        actualOption = stateDropdown.getFirstSelectedOption().getText();
        Assert.assertEquals(actualOption,expectedOption);


        //3.SELECT BY VALUE
        Thread.sleep(2000);
        stateDropdown.selectByValue("JP");
        expectedOption = "Japan";
        actualOption = stateDropdown.getFirstSelectedOption().getText();
        Assert.assertEquals(actualOption,expectedOption);

        Thread.sleep(2000);
        driver.quit();
    }
}
