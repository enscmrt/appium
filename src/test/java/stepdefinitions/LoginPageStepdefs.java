package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import utilities.DriverFactory;

public class LoginPageStepdefs {
    LoginPage lp = new LoginPage(DriverFactory.getDriver());
    @Given("user is on Login Page")
    public void userIsOnLoginPage() {
    }

    @When("click Login Button on Login Page")
    public void clickLoginButtonOnLoginPage() {
        lp.clickLoginButton();

    }

    @When("sendkeys username to usernamebox on Login Page")
    public void sendkeysUsernameToUsernameboxOnLoginPage() {
    }

    @Then("should see image on Login Page")
    public void shouldSeeImageOnLoginPage() {
    }
}
