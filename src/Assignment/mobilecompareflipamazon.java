package Assignment;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class mobilecompareflipamazon {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		String flip=driver.getWindowHandle();
		driver.findElement(By.xpath("//button[contains(text(),'✕')]")).click();
		driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("REDMI Note 10 Pro(Dark Night,128GB)(6 GB RAM)");
		driver.findElement(By.xpath("//input[@title='Search for products, brands and more']/../..//button[@type='submit']")).submit();
		Set<String> am=driver.getWindowHandles();
		for(String s:am){
			if(!s.equals(flip)){
				driver.switchTo().window(s);
			}
		}
		String price=driver.findElement(By.xpath("(//div[contains(text(),'₹15,999')])[1]")).getText();{
			System.out.println(price);
		}
		Set<String> amazon1=driver.getWindowHandles();
		for(String s:amazon1){
			if(!s.equals(flip)){
				driver.switchTo().window(s);
			}
		}
		driver.close();
		
     	
		WebDriver driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
     	driver1.get("https://www.amazon.in/");
		driver1.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("REDMI Note 10 Pro(Dark Night,128GB)(6 GB RAM)");
		driver1.findElement(By.xpath("//input[@id='nav-search-submit-button']")).submit();
		String price1=driver1.findElement(By.xpath("(//span[contains(text(),'15,999')])[1]")).getText();{
			System.out.println(price1);
		}
		driver1.quit();
		if(price.equals(price1)){
			System.out.println("Both prices are same");
		}else{
			System.out.println("Both prices are different");
		}
			
		
		
}
}