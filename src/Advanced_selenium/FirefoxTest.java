package Advanced_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class FirefoxTest {

	WebDriver driver;	
	@BeforeClass
	public void openFirefox(){
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("http://demowebshop.tricentis.com/");
	}
	
	
	@AfterClass
	public void closeFirefox(){
		driver.close();
	}
} 

