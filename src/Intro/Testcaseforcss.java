package Intro;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Testcaseforcss {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	WebDriverWait wait=new WebDriverWait(driver, 30);
	
	driver.get("http://demowebshop.tricentis.com/");
	
	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("input[value='Search store']"))));
	String com="Books";
	driver.findElement(By.cssSelector("input[value='Search store']")).sendKeys(com);
	driver.findElement(By.cssSelector("input[value='Search']")).click();
	try{
	if(driver.findElement(By.cssSelector("a[title='Show details for Build your own expensive computer']")).isDisplayed()){
		System.out.println("Pass:computer is displayed");
	}
	}
	catch(NoSuchElementException e){
		System.out.println("Fail:computer is not displayed ");
	}
	
	/*else{
		System.out.println("Fail");
	}*/
	driver.close();
}
}
