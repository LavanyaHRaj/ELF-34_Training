package Advanced_selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class multipleread {
public static void main(String[] args) throws IOException {
	   multipleread.readAllValues("Register");
	 
	    
	 /* for(int i=0;i<5-1;i++){
			for(int j=0;j<5;j++){
				System.out.println(data[i][j]);
			}
		}*/
}
	public static Object[][] readAllValues(String SheetName) throws EncryptedDocumentException, IOException{
	File file=new File("./Testdata/Testcasedata.xlsx");
	FileInputStream fis=new FileInputStream(file);
    Workbook wb=WorkbookFactory.create(fis);
    Sheet sheet=wb.getSheet(SheetName);
     
    int rowcount=sheet.getPhysicalNumberOfRows();
    int colcount=sheet.getRow(1).getPhysicalNumberOfCells();
   
    Object [][]data=new Object[rowcount-1][colcount] ;
    for(int i=1;i<rowcount;i++){
    	for(int j=0;j<colcount;j++){
    		data[i-1][j]=sheet.getRow(i).getCell(j).toString();
    	}
    }
	for(int i=0;i<rowcount-1;i++){
		for(int j=0;j<colcount;j++){
			System.out.println(data[i][j]);
		}
	}
	return data;
}
}
