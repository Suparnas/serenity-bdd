package starter;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class MyFirstTest {

    @Managed
    WebDriver driver;
    @Test
    public void navigateToDemoblaze(){

        driver.navigate().to("https://www.demoblaze.com");
    }
}
