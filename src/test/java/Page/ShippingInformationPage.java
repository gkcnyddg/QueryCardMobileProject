package Page;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ShippingInformationPage {

    public ShippingInformationPage(){
        //PageFactory.initElements(new AppiumFieldDecorator(getAppiumDriver()),this);
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver()),this);

    }



    // US 19 - TC 1  - STEP 1

    @AndroidFindBy(accessibility = "Profile") // Alt Bardaki Profil butonu
    public WebElement AltBarProfileMEA;

    @AndroidFindBy(accessibility = "Sign In") // Kullanıcı Girişi Yapılmamış Profil Pagedeki > "Sıgn In" < Butonu
    public WebElement ProfilePageSignInMEA;

    @AndroidFindBy(accessibility = "*Use Email Instead") // Sign In Page >"Use Email Instead"< Button
    public WebElement SignUseEmailInsteadMEA;

    @AndroidFindBy(xpath = "(//*[@class=\"android.widget.EditText\"])[1]") // Sign In Page >"Email Text Box"<
    public WebElement SignEmailTextBoxMEA;

    @AndroidFindBy(xpath = "(//*[@class=\"android.widget.EditText\"])[2]") // Sign In Page >"Password Text Box"<
    public WebElement SignPasswordTextBoxMEA;

    @AndroidFindBy(xpath = "(//*[@content-desc=\"Sign In\"])[2]") // Sign In Page >"Sign In Button"<
    public WebElement SignPageSignInButtonMEA;




    // US 19 - TC 2 - STEP 2

    @AndroidFindBy(accessibility = "Category") // Alt Bardaki Category butonu
    public WebElement AltBarCategoryMEA;

    @AndroidFindBy(accessibility = "Juniors") // Category Page >"Juniors"< Button
    public WebElement CategoryJuniorsMEA;

    @AndroidFindBy(accessibility = "Blue") // Ürün Page >"Blue"< Button (Renk Seçimi)
    public WebElement UrunColourBlueMEA;

    @AndroidFindBy(accessibility = "Add To Cart") // Ürün Page >"Add To Cart"< Button
    public WebElement UrunPageAddToCartMEA;

    @AndroidFindBy(accessibility = "Proceed to Checkout") // Shopping Cart Page > "Proceed to Checkout" Button
    public WebElement ProceedToCheckoutMEA;


    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"(5-6 Years) Disney Mickey Mouse Pyjamas Boys T-shirt Shorts Set\n" +
            "0 (0  Reviews)\n" +
            "$15.00\")") // Juniors Mickymouse Kart
    public WebElement JuniorsMickyMouseMEA;



    // US 19 - TC1 - STEP 3

    @AndroidFindBy(accessibility = "Pick Up") // Shipping Information Page >"Pick Up"< Button
    public WebElement ShipInfPickUpMEA;


    // US 19 - TC1 - STEP 4

    @AndroidFindBy(accessibility = "Delivery") // Shipping Information Page >"Delivery"< Button
    public WebElement ShipInfDeliveryMEA;

}
