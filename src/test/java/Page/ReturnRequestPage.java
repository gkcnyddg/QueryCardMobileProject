package Page;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class ReturnRequestPage {
    @AndroidFindBy(accessibility = "Order History") // Profil > Order History Buttonu
    public WebElement ProfilOrderHistory  ;

   @AndroidFindBy(xpath = "(//*[@class=\"android.widget.ImageView\"])[2]") // Profil > Order History > ilk Ürün karti
   public WebElement  OrderHistoryIlkSiparis ;

    @AndroidFindBy(accessibility = "Return Orders") // Profil > Return Orders Buttonu
    public WebElement ProfilReturnOrders  ;

}
