package xpathwebelement;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practicepage {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
	driver.findElement(By.xpath("//button[@id='openwindow']")).click();
	Thread.sleep(2000);
	String prac=driver.getWindowHandle();
	Set<String> aca=driver.getWindowHandles();
	for(String s:aca){
		if(!s.equals(prac))
			driver.switchTo().window(s);
			//driver.close();
		}
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[contains(@style,'position: absolute; inset: 0px; box-shadow: rgba(0, 0, 0, 0) 0px 0px 0px inset;')]")).click();
	driver.findElement(By.xpath("//span[contains(text(),'Register')]")).click();
	String username="lavanya";
	String email="hlavanya.ha@gmail.com";
	String pass="lavanya@h";
	driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys(username);
	driver.findElement(By.xpath("//input[@id='user_email']")).sendKeys(email);
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pass);
	driver.findElement(By.xpath("//input[@value='Sign up']")).click();
	for(String s:aca){
		if(!s.equals(prac)){
			driver.switchTo().window(s);
			driver.close();
		}
	}
	/*Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@id='opentab']")).click();*/
}
}


