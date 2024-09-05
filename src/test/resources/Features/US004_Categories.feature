
Feature: As a user, I want to be able to see the categories under the categories heading on the homepage and select the product from the category I want.

  @4
  Scenario: All categories should be visible under Category on the homepage.

    * Navigate to the "Category" section.
    * Verify that all top-level categories, "Men", "Women" "Juniors" are displayed.



  Scenario: All subcategories should be visible under Men

    * Navigate to the "Category" section.
    * Select a top-level category "Men".
    * Verify that all subcategories, "Men Clothing", "Men Shoes", "Men Accessories" under the selected category are displayed.