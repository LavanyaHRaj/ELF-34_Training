package Test_Scripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Advanced_selenium.BaseTest;
import Advanced_selenium.Working_With_propertiesfile;
import Advanced_selenium.multipleread;
import POm_repository.HomePage;
import POm_repository.LoginPage;
import POm_repository.WelcomePage;

public class LoginTC extends BaseTest{
 @Test(dataProvider="testdata")
 public void TC_01(String email, String password) throws IOException{
	 driver.get(Working_With_propertiesfile.demo("URL") );
	 WelcomePage welcome=new WelcomePage(driver); 
	 welcome.clickLogin();
	 LoginPage login=new LoginPage(driver) ;
	 login.email_value(email);
	 login.Password_value(password);
	 login.loginClick();
	 
	HomePage home=new HomePage(driver);
	if (home.getLogout().isDisplayed()){
		Reporter.log("PASS: User is logged in", true); 
	}
 }
	@DataProvider(name="testdata", parallel=true) 
	public Object[][] data() throws EncryptedDocumentException, IOException{
		 return multipleread.readAllValues("Login_Details");
	}
	
 }

