package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cutpastefacebook {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement emailTF=driver.findElement(By.xpath("//input[@id='email']"));
		emailTF.sendKeys("Lavanya");
		emailTF.sendKeys(Keys.CONTROL+"a");
		emailTF.sendKeys(Keys.CONTROL+"x");
		WebElement pass =driver.findElement(By.xpath("//input[@id='pass']"));
		pass.sendKeys(Keys.CONTROL+"v");
}
}