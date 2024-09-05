Feature: Manage Favorite Products Page
  As a registered user, I want to have a favorite products page on the site, and I want to be able to manage this page.

  Background:
    Given The user is logged in

  Scenario: Add a product to the favorite list
    * Userr makes driver adjustmentss
    * User clicks the button with description "Profile"
    * User clicks the button with description "Sign In"
    * User clicks the button "Email" and sendKeyss "mehmet.user@querycart.com"
    * User clicks the buttonn "signInLoginButton"
    Given The user sees the favorite icon on a product
    When The user clicks the favorite icon
    Then The product should be added to the favorite list
    And The favorite icon should be active

  Scenario: View Wishlist icon on the homepage
    * Userr makes driver adjustmentss
    * User clicks the button with description "Profile"
    * User clicks the button with description "Sign In"
    * User clicks the button "Email" and sendKeyss "mehmet.user@querycart.com"
    * User clicks the buttonn "signInLoginButton"
    Then The Wishlist icon should be visible and active

  Scenario: View products on the Wishlist page
    * Userr makes driver adjustmentss
    * User clicks the button with description "Profile"
    * User clicks the button with description "Sign In"
    * User clicks the button "Email" and sendKeyss "mehmet.user@querycart.com"
    * User clicks the buttonn "signInLoginButton"
    Given The user navigates to the Wishlist page
    Then The products added to the Wishlist should be displayed

  Scenario: Remove a product from the Wishlist
    * Userr makes driver adjustmentss
    * User clicks the button with description "Profile"
    * User clicks the button with description "Sign In"
    * User clicks the button "Email" and sendKeyss "mehmet.user@querycart.com"
    * User clicks the buttonn "signInLoginButton"
    Given The user navigates to the Wishlist page
    When The user clicks the remove icon on a product
    Then The product should be removed from the Wishlist
    And The product should no longer be displayed on the Wishlist page
