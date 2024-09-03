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




    // US 19 - TC2 - STEP 3

    @AndroidFindBy(accessibility = "Add") // Shipping Information Page >"Add"< Button
    public WebElement ShipInfAddMEA;


    // US 19 - TC2 - STEP 4


    // NOT !! Alttaki 5 adet locate klavye acıldıgında veya bir tanesi ekranda göründüğünde indexi değişmektedir.
    @AndroidFindBy(xpath = "(//*[@class=\"android.widget.EditText\"])[1]") // Shipping Information Page > Add > "Full Name" Textbox
    public WebElement NewAdressFullNameMEA;

    @AndroidFindBy(xpath = "(//*[@class=\"android.widget.EditText\"])[2]") // Shipping Information Page > Add > "Email" Textbox
    public WebElement NewAdressEmailMEA;

    @AndroidFindBy(xpath = "(//*[@class=\"android.widget.EditText\"])[3]") // Shipping Information Page > Add > "Phone" Textbox
    public WebElement NewAdressPhoneMEA;

    @AndroidFindBy(xpath = "(//*[@class=\"android.widget.EditText\"])[4]") // Shipping Information Page > Add > "Zip Code" Textbox
    public WebElement NewAdressZipCodeMEA;

    @AndroidFindBy(xpath = "(//*[@class=\"android.widget.EditText\"])[4]") // Shipping Information Page > Add > "Street Adress" Textbox
    public WebElement NewAdressStreetAdressMEA;                            // !!! tüm ekran göründüğünde indexi 5 olması gerekiyor !!!



    @AndroidFindBy(accessibility = "Country") // Shipping Information Page > Add > "Country" Seçim kartı
    public WebElement NewAdressCountryMEA;

    @AndroidFindBy(accessibility = "State") // Shipping Information Page > Add > "State" Seçim kartı
    public WebElement NewAdressStateMEA;

    @AndroidFindBy(accessibility = "City") // Shipping Information Page > Add > "City" Seçim kartı
    public WebElement NewAdressCityMEA;



    @AndroidFindBy(className = "android.widget.EditText") // Shipping Information Page > Add > Country-State-City içerisindeki "Arama Text Box"
    public WebElement NewAdressAramaTextBoxMEA;



    @AndroidFindBy(xpath = "(//*[@index=\"0\"])[13]") // Shipping Information Page > Add > Country-State-City içerisindeki bulunan ilk seçenek
    public WebElement NewAdressCSCilkMEA;


    // US 19 - TC2 - STEP 5

    @AndroidFindBy(accessibility = "Add Address") // Shipping Information Page > Add > "Add Address" Button
    public WebElement NewAdressAddAdressButtonMEA;

    // US 19 - TC2 - STEP 6

    @AndroidFindBy(xpath = "(//*[@class=\"android.widget.ImageView\"])[4]") // Shipping Information Page > İlk Adress Kartı
    public WebElement NewAdressIlkAdresKartiMEA;






}
