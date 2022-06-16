package Alertinterface;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerthandle {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.guru99.com/test/delete_customer.php");
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("435356");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	Alert alert=driver.switchTo().alert();
/*	alert.accept();
	Thread.sleep(1000);
	alert.accept();*/
	alert.dismiss();
	driver.close();
} 
}
