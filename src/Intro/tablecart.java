package Intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tablecart {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("(//input[@value='Add to cart'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='close']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='cart-label'])[1]")).click();
		String rev=(driver.findElement(By.xpath("//table[1]/tbody/tr/td[3]/a")).getText());
		if(rev.contains("14.1-inch Laptop")){
			System.out.println("pass");
		}
		driver.close();
}
}