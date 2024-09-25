package Pages;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;



public class Hooks {

	WebDriver driver;
	
	
	
	
	@Before
	 public void browser() {
     // Get the WebDriver instance from the BrowserSingleton
     driver = Browser.getdriver(); 
     System.out.println("This will run before the Scenario");
    
	} 
	
	@After
	public void afterScenario() {
		System.out.println("This will run after the Scenario");
	}
	

	
	

}
