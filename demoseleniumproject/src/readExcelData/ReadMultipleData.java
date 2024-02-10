package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./data/TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet infoSheet = wb.getSheet("students");
		int rowCount = infoSheet.getPhysicalNumberOfRows() -1;
		int cellCount = infoSheet.getRow(1).getPhysicalNumberOfCells();
		
		System.out.println(rowCount+" , "+cellCount);
		
		String [][] sarr= new String [rowCount][cellCount];
		
		for (int i=1, k=0 ; i <=rowCount; i++, k++) {
			for(int j=0; j<cellCount; j++) {
				sarr [k][j]=infoSheet.getRow(i).getCell(j).getStringCellValue();
			}
		}

		for(String [] arr : sarr) {
			for(String data : arr) {
				System.out.print(data+", ");
			}
			System.out.println();
		}
		
	}

}
