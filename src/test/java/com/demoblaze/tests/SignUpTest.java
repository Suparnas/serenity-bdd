package com.demoblaze.tests;

import com.demoblaze.steps.serenity.DemoblazeSteps;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.WebDriver;

public class SignUpTest {

    @Managed
    WebDriver driver;

    @Steps
    DemoblazeSteps user;

}
