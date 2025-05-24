package StepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.Textcontextsetup;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


import Pages.Pagemanager;
import Pages.landingpage;

public class Greencartdefination {
public WebDriver driver;
public WebDriverWait wait;
public String offerpageproduct;
public Textcontextsetup textcontextsetup ;
public String product;
public landingpage landingpage;
public Greencartdefination(Textcontextsetup Textcontextsetup) {
	this.textcontextsetup =Textcontextsetup;

}
	@Given("User in on 	Greencart Landing Page")
	public void user_in_on_greencart_landing_page() {
		/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\kurap\\Downloads\\chromedriver-win64\\chromedriver.exe");
		textcontextsetup.driver = new ChromeDriver();
		textcontextsetup.driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	   textcontextsetup.driver.manage().window().maximize();*/
	}
	@When("^User search with short name (.+) and extract actual name of product$")
	public void user_search_with_short_name_and_extract_actual_name_of_product(String Name) throws InterruptedException {
		landingpage=textcontextsetup.pagemanager.landingpage();
	landingpage.search(Name);
        Thread.sleep(5000);
        textcontextsetup.productpageproduct=  landingpage.getproductname();
	}
	@When("User select Quantity of product as {int}")
	public void user_select_quantity_of_product_as(Integer int1) {
		landingpage.getproduct(int1);
	}


}
