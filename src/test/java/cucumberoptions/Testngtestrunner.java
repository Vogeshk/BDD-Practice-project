package cucumberoptions;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@ CucumberOptions(features="src/test/java/featuresfiles",glue="StepDefination",monochrome=true,plugin= {"html:target/cucumber.html"})
public class Testngtestrunner extends AbstractTestNGCucumberTests{
	@Override
	@DataProvider(parallel=true)
	
	public Object[][] scenarios(){
		return super.scenarios();
	}

}
