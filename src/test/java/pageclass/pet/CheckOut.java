package pageclass.pet;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import global.petstore.BaseClassPet;

public class CheckOut extends BaseClassPet{
	public CheckOut() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//h2[text()='Shopping Cart']")
	private WebElement shopcart;
	public WebElement getShopcart() {
		return shopcart;
	}
	@FindBy(xpath="(//a[@class='Button'])[2]")
	private WebElement proceedToCheck;
	public WebElement getProceedToCheck() {
		return proceedToCheck;
	}

}
