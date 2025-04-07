package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePageHW {
	

	WebDriver driver;
	
	public BasePageHW(WebDriver dr) {
		PageFactory.initElements(dr, this);       // 3 Page factory
		this.driver = dr;
	}

}
