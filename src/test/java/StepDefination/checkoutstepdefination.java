package StepDefination;

import org.testng.Assert;

import Pages.Checkout;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.Textcontextsetup;

public class checkoutstepdefination {
	public Textcontextsetup textcontextsetup;
	public Checkout checkoutpage;
	public checkoutstepdefination(Textcontextsetup textcontextsetup) {
		this.textcontextsetup=textcontextsetup;
	}
	@When("user select the checkout")
	public void user_select_the_checkout() {
		checkoutpage=textcontextsetup.pagemanager.checkout();
		checkoutpage.checkout();
		checkoutpage.proceedButton();
	}
	@Then("^User validate product (.+) and quantity in checkout$")
	public void userValidateProductAndQuantityInCheckout(String productName) {
		Assert.assertEquals(checkoutpage.getproductname(), textcontextsetup.productpageproduct);
	}
	@Then("validate the buttons apply and place order")
	public void validate_the_buttons_apply_and_place_order() throws InterruptedException {
		Thread.sleep(2000);
	    Assert.assertTrue(checkoutpage.validatepromoButton());
	    Assert.assertTrue(checkoutpage.validateorderButton());

	}
}
