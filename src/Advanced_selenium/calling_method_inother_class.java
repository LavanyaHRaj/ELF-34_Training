package Advanced_selenium;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class calling_method_inother_class {
@Test(dataProvider="Test data")
public void demo(String Name,String MobileNo,String EmailID,String Date,String Execution){
	System.out.println(Name); 
	System.out.println(MobileNo); 
	System.out.println(EmailID); 
	System.out.println(Date); 
}

	@DataProvider(name="Test data")
public static Object[][] data_provider() throws EncryptedDocumentException, IOException{
	return multipleread.readAllValues("Sheet1");
}
}
