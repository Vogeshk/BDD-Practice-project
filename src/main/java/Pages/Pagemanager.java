package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Pagemanager {
	private WebDriver driver;
	public Pagemanager(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);

	}

	public landingpage landingpage() {
		return new landingpage(driver);
	}
	public Topdeals Topdeals() {
		return new Topdeals(driver);
	}
	public Checkout checkout() {
		return new Checkout(driver);
	}
}