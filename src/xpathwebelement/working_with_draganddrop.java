package xpathwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class working_with_draganddrop {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	WebElement source=driver.findElement(By.xpath("(//div[contains(text(),'Oslo')])[2]"));
	WebElement target=driver.findElement(By.xpath("//div[contains(text(),'Norway')]"));
	Actions act=new Actions(driver);
	act.dragAndDrop(source, target).perform();
	
	WebElement source1=driver.findElement(By.xpath("(//div[contains(text(),'Rome')])[2]"));
	WebElement target1=driver.findElement(By.xpath("//div[contains(text(),'Italy')]"));
	act.dragAndDrop(source1, target1).perform();
	
	WebElement source2=driver.findElement(By.xpath("(//div[contains(text(),'Washington')])[2]"));
	WebElement target2=driver.findElement(By.xpath("//div[contains(text(),'United States')]"));
	act.dragAndDrop(source2, target2).perform();
	
	WebElement source3=driver.findElement(By.xpath("(//div[contains(text(),'Copenhagen')])[2]"));
	WebElement target3=driver.findElement(By.xpath("//div[contains(text(),'Denmark')]"));
	act.dragAndDrop(source3, target3).perform();
	
	WebElement source4=driver.findElement(By.xpath("(//div[contains(text(),'Stockholm')])[2]"));
	WebElement target4=driver.findElement(By.xpath("//div[contains(text(),'Sweden')]"));
	act.dragAndDrop(source4, target4).perform();
	
	WebElement source5=driver.findElement(By.xpath("(//div[contains(text(),'Seoul')])[2]"));
	WebElement target5=driver.findElement(By.xpath("//div[contains(text(),'South Korea')]"));
	act.dragAndDrop(source5, target5).perform();
	
	WebElement source6=driver.findElement(By.xpath("(//div[contains(text(),'Madrid')])[2]"));
	WebElement target6=driver.findElement(By.xpath("//div[contains(text(),'Spain')]"));
	act.dragAndDrop(source6, target6).perform();


} 
}
