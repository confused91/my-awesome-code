package bdd_in_action.stepdefinition;

import bdd_in_action.base.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import selenium.pages.CreateAccountPage;
import selenium.pages.FacebookLoginPage;

public class FacebookAccountCreationSteps extends BaseTest {

    FacebookLoginPage facebookLoginPage;
    CreateAccountPage createAccountPage;

    @When("user clicks on create new account button on facebook login page")
    public void user_clicks_on_create_new_account_button_on_facebook_login_page() {
        facebookLoginPage = new FacebookLoginPage(driver);
        facebookLoginPage.clickCreateAccount();

    }

    @Then("sign up page should be opened")
    public void sign_up_page_should_be_opened() {
        createAccountPage = new CreateAccountPage(driver);
    }

}
