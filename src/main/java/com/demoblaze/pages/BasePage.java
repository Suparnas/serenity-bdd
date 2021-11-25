package com.demoblaze.pages;

import com.demoblaze.utils.ProductCategories;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class BasePage extends PageObject {

    private static final String HOME_PAGE_LOGO = "//a[@class='navbar-brand']";
    private static final String LOG_IN_LINK = "//*[@id='login2']";
    private static final String LOG_OUT_LINK = "//a[@id='logout2']";
    private static final String MY_ACCOUNT_LINK = "//a[@id='nameofuser']";
    private static final String ABOUT_US__LINK = "//a[contains(text(),'About us')]";
    private static final String CART_LINK = "//a[contains(text(),'Cart')]";
    private static final String CONTACT_LINK = "//a[contains(text(),'Contact')]";


    public LoginPage navigateToSignOnPage() {

        open();
        waitForTextToAppear("PRODUCT STORE"); //use explicit wait for the text to appear

        waitFor(HOME_PAGE_LOGO).$(HOME_PAGE_LOGO).click();
        waitFor(LOG_IN_LINK).$(LOG_IN_LINK).click();
        // return this.switchToPage(LoginPage.class);

        return null;
    }

    //clicks on the Login Link
    //@return
    public LoginPage clickLoginLink() {

        waitFor(LOG_IN_LINK).find(By.xpath(LOG_IN_LINK)).click();
        return this.switchToPage(LoginPage.class);
    }

    //navigate to Home page
    //@return
    public HomePage navigateToHome() {

        waitFor(HOME_PAGE_LOGO).$(HOME_PAGE_LOGO).click();
        return this.switchToPage(HomePage.class);
    }

    //Log out off the site
    //@return
    public HomePage Logout() {

        waitFor(LOG_OUT_LINK).$(LOG_OUT_LINK).click();
        return this.switchToPage(HomePage.class);
    }


    //Navigate to Account page
    //@return
    public AccountPage navigateToWelcomePage() {

        waitFor(MY_ACCOUNT_LINK).$(MY_ACCOUNT_LINK).click();
        return this.switchToPage(AccountPage.class);
    }


    /***
     * Method to select a product category from the side panel
     * @param ProductCategory
     * @return
     */
//    public ProductPage navigateToProductCategory(ProductCategories ProductCategory) {
//
//        switch (productCategory) {
//
//            case Phones:
//
//                waitFor(PHONE_LINK).$(PHONE_LINK).click();
//                return this.switchToPage(ProductPage.class);
//
//            case Laptops:
//
//                waitFor(LAPTOP_LINK).$(LAPTOP_LINK).click();
//                return this.switchToPage(ProductPage.class);
//
//            case Monitors:
//
//                waitFor(MONITOR_LINK).$(MONITOR_LINK).click();
//                return this.switchToPage(ProductPage.class);
//
//            default:
//            break;
//        }
//        return null;
//    }
}

