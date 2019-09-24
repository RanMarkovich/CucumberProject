import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions {
    @Given("^User navigates to blazedemo$")
    public void user_navigates_to_blazedemo() throws Exception {
        System.out.println("Method 1");
    }

    @And("^User clicks the home button to go to login page$")
    public void user_clicks_the_home_button_to_go_to_login_page() throws Exception {
        System.out.println("Method 2");
    }

    @And("^User enters correct username$")
    public void user_enters_correct_username() throws Exception {
        System.out.println("Method 3");
    }

    @And("^User enters correct password$")
    public void user_enters_correct_password() throws Exception {
        System.out.println("Method 4");
    }

    @And("^User ticks remember me checkbox$")
    public void user_ticks_remember_me_checkbox() throws Throwable{
        System.out.println("Method 5");
    }

    @When("^User clicks the login button$")
    public void user_clicks_the_login_button() throws Throwable{
        System.out.println("Method 6");
    }

    @Then("^User will be navigated to the successful login page$")
    public void user_will_be_navigated_to_the_successful_login_page() throws Throwable{
       System.out.println("Method 7");
    }

}
