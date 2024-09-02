
Feature:As a registered user, I want to have a payment page where I can pay for my orders that I control.
  Background:
    * User makes driver adjustments
    * Log in as a registered user.
    * Navigate to the Payment Information page.

  Scenario: [US024->TC001]Payment Method Selection
  * Verify the Select Payment Method menu item is visible.


  Scenario:[US024->TC002]Stripe Payment Method Form Availability
  * On the Payment Information page,confirm that payment types are available.
  * Select Stripe as the payment method.
  * Verify that the card information form is displayed.

  Scenario: [US024->TC003]Stripe Card Information Submission and Payment
    * Select Stripe as the payment method.
    * Fill in the card information form with valid details.
    * The payment should be processed successfully, and a confirmation message should be displayed.


  Scenario: [US024->TC004]Payment types availability
    * On the Payment Information page,confirm that payment types are available.

  Scenario Outline: [US024->TC005]Stripe Card Information Submission and Payment Negative Cases
    * Select Stripe as the payment method.
    * Fill in the card information form "<cardNo>","<expiryDate>","<CVV>","<Zip>"with invalid details.

    Examples:
      | cardNo               | expiryDate | CVV  | Zip      |
      |424242424242424       | 1229       | 345  | 56789    |
      |4242424242424242      | 1220       | 345  | 56789    |
      |4242424242424242      | 1229       | 3    | 56789    |
      |4242424242424242      | 1229       | 345  | 5        |

  Scenario: [US024->TC006]Stripe Payment Method Shopping Resumption
    * Select Stripe as the payment method.
    * Fill in the card information form with valid details.
    * The payment should be processed successfully, and a confirmation message should be displayed.
    * After completing the payment, verify if there's an option to resume shopping.
    * Click on the option to resume shopping.

  Scenario: [US024->TC007]Stripe Payment Method Order Details and Invoice Visibility
    * Select Stripe as the payment method.
    * Fill in the card information form with valid details.
    * The payment should be processed successfully, and a confirmation message should be displayed.
    * After order completion, navigate to the order summary or invoice section.
    * Verify that order details and invoice are viewable.


  Scenario:[US024->TC008]Cash on Delivery Payment Method Order Details and Invoice Visibility

    * Select Cash on Delivery as the payment method.
    * The payment should be processed successfully, and a confirmation message should be displayed.
    * After order completion, navigate to the order summary or invoice section.
    * Verify that order details and invoice are viewable.

  Scenario:[US024->TC009]Cash on Delivery Payment Method Shopping Resumption
    * Select Cash on Delivery as the payment method.
    * The payment should be processed successfully, and a confirmation message should be displayed.
    * After completing the payment, verify if there's an option to resume shopping.
    * Click on the option to resume shopping.





