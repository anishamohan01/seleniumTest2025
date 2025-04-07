package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class productsPage extends BasePageHW {
	
	
	public productsPage(WebDriver dr) {
		super(dr);
	}

	// 1. Page Elements 
	
	@FindBy(id="item_4_title_link")
	private WebElement backPack;
	
	// 2. Page Actions
	
	public void clickBackpack() {
		backPack.click();
	}
}
