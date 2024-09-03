package Page;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.OptionsMet;
import utilities.ReusableMethods;

import javax.sound.midi.InvalidMidiDataException;

import static org.junit.Assert.assertTrue;

public class HomepageProductsPage {

    public HomepageProductsPage(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver()),this);
    }

    @FindBy(xpath = "(//*[@class='android.view.View'])[19]")
    private WebElement homepageFirstProduct;

    @AndroidFindBy(accessibility = "Flower Print Foil T-shirt")
    private WebElement firstProductPageProductText;

    @AndroidFindBy(accessibility = "Shipping & Return")
    private WebElement shippingReturnButton;

    @AndroidFindBy(accessibility = "Details")
    private WebElement detailsButton;

    @AndroidFindBy(accessibility = "Videos")
    private WebElement videosButton;

    @AndroidFindBy(accessibility = "Review")
    private WebElement reviewButton;

    @AndroidFindBy(accessibility = "Product Details")
    private WebElement productDetailsTitle;

    @AndroidFindBy(xpath = "(//*[@class='android.view.View'])[29]")
    private WebElement productInformation;


    public static void scrollWithUiScrollable(String elementText) {
        AndroidDriver driver = (AndroidDriver) Driver.getDriver();
        driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textMatches(\""
                        + elementText + "\").instance(0))"));
    }


    String homePageFirstProductText;
    String relevantProductPageProductTexti;



    public void homePageFirstProductIsVisibleAndClickableTest(){
        ReusableMethods.wait(3);
        homePageFirstProductText = getHomepageFirstProduct().getAttribute("content-desc");
        getHomepageFirstProduct().click();
        relevantProductPageProductTexti = getFirstProductPageProductText().getAttribute("content-desc");
        ReusableMethods.wait(1);
    }
    public void relevantProductPageIsVisibleTest(){
        assertTrue(getFirstProductPageProductText().isEnabled());
        assertTrue(homePageFirstProductText.contains(relevantProductPageProductTexti));
    }

    public void HeadingsAreVisibleAndActiveInTheProductPageTest(){

        try {
            OptionsMet.swipe(508,1761,508,527);
        } catch (InvalidMidiDataException e) {
            e.printStackTrace();
        }

        assertTrue(getDetailsButton().isDisplayed());
        assertTrue(getVideosButton().isDisplayed());
        assertTrue(getReviewButton().isDisplayed());
        assertTrue(getShippingReturnButton().isDisplayed());
        assertTrue(getDetailsButton().isEnabled());
        assertTrue(getVideosButton().isEnabled());
        assertTrue(getReviewButton().isEnabled());
        assertTrue(getShippingReturnButton().isEnabled());
    }
    public void clickTheDetailsButton(){

        try {
            OptionsMet.swipe(508,1761,508,527);
        } catch (InvalidMidiDataException e) {
            e.printStackTrace();
        }
        detailsButton.click();
    }
    public void elementIsVisibleByDescription(String description) {
        //AndroidDriver driver = (AndroidDriver) getAppiumDriver();
        AndroidDriver driver = (AndroidDriver) Driver.getDriver();
        WebElement element = driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiSelector().description(\"" + description + "\")"));
       assertTrue(element.isDisplayed());
    }
    public void productDetailsTitleAndInformationIsVisible(){

        assertTrue(productDetailsTitle.isDisplayed());
        assertTrue(productInformation.isDisplayed());

    }

    public WebElement getProductDetailsTitle() {
        return productDetailsTitle;
    }

    public WebElement getProductInformation() {
        return productInformation;
    }

    public WebElement getShippingReturnButton() {
        return shippingReturnButton;
    }

    public WebElement getDetailsButton() {
        return detailsButton;
    }

    public WebElement getVideosButton() {
        return videosButton;
    }

    public WebElement getReviewButton() {
        return reviewButton;
    }

    public WebElement getHomepageFirstProduct() {
        return homepageFirstProduct;
    }

    public WebElement getFirstProductPageProductText() {
        return firstProductPageProductText;
    }
}


