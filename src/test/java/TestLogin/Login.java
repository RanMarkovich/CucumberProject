package TestLogin;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/Report"},
        features = {"src/test/resources/Login.feature"})

public class Login {

}
