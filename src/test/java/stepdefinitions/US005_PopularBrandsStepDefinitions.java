package stepdefinitions;

import Page.PopularBrandsHomePage;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import utilities.Driver;
import utilities.OptionsMet;
import utilities.ReusableMethods;

import javax.sound.midi.InvalidMidiDataException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class US005_PopularBrandsStepDefinitions {
PopularBrandsHomePage popularBrandsHomePage=new PopularBrandsHomePage();

    @Given("Locate the Popular Brands section.")
    public void locate_the_popular_brands_section() throws InterruptedException, InvalidMidiDataException {
        for (int i = 0; i <4 ; i++) {
            ReusableMethods.wait(2);
            OptionsMet.swipe(545,1849,545,701);
        }



    }
    @Given("Verifies that Popular Brands section is visible")
    public void verifies_that_popular_brands_section_is_visible() {
        popularBrandsHomePage.popularBrandsText.click();
        Assert.assertTrue(popularBrandsHomePage.popularBrandsText.isDisplayed());

    }
    @Given("Verify that each brandname is displayed")
    public void verify_that_each_brandname_is_displayed() throws InvalidMidiDataException {
        List<String> brandNames = new ArrayList<>();
        brandNames.addAll(Arrays.asList("Blossom Boutique", "Nike", "Dr. Martens", "Clarks", "Converse", "The North Face", "Levis", "Vans", "Red Wing", "Allen Edmonds", "Adidas", "Lesurmesure", "Harrods", "US Polo","Street Style Co.","Urban Casuals"));

        for (int i = 0; i < brandNames.size(); i++) {

                PopularBrandsHomePage.VerifyElementTextXpath(brandNames.get(i));
            if ((i+1)%3==0) {
                OptionsMet.swipe(952, 1739, 78, 1739);
            }
        }
    }

    @Given("Click on a brand name and Verify that clicking leads to the appropriate brand page.")
    public void click_on_a_brand_name_and_verify_that_clicking_leads_to_the_appropriate_brand_page() throws InvalidMidiDataException {
        List<String> brandNames = new ArrayList<>();
        brandNames.addAll(Arrays.asList("Blossom Boutique", "Nike", "Dr. Martens", "Clarks", "Converse", "The North Face", "Levis", "Vans", "Red Wing", "Allen Edmonds", "Adidas", "Lesurmesure", "Harrods", "US Polo","Street Style Co.","Urban Casuals"));
       ReusableMethods.wait(3);
        for (int i = 0; i < brandNames.size(); i++) {
            PopularBrandsHomePage.ClickElementandVerify(brandNames.get(i));
            Driver.getDriver().navigate().back();
            ReusableMethods.wait(2);
            if ((i+1)%3==0){
                OptionsMet.swipe(952,1739,78,1739);
            }

        }


    }






}