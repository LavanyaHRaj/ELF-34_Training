package Intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathamazon {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demowebshop.tricentis.com/");
	String email="srinivas2001bablu@gmail.com";
	String pass="Bablu@9690";
	driver.findElement(By.xpath("//a[@class='ico-login']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@class='email']")).sendKeys(email);
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pass);
	driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	try{
		if(driver.findElement(By.xpath("//a[@class='ico-logout']")).isDisplayed()){
	
		System.out.println("Pass:user is successfully loggedin");
	}  
    }
	catch(Exception e){
		System.out.println("Fail");
	}

}
}
