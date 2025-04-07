import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdownHW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		WebElement oldSelectEl = driver.findElement(By.id("oldSelectMenu"));
		Select oldSelect = new Select(oldSelectEl);
		oldSelect.selectByValue("5");
		oldSelect.selectByIndex(7);
		oldSelect.selectByVisibleText("White");
		WebElement multiSelectEl  = driver.findElement(By.id("cars"));
		Select multiSelect = new Select(multiSelectEl); 
		multiSelect.selectByVisibleText("Opel");
		multiSelect.selectByVisibleText("Audi");
		multiSelect.deselectByVisibleText("Audi");
	}

}
