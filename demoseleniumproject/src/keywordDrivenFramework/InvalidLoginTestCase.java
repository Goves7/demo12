package keywordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;

public class InvalidLoginTestCase extends BaseTest implements IautoConstant {

	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest bt= new BaseTest();
		bt.openBrowser();
		
		Flib flib= new Flib();
		int rc = flib.lastRowCount(EXCEL_PATH, "invalidcreds");
		
		for(int i=0; i<=rc;i++) {
			driver.findElement(By.name("username")).sendKeys(flib.readExcelData(EXCEL_PATH, "invalidcreds", i, 0));
			driver.findElement(By.name("pwd")).sendKeys(flib.readExcelData(EXCEL_PATH, "invalidcreds", i, 1));
			driver.findElement(By.id("loginButton")).click();
			Thread.sleep(1000);
			driver.findElement(By.name("username")).clear();
		}

	}

}
