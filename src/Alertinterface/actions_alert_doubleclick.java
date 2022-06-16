package Alertinterface;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actions_alert_doubleclick {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	Actions act =new Actions(driver);
	act.doubleClick(driver.findElement(By.xpath("//button[contains(text(),'Double-Click Me To See Alert')]"))).build().perform();
    Thread.sleep(2000);
	Alert alert=driver.switchTo().alert();
	alert.accept();
	
	driver.close();
} 
}
