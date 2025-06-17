package com.practice.tests.pom;

import com.practice.pages.CalendarEventsPage;
import com.practice.pages.DashboardPage;
import com.practice.pages.LoginPage;
import com.practice.tests.TestBase;
import com.practice.utilities.BrowserUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PageSubtitleTest extends TestBase {

    /**
     * Test case
     * Open browser
     * Login as a Driver
     * Verify that page subtitle is Quick Launchpad
     * Go to Activities -> Calendar Events
     * verify that page subtitle is Calendar Events
     */

    @Test
    public void test1(){
        LoginPage loginPage = new LoginPage();

        loginPage.loginAsDriver();
        //Same thing with thread.sleep(3000)
        //BrowserUtils.waitFor(2);
        DashboardPage dashboardPage = new DashboardPage();

        String expectedSubtitle = "Quick Launchpad";

        String actualSubtitle = dashboardPage.getPageSubTitle();

        Assert.assertEquals(actualSubtitle,expectedSubtitle,"verify subtitles");

        dashboardPage.navigateToModule("Activities","Calendar Events");

        CalendarEventsPage calendarEventsPage = new CalendarEventsPage();
        BrowserUtils.waitFor(2);

        Assert.assertEquals(calendarEventsPage.getPageSubTitle(),"Calendar Events","verify subtitles");



    }

}
