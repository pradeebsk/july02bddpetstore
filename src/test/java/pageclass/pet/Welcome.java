package pageclass.pet;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import global.petstore.BaseClassPet;

public class Welcome extends BaseClassPet {
	public Welcome() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//img[@src='../images/dogs_icon.gif']")
	private WebElement dogs;
	public WebElement getDogs() {
		return dogs;
	}
	

}
