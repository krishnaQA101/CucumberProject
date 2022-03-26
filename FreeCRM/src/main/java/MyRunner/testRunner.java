package MyRunner;


import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\DELL\\Desktop\\framework\\FreeCRM\\src\\main\\java\\Features"
		,glue={"stepDefinition"}
		,tags = ("@Firefox")
		)

public class testRunner {

}