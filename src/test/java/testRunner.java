import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@CucumberOptions(features={"src/test/Features"},
                 plugin = {"pretty","html:Report"})
@RunWith(Cucumber.class)


public class testRunner
{

}
