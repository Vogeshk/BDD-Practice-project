package StepDefination;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


//import com.aventstack.extentreports.gherkin.model.Scenario;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import utils.Textcontextsetup;

public class Hook {
		
		
		public Textcontextsetup textcontextsetup;
		public Hook(Textcontextsetup textcontextsetup) {
			this.textcontextsetup=textcontextsetup;
		}
		@After
		public void AfterScenario() throws IOException {
			textcontextsetup.testbase.getbrowser().quit();
		}
		@AfterStep
		public void Addscreenshot (Scenario scenario) throws IOException {
			if (scenario.isFailed()) {
				File screenshot = ((TakesScreenshot) textcontextsetup.testbase.getbrowser()).getScreenshotAs(OutputType.FILE);
				String screenshotPath = System.getProperty("user.dir") + "/target/screenshot.png";
				FileUtils.copyFile(screenshot, new File(screenshotPath));
		}
		
		}
}
