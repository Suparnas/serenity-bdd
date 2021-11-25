package demoblaze.cucumber.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import com.demoblaze.pages.AccountPage;
import com.demoblaze.pages.BasePage;
import com.demoblaze.pages.HomePage;
import com.demoblaze.pages.LoginPage;

public class DemoblazeStoreSteps extends ScenarioSteps {

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

    @Step("Logging out from the DemoBlaze site")
    public  HomePage Logout() {
        return basePage.Logout();
    }
}
