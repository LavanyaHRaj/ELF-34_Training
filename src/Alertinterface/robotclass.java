package Alertinterface;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class robotclass {
public static void main(String[] args) throws AWTException {
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("http://demowebshop.tricentis.com/");
	Robot rob =new Robot();
	rob.keyPress(KeyEvent.VK_TAB);
	rob.keyPress(KeyEvent.VK_TAB);
	rob.keyPress(KeyEvent.VK_TAB);
	rob.keyPress(KeyEvent.VK_SHIFT);
	rob.keyPress(KeyEvent.VK_ENTER);
	rob.keyRelease(KeyEvent.VK_TAB);
	rob.keyPress(KeyEvent.VK_SHIFT);
	rob.keyRelease(KeyEvent.VK_ENTER);
}
}
