package stepDefinitions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:/Users/hitss/eclipse-workspace/com.cucumber.mercadolibre/Feature/loginMercadoLibre.feature",
		      glue = {"stepDefinitions"},
		      monochrome = true,
		plugin = {"pretty","html:target/HtmlReporst"},
		tags = "@tagOutline"
		
		)
public class TestRunner {
}
