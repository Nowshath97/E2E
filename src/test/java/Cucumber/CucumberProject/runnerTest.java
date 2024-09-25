package Cucumber.CucumberProject;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users Folder\\workspace2\\CucumberProject\\src\\main\\java\\Testscenarios",
		glue={"Step_Definitions","Hooks"},
		dryRun=false,
		monochrome = false,
		tags= ("@SmokeTest"),
		plugin = { "rerun:target/rerun.txt" })

public class runnerTest {

}