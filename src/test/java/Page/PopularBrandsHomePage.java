package Page;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;

public class PopularBrandsHomePage {
    public PopularBrandsHomePage(){

        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver()),this);

    }
    @AndroidFindBy(accessibility = "Popular Brands")
    public WebElement popularBrandsText;
    @AndroidFindBy(accessibility = "Blossom Boutique")
    public WebElement blossomBrand;
    @AndroidFindBy(accessibility = "Nike")
    public WebElement nikeBrand;
    @AndroidFindBy(accessibility = "Dr. Martens")
    public WebElement martensBrand;
    @AndroidFindBy(accessibility = "Clarks")
    public WebElement clarksBrand;
    @AndroidFindBy(accessibility = "Converse")
    public WebElement converseBrand;
    @AndroidFindBy(accessibility = "The North Face")
    public WebElement northFaceBrand;
    @AndroidFindBy(accessibility = "Levis")
    public WebElement levisBrand;
    @AndroidFindBy(accessibility = "Vans")
    public WebElement vansBrand;
    @AndroidFindBy(accessibility = "Red Wing")
    public WebElement redWingBrand;
    @AndroidFindBy(accessibility = "Allen Edmonds")
    public WebElement allenBrand;
    @AndroidFindBy(accessibility = "Adidas")
    public WebElement adidasBrand;
    @AndroidFindBy(accessibility = "Lesurmesure")
    public WebElement lesurmesureBrand;
    @AndroidFindBy(accessibility = "Harrods")
    public WebElement harrodsBrand;
    @AndroidFindBy(accessibility = "US Polo")
    public WebElement poloBrand;
    @AndroidFindBy(xpath = "//*[@class='android.view.View']")
    public List<WebElement> slider ;






}
