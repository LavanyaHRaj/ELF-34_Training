  package thirdjunepractice;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshot_page {
public static void main(String[] args) {
	LocalDateTime systemdate=LocalDateTime.now();
	String ScreenshotName=systemdate.toString().replaceAll(":", "-");
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://www.makemytrip.com/");
	//driver.findElement(By.xpath("//p[contains(text(),'Login now')]"));
	TakesScreenshot ts=(TakesScreenshot)driver;
	File temp=ts.getScreenshotAs(OutputType.FILE); 
	File dest=new File("./Screenshots/"+ScreenshotName+".png");
	try {
		FileHandler.copy(temp, dest);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	driver.close();
}
}
