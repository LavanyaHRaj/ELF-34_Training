package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class clickandhold_release {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	WebElement l=driver.findElement(By.xpath("(//div[contains(text(),'Oslo')])[2]"));
	WebElement target=driver.findElement(By.xpath("//div[contains(text(),'Norway')]"));
	Actions act=new Actions(driver);
	act.clickAndHold(l).perform();
	act.release(target).perform();
	WebElement l1=driver.findElement(By.xpath("(//div[contains(text(),'Rome')])[2]"));
	WebElement target1=driver.findElement(By.xpath("//div[contains(text(),'Italy')]"));
	//Actions act=new Actions(driver);
	act.clickAndHold(l1).perform();
	act.release(target1).perform();
} 
}
