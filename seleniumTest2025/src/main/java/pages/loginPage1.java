package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage1 extends BasePageHW{
	
	public loginPage1(WebDriver dr) {
		super(dr);
	}
	
	@FindBy(name="user-name")
	private WebElement username;
	
	@FindBy(name="password")
	private WebElement pwd;
	
	@FindBy(id= "login-button")
	private WebElement loginBtn;
	
	
	// 2. Page Actions
	public void enterusername() {
		username.sendKeys("standard_user");
	}
	
	public void enterpassword() {
		pwd.sendKeys("secret_sauce");
	}
	
	public void clickLogin() {
		loginBtn.click();
	}
	
	

}
