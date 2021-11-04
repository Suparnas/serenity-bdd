package pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class BasePage extends PageObject {

    private static final String HOME_PAGE_LOGO = "//a[@class='navbar-brand']";
    private static final String LOG_IN_LINK = "//*[@id='login2']";

    public LoginPage navigateToSignOnPage() {
        waitForTextToAppear("PRODUCT STORE"); //use explicit wait for the text to appear

        waitFor(HOME_PAGE_LOGO).$(HOME_PAGE_LOGO).click();

        waitFor(LOG_IN_LINK).$(LOG_IN_LINK).click();

        return this.switchToPage(LoginPage.class);

    }


    //clicks on the Login Link
    public LoginPage clickLoginLink() {

        waitFor(LOG_IN_LINK).find(By.xpath(LOG_IN_LINK)).click();
        return this.switchToPage(LoginPage.class);
    }
}
