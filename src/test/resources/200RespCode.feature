Feature: Response is 200
  User gets 200 response code when using correct appid in Open Weather Map API

  Scenario: Calling Open Weather API using correct appid
    Given User send GET request to OpenWeatherMap with correct appid
    Then User should get 200 response code