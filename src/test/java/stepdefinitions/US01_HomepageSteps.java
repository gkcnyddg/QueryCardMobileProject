package stepdefinitions;

import io.cucumber.java.en.When;
import utilities.ReusableMethods;
import Page.QueryCardPage;


public class US01_HomepageSteps {

    QueryCardPage queryCardPage = new QueryCardPage();

    @When("User clicks the logo to refresh the page")
    public void user_clicks_the_logo_to_refresh_the_page() {
        queryCardPage.getQueryCardLogoElement().click();
        ReusableMethods.wait(3);  // Optional: Wait for page to refresh
    }


}


