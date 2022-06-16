package Advanced_selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseTest {
   
	public WebDriver driver;	
	@Parameters("browser")
	
	@BeforeClass(alwaysRun=true)
	public void openFirefox(@Optional("chrome") String browser){
		if(browser.equalsIgnoreCase("chrome")){
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//driver.get("http://demowebshop.tricentis.com/");
	}
		else if(browser.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
			driver=new ChromeDriver();
			//driver.get("http://demowebshop.tricentis.com/");
		}
	}
 	
	@AfterClass
	public void closeFirefox(){
		driver.close();
	}
}
