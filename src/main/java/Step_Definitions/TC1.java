package Step_Definitions;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pages.Amazon;
import Pages.Browser;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class TC1 {

	static WebDriver driver;
	
    Amazon amazon;
    int i = 1;
    
    @Before
    public void setup() {
   
      driver=Browser.getdriver();
        amazon = new Amazon(driver);
        
        System.out.println("This will run before the Scenario");
    }
    
	/*
	 * @After public void screenshot() throws IOException {
	 * 
	 * File scrfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 * File demofile = new
	 * File("C:\\Users Folder\\workspace2\\CucumberProject\\scr"+i+".jpg");
	 * FileUtils.copyFile(scrfile, demofile); i+=1; }
	 */
    
	@Given("User should navigate to the website")
	public void user_should_navigate_to_the_website() {
		driver.get("https://www.amazon.in");
	}
	@Then("user is able to click on Sign on button")
	public void user_is_able_to_click_on_sign_on_button() {
	   amazon.signin().click();
	   driver.navigate().back();
	}
	
	@Given("user is on search results page")
	public void user_is_on_search_results_page() {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Headphones");
		driver.findElement(By.id("nav-search-submit-text")).click();
	}


	@Then("click on an item to view the item and add to cart")
	public void click_on_an_item_to_view_the_item_and_add_to_cart() throws IOException {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement addToCart = driver.findElement(By.xpath("//button[@id='a-autoid-3-annou']"));
		wait.until(ExpectedConditions.visibilityOf(addToCart));
	    addToCart.click();
	    driver.findElement(By.xpath("//span[@id='nav-cart-count']")).click();
	    //File srcfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    //File DestFile=new File("C:\\Users Folder\\workspace2\\CucumberProject\\scr.jpg");
	  //Copy file at destination
	    //FileUtils.copyFile(srcfile, DestFile);
	}
	
	@After
	public static void afterscenario() {
		System.out.println("This will run after the test scenario");
	}

	@AfterAll
	public static void teardown() {
		driver.quit();
		
		
		
	}




}
