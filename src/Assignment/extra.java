package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class extra {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("(//a[@href='/books'])[1]")).click();
		driver.findElement(By.xpath("(//input[@class='button-2 product-box-add-to-cart-button'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@class='button-2 product-box-add-to-cart-button'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@class='button-2 product-box-add-to-cart-button'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Science']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@class='button-2 product-box-add-to-cart-button'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='close']")).click();
		driver.findElement(By.xpath("(//span[@class='cart-label'])[1]")).click();
		Thread.sleep(2000);
		for(int i=1; i<=3;i++){
		if(driver.findElement(By.xpath("//table[1]/tbody/tr["+i+"]/td[1]")).isDisplayed()){
			driver.findElement(By.xpath("//table[1]/tbody/tr["+i+"]/td[1]")).click();
		}
			driver.findElement(By.xpath("//input[@name='updatecart']")).click();
			
		}
		}
			

}