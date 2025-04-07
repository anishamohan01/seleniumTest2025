package course;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsHW {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");
		driver.findElement(By.className("submit-button")).click();
		driver.findElement(By.linkText("Sauce Labs Backpack")).click();
		driver.findElement(By.name("add-to-cart")).click();
//		driver.findElement(By.tagName("button")).click();
//		Object t = driver.findElement(By.partialLinkText("Items"));
//		System.out.println(t);
		driver.findElement(By.xpath("//button[@data-test='back-to-products']")).click();
		driver.findElement(By.partialLinkText("Bike Light")).click();
		driver.findElement(By.xpath("//button[@id=\"back-to-products\"]")).click();
		driver.get("https:www.google.com");
//		String title = driver.findElement(By.tagName("title")).getText();
//		System.out.println(title);

	}

}
