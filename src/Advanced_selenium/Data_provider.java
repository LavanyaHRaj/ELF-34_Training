package Advanced_selenium;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_provider {

	@Test(dataProvider="Test Data")
	public void Logintestcase(String FN, String LN, String Email,String password){
		System.out.println(FN);
		System.out.println(LN);  
	}
	
	@DataProvider(name ="Test Data")
	public Object[][] dataProvider(){
		Object[][] data=new Object[3][4]; 
		data[1][1]="Lavanya";
		
		return data;
	}
}
