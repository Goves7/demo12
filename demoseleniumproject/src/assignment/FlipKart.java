package assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlipKart {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.name("q")).sendKeys("Hp Laptop",Keys.ENTER);
		//Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[text()='Brand']")).click();
		driver.findElement(By.xpath("//div[text()='HP']/preceding-sibling :: div[@class='_24_Dny']")).click();
		//Thread.sleep(1000);
		
		//driver.findElement(By.xpath("//div[text()='Processor']")).click();
		driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling :: div[text()='Core i5']")).click();
		//Thread.sleep(1000);
		
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[text()='Operating System']"))));
		driver.findElement(By.xpath("//div[text()='Operating System']")).click();
		driver.findElement(By.xpath("//div[text()='Windows 11']/preceding-sibling :: div[@class='_24_Dny']")).click();
		//Thread.sleep(1000);
		
		List<WebElement> laptops = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		
		List<WebElement> laptopPrices = driver.findElements(By.xpath("//div[@class='_4rR01T']/ancestor :: div[@class='_3pLy-c row']/ descendant :: div[@class='_30jeq3 _1_WHN1']"));

		for(int i=0; i<laptops.size(); i++) {
			
			String op = laptops.get(i).getText();
			
			for(int j=i; j<=i;j++)
			{
				String ops = laptopPrices.get(j).getText();
			    System.out.print(op+" : "+ops);
			    Thread.sleep(1000);
			}
			System.out.println();
		}
	}

}
