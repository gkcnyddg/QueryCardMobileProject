package stepdefinitions;

import Page.RegisterPage;
import io.cucumber.java.en.Given;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import utilities.ConfigReader;
import utilities.Driver;
import utilities.OptionsMet;

public class US07_Registering extends OptionsMet {


    RegisterPage registerPage = new RegisterPage();
    Actions actions = new Actions(Driver.getDriver());

    ////////////////////////////////////////// TC_01 <-> TC_02 BackGround //////////////////////////////////////////////

    @Given("user opens the app")
    public void user_opens_the_app() {

        //The app is opened automatically

    }
    @Given("user ensures that profile icon is visible on the bottom bar")
    public void user_ensures_that_profile_icon_is_visible_on_the_bottom_bar() {

        //user asserts that profile icon is visible
        Assert.assertTrue(registerPage.getProfileIconBottomBar().isDisplayed());

    }
    @Given("user clicks on the profile icon")
    public void user_clicks_on_the_profile_icon() {

        registerPage.getProfileIconBottomBar().click();

    }
    @Given("user clicks on signup button")
    public void user_clicks_on_signup_button() {

        registerPage.getSignUpButton().click();

    }

    /////////////////////////////////////// US_07 -> TC_01 + TC_02 /////////////////////////////////////////////////////

    @Given("user clicks on use email instead button")
    public void user_clicks_on_use_email_instead_button() {

        registerPage.getUseEmailInsteadButton().click();

    }
    @Given("{string} Email and {string} values are entered to the related fields")
    public void and_values_are_entered_to_the_related_fields(String Name, String Password) {

        registerPage.getSignUpName().click();
        registerPage.getSignUpName().sendKeys(ConfigReader.getProperty(Name));
        actions.sendKeys(Keys.TAB).perform();
        registerPage.getSignUpEmail().sendKeys(ConfigReader.getProperty("Email"));
        actions.sendKeys(Keys.TAB).perform();
        registerPage.getSignUpPassword().sendKeys(ConfigReader.getProperty(Password));

    }

    @Given("Name phoneNumber and Password values are entered to the related fields")
    public void and_values_are_entered_to_the_related_fields() {

        registerPage.getSignUpName().click();
        registerPage.getSignUpName().sendKeys(ConfigReader.getProperty("Name"));
        actions.sendKeys(Keys.TAB).perform();
        registerPage.getSignUpEmail().sendKeys(ConfigReader.getProperty("phoneNumber"));
        actions.sendKeys(Keys.TAB).perform();
        registerPage.getSignUpPassword().sendKeys(ConfigReader.getProperty("Password"));

    }

    @Given("user clicks on sign up button")
    public void user_clicks_on_sign_up_button() {

        registerPage.getAccountCreateSignUpButton().click();

    }
    @Given("user is directed to SignIn page")
    public void user_is_directed_to_sign_ın_page() {

        Assert.assertTrue(registerPage.getRegisterSuccessfully().isDisplayed());

    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////



}

