package pageObjects;





import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.WebDriverUtility;

public class ChangeCurrencyPageObj extends Base {
	public ChangeCurrencyPageObj() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//span[contains(text(),'Currency')]")
	private WebElement currencyIcon;
	
	@FindBy (xpath = "//button[contains(text(),'€ Euro')]")
	private WebElement euroCurrencies;
	@FindBy (xpath ="//button[contains(text(),'£ Pound Sterling')]")
	private WebElement poundCurrency;
	
	
	
	public boolean iscurrencyIconshow() {
		if (currencyIcon.isDisplayed())
			return true;
		else 
			return false;
	}
	
	public void clickcurrencyIcon() {
		currencyIcon.click();
	}
	
	public void listOfCurrency() {
		List<WebElement> list = driver.findElements(By.xpath("//div/ul[@class='dropdown-menu']"));
		if (list.size()==3) {
		System.out.print("Number of 3");
		}
		
		
	}
	
	
	
	
}
