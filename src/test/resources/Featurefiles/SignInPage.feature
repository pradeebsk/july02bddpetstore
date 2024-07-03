Feature: To Validate Pet store SignInPage

  Scenario: To Verify the SignInPage with valid credentials
    Given user should launch Browser and Required Url
    When user should validate Pet Store SignIn Page
    When user should enter the signinpage Valid Credentials
    Then user should be able to click the SignIn Button successfully
    
  Scenario: To verify the LoginPage with valid credentials
    Given user should launch Browser and Required Url
    When user should validate Pet Store SignIn Page
    When user should enter the signinpage Valid Credentials
    Then user should be able to click the SignIn Button successfully
    Then user should be in the LoginPage and validated
    Then user should enter the valid credentials in LoginPage
    Then user should get the title of the LoginPage 
    Then user should be able to click the login button succesfully
