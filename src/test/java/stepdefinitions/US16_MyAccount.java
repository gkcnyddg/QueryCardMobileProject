package stepdefinitions;

import Page.OrderHistoryPage;
import Page.ProfilIconMyAccount;
import Page.WomenCatagory;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import utilities.Driver;

public class US16_MyAccount {
    OrderHistoryPage orderHistoryPage;
    Actions actions = new Actions(Driver.getDriver());
    WomenCatagory womenCatagory;
    ProfilIconMyAccount profilIconMyAccount;

    @Given("The user should be on the dashboard page")
    public void the_user_should_be_on_the_dashboard_page() {

        profilIconMyAccount = new ProfilIconMyAccount();
        profilIconMyAccount.dasbhboardSyf.isDisplayed();

    }
    @Given("And The user navigates to the My Account page")
    public void and_the_user_navigates_to_the_my_account_page() {
        profilIconMyAccount=new ProfilIconMyAccount();
        profilIconMyAccount.MyAccount.click();

    }
    @Given("The My Account page should display summary information")
    public void the_my_account_page_should_display_summary_information() {
        profilIconMyAccount=new ProfilIconMyAccount();
        Assert.assertTrue(profilIconMyAccount.TotalOrders.isDisplayed());
        Assert.assertTrue(profilIconMyAccount.TotalCampleted.isDisplayed());
        Assert.assertTrue(profilIconMyAccount.TotalReturnd.isDisplayed());
        Assert.assertTrue(profilIconMyAccount.WalletBalance.isDisplayed());


    }
    @Given("The My Account page should display the order history")
    public void the_my_account_page_should_display_the_order_history() {
       profilIconMyAccount=new ProfilIconMyAccount();
       Assert.assertTrue(profilIconMyAccount.orderHistory.isDisplayed());
       profilIconMyAccount.orderHistory.click();
       Assert.assertTrue(profilIconMyAccount.orderDetails.isDisplayed());


    }

}
