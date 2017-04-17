package com.automation.tests.steps;


import com.automation.tests.helpers.UrlHelper;
import com.automation.tests.pages.SportsBookPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.concurrent.TimeUnit;

import static com.automation.tests.helpers.BrowserDriver.getCurrentDriver;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.within;


public class SportsBookSteps {
    @Autowired
    private UrlHelper urlHelper;


    @Autowired
    private SportsBookPage sportsBookPage;

    Float betAmt;
    Float previousBalance;


    @Given("^I am on sports book page$")
    public void iAmOnSportsBookPage() throws Throwable {
        getCurrentDriver().manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        getCurrentDriver().manage().window().maximize();
        getCurrentDriver().manage().deleteAllCookies();
        getCurrentDriver().get(urlHelper.getUrl());
    }

    @And("^I login with username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void iLoginWithUsernameAndPassword(String username, String password) throws Throwable {
        sportsBookPage.loginAs(username, password);
    }

    @When("^I select a \"([^\"]*)\" event$")
    public void iSelectAEvent(String event) throws Throwable {
        sportsBookPage.selectOption(event);
    }

    @And("^I select the first active selection$")
    public void iSelectTheFirstActiveSelection() throws Throwable {
        sportsBookPage.selectFirstActiveSelection();
    }

    @And("^I place a bet of \"([^\"]*)\"$")
    public void iPlaceABetOf(String betAmt) throws Throwable {
        previousBalance = Float.parseFloat(sportsBookPage.balanceLink().getText().replace("£", ""));
        sportsBookPage.placeBet(betAmt);
        this.betAmt = Float.parseFloat(betAmt);
        assertThat(sportsBookPage.toReturnValueElement().getText().equals(null)).isFalse();
        assertThat(sportsBookPage.totalStakePriceElement().getText().equals(null)).isFalse();
        /*Not sure how the return value and total stake price is calculated.
        Hence asserting it to not null */
        sportsBookPage.clickUsingJS(sportsBookPage.placeBetBtn());


        assertThat(sportsBookPage.betPlacedConfirmation().isDisplayed()).isTrue();

    }

    @Then("^the bet should be successfully placed$")
    public void theBetShouldBeSuccessfullyPlaced() throws Throwable {
        Thread.sleep(3000);
        Float newBalance = Float.parseFloat(sportsBookPage.balanceLink().getText().replace("£", ""));
        assertThat(newBalance).isCloseTo((previousBalance - betAmt), within(0.01f));
        //Using close to as the final value can be rounded off

    }


}
