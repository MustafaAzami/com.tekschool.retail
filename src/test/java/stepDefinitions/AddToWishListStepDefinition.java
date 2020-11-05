package stepDefinitions;

import org.junit.Assert;

import core.Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.AddToWishListPageObj;
import utilities.WebDriverUtility;

public class AddToWishListStepDefinition extends Base {
	
	AddToWishListPageObj wishList = new AddToWishListPageObj();
	
	
	
	
	
	@Given("^User is on Retail WebSite$")
	public void user_is_on_Retail_WebSite() throws Throwable {
		Base.initializeDriver();
		logger.info("Retail page is opened");
		WebDriverUtility.screenShot();

	}

	@When("^User click on Desktop product manue$")
	public void user_click_on_Desktop_product_manue() throws Throwable {
		wishList.clickOndestTopManue();
	}

	@When("^User click Mac$")
	public void user_click_Mac() throws Throwable {
		wishList.clickOnmac();
	}

	@When("^User should see a heart Icon$")
	public void user_should_see_a_heart_Icon() throws Throwable {
		wishList.ishearthIconDisplayed();
		
	}

	
	@When("^User Hoven Mouse over the Icon it should display 'Add to Wish List'$")
	public void user_Hoven_Mouse_over_the_Icon_it_should_display_Add_to_Wish_List() throws Throwable {
		wishList.move();

	}
	

	
	
	@When("^User click on Heart Icon$")
	public void user_click_on_Heart_Icon() throws Throwable {
		wishList.clickOnAddWishList();

	}
	
	@When("^User Should get a success message '(.+)'$")
	public void user_Should_get_a_success_message_Success_You_have_added_iMac_to_your_shopping_cart(String message) throws Throwable {
		Assert.assertTrue(wishList.getSuccessMessage().contains(message));
		WebDriverUtility.screenShot();

	}
	
}
