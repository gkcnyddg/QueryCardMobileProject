Feature: As a user, I want to be able to access detailed information about the product
        I have selected on the page

  Background: User navigates to the homepage and select first product.
    * Navigate to the homepage,bilal.
    * Select "first product" from the homepage,bilal.

  Scenario: TC_01  It should be possible to go to the selected product page from the homepage

     * It is verified that the relevant "product page" is navigated to,bilal.


  Scenario: TC_02  Details, Videos, Review, Review, Shipping&Return headings should be visible
            and active when you go to the product page

    * It is verified that "Details", "Videos", "Review", "Shipping&Return" headings should be visible and active,bilal.

  Scenario: TC_03  When Details button is clicked, Product Details title and product information should be displayed

    * Click the "Details" button,bilal.
    * It is verified that "Product Details" title is displayed,bilal.
    * It is verified that "Product information" is displayed,bilal.

  Scenario: TC_04  When clicking the Videos button, the Product Videos title and product videos should be displayed

    * Click the "Videos" button,bilal.
    * It is verified that "Product Videos" title is displayed,bilal.
    * It is verified that "videos" is displayed,bilal.

  Scenario: TC_05  When the Review button is clicked, the Review title and reviews of the product should be displayed

    * Click the "Review" button,bilal.
    * It is verified that "Product Reviews" title is displayed,bilal.
    * It is verified that "reviews of the product" is displayed,bilal.


  Scenario: TC_06  When the Shipping&Return button is clicked, the Shipping&Return heading and the shipping and return conditions of the product should be displayed

    * Click the "Shipping & Return" button,bilal.
    * It is verified that "Shipping & Return" title is displayed,bilal.
    * It is verified that "the shipping and return conditions of the product" is displayed,bilal.