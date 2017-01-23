Feature:
  In order to have online shop
  Customers should be able to
  login to their accounts

  Scenario Outline: Login with correct data
    Given User is on login page
    When User writes <email> and <password>
    Then User log to his online shop account
    Examples:
      | email | password |
      |testautomation@wp.pl| marchewka |

  Scenario Outline: Login with incorrect data
    Given User is on login page
    When User writes <email> and <password>
    Then User see error
  Examples:
  | email              | password |
  |testautomation@wp.pl| WrongPassword |
  |wrongEmail@wp.pl    | marchewka     |




