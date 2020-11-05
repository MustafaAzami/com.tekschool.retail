package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.WebDriverUtility;

public class AddToWishListPageObj extends Base {
	public AddToWishListPageObj() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy (xpath = "//a[contains(text(),'Desktops') and @class='dropdown-toggle']")
	private WebElement deskTopManue;
	
	@FindBy (xpath ="//a[contains(text(),'Mac (1)')]")
	private WebElement mac;
	
	@FindBy (xpath = "(//i[@class='fa fa-heart'])[1]")
	private WebElement hearthIconDisplayed;
	
	@FindBy (xpath ="(//i[@class='fa fa-heart'])[1]")
	private WebElement hoverOverHeartIcon;
	
	@FindBy (xpath ="(//i[@class='fa fa-heart'])[1]")
	private WebElement AddWishList;

	@FindBy(xpath ="//body/div[@id='product-category']/div[1]")
	private WebElement mysuccessMessage;

	
	
	public void clickOndestTopManue() {
		deskTopManue.click();
	}
	
	public void clickOnmac() {
		mac.click();
	}
	
	public boolean ishearthIconDisplayed() {
		if(hearthIconDisplayed.isDisplayed())
			return true;
		else
			return false;
	}
	
	public void move() {
		WebDriverUtility.moveToElementAction(hoverOverHeartIcon);
	}
	
	
	public void clickOnAddWishList() {
		AddWishList.click();
	}
	
	public String getSuccessMessage() {
		
		//try {
		String expectedtext = WebDriverUtility.getText(mysuccessMessage);
		//System.out.println(expectedtext);
		return expectedtext;
	//	}
	//	catch (NoSuchElementException e) {
	//		e.printStackTrace();
	//	}
		
	}
	
}
