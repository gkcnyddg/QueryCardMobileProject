package stepdefinitions;

import Page.QueryCardPage;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.OptionsMet;
import utilities.ReusableMethods;



public class Stepdefinition extends OptionsMet {
    QueryCardPage card = new QueryCardPage();
    Actions actions = new Actions(Driver.getDriver());

    @Given("User makes driver adjustments")
    public void user_makes_driver_adjustments() {
        Driver.getDriver();
    }

    @Given("User confirms to be on the homepage")
    public void user_confirms_to_be_on_the_homepage() {
        card.LogoGorunurTest();
        Assert.fail();
    }

    @Given("User clicks the button with description {string}")
    public void user_clicks_the_button_with_description(String description) {
        ReusableMethods.wait(3);
        clickButtonByDescription(description);
    }

    @Given("User clicks the button {string} and sendKeys {string}")
    public void user_clicks_the_button_and_send_keys(String elementName, String text) {
        card.phoneTextBoxClickAndSendKeys(text);
        // Telefon numarası alanından sonra Tab ile şifre alanına geç
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys("Wise.123").perform();
        ReusableMethods.wait(1);
        // Şifre alanından sonra Tab ile "remember me" checkbox'ına geç
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys(Keys.SPACE).perform();
        actions.sendKeys(Keys.ENTER).perform();

    }

    @Given("User clicks the button {string}")
    public void user_clicks_the_button(String elementName) {
        card.signInLoginClick();
        ReusableMethods.wait(1);
        hideKeyboard();
        ReusableMethods.wait(2);

    }

    @Given("Verifies username {string} in dashboard")
    public void verifies_username_in_dashboard(String userName) {
        ReusableMethods.wait(1);
        VerifyElementText(userName);
    }
    /***US 11   **/
    @Given("As a user muss be {string} phone and {string} password Login")
    public void as_a_user_muss_be_phone_and_password_login(String phoneNumber, String password) {
        card.Login(phoneNumber,password);
    }
    @Given("User clicks the button with itemName {string} and {string} and {string} added WishList")
    public void user_clicks_the_button_with_item_name_and_and_added_wish_list(String itemName, String reviews,String price) {
       xPathElementClick(itemName,reviews,price);
    }


    @Given("Driver turns off")
    public void driver_turns_off() {
        Driver.quitDriver();
        //quitAppiumDriver();
    }
    @Given("Toaster is displayed")
    public void toast_is_displayed() {
        card.wishListToast();

    }

    ////////////////////////////////////////// TC_01 <-> TC_02 BackGround //////////////////////////////////////////////

    @Given("user opens the app")
    public void user_opens_the_app() {

        //The app is opened automatically

        ReusableMethods.wait(2);

    }
    @Given("user ensures that profile icon is visible on the bottom bar")
    public void user_ensures_that_profile_icon_is_visible_on_the_bottom_bar() {

        //user asserts that profile icon is visible
        Assert.assertTrue(card.getProfileIconBottomBar().isDisplayed());
        ReusableMethods.wait(2);

    }
    @Given("user clicks on the profile icon")
    public void user_clicks_on_the_profile_icon() {

        card.getProfileIconBottomBar().click();
        ReusableMethods.wait(2);

    }
    @Given("user clicks on signup button")
    public void user_clicks_on_signup_button() {

        card.getSignUpButton().click();
        ReusableMethods.wait(2);

    }

    /////////////////////////////////////// US_07 -> TC_01 + TC_02 /////////////////////////////////////////////////////

    @Given("user clicks on use email instead button")
    public void user_clicks_on_use_email_instead_button() {

        card.getUseEmailInsteadButton().click();
        ReusableMethods.wait(2);

    }
    @Given("{string} Email and {string} values are entered to the related fields")
    public void and_values_are_entered_to_the_related_fields(String Name, String password) {

        card.getSignUpName().click();
        card.getSignUpName().sendKeys(ConfigReader.getProperty(Name));
        actions.sendKeys(Keys.TAB).perform();
        card.getSignUpEmail().sendKeys(ConfigReader.getProperty("Email"));
        actions.sendKeys(Keys.TAB).perform();
        card.getSignUpPassword().sendKeys(ConfigReader.getProperty(password));
        ReusableMethods.wait(2);

    }

    @Given("Name phoneNumber and Password values are entered to the related fields")
    public void and_values_are_entered_to_the_related_fields() {

        card.getSignUpName().click();
        card.getSignUpName().sendKeys(ConfigReader.getProperty("Name"));
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys(Keys.TAB).perform();
        card.getSignUpEmail().sendKeys(ConfigReader.getProperty("phoneNumber2"));
        actions.sendKeys(Keys.TAB).perform();
        card.getSignUpPassword().sendKeys(ConfigReader.getProperty("password"));
        ReusableMethods.wait(2);

    }

    @Given("user clicks on sign up button")
    public void user_clicks_on_sign_up_button() {

        card.getAccountCreateSignUpButton().click();
        ReusableMethods.wait(2);

    }
    @Given("user is directed to SignIn page")
    public void user_is_directed_to_sign_ın_page() {

        Assert.assertTrue(card.getRegisterSuccessfully().isDisplayed());
        ReusableMethods.wait(2);

    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////


}

