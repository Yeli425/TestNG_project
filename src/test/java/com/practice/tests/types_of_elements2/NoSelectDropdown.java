package com.practice.tests.types_of_elements2;

import com.practice.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class NoSelectDropdown {

    @Test
    public void test1(){
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://practice.expandtesting.com/dropdown");

        WebElement dropdownElement = driver.findElement(By.id("dropdown"));

        dropdownElement.click();

        List<WebElement> dropdownOptions = driver.findElements(By.xpath("//option[contains(text(), 'Option')]"));

        //print each option
        for (WebElement option : dropdownOptions) {
            System.out.println(option.getText());
        }

        //click yahoo
        dropdownOptions.get(1).click();



    }
}
