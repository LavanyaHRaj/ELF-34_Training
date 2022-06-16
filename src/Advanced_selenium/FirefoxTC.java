package Advanced_selenium;

import org.testng.annotations.Test;

public class FirefoxTC extends BaseTest {
	@Test
	public void TC(){
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
	}
}
