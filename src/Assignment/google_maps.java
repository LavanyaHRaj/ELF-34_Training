package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class google_maps {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://www.google.co.in/maps");
	driver.findElement(By.xpath("//img[@class='eYqqWd']")).click();
	WebElement l=driver.findElement(By.xpath("//input[@placeholder='Choose starting point, or click on the map...']"));
	l.sendKeys("Bengaluru,Karnataka");
	driver.findElement(By.xpath("//input[@aria-controls='sbsg51']/../../..//button[@jsaction='search;focus:pane.focusTooltip;blur:pane.blurTooltip']")).click();
	WebElement l1=driver.findElement(By.xpath("//input[@placeholder='Choose destination, or click on the map...']"));
	l1.sendKeys("Mangaluru,Karnataka");
	driver.findElement(By.xpath("//input[@aria-controls='sbsg52']/../../..//button[@data-tooltip='Search']")).click();
	
	driver.findElement(By.xpath("//body[@class='LoJzbe keynav-mode-off highres screen-mode']")).click();
	driver.findElement(By.xpath("//img[@aria-label='Driving']")).click();
	if(driver.findElement(By.xpath("(//h1[@class='VuCHmb fontHeadlineSmall'])[1]")).isDisplayed()){
		System.out.println("Pass:direction is displayed properly");
	}else{
		System.out.println("Fail");
	}
	Thread.sleep(7000);
	driver.close();
	
}
}
