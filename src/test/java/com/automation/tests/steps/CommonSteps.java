package com.automation.tests.steps;


import com.automation.tests.helpers.UrlHelper;
import com.automation.tests.pages.SportsBookPage;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.StaleElementReferenceException;
import org.springframework.beans.factory.annotation.Autowired;

import java.net.URISyntaxException;
import java.util.concurrent.TimeUnit;

import static com.automation.tests.helpers.BrowserDriver.getCurrentDriver;


public class CommonSteps {
    @Autowired
    UrlHelper urlHelper;

    @Autowired
    private SportsBookPage sportsBookPage;


    @After("@acceptance_test")
    public void beforeScenario() throws URISyntaxException {
        try {
            sportsBookPage.clickUsingJS(sportsBookPage.accountTabBtn());
            sportsBookPage.clickUsingJS(sportsBookPage.logoutLink());
        } catch (StaleElementReferenceException ex) {
            System.out.println("Ignoring " + ex);
        }

        //To log out after every scenario

    }


}
