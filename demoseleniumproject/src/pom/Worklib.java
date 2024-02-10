package pom;

import org.openqa.selenium.JavascriptExecutor;

public class Worklib extends BaseTest {

	public void scrollDown(int x, int y) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
	}
	
	public void confirmationPopup() {
		driver.switchTo().alert().accept();
	}
}
