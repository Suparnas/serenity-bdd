package com.demoblaze.pages;

public class HomePage  extends BasePage{

    private static final String SIGN_UP_LINK = "//*[@id='Catalog']//input[@name='username']";

    private static final String USER_NAME_FIELD = "//*[@id='Catalog']//input[@name='password']";

    private static final String PASSWORD_FIELD = "//*[@id='Catalog']//input[@name='repeatedPassword']";

    private static final String SIGN_UP_BUTTON = "//*[@id='Catalog']//input[@name='account.firstName']";


    /**
     * Add New User Information
     *
     * @param userName
     * @param password
     * @return
     */
    public HomePage addNewUserInfo(String userName , String password) {

        waitForTextToAppear("Sign Up");

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
