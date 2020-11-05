package stepDefinitions;

import org.apache.log4j.Logger;
import org.junit.Assert;

import core.Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.AddToShoppingCart;
import utilities.WebDriverUtility;

public class AddProductToShoppingCart extends Base {

	AddToShoppingCart addProduct = new AddToShoppingCart();
	
	@Given("^User is on test Envirnoment website$")
	public void user_is_on_test_Envirnoment_website() throws Throwable {
		Base.initializeDriver();
		logger.info("Retail page is opened");
		WebDriverUtility.screenShot();

	}

	@When("^User open desktop product menue$")
	public void user_open_desktop_product_menue() throws Throwable {
		addProduct.clickOndeskTopManue();
		

	}

	@When("^User click on Mac product$")
	public void user_click_on_Mac_product() throws Throwable {
		addProduct.clickOnMacProduct();

	}

	@When("^User should see an Add To Cart button$")
	public void user_should_see_an_Add_To_Cart_button() throws Throwable {
		addProduct.displayAddToCartButton();

	}

	@When("^User click on Add To Cart Button$")
	public void user_click_on_Add_To_Cart_Button() throws Throwable {
		addProduct.ClickonAddToCartButton();

	}

	@Then("^User get A 'Success: You have added iMac to your shopping cart!'$")
	public void user_get_A_Success_You_have_added_iMac_to_your_shopping_cart() throws Throwable {
		addProduct.showsuccessMessage();

	}
	
}
