Feature: Smoke test
  @smoke
  Scenario: Main functions' test
    * User makes driver adjustments
    * User registers to the app
    * User waits for 10 sec
    * User clicks the button with description "Profile"
    * The user navigates to the Address page
    * The "Add New Address" button should be visible
    * The user clicks on the "Add New Address" button
    * The user enters the new address details
    * The user saves the new address
    * The new address should be added successfully
    * User navigates to the back
    * The user navigates to the homepage
    * User waits for 5 sec
    * Kullanıcı istediği ürünleri sepetine ekler ve Shipping Information sayfasına ulaşır.
    * User waits for 5 sec
    * Kullanıcı Pick Up Butonunun görüntüler ve tıklar.
    * Kullanıcı Delivery Butonunu görüntüler ve tıklar.
    * User waits for 5 sec
    * User navigates to the back
    * User delete the product on the card
    * User waits for 5 sec
    * The user navigates to the homepage
    * User waits for 5 sec
    * Navigate to the Payment Information pagee.
    * User waits for 5 sec
    * Select Cash on Delivery as the payment method.
    * The payment should be processed successfully, and a confirmation message should be displayed.
    * After completing the payment, verify if there's an option to resume shopping.
    * Click on the option to resume shopping.
    * Locate the Popular Brands section.
    * Verify that each brandname is displayed
    * User waits for 5 sec
    * User clicks the button with description "Profile"
    * User clicks the Logout button





