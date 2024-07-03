package pageclass.pet;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import global.petstore.BaseClassPet;

public class DogBreeds extends BaseClassPet {
	public DogBreeds() {
		PageFactory.initElements(driver,this);	
		
	}
	@FindBy(xpath="//h2[text()='Dogs']")
	private WebElement dogstitle;
	public WebElement getDogstitle() {
		return dogstitle;
	}
	@FindBy(xpath="//a[text()='K9-DL-01']")
	private WebElement dalmation;
	public WebElement getDalmation() {
		return dalmation;
	}

}
