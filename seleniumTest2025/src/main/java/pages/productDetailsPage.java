package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class productDetailsPage extends BasePageHW{
	
	
	public productDetailsPage(WebDriver dr) {
		super(dr);
	}
	
	@FindBy(id="add-to-cart")
	private WebElement addToCart;
	
	@FindBy(className="shopping_cart_link")
	private WebElement cartLink;
	
	
	public void clickAddToCart() {
		addToCart.click();
	}

	public void clickCartLink() {
		cartLink.click();
	}
	
}
