package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class methodsofwebelelment {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		/*WebElement l=driver.findElement(By.xpath("//input[@value='Search store']"));
		l.sendKeys("Computers");
		l.clear();*/
		
		/*WebElement l=driver.findElement(By.xpath("//input[@value='Search store']"));
		l.click();*/
		
		/*WebElement l=driver.findElement(By.xpath("//input[@value='Search store']"));
		System.out.println(l.getAttribute("class"));*/
		
	/*	WebElement l=driver.findElement(By.xpath("//input[@value='Search store']"));
		System.out.println(l.getCssValue("font-size"));*/
		
		/*WebElement l=driver.findElement(By.xpath("//input[@value='Search store']"));
		System.out.println(l.getLocation());*/
		
		/*WebElement l=driver.findElement(By.xpath("//input[@value='Search store']"));
		System.out.println(l.getTagName());*/
		
		//WebElement l=driver.findElement(By.xpath("(//a[contains(text(),'Books')])[1]"));
		//System.out.println(l.getText());
		
		//System.out.println(l.isDisplayed());
		
		//System.out.println(l.isEnabled());
		
		/*WebElement l1=driver.findElement(By.xpath("(//input[contains(@type,'radio')])[1]"));
		System.out.println(l1.isSelected());*/
		
		/*WebElement l=driver.findElement(By.xpath("(//a[contains(text(),'Books')])[1]"));
		System.out.println(l.getRect());*/
		
		/*WebElement l=driver.findElement(By.xpath("(//a[contains(text(),'Books')])[1]"));
		System.out.println(l.getSize());*/
		
		WebElement l=driver.findElement(By.xpath("//input[@value='Search store']"));
		l.sendKeys("Computers");
		l.submit();
		
		
		driver.close();
}
}