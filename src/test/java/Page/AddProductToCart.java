package Page;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class AddProductToCart {

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ScrollView\").instance(0)")
    public WebElement urunListesi;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.view.View\").instance(20)")
    public WebElement secilenUrun;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.view.View\").instance(16)")
    public WebElement urunBedeni;
    
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(10)")
    public WebElement addToCart;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(9)")
    public WebElement aded;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(12)")
    public WebElement sepet;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.view.View\").instance(0)")
    public WebElement sepetGoruntuleme;

    @AndroidFindBy(uiAutomator = "accessibility = \"Home\"")
    public WebElement homeButon;

}
