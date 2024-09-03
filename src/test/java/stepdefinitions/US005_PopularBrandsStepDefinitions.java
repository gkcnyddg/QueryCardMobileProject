package stepdefinitions;

import Page.PopularBrandsHomePage;
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

public class US005_PopularBrandsStepDefinitions {
PopularBrandsHomePage popularBrandsHomePage=new PopularBrandsHomePage();
    @Given("Locate the Popular Brands section.")
    public void locate_the_popular_brands_section() throws InterruptedException, InvalidMidiDataException {
        for (int i = 0; i <3 ; i++) {
            ReusableMethods.wait(2);
            OptionsMet.swipe(545,1849,545,701);
        }



    }
    @Given("Verifies that Popular Brands section is visible")
    public void verifies_that_popular_brands_section_is_visible() {
        popularBrandsHomePage.popularBrandsText.click();
        Assert.assertTrue(popularBrandsHomePage.popularBrandsText.isDisplayed());

    }
    @Given("Verify that each {int},{string} is displayed")
    public void verify_that_each_is_displayed(Integer dataIndex, String brand) {
    popularBrandsHomePage.blossomBrand.click();
    Assert.assertTrue(popularBrandsHomePage.blossomBrand.isDisplayed());
    }

    @Given("Click on a {string} name")
    public void click_on_a_name(String brand) {

    }
    @Given("Click on a brand name and Verify that clicking leads to the appropriate brand page.")
    public void click_on_a_brand_name_and_verify_that_clicking_leads_to_the_appropriate_brand_page() throws InvalidMidiDataException {
        popularBrandsHomePage.blossomBrand.click();
        Assert.assertTrue(popularBrandsHomePage.blossomBrand.isDisplayed());
        Driver.getDriver().navigate().back();
        ReusableMethods.wait(2);
        popularBrandsHomePage.nikeBrand.click();
        Assert.assertTrue(popularBrandsHomePage.nikeBrand.isDisplayed());
        Driver.getDriver().navigate().back();
        ReusableMethods.wait(2);
        popularBrandsHomePage.martensBrand.click();
        Assert.assertTrue(popularBrandsHomePage.martensBrand.isDisplayed());
        Driver.getDriver().navigate().back();
        ReusableMethods.wait(2);
        OptionsMet.swipe(952,1739,78,1739);
        popularBrandsHomePage.clarksBrand.click();
        Assert.assertTrue(popularBrandsHomePage.clarksBrand.isDisplayed());
        Driver.getDriver().navigate().back();
        ReusableMethods.wait(2);
        popularBrandsHomePage.converseBrand.click();
        Assert.assertTrue(popularBrandsHomePage.converseBrand.isDisplayed());
        Driver.getDriver().navigate().back();
        ReusableMethods.wait(2);
        popularBrandsHomePage.northFaceBrand.click();
        Assert.assertTrue(popularBrandsHomePage.northFaceBrand.isDisplayed());
        Driver.getDriver().navigate().back();
        ReusableMethods.wait(2);
        OptionsMet.swipe(952,1739,78,1739);
        popularBrandsHomePage.levisBrand.click();
        Assert.assertTrue(popularBrandsHomePage.levisBrand.isDisplayed());
        Driver.getDriver().navigate().back();
        ReusableMethods.wait(2);
        popularBrandsHomePage.vansBrand.click();
        Assert.assertTrue(popularBrandsHomePage.vansBrand.isDisplayed());
        Driver.getDriver().navigate().back();
        ReusableMethods.wait(2);
        popularBrandsHomePage.redWingBrand.click();
        Assert.assertTrue(popularBrandsHomePage.redWingBrand.isDisplayed());
        Driver.getDriver().navigate().back();
        ReusableMethods.wait(2);
        OptionsMet.swipe(952,1739,78,1739);
        popularBrandsHomePage.lesurmesureBrand.click();
        Assert.assertTrue(popularBrandsHomePage.lesurmesureBrand.isDisplayed());
        Driver.getDriver().navigate().back();
        ReusableMethods.wait(2);
        popularBrandsHomePage.allenBrand.click();
        Assert.assertTrue(popularBrandsHomePage.allenBrand.isDisplayed());
        Driver.getDriver().navigate().back();
        ReusableMethods.wait(2);
        popularBrandsHomePage.adidasBrand.click();
        Assert.assertTrue(popularBrandsHomePage.adidasBrand.isDisplayed());
        Driver.getDriver().navigate().back();
        ReusableMethods.wait(2);


    }






}