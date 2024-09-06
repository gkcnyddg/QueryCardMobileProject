Feature: As a user I want to add a product to my card, and perform payment

  @E2E
  Scenario Outline:End To End
    * User makes driver adjustments
    * Log in as a registered user.
    * User add 5 products to card
    * User clicks to card page
    * User verify that products are displayed
    * User delete the product on the card
    * User verify that product has been deleted
    * User clicks on go to shopping page
    * User waits for 2 sec
    * Navigate to the Payment Information page.
    * User waits for 5 sec
    * Select Stripe as the payment method.
    * User waits for 2 sec
    * Fill in the card information form "<cardNo>","<expiryDate>","<CVV>","<Zip>"with invalid details.
    * Fill in the card information form with valid details.
    * The payment should be processed successfully, and a confirmation message should be displayed.
    * After order completion, navigate to the order summary or invoice section.
    * Verify that order details and invoice are viewable.
    Examples:
      | cardNo | expiryDate | CVV | Zip |
      |424242424242424       | 1229       | 345  | 56789    |

