package Intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathwithtext {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demowebshop.tricentis.com/");
	driver.findElement(By.xpath("//a[text()='Register']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[text()='Log in']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[text()='Shopping cart']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//span[text()='Wishlist']")).click();
	driver.close();
}
}
