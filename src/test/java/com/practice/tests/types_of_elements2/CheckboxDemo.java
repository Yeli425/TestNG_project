package com.practice.tests.types_of_elements2;

import com.practice.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class CheckboxDemo {

    @Test
    public void test1() {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://practice.expandtesting.com/checkboxes");

        WebElement checkbox1 = driver.findElement(By.xpath("//input[@id='checkbox1']"));
        WebElement checkbox2 = driver.findElement(By.xpath("//input[@id='checkbox2']"));

        //how to verify checkbox is selected or not ?
        System.out.println("checkbox1.isSelected() = " + checkbox1.isSelected());
        System.out.println("checkbox2.isSelected() = " + checkbox2.isSelected());
        //verify checkbox 1 is not selected 2 is selected
        Assert.assertFalse(checkbox1.isSelected(), "Verify checkbox 1 is NOT selected");
        Assert.assertTrue(checkbox2.isSelected(), "Verify checkbox 2 is selected");

        //how to click checkbox ?
        checkbox1.click();
        System.out.println("-------AFTER CLICK-----");
        //verify checkboxes again
        Assert.assertTrue(checkbox1.isSelected(), "Verify checkbox 1 is selected");
        Assert.assertTrue(checkbox2.isSelected(), "Verify checkbox 2 is selected");
        System.out.println("checkbox1.isSelected() = " + checkbox1.isSelected());
        System.out.println("checkbox2.isSelected() = " + checkbox2.isSelected());
        driver.quit();
        //BREAK UNTIL 1:16



    }


    @Test
    public void test2 () {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/checkboxes");

        WebElement checkbox1 = driver.findElement(By.xpath("//input[1]"));
        WebElement checkbox2 = driver.findElement(By.xpath("//input[2]"));


        List<WebElement> checkboxList = driver.findElements(By.tagName("input"));
        System.out.println("buttons.size() = " + checkboxList.size());

        for (int i = 0; i < checkboxList.size(); i++) {
            if (!checkboxList.get(i).isSelected()) {
                checkboxList.get(i).click();
            }


        }
        Assert.assertTrue(checkbox1.isSelected(), "Verify checkbox 1 is selected");
        Assert.assertTrue(checkbox2.isSelected(), "Verify checkbox 2 is selected");
        System.out.println("checkbox1.isSelected() = " + checkbox1.isSelected());
        System.out.println("checkbox2.isSelected() = " + checkbox2.isSelected());
        driver.quit();
    }


}