package Alertinterface;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class clickonmovies_web {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/Nalaa/Downloads/iframe.html");
	//driver.switchTo().frame(0);
	//driver.switchTo().frame("frame1");
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='FR1']")));
	
	driver.findElement(By.xpath("//a[contains(text(),'MOVIES')]")).click();
	
	driver.close();
} 
}
