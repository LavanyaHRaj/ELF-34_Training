package xpathwebelement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class sortbyforloop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("(//a[contains(text(),'Books')])")).click();
		Thread.sleep(2000);
		Select sortby=new Select(driver.findElement(By.id("products-orderby")));
		List<WebElement> optlist=sortby.getOptions();
		for(int i=0;i<optlist.size();i++){
        Select sortby1=new Select(driver.findElement(By.id("products-orderby")));
		sortby1.selectByIndex(i);
		
		}
		driver.close();
	}

		
		
		
		
}
