package thirdjunepractice;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screeshot_element {
public static void main(String[] args) {
	LocalDateTime systemdate=LocalDateTime.now();
	String ScreenshotName=systemdate.toString().replaceAll(":", "-");
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.easemytrip.com/");
	WebElement pop=driver.findElement(By.xpath("//div[contains(text(),'Hey! Got')]"));
	if(pop.isDisplayed()){
		File temp=pop.getScreenshotAs(OutputType.FILE);
		File d=new File("./Screenshots/"+ScreenshotName+".png");
		try {
			FileHandler.copy(temp, d);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
} 
}
