package Advanced_selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Working_With_propertiesfile {
public static  String demo(String value) throws IOException{
	FileInputStream fis=new FileInputStream("./Testdata/config.properties");
	Properties property=new Properties();
	property.load(fis);
	//System.out.println(property.getProperty(value));
	return property.getProperty(value);
}

}
