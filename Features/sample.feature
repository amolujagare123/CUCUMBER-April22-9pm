Feature: All login scenarios

  Background: before scenario
    Given open the browser
    And maximize it

  @login
  Scenario: to test the functionality of login button for valid username and password
    Given I am on login page
   # When I enter correct username and correct password
    When I enter "admin" and "admin123"
    And I click on Login button
    Then I should be on home page

  @login
  Scenario: to test the functionality of login button for invalid username and password
    Given I am on login page
    #When I enter incorrect username and incorrect password
    When I enter "xyz" and "abcd"
    And I click on Login button
    Then I there should be an error message

  @login  @blank
  Scenario: to test the functionality of login button for blank username and password
    Given I am on login page
    #When I enter blank username and blank password
    When I enter "" and ""
    And I click on Login button
    Then I there should be another error message

    @userReg
    Scenario: to test the functionality of submit button
      Given I am on user registration page
      When I enter below data
      | amol | Ujagare | 787878 | amol@gmail.com |
      Then user should be added

   @subscribe
   Scenario Outline: to test the subscribe button
     Given I am on subscription page
     When I enter <name> , <email>,<phone>
     Then User should be subscribed
     Examples:
       | name     | email       | phone  |
       | Amol     | a@gmail.com | 123456 |
       | Harshal  | h@gmail.com | 223456 |
       | vrunda   | v@gmail.com | 323456 |
       | prafulla | p@gmail.com | 423456 |

