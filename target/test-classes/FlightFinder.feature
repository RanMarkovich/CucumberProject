Feature: Find Flights
  User find relevant flights when choosing departure and destination cities

  Scenario: Choosing departure and destination and engaging flight finder
    Given User navigates to blazedemo
    And User chooses his departure city
    And User chooses his destination city
    When User clicks the find flights button
    Then User will be navigated to flight reservation page