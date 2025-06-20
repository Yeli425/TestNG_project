package com.practice.tests.ddf;

import com.practice.pages.DashboardPage;
import com.practice.pages.LoginPage;
import com.practice.tests.TestBase;
import com.practice.utilities.ExcelUtil;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DDFLoginTest extends TestBase {

    @DataProvider
    public Object[][] userData(){
        ExcelUtil qa3short = new ExcelUtil("src/test/resources/Vytracktestdata.xlsx","QA3-short");

        String [][] dataArray = qa3short.getDataArrayWithoutFirstRow();

        return dataArray;
    }


    @Test(dataProvider = "userData")
    public void loginTestDDF(String username,String password,String firstname,String lastname){
        extentLogger = report.createTest("Test "+firstname+" "+lastname);

        LoginPage loginPage = new LoginPage();
        loginPage.login(username,password);

        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.waitUntilLoaderScreenDisappear();

        String actualFullname = dashboardPage.getUserName();
        String expectedFullname = firstname+" "+lastname;

        Assert.assertEquals(actualFullname,expectedFullname);
        extentLogger.pass("PASS");
    }

}
