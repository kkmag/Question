Feature:
  As a customer
  I want to have search option
  So that i can find items by typing their names

  Scenario Outline: Searching item by general name that is in Stock
    Given User is on Home Page
    When User search item by <generalName>
    Then User see all the results that match this name
    Examples:
      | generalName |
      | printed     |
      | Printed     |
      | PRINTED     |
      | PrInTeD     |

  Scenario Outline: Searching item by full product name that is in Stock
    Given User is on Home Page
    When User search item by <productName>
    Then User find exactly one element
    Examples:
    | productName |
    |Faded Short Sleeve T-shirts |
    |Blouse                      |
