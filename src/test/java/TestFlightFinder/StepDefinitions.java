package TestFlightFinder;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.After;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;


public class StepDefinitions {
    private WebDriver driver;
    private WebDriverWait wait;
    private Select select;
    private By depCityLocator = By.name("fromPort");
    private String selectDepCity = "Boston";
    private By desCityLocator = By.name("toPort");
    private String selectDesCity = "London";
    private String blazeDemoUrl = "http://blazedemo.com";
    private By flightsTableLocator = By.className("table");
    private By containerHeaderText = By.xpath("/html/body/div[2]/h3");

    @Before
    public void setUp(){
        this.driver = new ChromeDriver();
        this.wait = new WebDriverWait(driver, 60);
        this.driver.manage().window().maximize();
        this.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        this.driver.manage().timeouts().setScriptTimeout(60,TimeUnit.SECONDS);
    }

    @After
    public void tearDown(){
        this.driver.quit();
        this.driver.manage().deleteAllCookies();
        this.driver = null;
    }

    @Given("^User navigates to blazedemo$")
    public void user_navigates_to_blazedemo() throws Throwable {
       driver.get(blazeDemoUrl);
       assertEquals("BlazeDemo", driver.getTitle());
    }

    @And("^User chooses his departure city$")
    public void user_chooses_his_departure_city() throws Throwable {
        select = new Select(driver.findElement(depCityLocator));
        select.selectByVisibleText(selectDepCity);
    }

    @And("^User chooses his destination city$")
    public void user_chooses_his_destination_city() throws Throwable {
        select = new Select(driver.findElement(desCityLocator));
        select.selectByVisibleText(selectDesCity);
    }

    @When("^User clicks the find flights button$")
    public void user_clicks_the_find_flights_button() throws Throwable {
        driver.findElement(desCityLocator).submit();
    }

    @Then("^User will be navigated to flight reservation page$")
    public void user_will_be_navigated_to_flight_reservation_page() throws Throwable{
        wait.until(ExpectedConditions.visibilityOfElementLocated(flightsTableLocator));
        assertEquals("Flights from " + selectDepCity + " to " + selectDesCity + ":", driver.findElement(containerHeaderText).getText());
    }
}
