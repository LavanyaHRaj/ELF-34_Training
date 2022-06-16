package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkartlogin {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(2000);
	String email="hlavanya.ha@gmail.com";
	String password="lavanya@h";
	String mob="9741515849";
	String newpass="lavanya@h11";
	driver.findElement(By.xpath("(//input[@autocomplete='off'])[2]")).sendKeys(email);
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
	driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//input[@autocomplete='off'])[2]")).sendKeys(mob);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='CONTINUE']")).click();
	driver.findElement(By.xpath("//input[@autocomplete='on']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@autocomplete='off'])[2]")).sendKeys(newpass);
	driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
}
}
