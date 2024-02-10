package keywordDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest extends Flib implements IautoConstant {

	static WebDriver driver;
	public void openBrowser() throws IOException {
		Flib flib = new Flib();
		String browserName = flib.readPropertyData(PROP_PATH, "Browser");
		String url = flib.readPropertyData(PROP_PATH, "Url");
		
		if(browserName.equalsIgnoreCase("chrome")) {
            System.setProperty(CHROME_KEY, CHROME_PATH);
            driver= new ChromeDriver();
		}
		
		else if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty(GECKO_KEY, GECKO_PATH);
            driver= new ChromeDriver();   
		}
		
		else {
			System.setProperty(EDGE_KEY, EDGE_PATH);
            driver= new ChromeDriver();    
		}
		 driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
         driver.get(url);  
	}
	
	public void closeBrowser() {
		driver.close();
	}
	
}
