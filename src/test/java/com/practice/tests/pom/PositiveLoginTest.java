package com.practice.tests.pom;

import com.practice.pages.LoginPage;
import com.practice.tests.TestBase;
import com.practice.utilities.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PositiveLoginTest extends TestBase {


    @Test
    public void loginAsDriver(){
        LoginPage loginPage = new LoginPage();

        String username = ConfigurationReader.get("driver_username");
        String password = ConfigurationReader.get("driver_password");

        loginPage.login(username,password);

        Assert.assertEquals(driver.getCurrentUrl(),"https://qa3.vytrack.com/","verify we successfuly login");

    }

    @Test
    public void loginAsStoreManager(){
        LoginPage loginPage = new LoginPage();

        String username = ConfigurationReader.get("storemanager_username");
        String password = ConfigurationReader.get("storemanager_password");

        loginPage.login(username,password);

     Assert.assertEquals(driver.getCurrentUrl(),"https://qa3.vytrack.com/");




    }

}
