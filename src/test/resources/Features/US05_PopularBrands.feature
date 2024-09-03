
Feature:As a user, I want to be able to see the popular brands of the site on the homepage
  Background:
    * User makes driver adjustments
    * Locate the Popular Brands section.


  Scenario:Popular Brands Section Visibility
    * Verifies that Popular Brands section is visible


  Scenario Outline: Popular Brands Section Brand Name Display
    * Verify that each <dataIndex>,"<brandname>" is displayed
    Examples:
      | dataIndex | brandname |
      |1          | Blossom Boutique |
      |2          | Nike             |
      |3          | Dr. Martens      |
      |4          |Clarks            |

  @gokcen

  Scenario:Interaction with Brands
    * Click on a brand name and Verify that clicking leads to the appropriate brand page.

