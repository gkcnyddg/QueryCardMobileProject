Feature: As a registered user,
        I would like to have a page in my Dashboard where I can view my shopping history
  Background:
    * User makes driver adjustments
    * User perform sign in with email: "userSelcuk", password: "passSelcuk"
    * User Navigate to the Dashboard

  Scenario: Verify "Order History" menu item is visible and active.
    * User verify that "Order History" item is visible

  Scenario: Verify shopping history viewing icon is active.
    * User goes to Order History page
    * User verify view history icon is visible

  Scenario Outline: Verify order invoice can be accessed from Order History.
    * User goes to Order History page
    * User click on order <index>
    * User click on Downland Receipt
    * User verify that receipt contains <orderId>, <orderDate>, <paymentType>, <total>
    Examples:
    |index|orderId   |orderDate             |paymentType     |total   |
    |1    |#280824530|02:28 PM, 28-08-2024  |Cash On Delivery|$310.00|

  Scenario: Verify an order can be canceled from the Order History.
    * User goes to Order History page
    * User click on order 2
    * User scroll down into bottom
    * User verify that cancel button is active.

