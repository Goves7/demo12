package pom;

import java.io.IOException;

public class ValidLoginTestCase extends BaseTest{

	public static void main(String[] args) throws IOException {
		BaseTest bt = new BaseTest();
		bt.browserSetup();

		Flib flib= new Flib();
		
		String username = flib.readExcelData(EXCEL_PATH, "validcreds", 1, 0);
		String password = flib.readExcelData(EXCEL_PATH, "validcreds", 1, 1);
		
		LoginPage lp = new LoginPage(driver);
		lp.loginMethod(username, password);
	}

}
