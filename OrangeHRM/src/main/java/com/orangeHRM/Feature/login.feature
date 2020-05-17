Feature: Free CRM Login Feature

  #Scenario: Free CRM Login Test Scenario
  Scenario: Free CRM Login Test Scenario TsestCase ID Login_001
    Given user is already on Login Page
    Then user enters valid username and valid password
    Then click on submit button
    Then user will land on dashbord page
    Then logout from application and close browser

 
  Scenario: Free CRM Login Test Scenario TsestCase ID Login_003
    Given user is already on Login Page
    Then user enters valid username and invalid password
    Then click on submit button
    Then user will land on retry login page
    Then close the browser
 
  Scenario: Free CRM Login Test Scenario TsestCase no 8
    Given user is already on Login Page
    Then user enters valid username and valid password
    Then view password if show password is eanble
    Then close the browser
