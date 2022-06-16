package Alertinterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class file_upload {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://smallpdf.com/pdf-to-word");
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//div[contains(@aria-hidden,'false')])[2]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:/Users/Nalaa/Downloads/Lavanya H.resume.pdf");
	
	driver.close();
}
}
