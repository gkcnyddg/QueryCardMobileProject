package Page;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
public class US_026_FavoritePage {

   public US_026_FavoritePage() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver()), this);
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(2)")
    public static WebElement favoriteIcon;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Wishlist\")")
    public static WebElement wishlistIcon;

    @AndroidFindBy (uiAutomator = "new UiSelector().description(\"(1  Products Found)\")")
    public static WebElement productFoundText;

    @AndroidFindBy (uiAutomator = "new UiSelector().description(\"Flower Print Foil T-shirt\n" +
            "0 (0  Reviews)\n" +
            "$65.00\")")
    public static WebElement flowerTshirt;

    @AndroidFindBy (uiAutomator = "new UiSelector().description(\"Wishlist\")")
    public static WebElement wishListText;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(2)")
    public static WebElement removeIcon;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Remove\n" +
            "Removed from Wishlist\")")
    public static WebElement removedFromWishlistText;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(2)")
    public static WebElement wishListEmptyIconu;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc='Wishlist']")
    public WebElement wishlistPage;

    public void addProductToFavorites() {
        favoriteIcon.click();
    }

    public static void goToWishlist() {
        wishlistIcon.click();
    }


}

