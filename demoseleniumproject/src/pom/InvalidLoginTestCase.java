package pom;

import java.io.IOException;

public class InvalidLoginTestCase extends BaseTest {

	public static void main(String[] args) throws IOException {
		BaseTest bt= new BaseTest();
		bt.browserSetup();
		
		Flib flib= new Flib();
		int rc = flib.lastRowCount(EXCEL_PATH, "invalidcreds");
		
		LoginPage lp = new LoginPage(driver);
		
		for(int i=1; i<=rc; i++) {
			lp.invalidLoginMethod(flib.readExcelData(EXCEL_PATH, "invalidcreds", i, 0), flib.readExcelData(EXCEL_PATH, "invalidcreds", i, 1));
		}
	}
	
}
