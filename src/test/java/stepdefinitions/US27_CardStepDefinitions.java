package stepdefinitions;

import Page.ShoppingCardPage;
import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class US27_CardStepDefinitions {
	ShoppingCardPage shoppingCardPage;

	@Given("User verify that card icon is visible and active")
	public void user_verify_that_card_icon_is_visible_and_active() {
		shoppingCardPage = new ShoppingCardPage();
		boolean displayed = shoppingCardPage.cardIcon.isDisplayed();

		Assert.assertTrue(displayed);
	}

	@ParameterType("[^\"]*")
	public List<Integer> index(String each) {
		return (Arrays.stream(each.split(",")).map(Integer::parseInt).toList());
	}
	@Given("User add {int} product(s) to card")
	public void user_add_product_to_card(int howMany) {
		shoppingCardPage = new ShoppingCardPage();

		shoppingCardPage.firstProduct.click();

		shoppingCardPage.addToCard("S", howMany - 1);

	}

	@Given("User clicks to card page")
	public void user_clicks_to_card_page() {
		shoppingCardPage = new ShoppingCardPage();

		shoppingCardPage.cardIcon.click();
		ReusableMethods.wait(2);
	}

	@Given("User verify that products are displayed")
	public void user_verify_that_products_are_displayed() {
		shoppingCardPage = new ShoppingCardPage();

	//	boolean displayed = shoppingCardPage.firstProductOnCard.isDisplayed();
	//	Assert.assertTrue(displayed);
	}

	@Given("User delete the product on the card")
	public void user_delete_the_product_on_the_card() {
		shoppingCardPage = new ShoppingCardPage();

		shoppingCardPage.removeProductOnTheCardButton.click();
	}

	@Given("User verify that product has been deleted")
	public void user_verift_that_product_has_been_deleted() {
		shoppingCardPage = new ShoppingCardPage();

		String actualSubTotalText = shoppingCardPage.subTotalText.getAttribute("content-desc");
		String expectedSubTotalText = "$0.00";

		Assert.assertEquals(expectedSubTotalText, actualSubTotalText);
	}

	@Given("User verify that subtotal information is visible")
	public void user_verify_that_subtotal_information_is_visible() {
		shoppingCardPage = new ShoppingCardPage();

		boolean displayed = shoppingCardPage.subTotalText.isDisplayed();

		Assert.assertTrue(displayed);
	}

	@Given("User verify that proceed to checkout button is visible and active")
	public void user_verify_that_proceed_to_checkout_button_is_visible_and_active() {
		shoppingCardPage = new ShoppingCardPage();

		boolean displayed = shoppingCardPage.proceedToCheckoutButton.isDisplayed();

		Assert.assertTrue(displayed);
	}

	@Given("User verify that go to shopping button is visible")
	public void user_verify_that_go_to_shopping_button_is_visible() {
		shoppingCardPage = new ShoppingCardPage();

		boolean displayed = shoppingCardPage.goToShoppingButton.isDisplayed();

		Assert.assertTrue(displayed);
	}

}
