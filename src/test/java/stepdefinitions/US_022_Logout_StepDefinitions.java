package stepdefinitions;

import Page.HomepageProductsPage;
import io.cucumber.java.en.Given;
import utilities.OptionsMet;
import utilities.ReusableMethods;

public class US_022_Logout_StepDefinitions {

    HomepageProductsPage page = new HomepageProductsPage();


    @Given("Log in as a registered user,bilal.")
    public void log_in_as_a_registered_user_bilal() {
        page.loginTest();
    }
    @Given("{string} button should be visible on the homepage,bilal.")
    public void should_be_visible_on_the_homepage_bilal(String button) {
        ReusableMethods.wait(2);
        page.elementIsVisibleByDescription(button);
        OptionsMet.clickButtonByDescription(button);
    }
    @Given("{string} button should be visible and active in the dashboard sidebar when clicking on the profile icon")
    public void logout_link_should_be_visible_and_active_in_the_dashboard_sidebar_when_clicking_on_the_profile_icon(String button) {
       ReusableMethods.wait(1);
        page.elementIsVisibleAndActiveByDescription(button);
    }
    @Given("Successful exit from the site when clicked {string} button")
    public void successful_exit_from_the_site_when_clicked(String button) {
        OptionsMet.clickButtonByDescription(button);
        ReusableMethods.wait(2);
    }

}
