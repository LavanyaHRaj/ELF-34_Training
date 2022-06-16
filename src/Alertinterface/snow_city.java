package Alertinterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class snow_city {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://snowcityblr.com/contact-us/");
	driver.switchTo().frame(0);
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[contains(text(),'Directions')]")).click();
	
}
}
