package Page;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class WomenCatagory {
   public WomenCatagory(){ PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver()), this);}


   @AndroidFindBy(accessibility = "Category")
   public WebElement catagorybuton; // catagory butonu

    @AndroidFindBy(accessibility = "Women")
   public WebElement womencatagrybuton; //catagry sayfası women

    @AndroidFindBy(uiAutomator = "new UiSelector().className(android.widget.ImageView).instance(3)")
    public WebElement womencatagryokişaretibuton; // Womencatagoryokişareti butonu


    @AndroidFindBy (accessibility = "Women Clothing")
    public WebElement womenCloting; // womenClartingaltcatagory

    @AndroidFindBy(accessibility = "Women Shoes")
    public WebElement womenShoes ; // women shoes alt katagory

    @AndroidFindBy(accessibility = "Women Accessories")
    public WebElement womenAccessories; // women accessories alt katagry


   @AndroidFindBy(uiAutomator = "new UiSelector().className(android.view.View ).instance(15)")
   public WebElement dresUrun; // listedeki herhangi bir ürün

    @AndroidFindBy(uiAutomator = " new UiSelector().className(\"android.widget.ImageView\").instance(3)")
    public WebElement favoributon; // ürün üzründeki favori butonu

    @AndroidFindBy(uiAutomator = " new UiSelector().className(\"android.widget.ImageView\").instance(0)")
    public WebElement womensyfgeritursu; // women sayfasındaki geri tuşu

    @AndroidFindBy(uiAutomator = " new UiSelector().description(\"Wishlist\")")
    public WebElement favoriListesi; // favori listelerinin olduğu buton,

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.view.View\").instance(3)")
    public WebElement favoriSayfasigoruntuleme; // favaori listesini görüntüler

    @AndroidFindBy(accessibility = "Add To Cart")
    public WebElement addtoCartbuton; // ürün bilgilerindeki add to cart

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(12)")
    public WebElement alisverissepeti; // ürün bilgierindeki alışveriş ikonu

    @AndroidFindBy(uiAutomator = " new UiSelector().className(\"android.view.View\").instance(16)")
    public WebElement bedenbilgisiS; // beden bilgisi

    @AndroidFindBy(uiAutomator = " new UiSelector().className(\"android.view.View\").instance(6)")
    public WebElement sepetListe; // sepet liste doğrulama

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(2)")
 public WebElement filtremeikonu; // filtremele ikonu

 @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.RadioButton\").instance(2)")
 public WebElement priceHighToLow; // sortby seçme
 @AndroidFindBy(accessibility = "Brands")
 public WebElement brandsikon; // brands ikon
@AndroidFindBy(accessibility = "Sort By")
 public WebElement sortbyikon;// sortbyikon
 @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(8)")
 public WebElement nikeozellik; // bramds özellik
 @AndroidFindBy(accessibility = "color")
 public WebElement colorbuton; // color buton
 @AndroidFindBy(accessibility = "size")
 public WebElement sizebuton; // size buton
 @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(9)")
 public WebElement sizesecilenozellik; // size özellik
 @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(15)")
 public WebElement colorozellikseme; // color özellik
















}
