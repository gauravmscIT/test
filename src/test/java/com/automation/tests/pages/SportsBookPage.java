package com.automation.tests.pages;


import com.automation.tests.helpers.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.springframework.stereotype.Component;

import java.util.List;

import static com.automation.tests.helpers.BrowserDriver.getCurrentDriver;
import static org.assertj.core.api.Assertions.assertThat;


@Component
public class SportsBookPage extends PageObject {


    private By showLoginOption = By.cssSelector(".account-tab__text [data-translate='SBHEADER_LOGIN']");
    private By usernameField = By.cssSelector("#loginUsernameInput");
    private By passwordField = By.cssSelector("#loginPasswordInput");
    private By loginBtn = By.cssSelector("#loginButton");

    private By bettingMenu = By.cssSelector("[title='Betting']");


    private By selections = By.cssSelector(".btmarket__selection .btn.betbutton.oddsbutton");

    private By stakeInputField = By.cssSelector("input[data-ng-model='bet.stake']");

    private By placeBetBtn = By.cssSelector("#place-bet-button");

    private By accountTabBtn = By.cssSelector("#accountTabButton");

    private By toReturnValueElement = By.cssSelector(".betslip-selection__estimated-returns " +
            ".betslip-selection__estimated-returns-amount");


    private By totalStakePriceElement = By.cssSelector("#total-stake-price");

    private By balanceLink = By.cssSelector("#balanceLink");

    private By betPlacedConfirmation = By.cssSelector("#receipt-notice-box");

    private By logoutLink = By.cssSelector("#logoutLink");


    public WebElement showLoginOption() {
        return waitForElement(showLoginOption);
    }

    public WebElement usernameField() {
        return waitForElement(usernameField);
    }

    public WebElement passwordField() {
        return waitForElement(passwordField);
    }

    public WebElement loginBtn() {
        return waitForElement(loginBtn);
    }

    public WebElement bettingMenu() {
        return waitForElement(bettingMenu);
    }

    public WebElement selections() {
        return waitForElement(selections);
    }


    public WebElement stakeInputField() {
        return waitForElement(stakeInputField);
    }


    public WebElement placeBetBtn() {
        return waitForElement(placeBetBtn);
    }

    public WebElement accountTabBtn() {
        return waitForElement(accountTabBtn);
    }

    public WebElement toReturnValueElement() {
        return waitForElement(toReturnValueElement);
    }

    public WebElement totalStakePriceElement() {
        return waitForElement(totalStakePriceElement);
    }


    public WebElement balanceLink() {
        return waitForElement(balanceLink);
    }

    public WebElement betPlacedConfirmation() {
        return waitForElement(betPlacedConfirmation);
    }

    public WebElement logoutLink() {
        return waitForElement(logoutLink);
    }


    public void loginAs(String username, String password) {
        clickUsingJS(showLoginOption());
        usernameField().clear();
        usernameField().sendKeys(username);
        passwordField().clear();
        passwordField().sendKeys(password);
        clickUsingJS(loginBtn());
        assertThat(accountTabBtn().isDisplayed()).isTrue();


    }

    public void selectOption(String option) throws InterruptedException {
        try {
            By el = By.cssSelector("[title='" + option + "']");
            elementToBeClickable(getCurrentDriver().findElement(el));
            WebElement optionElement = getCurrentDriver().findElement(el);
            clickUsingJS(optionElement);
        } catch (StaleElementReferenceException e) {

        }


    }

    public void selectFirstActiveSelection() throws InterruptedException {
        try {

            elementToBeClickable(getCurrentDriver().findElement(selections));
            List<WebElement> activeSelections = getCurrentDriver().findElements(selections);


            clickUsingJS(activeSelections.get(0));

        } catch (StaleElementReferenceException e) {

        }

    }

    public void placeBet(String betAmt) {
        stakeInputField().clear();
        stakeInputField().sendKeys(betAmt);


    }


}


