package Intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class backtraversing {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
	    driver.findElement(By.xpath("//a[text()='Simple Computer']/../..//input[@value='Add to cart']")).click();
	    driver.findElement(By.xpath("//ul[@class='option-list']")).click();
	    driver.findElement(By.xpath("//a[text()='Computing and Internet']/../..//input[@value='Add to cart']")).click();
	    driver.findElement(By.xpath("//ul[@class='option-list']")).click();
}
}