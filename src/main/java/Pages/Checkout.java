package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkout {

	public WebDriver driver;
	
	public Checkout(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css=".cart-icon")
	WebElement cHECKOUT;
	@FindBy(xpath="//button[text()='PROCEED TO CHECKOUT']")
	WebElement proceedButton;
	@FindBy(xpath="//p[@class='product-name']")
	WebElement checkoutproductname;
	@FindBy(css=".promoBtn")
	WebElement promoButton;
	@FindBy(xpath="//button[text()='Place Order']")
	WebElement orderButton;
	
	public void checkout() {
		cHECKOUT.click();
	}
	public void proceedButton() {
		proceedButton.click();
	}
	
	public String getproductname() {
		return checkoutproductname.getText().split("-")[0].trim();
	}
	 public boolean validatepromoButton () {
		return promoButton.isDisplayed();
	 }
	 public boolean validateorderButton () {
			return orderButton.isDisplayed();
		 }
	
}
