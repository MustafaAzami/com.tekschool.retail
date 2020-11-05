package pageObjects;


import java.util.ArrayList;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class RemoveProductPageObj extends Base {

		
	public RemoveProductPageObj() {

		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//span[contains(text(),'Shopping Cart')]")
	private WebElement ShoppingCartManue;
	
	@FindBy(xpath ="//h1[contains(text(),' (10.00kg)')]")
	private WebElement ListShow;
	
	@FindBy (xpath = "(//button[@class='btn btn-danger'])[2]")
	private WebElement RedXButton;
	
	@FindBy (xpath ="(//button[@class='btn btn-danger'])[2]")
	private WebElement RedXButtonClick;
	
	public void clickOnShoppingCartManue() {
		ShoppingCartManue.click();
	}
	
	public boolean isListShow() {
		if(ListShow.isDisplayed())
			return true;
		else
			return false;
		
	}
	public boolean showRedXButton() {
		if(RedXButton.isDisplayed()) 
			return true;
		else
			return false;
		}
	
	public void cickonRedXButtonClick() {
		RedXButtonClick.click();
	}
	
	
	
}
