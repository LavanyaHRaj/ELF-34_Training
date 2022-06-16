package thirdjunepractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class firefoxbrowser {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
	FirefoxOptions option=new FirefoxOptions();
	option.addArguments("--disable-notifications");
	WebDriver driver=new FirefoxDriver(option);
	
	driver.get("https://www.easemytrip.com/");
	//System.out.println("Browser-open"); 
} 
}
