import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class StepDefinitions {
    WebDriver driver;
    WebDriverWait wait;
    @Before
    public void setUp(){
       this.driver = new ChromeDriver();
       this.wait = new WebDriverWait(driver,60);
       this.driver.manage().window().maximize();
       this.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
       this.driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);
    }

    @After
    public void tearDown(){
        this.driver.manage().deleteAllCookies();
        this.driver.quit();
        this.driver = null;
    }

    @Given("^User navigates to blazedemo$")
    public void user_navigates_to_blazedemo() throws Throwable {
        driver.get("http://blazedemo.com/");
    }

    @And("^User clicks the home button to go to login page$")
    public void user_clicks_the_home_button_to_go_to_login_page() throws Throwable {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("home"))).click();
    }

    @And("^User enters correct username$")
    public void user_enters_correct_username() throws Throwable {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email"))).sendKeys("ranm@yopmail.com");
    }

    @And("^User enters correct password$")
    public void user_enters_correct_password() throws Throwable {
        driver.findElement(By.id("password")).sendKeys("123456");
    }

    @And("^User ticks remember me checkbox$")
    public void user_ticks_remember_me_checkbox() throws Throwable{
        driver.findElement(By.name("remember")).click();

    }

    @When("^User clicks the login button$")
    public void user_clicks_the_login_button() throws Throwable{
        driver.findElement(By.name("remember")).submit();
    }

    @Then("^User will be navigated to the successful login page$")
    public void user_will_be_navigated_to_the_successful_login_page() throws Throwable{
        String successLoginText = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("panel-body"))).getText();
       Assert.assertEquals("You are logged in!", successLoginText);
    }

}
