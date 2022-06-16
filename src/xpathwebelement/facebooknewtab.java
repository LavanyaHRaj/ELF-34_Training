package xpathwebelement;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebooknewtab {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demowebshop.tricentis.com/");
	String demowindow=driver.getWindowHandle();
	driver.findElement(By.xpath("//a[contains(text(),'Facebook')]")).click();
	Thread.sleep(4000);
	Set<String> facwindow=driver.getWindowHandles();
	for(String s:facwindow){
		if(!s.equals(demowindow)){
			driver.switchTo().window(s);
			driver.close();
		}	
}
}
}
