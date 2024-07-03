package stepdefinition.org;

import org.junit.Assert;

import global.petstore.BaseClassPet;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageclass.pet.LoginPage;

public class LoginPageStep extends BaseClassPet{
	public static BaseClassPet base;
	public static LoginPage loginPage;
	
	@Given("user should be in the LoginPage and validated")
	public void user_should_be_in_the_login_page_and_validated() {
		try {
			LoginPage loginPage = new LoginPage();
//			Assert.assertTrue(loginPage.getLoginclick().isDisplayed());
//			System.out.println("user is in loginPage");
			System.out.println(loginPage.getLoginclick().getAttribute("value"));
			
		} catch (Exception e) {
			System.out.println("exception user not moved to the loginPage"+e.getMessage());
		}
	    
	}

	@When("user should enter the valid credentials in LoginPage")
	public void user_should_enter_the_valid_credentials_in_login_page() {
	 
	    try {
	    	 loginPage.getUserName().sendKeys("pradeepkumar");
	    	 loginPage.getPassWord().clear();
	 	    loginPage.getPassWord().sendKeys("Jaisri_@123");
		} catch (Exception e) {
			System.out.println("exception user not entered the valid credentials "+e.getMessage());
		}
	}

	@When("user should get the title of the LoginPage")
	public void user_should_get_the_title_of_the_login_page() {
	   try {
		System.out.println(driver.getTitle());
	} catch (Exception e) {
		System.out.println("user not able to get the title of the second page");
	}
	}

	@Then("user should be able to click the login button succesfully")
	public void user_should_be_able_to_click_the_login_button_succesfully() {
		try {
			System.out.println("check success for git hub");
			System.out.println("proceed further ");
			loginPage.getLoginclick().click();
			System.out.println("user arises the merger conflict");
		} catch (Exception e) {
			System.out.println("user not able to click login "+e.getMessage());
		}
	    
	}



}
