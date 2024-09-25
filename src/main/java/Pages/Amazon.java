package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Amazon {
	
	private WebDriver driver;
	
	public Amazon(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement signin() {
	WebElement signin = driver.findElement(By.xpath("//span[contains(text(),'Hello,')]"));
	return signin;
	}
	
	public WebElement clickSearch(WebDriver driver) {
		WebElement click = driver.findElement(By.id("nav-search-submit-text"));
		
		return click;
	}

}
