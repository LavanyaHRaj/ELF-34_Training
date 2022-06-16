package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class printalloptions_incar {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/Nalaa/Downloads/demo.html");
	WebElement dr=driver.findElement(By.id("standard_cars"));
	Select dropdown=new Select(dr);
	List<WebElement>listele = dropdown.getOptions();
	for(WebElement wb:listele){
		System.out.println(wb.getText());
	}
	driver.close();
}
}
