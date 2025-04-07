package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	public LoginPage(WebDriver dr){
		PageFactory.initElements(dr, this);
		this.driver = dr;
		
	}
	
	//Page Elements
	
	@FindBy(id="user-name")
	private WebElement username;
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(id="login-button")
	private WebElement loginBtn;
	
	
	
	//Page Actions
	
	public String enterUsername() {
		username.sendKeys("standard_user");
		return "standard_user";
	}
	
	public void enterPassword() {
		password.sendKeys("secret_sauce");
	}
	
	public void clickLogin() {
		loginBtn.click();
	}


}


