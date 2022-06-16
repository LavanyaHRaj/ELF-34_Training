package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectdroponebyone {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/Nalaa/Downloads/demo.html.");
	driver.findElement(By.xpath("//th[contains(text(),'Standard')]"));
	Thread.sleep(2000);
	WebElement drop=driver.findElement(By.id("standard_cars"));
	Select sortby=new Select(drop);
	List<WebElement>options=sortby.getOptions();
	for(int i=0;i<options.size();i++){
		Select sortby1=new Select(driver.findElement(By.id("standard_cars")));
		sortby1.selectByIndex(i);
	}
	
} 
}
