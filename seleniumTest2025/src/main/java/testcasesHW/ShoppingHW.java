package testcasesHW;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pagesHW.LoginPageHW;

public class ShoppingHW {
	
	WebDriver driver;
	
	@BeforeMethod()
	public void before() {
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	
	@AfterMethod()
	public void after() {
		driver.quit();
	}
	
	
	@Test()
	public void loginTest() {
		LoginPageHW lp = new LoginPageHW(driver);
		lp.enterUsername();
		lp.enterPassword();
		lp.clickLogin();
	}

}
