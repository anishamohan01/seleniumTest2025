package testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.LoginPage;

public class Shopping {
	
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
		//driver.quit();
	}
	
	@Test()
	public void loginTest() {
		LoginPage lp = new LoginPage(driver);
		String x = lp.enterUsername();
		System.out.println(x);
		lp.enterPassword();
		lp.clickLogin();
	}
	
	

}
