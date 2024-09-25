package Runner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\Nowshath Shaik\\Git\\workspace2\\CucumberProject\\src\\main\\java\\Testscenarios",
		glue={"Step_Definitions"},
		dryRun=false,
		monochrome = false,
		tags= ("@SmokeTest"),
		plugin = { "rerun:target/rerun.txt" })

public class runnerTest {

}