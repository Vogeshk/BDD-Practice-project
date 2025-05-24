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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Pages.Pagemanager;
import Pages.Topdeals;
import Pages.landingpage;

public class Offerstepefination {
public WebDriver driver;
public WebDriverWait wait;
public String offerpageproduct;
public String productpageproduct;
public Topdeals topdeals;
public Pagemanager Pagemanager ;
public Textcontextsetup textcontextsetup;

public Offerstepefination(Textcontextsetup Textcontextsetup) {
	this.textcontextsetup =Textcontextsetup;
}
	@Then("^User searched for (.+) in offers page to check if product exists$")
	public void userSeasrchedForProductInOffersPage(String Name) {
		// Pagemanager = new Pagemanager(textcontextsetup.driver);
			topdeals= textcontextsetup.pagemanager.Topdeals();
	topdeals.topdealclick();
	topdeals.topsearch(Name);
	
	}
	@Then("validate product and offerpage")
	public void validate_product_and_offerpage() {
		//String product= Pagemanager.landingpage().getproductname();
	Assert.assertEquals( textcontextsetup.productpageproduct, topdeals.Toproductname());
	}

}
