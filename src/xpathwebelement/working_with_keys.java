package xpathwebelement;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class working_with_keys {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		
		Actions act=new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).build().perform();;
		Thread.sleep(2000);
		act.sendKeys(Keys.PAGE_UP).build().perform();
		
		driver.close();
	}

}
