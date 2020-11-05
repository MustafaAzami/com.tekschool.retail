package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.WebDriverUtility;

public class AddToShoppingCart extends Base{
	
	public AddToShoppingCart() {
		PageFactory.initElements(driver, this);
	}
	@FindBy (xpath = "(//a[contains(text(),'Desktops')])[1]")
	private WebElement deskTopManue;
	@FindBy (xpath ="//a[contains(text(),'Mac (1)')]")
	private WebElement MacProduct;
	@FindBy (xpath ="//span[contains(text(),'Add to Cart')]")
	private WebElement AddToCartButton;
	@FindBy (xpath ="//div/div[contains(text(),' Success: You have added ')]")
	private WebElement successMessage;
	
	
	public void clickOndeskTopManue() {
		deskTopManue.click();
	}
	public void clickOnMacProduct() {
		MacProduct.click();
	}
	public boolean displayAddToCartButton() {
		if(AddToCartButton.isDisplayed())
			return true;
		else
			return false;
	}
	
	public void ClickonAddToCartButton() {
		AddToCartButton.click();
	}
	
	public void showsuccessMessage() {
		successMessage.isDisplayed();
	}
	
	
	
	
	
	
}
