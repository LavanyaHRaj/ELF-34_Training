package Intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class validateregister {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demowebshop.tricentis.com/");
	String Title=driver.getTitle();
	if(Title.contains("Demo")){
		System.out.println("Pass:DemoWebshop is displayed");
	}
	driver.findElement(By.className("ico-register")).click();
	String regTitle=driver.getTitle();
	if(regTitle.contains("Register")){
		System.out.println("Pass:Home page is displayed");
	}
	String firstname="lavanya";
	String lastname="raj";
	String email="lavraj13@gmail.com";
	String password="raj@123";
	String confirm_password="raj@123";
	driver.findElement(By.id("gender-female")).click();
	driver.findElement(By.id("FirstName")).sendKeys(firstname);
	driver.findElement(By.id("LastName")).sendKeys(lastname);
	driver.findElement(By.id("Email")).sendKeys(email);
	driver.findElement(By.id("Password")).sendKeys(password);
	driver.findElement(By.id("ConfirmPassword")).sendKeys(confirm_password);
	driver.findElement(By.id("register-button")).click();
	if(driver.findElement(By.className("ico-logout")).isDisplayed()){
		System.out.println("Pass:User is registered successfully");
	}
	Thread.sleep(2000);
	driver.close();
	
}
}
