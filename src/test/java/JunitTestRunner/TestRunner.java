package JunitTestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/features",
		glue="StepDefinations",stepNotifications=true,monochrome=true,tags="@datadriven",
		plugin={"pretty","junit:target/cukes.xml"})
public class TestRunner {

	
}
