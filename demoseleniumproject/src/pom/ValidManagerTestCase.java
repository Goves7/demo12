package pom;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class ValidManagerTestCase extends BaseTest{

	public static void main(String[] args) throws IOException, EncryptedDocumentException, InterruptedException  {
		
	BaseTest bt = new BaseTest();
	bt.browserSetup();
	
	Flib flib = new Flib();
	
	// Perform Valid Login
	LoginPage lp = new LoginPage(driver);
	lp.loginMethod(flib.readExcelData(EXCEL_PATH, "validcreds", 1, 0), flib.readExcelData(EXCEL_PATH, "validcreds", 1, 1));
	
	HomePage hp = new HomePage(driver);
	hp.getUsersModule().click();
	
	UsersPage up = new UsersPage(driver);
	up.createManagerMethod(flib.readExcelData(EXCEL_PATH, "managercreds", 1, 0), flib.readExcelData(EXCEL_PATH, "managercreds", 1, 1), flib.readExcelData(EXCEL_PATH, "managercreds", 1, 2), flib.readExcelData(EXCEL_PATH, "managercreds", 1, 3));
	
	up.deleteManager();
	
	Worklib wl = new Worklib();
	wl.confirmationPopup();
	
	Thread.sleep(3000);
	bt.closeBrowser();
	}

}
