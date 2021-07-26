package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/Login.feature",
        /*
        * glue is where we can find implementation for gherkin
        * steps we provide path of package for steps
        * */
        glue = "steps",

        /*
        * if we set dry run to true it will quickly scan all gherkin steps
        * are implemented or not. If it is true no actual execution happens
        * */
        dryRun = false,

        /*
        * it means that the console output for the cucumber test is easily readable
        * it will remove unreadable character
        * */
        monochrome = true,

        /*
        * if strict is set to true then at the time of execution if cucumber encounters
        * any undefined steps, it will give an error and stops execution. Also it gives code snippet for the unimplemented steps
        * */
        // strict  = true,

        /*
        * tags will identify the scenerios based on the tags we will provide such as
        * @smoke, @regression etc we can add multiples tags in the runner class to execute scenerios belong to different tags
        * such as
        * 1) and - text cases with only both tags will execute
        * 2) or - all tags chosen will execute
        *  */
        tags="@test",

        plugin = {"pretty", "html:target/cucumber.html", "json:target/cucumber.json", "rerun:target/failed.txt"}

)
public class SmokeRunner {
}
