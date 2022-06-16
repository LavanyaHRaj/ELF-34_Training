package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class shoppingcarttable2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("(//a[@href='/books'])[1]")).click();
		driver.findElement(By.xpath("//a[text()='Computing and Internet']/../..//input[@value='Add to cart']")).click();
		driver.findElement(By.xpath("//span[@class='close']")).click();
		driver.findElement(By.xpath("(//span[@class='cart-label'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Fiction']/../..//input[@value='Add to cart']")).click();
		driver.findElement(By.xpath("//span[@class='close']")).click();
		driver.findElement(By.xpath("(//span[@class='cart-label'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Health Book']/../..//input[@value='Add to cart']")).click();
		driver.findElement(By.xpath("//span[@class='close']")).click();
		driver.findElement(By.xpath("(//span[@class='cart-label'])[1]")).click();
		Thread.sleep(2000);
		
}
}