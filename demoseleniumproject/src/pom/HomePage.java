package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(xpath="//div[text()='Time-Track']/../descendant :: img") private WebElement timeTrackModule;
	@FindBy(xpath="//div[text()='Tasks']/ following-sibling :: img") private WebElement tasksModule;
	@FindBy(xpath="//div[text()='Reports']/ following-sibling :: img") private WebElement reportsModule;
	@FindBy(xpath="//div[text()='Users']/ following-sibling :: img") private WebElement usersModule;
	@FindBy(xpath="//div[text()='Work Schedule']/ following-sibling :: img") private WebElement workScheduleModule;
	@FindBy(xpath="//div[text()='Settings']/ following-sibling :: img") private WebElement settingsModule;
	@FindBy(linkText="Logout") private WebElement logoutLink;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getTimeTrackModule() {
		return timeTrackModule;
	}

	public WebElement getTasksModule() {
		return tasksModule;
	}

	public WebElement getReportsModule() {
		return reportsModule;
	}

	public WebElement getUsersModule() {
		return usersModule;
	}

	public WebElement getWorkScheduleModule() {
		return workScheduleModule;
	}

	public WebElement getSettingsModule() {
		return settingsModule;
	}

	public WebElement getLogoutLink() {
		return logoutLink;
	}
	
	
}
