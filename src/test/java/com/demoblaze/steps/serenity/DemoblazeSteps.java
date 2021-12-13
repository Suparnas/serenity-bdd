package com.demoblaze.steps.serenity;

import com.demoblaze.pages.*;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class DemoblazeSteps extends ScenarioSteps {

    BasePage basePage;
    HomePage homePage;

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

//    @Step("Navigating to Product Page")
//    public ProductPage navigateToProductCategory(ProductCategories ProductCategory) {
//        return basePage.navigateToProductCategory(ProductCategory);
//    }

//    @Step("Logging out from the DemoBlaze site")
//    public  HomePage Logout() {
//        return basePage.Logout();
//    }

    @Step("Opening the site")
    public HomePage openStore() { return homePage.openStore();
    }



    @Step("Navigating to Signup Link")
    public HomePage navigateToSignUpLink() {
        return homePage.navigateToSignUpLink();
    }

    @Step("Entering info")
    public HomePage addNewUserInfo(String userName, String password) {
        return homePage.addNewUserInfo(userName, password);
    }

    @Step("Click on Sign up")
    public HomePage clickSignUp() {
        return homePage.clickSignUp();

    }

    @Step("get Alert")
    public HomePage getAlert() {
        return (HomePage) homePage.getAlert();

    }
}

