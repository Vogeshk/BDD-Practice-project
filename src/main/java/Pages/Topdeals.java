package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Abstractcomponent.Abstract;

public class Topdeals extends Abstract {
	private WebDriver driver;
	public Topdeals(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//a[text()='Top Deals']")
	WebElement Topdealslink;
	@FindBy(id="search-field")
	WebElement Topsearchbox;
	@FindBy(xpath="//tr/td[1]")
	WebElement Topproduct;

	public void topdealclick() {
		Topdealslink.click();
	}
	public void topsearch(String name) {
		twowindowswitch();
		visiblewait(Topsearchbox);
		textboxwithtext(Topsearchbox,name);
		
	}
	public String Toproductname() {
		return Topproduct.getText().trim();
	}
}
