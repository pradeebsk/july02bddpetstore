package pageclass.pet;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import global.petstore.BaseClassPet;

public class LoginPage extends BaseClassPet {
	public LoginPage() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//input[@name='username']")
	private WebElement userName;
	public WebElement getUserName() {
		return userName;
	}
	@FindBy(xpath="//input[@type='password']")
	private WebElement passWord;
	public WebElement getPassWord() {
		return passWord;
	}
	@FindBy(xpath="//input[@name='signon']")
	private WebElement loginclick;
	public WebElement getLoginclick() {
		return loginclick;
	}
	@FindBy(xpath="//div[@id='WelcomeContent']")
	private WebElement welcome;
	public WebElement getWelcome() {
		return welcome;
	}
	

}
