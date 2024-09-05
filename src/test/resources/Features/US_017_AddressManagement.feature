Feature: Address Management
  As a registered user, I want to manage my address information in the Address page.

  Background:
    Given The user is logged in
#1
  Scenario: Verify that Address menu item is visible and active
    * User makes driver adjustmentss
    * User clicks the button with description "Profile"
    * User clicks the button with description "Sign In"
    * User clicks the button "Email" and sendKeyss "mehmet.user@querycart.com"
    * User clicks the buttonn "signInLoginButton"
    * User clicks the button with descriptionnn "Profile"
    Then The Address menu item should be visible
    And The Address menu item should be active
#2
  Scenario: Verify that registered addresses are visible on the Address page
    * User makes driver adjustmentss
    * User clicks the button with description "Profile"
    * User clicks the button with description "Sign In"
    * User clicks the button "Email" and sendKeyss "mehmet.user@querycart.com"
    * User clicks the buttonn "signInLoginButton"
    * User clicks the button with descriptionnn "Profile"
    When The user navigates to the Address page
    Then The registered addresses should be displayed
#3
  Scenario: Verify that registered addresses are editable
    * User makes driver adjustmentss
    * User clicks the button with description "Profile"
    * User clicks the button with description "Sign In"
    * User clicks the button "Email" and sendKeyss "mehmet.user@querycart.com"
    * User clicks the buttonn "signInLoginButton"
    * User clicks the button with descriptionnn "Profile"
    When The user navigates to the Address page
    When The user selects an address to edit
    And The user updates the address information
    Then The updated address should be saved successfully
#4
  Scenario: Verify that Add New Address button is visible and active
    * User makes driver adjustmentss
    * User clicks the button with description "Profile"
    * User clicks the button with description "Sign In"
    * User clicks the button "Email" and sendKeyss "mehmet.user@querycart.com"
    * User clicks the buttonn "signInLoginButton"
    * User clicks the button with descriptionnn "Profile"
    When The user navigates to the Address page
    Then The "Add New Address" button should be visible
    And The "Add New Address" button should be active
#5
  Scenario: Verify that new address can be added successfully
    * User makes driver adjustmentss
    * User clicks the button with description "Profile"
    * User clicks the button with description "Sign In"
    * User clicks the button "Email" and sendKeyss "mehmet.user@querycart.com"
    * User clicks the buttonn "signInLoginButton"
    * User clicks the button with descriptionnn "Profile"
    When The user navigates to the Address page
    When The user clicks on the "Add New Address" button
    And The user enters the new address details
    And The user saves the new address
    Then The new address should be added successfully
#6
  Scenario: Verify that registered addresses are deletable
    * User makes driver adjustmentss
    * User clicks the button with description "Profile"
    * User clicks the button with description "Sign In"
    * User clicks the button "Email" and sendKeyss "mehmet.user@querycart.com"
    * User clicks the buttonn "signInLoginButton"
    * User clicks the button with descriptionnn "Profile"
    When The user navigates to the Address page
    When The user selects an address to delete
    And The user confirms the deletion
    Then The address should be deleted successfully
