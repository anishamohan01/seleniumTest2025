package pagesHW;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageHW {
	
	WebDriver driver;
	
	public LoginPageHW(WebDriver dr) {
		PageFactory.initElements(dr, this);
		this.driver = dr;
	} 
	
	
	
	
	
	//Page Elements
	
	@FindBy(id="user-name")
	private WebElement username;
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(id="login-button")
	private WebElement loginbtn;
	
	
	// Page Actions
	
	public void enterUsername() {
		username.sendKeys("locked_out_user");	
	}
	
	public void enterPassword() {
		password.sendKeys("secret_sauce");
	}
	
	public void clickLogin() {
		loginbtn.click();
	}
	

}
