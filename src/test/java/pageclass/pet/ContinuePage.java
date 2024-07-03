package pageclass.pet;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import global.petstore.BaseClassPet;

public class ContinuePage extends BaseClassPet {
	public ContinuePage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//th[text()='Payment Details']")
	private WebElement payment;
	public WebElement getPayment() {
		return payment;
	}
	@FindBy(xpath="//input[@name='newOrder']")
	private WebElement continueButton;
	public WebElement getContinueButton() {
		return continueButton;
	}
	

}
