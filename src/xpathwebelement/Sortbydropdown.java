package xpathwebelement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sortbydropdown {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demowebshop.tricentis.com/");
	driver.findElement(By.xpath("//a[contains(text(),'Books')]")).click();
	Thread.sleep(2000);
	/*WebElement dropdown=driver.findElement(By.id("products-orderby"));
	Select sortbydrop =new Select(dropdown);
	List<WebElement> options=sortbydrop.getOptions();
	for(WebElement wb:options){
		System.out.println(wb.getText());
	}
	*/
	WebElement drop=driver.findElement(By.id("products-viewmode"));
	Select view=new Select(drop);
	List<WebElement> opt=view.getOptions();
	for(WebElement w:opt){
		System.out.println(w.getText()); 
	}
	
	
	driver.close();
} 
}
