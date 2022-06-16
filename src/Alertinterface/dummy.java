package Alertinterface;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dummy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		String flip=driver.getWindowHandle();
		driver.findElement(By.xpath("//button[contains(text(),'✕')]")).click();
		driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("Sumsung");
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
	}

}
