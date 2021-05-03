Feature: Click on form Authentication on Menu.
	
	Automate form Authentication
	
	
@SeleniumTest            
Scenario: Try to login with correct username and wrong password 

	Given want to login with username "tomsmith" and password "abcd" 
	When I click on login button 
	Then I should see "Your password is invalid!"
	
@SeleniumTest            
Scenario: Try to login with incorrect username and correct password 

	Given want to login with username "abcd" and password "SuperSecretPassword!" 
	When I click on login button 
	Then I should see "Your username is invalid!"
	
@SeleniumTest            
Scenario: Try to login with correct username and correct password 

	Given want to login with username "tomsmith" and password "SuperSecretPassword!" 
	When I click on login button 
	Then I logout