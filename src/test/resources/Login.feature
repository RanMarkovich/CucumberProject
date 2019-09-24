Feature: Login into account
  User logs in to account using correct credentials

  Scenario: Login into account with correct details
    Given User navigates to blazedemo
    And User clicks the home button to go to login page
    And User enters correct username
    And User enters correct password
    And User ticks remember me checkbox
    When User clicks the login button
    Then User will be navigated to the successful login page