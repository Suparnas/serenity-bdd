package com.demoblaze.steps;

import com.demoblaze.steps.serenity.DemoblazeStoreSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class Sample {

    @Managed
    WebDriver driver;

    @Steps
    DemoblazeStoreSteps shopper;

    @Test
    @Title("Navigating to Sign On")
    public void clickLoginLink() {

        shopper.clickLoginLink();

    }
}
