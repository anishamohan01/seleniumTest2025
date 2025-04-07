package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class completePage extends BasePageHW{ //Camel casing
	
	
	public completePage(WebDriver dr) {
		super(dr);
	}
	
	
	@FindBy(className="complete-header")
	private WebElement successMessage;
	
	@FindBy(id="back-to-products")
	private WebElement backHome;
	
	public String getHeader() {
		return successMessage.getText();   // Thank you for your order!
	}
	
	public void clickBackHome() {
		backHome.click();
	}

}
