package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Abstractcomponent.Abstract;

public class landingpage extends Abstract {
	private WebDriver driver;
	public landingpage(WebDriver driver) {
		super (driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy (xpath="//input[@type='search']")
	WebElement search;
	@FindBy(xpath="//h4[@class='product-name']")
	WebElement productname;
	@FindBy(xpath="//a[@class='increment']")
	WebElement increment;
	@FindBy(xpath="//button[text()='ADD TO CART']")
	WebElement cartbutton;
	public void search(String name) {
		visiblewait(search);
		textboxwithtext(search,name);
	}
	public String getproductname() {
		return productname.getText().split("-")[0].trim();
	}

	public void getproduct(int quantity) {
		for (int i=1;i>quantity;i++) {
			increment.click();
		}
		cartbutton.click();
	}
}
