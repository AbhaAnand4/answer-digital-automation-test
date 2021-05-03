Feature: Click on 4 keys and assert text displayed after every key press.
	
	Key Presses on Menu
	
	
@SeleniumTest            
Scenario: Press key 4 and assert the text displayed. 

	Given Go to key presses page
	When I click on key "4"
	Then Text displayed should be "You entered: 4"
	
@SeleniumTest            
Scenario: Press key 5 and assert the text displayed.  

	Given Go to key presses page
	When I click on key "5"
	Then Text displayed should be "You entered: 5"
	
@SeleniumTest            
Scenario: Press key 6 and assert the text displayed.  

	Given Go to key presses page
	When I click on key "6"
	Then Text displayed should be "You entered: 6"
	
@SeleniumTest            
Scenario: Press key 7 and assert the text displayed.  

	Given Go to key presses page
	When I click on key "7"
	Then Text displayed should be "You entered: 7"