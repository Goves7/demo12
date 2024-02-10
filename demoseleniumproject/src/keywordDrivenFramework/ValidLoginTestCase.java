package keywordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;

public class ValidLoginTestCase extends BaseTest implements IautoConstant {

	public static void main(String[] args) throws IOException {
		BaseTest bt = new BaseTest();
		bt.openBrowser();

		Flib flib= new Flib();
		
		driver.findElement(By.name("username")).sendKeys(flib.readExcelData(EXCEL_PATH, "validcreds", 1, 0));
		driver.findElement(By.name("pwd")).sendKeys(flib.readExcelData(EXCEL_PATH, "validcreds", 1, 1));
		driver.findElement(By.id("loginButton")).click();
		
	}
}
