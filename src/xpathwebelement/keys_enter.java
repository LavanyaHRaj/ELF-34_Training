package xpathwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keys_enter {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demowebshop.tricentis.com/");
	WebElement searchtf=driver.findElement(By.xpath("//input[contains(@value,'Search store')]"));
	searchtf.sendKeys("Computers");
	Actions act=new Actions(driver);
	act.sendKeys(Keys.ENTER).build().perform();
	
	
	
}
}
