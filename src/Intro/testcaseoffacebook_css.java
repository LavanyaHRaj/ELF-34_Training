package Intro;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcaseoffacebook_css {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://www.facebook.com/");
	String Firstname="Amulyaaa";
	String Surname="SRR";
    String mobile="9844021427";
    String password="SRraj@11";
	driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']")).click();
	//Thread.sleep(5000);
	driver.findElement(By.cssSelector("input[placeholder='First name']")).sendKeys(Firstname);
	driver.findElement(By.cssSelector("input[aria-label='Surname']")).sendKeys(Surname);
	driver.findElement(By.cssSelector("input[aria-label='Mobile number or email address']")).sendKeys(mobile);
	driver.findElement(By.cssSelector("input[aria-label='New password']")).sendKeys(password);
	driver.findElement(By.cssSelector("button[name='websubmit']")).click();

}
}
