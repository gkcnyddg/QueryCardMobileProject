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



    // US 19 - TC 1-2-3-4-5-6  - STEP 1

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




    // US 19 - TC 1-2-3-4-5-6 - STEP 2

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




    // US 19 - TC3 - STEP 3
    @AndroidFindBy(accessibility = "Edit") // Shipping Information Page > "Edit" Button
    public WebElement ShipInfEditMEA;

    @AndroidFindBy(accessibility = "Address") // Shipping Information Page > Edit > "Address" Başlığı
    public WebElement ShipInfEditAdresBaslikMEA;



    // US 19 - TC3 - STEP 4
    @AndroidFindBy(xpath = "(//*[@index=\"0\"])[15]") // Shipping Information Page > Edit > ilk Adres kartı üzerindeki Yeşil Yuvarlak
    public WebElement ShipInfEditYesilYuvarlakMEA;



    // US 19 - TC4 - STEP 4
    @AndroidFindBy(xpath = "(//*[@index=\"1\"])[3]") // Shipping Information Page > Edit > ilk Adres kartı üzerindeki Kırmızı Yuvarlak
    public WebElement ShipInfEditKirmiziYuvarlakMEA;


    // US 19 - TC4 - STEP 5
    @AndroidFindBy(accessibility = "Are you sure you want to delete?") // Shipping Information Page > Edit > Kırmızı Yuvarlak Tıklandıktan sonraki sayfa "Are you sure you want to delete?" başlığı
    public WebElement ShipInfEditDeleteSureYaziMEA;

    @AndroidFindBy(accessibility = "Delete") // Shipping Information Page > Edit > Kırmızı Yuvarlak Tıklandıktan sonraki sayfada "Delete" Button
    public WebElement ShipInfEditKirmiziYuvarlakDeleteButtonMEA;



    // US 19 - TC5 - STEP 3
    @AndroidFindBy(accessibility = "Order Summary") // Shipping Information Page > "Order Summary" Başlığı
    public WebElement ShipInfOrderSummaryMEA;
    @AndroidFindBy(accessibility = "Subtotal") // Shipping Information Page > Order Summary Altındaki "Subtotal"
    public WebElement ShipInfSubtotalMEA;
    @AndroidFindBy(accessibility = "Tax") // Shipping Information Page > Order Summary Altındaki "Tax"
    public WebElement ShipInfTaxMEA;
    @AndroidFindBy(accessibility = "Shipping Charge") // Shipping Information Page > Order Summary Altındaki "Shipping Charge"
    public WebElement ShipInfShippingChargeMEA;
    @AndroidFindBy(accessibility = "Discount") // Shipping Information Page > Order Summary Altındaki "Discount"
    public WebElement ShipInfDiscountMEA;
    @AndroidFindBy(accessibility = "Total") // Shipping Information Page > Order Summary Altındaki "Total"
    public WebElement ShipInfTotalMEA;


    // US 19 - TC6 - STEP 3
    @AndroidFindBy(xpath = "(//*[@class=\"android.widget.ImageView\"])[4]") // Shipping Information Page > İlk adresin kartı
    public WebElement ShipInfIlkAdresKartiMEA;

    // US 19 - TC6 - STEP 4
    @AndroidFindBy(accessibility = "Save & Pay") // Shipping Information Page > "Save & Pay" Button
    public WebElement ShipInfSaveAndPayMEA;

}
