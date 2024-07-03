package pageclass.pet;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import global.petstore.BaseClassPet;

public class Dalmation extends BaseClassPet{
	public Dalmation() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="(//a[text()='Add to Cart'])[1]")
	private WebElement malePuppy;
	public WebElement getMalePuppy() {
		return malePuppy;
	}

}
