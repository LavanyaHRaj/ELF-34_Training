package Advanced_selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Read_Excel {

   static File file= new File("./Testdata/TestCase.xlsx");
   static FileInputStream fis;
   static Workbook workbook;
   static Sheet sheet;
   
   public static String readStringValue(String Sheetname, int RowNum,int ColNum) throws EncryptedDocumentException, IOException{
	   fis=new FileInputStream(file);
	   workbook=WorkbookFactory.create(fis) ;
	   sheet=workbook.getSheet(Sheetname);
	   return sheet.getRow(RowNum).getCell(ColNum).getStringCellValue();
   }
   public static double readNumericValue(String Sheetname, int RowNum,int ColNum) throws EncryptedDocumentException, IOException{
	   fis=new FileInputStream(file);
	   workbook=WorkbookFactory.create(fis) ;
	   sheet=workbook.getSheet(Sheetname);
	   return sheet.getRow(RowNum).getCell(ColNum).getNumericCellValue();   
	   
   }
   public static Date readDateValue(String Sheetname, int RowNum,int ColNum) throws EncryptedDocumentException, IOException{
	   fis=new FileInputStream(file);
	   workbook=WorkbookFactory.create(fis) ;
	   sheet=workbook.getSheet(Sheetname);
	   return sheet.getRow(RowNum).getCell(ColNum).getDateCellValue();
}
   public static boolean readBooleanValue(String Sheetname, int RowNum,int ColNum) throws EncryptedDocumentException, IOException{
	   fis=new FileInputStream(file);
	   workbook=WorkbookFactory.create(fis) ;
	   sheet=workbook.getSheet(Sheetname);
	   return sheet.getRow(RowNum).getCell(ColNum).getBooleanCellValue();
}
}