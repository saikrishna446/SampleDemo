@tag
Feature: login to the application

Scenario: scenario description
Given navigate to application
	When user click on sign in link
  And enter email address as "test902@gmail.com"
	And enter password as "password"
	And click on sign in button
	Then Login is successful
    
