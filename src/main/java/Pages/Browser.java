package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

	private static WebDriver driver;
	
	private Browser() {
		
	}
	
	public static synchronized WebDriver getdriver() {
		
		if(driver==null) {
			synchronized (Browser.class) {
                if (driver == null) {
                    // Set the WebDriver path if necessary
                	System.setProperty("webdriver.chrome.driver", "F:\\Testathon\\driver\\chromedriver-win64\\chromedriver.exe");
                    driver = new ChromeDriver();
                    driver.manage().window().maximize();
                }
            }
		}
		return driver;
		
	}

	public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
