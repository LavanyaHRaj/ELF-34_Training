package Test_Scripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Advanced_selenium.BaseTest;
import Advanced_selenium.Working_With_propertiesfile;
import Advanced_selenium.multipleread;
import POm_repository.RegisterPage;
import POm_repository.WelcomePage;

public class Register1TC extends BaseTest{
@Test(dataProvider="testdata")
public void TC03(String firstname, String lastname, String email, String password, String confirmpwd) throws IOException{
		driver.get(Working_With_propertiesfile.demo("URL"));
		WelcomePage welcome=new WelcomePage(driver);
		welcome.registerClick();
		
		RegisterPage register=new RegisterPage();
		register.femaleGenderButton();
		register.firstNameSendKeys(firstname);
		register.lastNameSendKeys(lastname);
		register.emailSendKeys(email);
		register.passwordSendKeys(password);
		register.confirmPasswordSendKeys(confirmpwd);
		register.registerButtonClick();

}
	@DataProvider(name="testdata")
	public Object[][] data() throws EncryptedDocumentException, IOException{
		return multipleread.readAllValues("Register");
	}
}
