package xpathwebelement;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandles {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoqa.com/browser-windows");
	String windowhandle=driver.getWindowHandle();
	driver.findElement(By.xpath("//button[@id='windowButton']")).click();
	Set<String> windowhandles=driver.getWindowHandles();
	
	for(String s:windowhandles){
		if(s.equals(windowhandle)){
			driver.switchTo().window(s);
			//driver.close();
			
		}
		else{
			driver.switchTo().window(s);
			driver.close();
		}
	}
} 
}
