package com.demoblaze.tests;

import com.demoblaze.pages.HomePage;
import com.demoblaze.steps.serenity.DemoblazeSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

@RunWith(SerenityRunner.class)
public class SignUpTest {

    @Managed
    WebDriver driver;

    @Steps
    DemoblazeSteps user;

    @Test
    @Title("Add a new user to store")

    public void addNewUserToDemoBlaze() throws InterruptedException {
        String userName = "user001";


        String password = "test123";


        user.openStore();
        user.navigateToSignUpLink();
        user.addNewUserInfo(userName, password);
        user.clickSignUp();
       // user.getAlert();
        Alert alert = driver.switchTo().alert();
        String alertText=alert.getText();

        assertEquals("This user already exist.", alertText);

//
//        String firstMsg = page.getAlert().getText();
//        page.getAlert().accept();
//        String secondMsg = page.getAlert().getText();
//        page.getAlert().accept();
//        Assert.assertEquals("The year is invalid.", firstMsg);
//        Assert.assertEquals("Invalid Receipt Date format.", secondMsg);

    }
}

