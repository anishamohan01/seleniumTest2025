package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.cartPage;
import pages.completePage;
import pages.infoPage;
import pages.loginPage1;
import pages.overviewPage;
import pages.productDetailsPage;
import pages.productsPage;

public class shopping extends BaseTest {
	
	@Test
	public void purchase_bagpack() {
		  // Test cases Means set of actions in a sequences with a validations 
		loginPage1 lp = new loginPage1(driver);
		productsPage pp = new productsPage(driver);
		productDetailsPage pdp = new productDetailsPage(driver);
		infoPage ip = new infoPage(driver);
		overviewPage op = new overviewPage(driver);
		completePage cp = new completePage(driver);
		cartPage cartpage = new cartPage(driver);
		lp.enterusername();
		lp.enterpassword();
		lp.clickLogin();
		pp.clickBackpack();
		pdp.clickAddToCart();
		pdp.clickCartLink();
		cartpage.clickCheckout();
		ip.enterDetails();
		op.clickFinish();
		String header = cp.getHeader();
		System.out.println(header);
		cp.clickBackHome();
		Assert.assertEquals(header, "Thank you for your order!"); // Pass or fail
	}
}
