Feature: All login scenarios

  Scenario: to test the functionality of login button for valid username and password
    Given I am on login page
    When I enter correct username and correct password
    And I click on Login button
    Then I should be on home page