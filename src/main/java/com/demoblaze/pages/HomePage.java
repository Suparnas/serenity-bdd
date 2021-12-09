package com.demoblaze.pages;

public class HomePage  extends BasePage{

    private static final String SIGN_UP_LINK = "//a[contains(text(),'Sign up')]";

    private static final String USER_NAME_FIELD = "//input[@id='sign-username']";

    private static final String PASSWORD_FIELD = "//input[@id='sign-password']";

    private static final String SIGN_UP_BUTTON = "//*[@id='Catalog']//input[@name='account.firstName']";

    private static final String HOME_PAGE_LOGO = "//a[@class='navbar-brand']";

    /**
     * Add New User Information
     *
     * @param userName
     * @param password
     * @return
     */
    public HomePage openStore() {
        open();
        //waitForTextToAppear("PRODUCT STORE"); //use explicit wait for the text to appear

        waitFor(HOME_PAGE_LOGO).$(HOME_PAGE_LOGO).click();
        //waitFor(LOG_IN_LINK).$(LOG_IN_LINK).click();
        return this;

    }

    public HomePage navigateToSignUpLink() {
       // waitForTextToAppear("PRODUCT STORE"); //use explicit wait for the text to appear

        waitFor(SIGN_UP_LINK).$(SIGN_UP_LINK).click();
        return this;

    }
    public HomePage addNewUserInfo(String userName , String password) {

     //   waitForTextToAppear("Sign Up");

        $(USER_NAME_FIELD).type(userName);

        $(PASSWORD_FIELD).type(password);

        return this;
    }
    /**
     * Clisking Signup button
     *
     * @return
     */
    public HomePage clickSignUp() {

        waitFor(SIGN_UP_BUTTON).$(SIGN_UP_BUTTON).click();

        return this.switchToPage(HomePage.class);
    }

}
