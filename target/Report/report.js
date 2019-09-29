$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/200RespCode.feature");
formatter.feature({
  "name": "Response is 200",
  "description": "  User gets 200 response code when using correct appid in Open Weather Map API",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Calling Open Weather API using correct appid",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User send GET request to OpenWeatherMap with correct appid",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.user_send_GET_request_to_OpenWeatherMap_with_correct_appid()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should get 200 response code",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.user_should_get_response_code(int)"
});
formatter.result({
  "status": "passed"
});
});