Feature: Testing Authentication for gmail 
	Users should be Authenticated

 
Scenario Outline: : User Authentication Success 
  Given user hits the url "https://www.google.com/"
	When user enters the username "<username>" And password "<password>" 
	Then user see "COMPOSE" button 
	     
	Examples: 
		|username|password|
		|jagruti.ghorpade@gmail.com|aaaaaa|  
		|jagruti.g.thorat@gmail.com|cccccc|
		|gt9111987@gmail.com|abcd|
		
		
		
