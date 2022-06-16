package Alertinterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class parent_frame {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	WebDriver  driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/Nalaa/Downloads/iframe%20(1).html");
	driver.switchTo().frame(0);
	driver.findElement(By.xpath("//a[contains(text(),'COVID')]")).click();
	driver.switchTo().parentFrame();
	driver.findElement(By.xpath("//a[@href='http://google.com']")).click();
	
} 
}
