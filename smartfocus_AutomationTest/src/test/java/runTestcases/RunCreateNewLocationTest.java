package runTestcases;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features=".", format={"json:target/cucumber.json", "html:target/cucumber"})
public class RunCreateNewLocationTest {

}
