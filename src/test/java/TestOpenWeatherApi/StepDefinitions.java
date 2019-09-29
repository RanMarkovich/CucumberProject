package TestOpenWeatherApi;

import com.jayway.restassured.response.Response;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import static com.jayway.restassured.RestAssured.when;
import static org.junit.Assert.assertEquals;

public class StepDefinitions {
    private Response response;

    @Given("^User send GET request to OpenWeatherMap with correct appid$")
    public void user_send_GET_request_to_OpenWeatherMap_with_correct_appid() throws Exception {
        response = when().get("http://api.openweathermap.org/data/2.5/weather?id=294514&appid=7575e7608cc6fa2587b22b386c5c64c8");
    }

    @Then("^User should get (\\d+) response code$")
    public void user_should_get_response_code(int arg1) throws Exception {
        assertEquals(200, response.getStatusCode());
    }
}
