Feature: As a registered user,
  I want to have a cart on the site and I want to be able to manage these cart operations

  Background:
    * User makes driver adjustments
    * User perform sign in with email: "userSelcuk", password: "passSelcuk"

  Scenario: Verify the cart icon is visible and active on the homepage.
    * User verify that card icon is visible and active

  Scenario: Verify products are displayed in the cart and can be deleted.
    * User add 5 products to card
    * User clicks to card page
    * User verify that products are displayed
    * User delete the product on the card
    * User verify that product has been deleted

  Scenario: Verify the subtotal information is visible on the Shopping Cart page.
    * User add 5 products to card
    * User clicks to card page
    * User verify that subtotal information is visible

  Scenario: Verify the Proceed to Checkout button is visible
    * User add 5 products to card
    * User clicks to card page
    * User verify that proceed to checkout button is visible and active

  Scenario: Verify the Go to Shopping button is visible and active if there are no items in the cart.
    * User clicks to card page
    * User verify that go to shopping button is visible
