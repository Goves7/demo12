package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsersPage {

	@FindBy(xpath="//input[@value='Create New User']") private WebElement createNewUserButton;
	@FindBy(name="username") private WebElement usernameTB;
	@FindBy(name="passwordText") private WebElement passwordTB;
	@FindBy(name="passwordTextRetype") private WebElement retypePasswordTB;
	@FindBy(name="firstName") private WebElement firstNameTB;
	@FindBy(name="lastName") private WebElement lastNameTB;
	@FindBy(name="rightGranted[12]") private WebElement modifyTimeTrackOfOtherUsersCheckbox;
	@FindBy(name="rightGranted[2]") private WebElement manageCustomersAndProjectsCheckbox;
	@FindBy(name="rightGranted[13]") private WebElement manageTasksCheckbox;
	@FindBy(name="rightGranted[1]") private WebElement generateReportsCheckbox;
	@FindBy(name="rightGranted[5]") private WebElement manageUsersCheckbox;
	@FindBy(name="rightGranted[7]") private WebElement manageBillingTypesCheckbox;
	@FindBy(xpath="//input[contains(@value,'Create User ')]") private WebElement createUserButton;
	@FindBy(xpath="(//input[contains(@value,'Cancel')])[2]") private WebElement cancelButton;
	@FindBy(xpath="//a[text()='Shrama, Rohit (manager_01)']") private WebElement usersLink;
	@FindBy(xpath="//input[@value='Delete This User']") private WebElement deleteThisUserButton;
	
	public UsersPage(WebDriver driver) {
		PageFactory.initElements(driver , this);
	}

	public WebElement getCreateNewUserButton() {
		return createNewUserButton;
	}

	public WebElement getUsernameTB() {
		return usernameTB;
	}

	public WebElement getPasswordTB() {
		return passwordTB;
	}

	public WebElement getRetypePasswordTB() {
		return retypePasswordTB;
	}

	public WebElement getFirstNameTB() {
		return firstNameTB;
	}

	public WebElement getLastNameTB() {
		return lastNameTB;
	}

	public WebElement getModifyTimeTrackOfOtherUsersCheckbox() {
		return modifyTimeTrackOfOtherUsersCheckbox;
	}

	public WebElement getManageCustomersAndProjectsCheckbox() {
		return manageCustomersAndProjectsCheckbox;
	}

	public WebElement getManageTasksCheckbox() {
		return manageTasksCheckbox;
	}

	public WebElement getGenerateReportsCheckbox() {
		return generateReportsCheckbox;
	}

	public WebElement getManageUsersCheckbox() {
		return manageUsersCheckbox;
	}

	public WebElement getManageBillingTypesCheckbox() {
		return manageBillingTypesCheckbox;
	}

	public WebElement getCreateUserButton() {
		return createUserButton;
	}

	public WebElement getCancelButton() {
		return cancelButton;
	}
	
	
	public WebElement getUsersLink() {
		return usersLink;
	}

	public WebElement getDeleteThisUserButton() {
		return deleteThisUserButton;
	}

	public void createManagerMethod(String username, String password, String fn, String ln) throws InterruptedException {
		createNewUserButton.click();
		usernameTB.sendKeys(username);
		passwordTB.sendKeys(password);
		retypePasswordTB.sendKeys(password);
		firstNameTB.sendKeys(fn);
		lastNameTB.sendKeys(ln);
		Thread.sleep(1000);
		modifyTimeTrackOfOtherUsersCheckbox.click();
		manageCustomersAndProjectsCheckbox.click();
		generateReportsCheckbox.click();
		manageUsersCheckbox.click();
		manageBillingTypesCheckbox.click();
	
		Worklib wl = new Worklib();
		wl.scrollDown(0, 500);
		Thread.sleep(1000);
		createUserButton.click();
		
	}
	
	public void deleteManager() {
		
		usersLink.click();
		deleteThisUserButton.click();
	}
}
