package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="username") private WebElement usnTB;
	@FindBy(name="pwd") private WebElement pwdTB;
	@FindBy(id="loginButton") private WebElement loginButton;
	@FindBy(xpath="//label[@id='keepLoggedInLabel']/ancestor :: td /descendant :: input[@name='remember']") private WebElement keepMeLoggedInCheckBox;
	@FindBy(linkText="Actimind Inc.") private WebElement actimindLink;
	
	
	
	public WebElement getUsnTB() {
		return usnTB;
	}
	public WebElement getPwdTB() {
		return pwdTB;
	}
	public WebElement getLoginButton() {
		return loginButton;
	}
	public WebElement getKeepMeLoggedInCheckBox() {
		return keepMeLoggedInCheckBox;
	}
	public WebElement getActimindLink() {
		return actimindLink;
	}
	
	
	public void loginMethod(String username, String password) {
		usnTB.sendKeys(username);
		pwdTB.sendKeys(password);
		loginButton.click();
	}
	
	public void invalidLoginMethod(String username, String password) {
		usnTB.sendKeys(username);
		pwdTB.sendKeys(password);
		loginButton.click();
		usnTB.clear();
		
	}
	
}
