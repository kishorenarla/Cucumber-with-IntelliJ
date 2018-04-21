package FreeCrm;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="C:\\Users\\HP 1040-G1\\IdeaProjects\\comqaCRM\\src\\login.feature",
        glue ={"StepDefs"},
        monochrome = true

)
public class testRunner {
}
