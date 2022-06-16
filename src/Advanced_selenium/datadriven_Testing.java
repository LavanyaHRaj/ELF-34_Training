package Advanced_selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class datadriven_Testing {
public static void main(String[] args) throws IOException {
	
	File file=new File("./Testdata/Test_data.xlsx");
	FileInputStream fis=new FileInputStream(file);
	Workbook wb=WorkbookFactory.create(fis);
	Sheet sheet=wb.getSheet("Sheet1");
	System.out.println(sheet.getRow(3).getCell(4).getDateCellValue());
	
}
}
