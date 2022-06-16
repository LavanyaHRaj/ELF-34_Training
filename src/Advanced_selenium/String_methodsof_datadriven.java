package Advanced_selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class String_methodsof_datadriven {
	public static String readString(String sheet,int r,int c) throws EncryptedDocumentException, IOException{
		File file=new File("./Testdata/TestCase.xlsx");
		FileInputStream fis=new FileInputStream(file);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sheet1=wb.getSheet(sheet);
		return sheet1.getRow(r).getCell(c).toString();
	}
	public static String readnumericvalue(int r,String sheet,int c) throws EncryptedDocumentException, IOException{
		File file=new File("./Testdata/TestCase.xlsx");
		FileInputStream fis=new FileInputStream(file);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sheet1=wb.getSheet("Sheet1");
		return sheet1.getRow(r).getCell(c).toString();
	}
	
	public static String readDate(int r,int c,String sheet) throws EncryptedDocumentException, IOException{
		File file=new File("./Testdata/TestCase.xlsx");
		FileInputStream fis=new FileInputStream(file);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sheet1=wb.getSheet("Sheet1");
		return sheet1.getRow(r).getCell(c).toString();
	}
	
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	System.out.println(String_methodsof_datadriven.readString("Sheet1", 1, 0));
	String_methodsof_datadriven.readnumericvalue(3, "Sheet1", 2);
	String_methodsof_datadriven.readDate(2, 3, "Sheet1");
	
}  
}
