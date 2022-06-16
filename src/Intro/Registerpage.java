package Intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registerpage {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demowebshop.tricentis.com/");
	driver.findElement(By.className("ico-register")).click();;
	driver.findElement(By.id("gender-female")).click();
	driver.findElement(By.id("FirstName")).sendKeys("Lavanya");
	driver.findElement(By.id("LastName")).sendKeys("Raj");
	driver.findElement(By.id("Email")).sendKeys("lavanyaa.h@gmail.com");
	driver.findElement(By.id("Password")).sendKeys("lavanya");
	driver.findElement(By.id("ConfirmPassword")).sendKeys("lavanya");
	driver.findElement(By.id("register-button")).click();
	Thread.sleep(2000);;
	driver.close();
}
}
