package pom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Stale {

	public static void main(String[] args) {
	 
	 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
     WebDriver  driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
     driver.get("http://desktop-1drg44f/login.do");
     
     WebElement usnTB = driver.findElement(By.name("username"));
     
     WebElement pwdTB = driver.findElement(By.name("pwd"));
     
     WebElement loginButton = driver.findElement(By.id("loginButton"));
     
     usnTB.sendKeys("admin");
     driver.navigate().refresh();
     pwdTB.sendKeys("manager");
     loginButton.click();
     
     
	}

}
