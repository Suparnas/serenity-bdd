package com.demoblaze.tests;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Title;
import org.openqa.selenium.WebDriver;

import com.demoblaze.steps.serenity.DemoBlazeSteps;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class Sample {

    @Managed
    WebDriver driver;

    @Steps
    DemoBlazeSteps user;

    @Test
    @Title("Navigating to DemoBlaze page")
    public void navigateToSignOnPage() {

        user.navigateToSignOnPage();

    }

}
