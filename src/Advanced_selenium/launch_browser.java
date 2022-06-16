package Advanced_selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launch_browser {
		public static void main(String[]args){
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.amazon.com");
		String amazon=driver.getWindowHandle();
		String  search ="Redmi Phones";
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(search);
        driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).submit();
        Set<String> redmi=driver.getWindowHandles();
        for(String s:redmi){
        	if(!s.equals(amazon)){
        		driver.switchTo().window(s);
        	}
        }
        driver.findElement(By.xpath("(//span[contains(text(),'Xiaomi Redmi')]) [1]")).click();
        
		}
		}

