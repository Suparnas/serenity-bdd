package com.demoblaze.tests;
import org.junit.Test;


import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class Sample {

    @Managed
    WebDriver driver;

    @Steps
    DemoBlazesteps user;

    @Test
    @Title("Navigating to Products page")
    public void navigateToProductPage() {

        user.navigateToProductpage();

    }

}
