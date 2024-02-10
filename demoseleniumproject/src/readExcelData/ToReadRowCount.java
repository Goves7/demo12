package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToReadRowCount {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./data/ActiTimeTestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("validcreds");
		int rowCount = sheet.getLastRowNum();
		int rowC = sheet.getPhysicalNumberOfRows();
	    int cellC = sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println(rowCount);
		System.out.println(rowC);
		System.out.println(cellC);
		
	}

}
