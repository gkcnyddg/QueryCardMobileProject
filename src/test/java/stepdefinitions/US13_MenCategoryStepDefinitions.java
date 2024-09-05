package stepdefinitions;

import Page.MenCategoryPage;
import Page.QueryCardPage;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.OptionsMet;
import utilities.ReusableMethods;

import javax.sound.midi.InvalidMidiDataException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



import static org.junit.Assert.assertTrue;
import static utilities.OptionsMet.clickButtonByDescription;

public class US13_MenCategoryStepDefinitions {

    MenCategoryPage categoryPage = new MenCategoryPage();
    QueryCardPage queryCardPage = new QueryCardPage();


    @Given("Click on the {string} section at the bottom right")
    public void click_on_the_section_at_the_bottom_right(String profileButton) {
        clickButtonByDescription(profileButton);
        ReusableMethods.wait(3);
    }

    @Given("Clicks the {string} button")
    public void clicks_the_buttonn(String signIn) {
        clickButtonByDescription(signIn);
        ReusableMethods.wait(3);
    }

    @Given("Clicks on {string} text")
    public void clicks_on_text(String string) {
        categoryPage.useEmailText.click();
    }

    @Given("Enters {string} and {string} information")
    public void enters_and_information(String email, String password) {
        categoryPage.emailTextBox.click();
        categoryPage.emailTextBox.sendKeys(ConfigReader.getProperty(email));
        queryCardPage.passwordTextBox.click();
        queryCardPage.passwordTextBox.sendKeys(ConfigReader.getProperty(password));
        ReusableMethods.wait(3);
    }



    @Given("Clicks the {string} button.")
    public void clicks_the_button(String string) {
        queryCardPage.signInLoginClick();
    }
    @Given("The categories section in the body section must be visible")
    public void the_categories_section_in_the_body_section_must_be_visible() {

        Assert.assertTrue(categoryPage.categoriesText.isDisplayed());

    }

    @Given("Products of men's brands are displayed in the Categories section.")
    public void products_of_men_s_brands_are_displayed_in_the_categories_section() throws InvalidMidiDataException {
        List<String> categoriesMen=new ArrayList<>();
        categoriesMen.addAll(Arrays.asList("Men","Men Clothing","Men T-Shirt","Men Shorts","Men Coat","Men Shoes","Men Sneakers",
                                           "Men Classic Shoes","Men Boots","Men Casuel Shoes","Men Accessories","Men Bags","Men Socks"));

        for (int i = 0; i <categoriesMen.size() ; i++) {

            MenCategoryPage.VerifyElementTextXpath(categoriesMen.get(i));
            if ((i+1)%3==0){
                ReusableMethods.wait(2);
                OptionsMet.swipe(987,901,71,921);

            }

        }

    }
    @Given("Click on a category name and Verify that clicking leads to the appropriate brand page")
    public void click_on_a_category_name_and_verify_that_clicking_leads_to_the_appropriate_brand_page() throws InvalidMidiDataException {

        List<String> categoriesMen = new ArrayList<>();
        categoriesMen.addAll(Arrays.asList("Men", "Men Clothing", "Men T-Shirt", "Men Shorts", "Men Coat", "Men Shoes", "Men Sneakers",
                "Men Classic Shoes", "Men Boots", "Men Casuel Shoes", "Men Accessories", "Men Bags", "Men Socks"));

        ReusableMethods.wait(2);
        for (int i = 0; i < categoriesMen.size(); i++) {

            MenCategoryPage.ClickElementandVerify(categoriesMen.get(i));
            Driver.getDriver().navigate().back();
            ReusableMethods.wait(2);

            if ((i + 1) % 3 == 0) {
                ReusableMethods.wait(2);
                OptionsMet.swipe(987,901,71,921);

            }
        }


    }

    @Given("Click {string} brands")
    public void click_men_brands() {
        Assert.assertTrue(categoryPage.menCategoriesText.isEnabled());
        categoryPage.menCategoriesText.click();

    }
    @Given("Verifies the activation of the {string} icon at the top right")
    public void verifies_the_activation_of_the_icon_at_the_top_right(String string) {
       Assert.assertTrue(categoryPage.filtreIcon.isEnabled());
    }
    @Given("Click on the checkBox to like the {string} product")
    public void click_on_the_check_box_for_the_product(String string) {
        Assert.assertTrue(categoryPage.adidasText.isEnabled());

    }
    @Given("Verifies and ticks the {string} Button on the Home Page")
    public void verifies_and_ticks_the_button_on_the_home_page(String string) {

        categoryPage.begeniButonu.click();
        categoryPage.geriTusu.click();
        categoryPage.whisListButonu.click();

        Assert.assertTrue(categoryPage.adidasText.isEnabled());


    }

}


