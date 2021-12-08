package com.demoblaze.tests;

import com.demoblaze.steps.serenity.DemoblazeSteps;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class SignUpTest {

    @Managed
    WebDriver driver;

    @Steps
    DemoblazeSteps user;

    @Test
    @Title(Add a new user to store);

    String userName = "user001";
    String password = "test123";


    user.openStore();
    user.navigateToSignUpLink();
    user.addNewUserInfo(userName, password);
    user.clickSignUp();

}

