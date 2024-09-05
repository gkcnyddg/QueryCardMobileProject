Feature:
  Background:
    * Click on the "Profile" section at the bottom right
    * Clicks the "Sign In" button
    * Clicks on "Use email instead" text
    * Enters "damra.manager@querycart.com" and "Query.2006" information
    * Clicks the "Sign In" button.


    Scenario:Men category window and subcategories should be visible and active in the home page body section
      * The categories section in the body section must be visible
      * Products of men's brands are displayed in the Categories section.
      * Click on a category name and Verify that clicking leads to the appropriate brand page


@DAMRA
  Scenario: Operations (adding to cart, adding to favorites list and viewing) should be possible on the products on the men category page.
    * Click "men" brands
    * Verifies the activation of the "filter" icon at the top right
    * Click on the checkBox to like the "Adidas 3-Stripes Cushioned Crew" product
    * Verifies and ticks the "WhisList" Button on the Home Page

