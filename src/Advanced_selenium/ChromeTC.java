package Advanced_selenium;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ChromeTC extends BaseTest  {
   
	@Test
	public void TC(){
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
	}
	
}
