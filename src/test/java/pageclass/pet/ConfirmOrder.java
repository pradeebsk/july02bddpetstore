package pageclass.pet;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import global.petstore.BaseClassPet;

public class ConfirmOrder extends BaseClassPet {
	public ConfirmOrder() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath=" //b[text()=' 2024/06/23 06:10:38']")
	private WebElement orderTime;
	public WebElement getOrderTime() {
		return orderTime;
	}
	@FindBy(xpath="//a[@class='Button']")
	private WebElement confirmOrder;
	public WebElement getConfirmOrder() {
		return confirmOrder;
	}
	@FindBy(xpath="//th[@align='center']")
	private WebElement orderId;
	public WebElement getOrderId() {
		return orderId;
	}
	@FindBy(xpath="//a[text()='Return to Main Menu']")
	private WebElement returnToHome;
	public WebElement getReturnToHome() {
		return returnToHome;
	}
	

}
