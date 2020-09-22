package p2;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "use_cases",
   plugin = { "html:target/cucumber/wikipe"},
		   monochrome=true,
		   snippets = SnippetType.CAMELCASE,
		   glue = {"p2"},
		   strict=true
		   )

public class AcceptanceTest {

}