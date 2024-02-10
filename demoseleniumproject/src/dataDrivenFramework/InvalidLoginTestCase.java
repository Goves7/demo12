package dataDrivenFramework;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidLoginTestCase {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://127.0.0.1/login.do;jsessionid=124yop1uvz4vk");
		
		Flib flib = new Flib();
		int rc = flib.lastRowCount("./data/ActiTimeTestData.xlsx", "invalidcreds");
		
		for(int i=1; i<=rc; i++) {
			driver.findElement(By.name("username")).sendKeys(flib.readExcelData("./data/ActiTimeTestData.xlsx", "invalidcreds", i, 0));
			driver.findElement(By.name("pwd")).sendKeys(flib.readExcelData("./data/ActiTimeTestData.xlsx", "invalidcreds", i, 1));
			driver.findElement(By.id("loginButton")).click();
			driver.findElement(By.name("username")).clear();
			Thread.sleep(1000);
		}

	}

}
