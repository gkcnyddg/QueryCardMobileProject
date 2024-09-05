package stepdefinitions;

import io.cucumber.java.en.Given;
import utilities.OptionsMet;
import utilities.ReusableMethods;

public class US004 extends OptionsMet {

    @Given("Navigate to the {string} section.")
    public void navigate_to_the_section(String description) {
        ReusableMethods.wait(3);
        clickButtonByDescription(description);
        ReusableMethods.wait(3);

    }

    @Given("Verify that all top-level categories, {string}, {string} {string} are displayed.")
    public void verify_that_all_top_level_categories_are_displayed(String string, String string2, String string3) {
        ReusableMethods.wait(3);
        Object VerifyElementText;
        VerifyElementText("Men");
        VerifyElementText("Women");
        VerifyElementText("Juniors");
        ReusableMethods.wait(3);
    }

    @Given("Select a top-level category {string}.")
    public void select_a_top_level_category_men(String description) {
        ReusableMethods.wait(3);
        clickButtonByDescription(description);
        ReusableMethods.wait(3);
    }


    @Given("Verify that all subcategories, {string}, {string}, {string} under the selected category are displayed.")
    public void verify_that_all_subcategories_under_the_selected_category_are_displayed(String string, String string2, String string3) {
        ReusableMethods.wait(3);
        Object VerifyElementText;
        VerifyElementText("Men Clothing");
        VerifyElementText("Men Shoes");
        VerifyElementText("Men Accessories");
        ReusableMethods.wait(3);
    }










}
