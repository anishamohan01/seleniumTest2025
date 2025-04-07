package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class overviewPage extends BasePageHW{
	
	
	public overviewPage(WebDriver dr) {
		super(dr);
		
	}

	@FindBy(name="finish")
	private WebElement finish;
	
	public void clickFinish() {
		finish.click();
	}
	
	
}
