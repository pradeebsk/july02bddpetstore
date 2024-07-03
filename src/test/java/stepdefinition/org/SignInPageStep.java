package stepdefinition.org;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriverException;

import global.petstore.BaseClassPet;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageclass.pet.SigninPage;

public class SignInPageStep extends BaseClassPet{
	public static BaseClassPet base;
	public static SigninPage signInPage;
	
	@Given("user should launch Browser and Required Url")
	public void user_should_launch_browser_and_required_url() {
		try {
			base = new BaseClassPet();
			base.getDriver("chrome");
			base.windowsMax();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);
		} catch (WebDriverException e) {
			System.out.println("base.getDriver(\"chrome\");" + "driver not launched");
		}
	}
	@When("user should validate Pet Store SignIn Page")
	public void user_should_validate_pet_store_sign_in_page() {
		try {
			base.getUrl("https://petstore.octoperf.com/actions/Catalog.action");
			signInPage = new SigninPage();
		} catch (Exception e) {
			System.out.println("user not launched reqiured url " + e.getMessage());
		}
	}
	@When("user should enter the signinpage Valid Credentials")
	public void user_should_enter_the_signinpage_valid_credentials() {
	    System.out.println("there is no details to enter");
	}
	@Then("user should be able to click the SignIn Button successfully")
	public void user_should_be_able_to_click_the_sign_in_button_successfully() {
		try {
			Assert.assertTrue(signInPage.getSidebar().isDisplayed());
			System.out.println("user is in launched pet store page ");
			signInPage.getSignInClick().click();
			System.out.println("user moved to the logginpage");
		} catch (NoSuchElementException e) {
			System.out.println("user not launched pet storage page");
		}

	}

}
