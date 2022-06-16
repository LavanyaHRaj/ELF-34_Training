package Test_Scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import Advanced_selenium.BaseTest;
import Advanced_selenium.Working_With_propertiesfile;
import POm_repository.RegisterPage;
import POm_repository.WelcomePage;

public class RegisterTC extends BaseTest{
@Test
public void TC_02() throws IOException{
	driver.get(Working_With_propertiesfile.demo("URL"));
	WelcomePage welcome=new WelcomePage(driver);
	welcome.registerClick();
	
	RegisterPage register=new RegisterPage();
	register.getFemaleGender();
	register.firstNameSendKeys(Working_With_propertiesfile.demo("firstname"));
	register.lastNameSendKeys(Working_With_propertiesfile.demo("lastname"));
	register.emailSendKeys(Working_With_propertiesfile.demo("email"));
	register.passwordSendKeys(Working_With_propertiesfile.demo("password"));
	register.confirmPasswordSendKeys(Working_With_propertiesfile.demo("confirmpwd"));
	register.registerButtonClick();
	
}
}
