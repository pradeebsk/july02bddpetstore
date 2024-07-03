package pageclass.pet;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import global.petstore.BaseClassPet;

public class SigninPage extends BaseClassPet {
	public SigninPage() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//div[@id='SidebarContent']")
	private WebElement sidebar;
	public WebElement getSidebar() {
		return sidebar;
	}
	@FindBy(xpath="//a[text()='Sign In']")
	private WebElement signInClick;
	public WebElement getSignInClick() {
		return signInClick;
	}

}
