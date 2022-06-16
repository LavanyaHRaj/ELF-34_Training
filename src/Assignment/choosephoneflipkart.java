package Assignment;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class choosephoneflipkart {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	
	driver.get("https://www.flipkart.com/");
	String flip=driver.getWindowHandle();
	
	driver.findElement(By.xpath("//button[contains(text(),'✕')]")).click();
	driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("vivo phone");
	driver.findElement(By.xpath("//input[@title='Search for products, brands and more']/../..//button[@type='submit']")).submit();
	driver.findElement(By.xpath("(//div[contains(text(),'vivo T1 5G (Starlight Black, 128 GB)')])[1]")).click();
	Set<String> vivo=driver.getWindowHandles();
	for(String s:vivo){
		if(!s.equals(flip)){
			driver.switchTo().window(s);
		}
	}
	String price=driver.findElement(By.xpath("(//div[contains(text(),'₹16,990')])[1]")).getText();{
		System.out.println(price);
	}
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
	Thread.sleep(2000);
	Actions act=new Actions(driver);
	act.sendKeys(Keys.PAGE_DOWN).build().perform();
	driver.findElement(By.xpath("//div[text()='Save for later']/../..//button[2]")).click();
	Thread.sleep(2000);
	act.sendKeys(Keys.PAGE_UP).build().perform();
	String price1=driver.findElement(By.xpath("//span[@class='_2-ut7f _1WpvJ7']")).getText();{
		System.out.println(price1);
	}
	
	driver.quit();
}
}
