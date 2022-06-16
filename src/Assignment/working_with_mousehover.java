package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class working_with_mousehover {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demowebshop.tricentis.com/");
	Actions act=new Actions(driver);
	act.moveToElement(driver.findElement(By.xpath("(//a[contains(text(),'Computers')])[1]"))).click().build().perform();
	Thread.sleep(2000);
	act.click(driver.findElement(By.xpath("(//a[@href='/desktops'])[4]"))).build().perform();
	Thread.sleep(2000);
	act.moveToElement(driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]"))).click().build().perform();
	Thread.sleep(2000);
	act.click(driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]"))).build().perform();
	
}
}
