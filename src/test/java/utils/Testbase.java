package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Testbase {
public WebDriver driver;
	
	public WebDriver getbrowser() throws IOException {
		if (driver==null) {
			FileInputStream file = new FileInputStream (System.getProperty("user.dir")+"//src//test//configfile.properties");
			Properties prop = new Properties();
			prop.load(file);
			String URL= prop.getProperty("TestURL");
			if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {
				driver = new ChromeDriver();
			}
			if(prop.getProperty("browser").equalsIgnoreCase("Edge")) {
				driver = new EdgeDriver();
			}
				driver.manage().window().maximize();
				driver.get(URL);
	   	}
		return driver;
}
}