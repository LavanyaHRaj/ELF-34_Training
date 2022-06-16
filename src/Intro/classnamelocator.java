package Intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class classnamelocator {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/Nalaa/Downloads/LocatorsPractice.html");
	driver.findElement(By.className("username")).sendKeys("lavanya");
	driver.findElement(By.className("password")).sendKeys("lavanyaaa");
	driver.findElement(By.className("checkbox")).click();
	driver.findElement(By.name("b")).click();
	driver.findElement(By.className("button")).click();
}
}
