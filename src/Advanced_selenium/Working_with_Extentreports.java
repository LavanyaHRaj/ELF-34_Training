package Advanced_selenium;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Working_with_Extentreports {
	static WebDriver driver;
public static void main(String[] args) {
	LocalDateTime systemdate=LocalDateTime.now();
	String ReportName=systemdate.toString().replaceAll(":", "-");
	ExtentReports reports=new ExtentReports("./Reports/"+ReportName+"Reports.html", false);
	ExtentTest test=reports.startTest("ExtentDemo");
	
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
    driver=new ChromeDriver();
	test.log(LogStatus.INFO, "Browser is opened");
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 
	driver.get("https://www.zomato.com/");
	test.log(LogStatus.INFO, "page is loaded");
	WebElement scrollele=driver.findElement(By.xpath("//h5[text()='Marathahalli']"));
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView(true);",scrollele);
	
	test.log(LogStatus.PASS, "Page is scrolled");
	test.log(LogStatus.INFO, test.addScreenCapture(screenCapture()));
	test.log(LogStatus.FATAL, "Header is not displayed");

	reports.endTest(test);
	reports.flush();	
}
public static String screenCapture(){
	
	LocalDateTime sysdate=LocalDateTime.now();
	String ScreenshotName=sysdate.toString().replaceAll(":", "-");
	String imPath="./Screenshots/"+ScreenshotName+".png";
	 TakesScreenshot ts=(TakesScreenshot)driver;
	 File temp=ts.getScreenshotAs(OutputType.FILE);
	 File dest=new File(imPath);
	 try {
		FileHandler.copy(temp, dest);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		System.out.println("Expection is Handled");
	}
	
	 return "."+imPath;//if you don't insert "." ,it will attach screenshot to wrong destination.
}
}
