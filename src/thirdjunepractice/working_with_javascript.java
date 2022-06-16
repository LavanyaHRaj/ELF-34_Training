package thirdjunepractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class working_with_javascript {
public static void main(String[] args) throws InterruptedException {
   System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
   WebDriver driver=new ChromeDriver();
   driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
   /*driver.get("http://demowebshop.tricentis.com/");
   
   JavascriptExecutor js=(JavascriptExecutor) driver;
   js.executeScript("window.scrollBy(0,1000);");
   Thread.sleep(2000);
   js.executeScript("window.scrollBy(0,-1000);");
   Thread.sleep(2000);
   js.executeScript("window.scrollTo(670,959);");*/
   
 /*  driver.get("https://www.zomato.com/");
   WebElement scrollele=driver.findElement(By.xpath("//h5[contains(text(),'Marathahalli')]"));
   JavascriptExecutor js=(JavascriptExecutor)driver;
   js.executeScript("arguments[0].scrollIntoView(true);",scrollele);*/
   
  /* driver.get("https://www.oracle.com/java/technologies/downloads/");
   driver.findElement(By.xpath("//a[@data-lbl='lightbox-open-jdk-8u333-linux-x64.tar.gz']")).click();
   Thread.sleep(2000);
   WebElement clickele=driver.findElement(By.xpath("//a[contains(text(),'Download jdk-8u333-linux-x64.tar.gz')]"));
   JavascriptExecutor js=(JavascriptExecutor)driver;
   js.executeScript("arguments[0].click();", clickele);*/
   
   driver.get("https://demoapp.skillrary.com/");
   WebElement TF=driver.findElement(By.xpath("//input[@class='form-control']"));
   JavascriptExecutor js=(JavascriptExecutor)driver;
   js.executeScript("arguments[0].value='textfield is disabled';", TF);
   
   driver.close();
   
   
   
}
}
