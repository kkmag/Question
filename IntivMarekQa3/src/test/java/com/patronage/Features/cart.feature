Feature:
  As a customer
  I want to have shopping cart
  So that i can put, remove, change quantity of items in it


  Scenario: Putting item in cart
    Given Im on product page
    When I add product to my cart
    Then I have this item in my cart

   Scenario: Putting and removing item in cart
     Given Im on product page
     When I add product to my cart
     When I remove product from my cart
     Then I should have empty cart

  Scenario: Changing quantities
    Given Im on product page
    When I add product to my cart
    When I change quantity of product using plus button 5 times
    Then I should have six items of the same product
