package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectclassdropdown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Books')]")).click();
		Thread.sleep(2000);
		//WebElement dropdown=driver.findElement(By.id("products-orderby"));
		Select sortBydropDown=new Select(driver.findElement(By.id("products-orderby")));
		sortBydropDown.selectByVisibleText("Name: A to Z");
		Thread.sleep(2000);
		Select sortBydropDown1=new Select(driver.findElement(By.id("products-orderby")));
		sortBydropDown1.selectByVisibleText("Name: Z to A");
		Thread.sleep(2000);
		Select sortBydropDown2=new Select(driver.findElement(By.id("products-orderby")));
		sortBydropDown2.selectByVisibleText("Price: Low to High");
		Thread.sleep(2000);
		Select sortBydropDown3=new Select(driver.findElement(By.id("products-orderby")));
		sortBydropDown3.selectByVisibleText("Price: High to Low");
		Thread.sleep(2000);
		Select sortBydropDown4=new Select(driver.findElement(By.id("products-orderby")));
		sortBydropDown4.selectByVisibleText("Position");
		
		driver.close();
}
}