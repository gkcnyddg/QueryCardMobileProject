package stepdefinitions;

import Page.HomepageProductsPage;
import io.cucumber.java.en.Given;
import utilities.Driver;
import utilities.OptionsMet;

import javax.sound.midi.InvalidMidiDataException;

public class US_012_homePage_Stepdefinition {

    HomepageProductsPage page = new HomepageProductsPage();

    @Given("Navigate to the homepage,bilal.")
    public void navigate_to_the_homepage_bilal() {

        Driver.getDriver();
    }

    @Given("Select {string} from the homepage,bilal.")
    public void select_from_the_homepage_bilal(String firstProduct) {

        page.homePageFirstProductIsVisibleAndClickableTest();

    }
    @Given("It is verified that the relevant {string} is navigated to,bilal.")
    public void ıt_is_verified_that_the_relevant_is_navigated_to_bilal(String productPage) {

        page.relevantProductPageIsVisibleTest();

    }

    @Given("It is verified that {string}, {string}, {string}, {string} headings should be visible and active,bilal.")
    public void ıt_is_verified_that_headings_should_be_visible_and_active_bilal(String details, String videos, String review, String shippingReturn) {

      page.HeadingsAreVisibleAndActiveInTheProductPageTest();
    }
    @Given("Click the {string} button,bilal.")
    public void click_the_button_bilal(String button) throws InvalidMidiDataException {

        OptionsMet.swipe(508,1761,508,527);
        OptionsMet.clickButtonByDescription(button);

    }
    @Given("It is verified that {string} title is displayed,bilal.")
    public void ıt_is_verified_that_title_and_is_displayed_bilal(String title) {

        page.elementIsVisibleByDescription(title);

    }
    @Given("It is verified that {string} is displayed,bilal.")
    public void ıt_is_verified_that_is_displayed_bilal(String productInformation) {

        page.getProductInformation().isDisplayed();
    }

}
