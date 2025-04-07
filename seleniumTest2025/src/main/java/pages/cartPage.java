package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class cartPage extends BasePageHW{
	
	
	public cartPage(WebDriver dr) {
		super(dr);
	}

	@FindBy(id="checkout")
	private WebElement checkout;
	
	
	public void clickCheckout() {
		checkout.click();
	}
	
	
	
	
}
