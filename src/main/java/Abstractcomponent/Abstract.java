package Abstractcomponent;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Abstract {
	private WebDriver driver;
	private WebDriverWait wait;
	private Actions action;
	public Abstract (WebDriver driver) {
		this.driver=driver;
		this.wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		this.action = new Actions(driver);
	}
	
	public void visiblewait(WebElement waits) {
		wait.until(ExpectedConditions.visibilityOf(waits));
	}
	public void textboxwithtext(WebElement Element , String send) {
		action.moveToElement(Element).click().sendKeys(send).build().perform();
	}
	public void twowindowswitch() {
		String  CurentWindow = driver.getWindowHandle();
		Set<String> handles=driver.getWindowHandles();
		for(String handle:handles) {
			if (!handle.equals(CurentWindow)) {
				driver.switchTo().window(handle);
			}
		}
	}
}
