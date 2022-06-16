package Intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class workingwithcssselectoe {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/Nalaa/Downloads/LocatorsPractice%20(1).html");
	String username="kavya";
	String password="kavya123";
	driver.findElement(By.cssSelector("input[class='username']")).sendKeys(username);
	driver.findElement(By.cssSelector("input[class='password']")).sendKeys(password);
	driver.findElement(By.cssSelector("input[class='checkbox']")).click();
	driver.findElement(By.cssSelector("input[name='b']")).click();
	driver.findElement(By.cssSelector("input[value='cancel']")).click();
	Thread.sleep(2000);
	driver.close();
}
}
