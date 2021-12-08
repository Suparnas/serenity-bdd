package com.demoblaze.steps.serenity;

import com.demoblaze.pages.*;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class DemoblazeSteps extends ScenarioSteps {

    BasePage basePage;
    /***********************************
     *
     * BASE STEPS
     *    /***********************************
     */
    @Step("Clicking on Log in")
    public LoginPage clickLoginLink() {
        return basePage.clickLoginLink();
    }

    @Step("Navigating to Home Page")
    public HomePage navigateToHome() {
        return basePage.navigateToHome();
    }

    @Step("Navigating to Account Page")
    public AccountPage navigateToWelcomePage() {
        return basePage.navigateToWelcomePage();
    }

    @Step("Navigating to Product Page")
    public ProductPage navigateToProductCategory(ProductCategories ProductCategory) {
        return basePage.navigateToProductCategory(ProductCategory);
    }

    @Step("Logging out from the DemoBlaze site")
    public  HomePage Logout() {
        return basePage.Logout();
    }
}
