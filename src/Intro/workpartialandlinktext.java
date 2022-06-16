package Intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class workpartialandlinktext {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demowebshop.tricentis.com/");
	/*driver.findElement(By.linkText("Register")).click();*/
	driver.findElement(By.linkText("Log in")).click();
	/*driver.findElement(By.partialLinkText("Books")).click();*/
	/*driver.findElement(By.partialLinkText("BOOKS")).click();*/
}
}
