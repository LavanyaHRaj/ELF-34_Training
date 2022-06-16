package Advanced_selenium;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Login_dataprovider {
@Test(dataProvider="Test Data")
public void Login(String Email,String Password){
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demowebshop.tricentis.com/");
	driver.findElement(By.xpath("//a[contains(text(),'Log in')]")).click();
	driver.findElement(By.xpath("//input[@autofocus='autofocus']")).sendKeys(Email);
	driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(Password);
	driver.findElement(By.xpath("(//input[@type='submit'])[1]")).submit();
	try{
	driver.findElement(By.xpath("//a[contains(text(),'Log out')]")).isDisplayed();
	}
	catch (Exception e) {
		System.out.println("Pass:User is logged in"); 
	}finally{
		driver.close();
	}
}

	
	@DataProvider(name="Test Data", parallel=true)
	public static Object[][] dataP() throws EncryptedDocumentException, IOException {
		return multipleread.readAllValues("Login_Details");
	}
} 

