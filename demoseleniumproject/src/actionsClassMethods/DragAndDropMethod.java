package actionsClassMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragAndDropMethod {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");

		driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
		driver.findElement(By.xpath("//section[text()='Drag & Drop']")).click();
		driver.findElement(By.partialLinkText("Drag Position")).click();
		WebElement mobileCharger = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
		WebElement mobileAccessories = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
		
		Actions act = new Actions(driver);
		
		act.dragAndDrop(mobileCharger, mobileAccessories).perform();
	}

}
