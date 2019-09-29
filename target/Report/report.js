$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/FlightFinder.feature");
formatter.feature({
  "name": "Find Flights",
  "description": "  User find relevant flights when choosing departure and destination cities",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Choosing departure and destination and engaging flight finder",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User navigates to blazedemo",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.user_navigates_to_blazedemo()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User chooses his departure city",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.user_chooses_his_departure_city()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User chooses his destination city",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.user_chooses_his_destination_city()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks the find flights button",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.user_clicks_the_find_flights_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User will be navigated to flight reservation page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.user_will_be_navigated_to_flight_reservation_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});