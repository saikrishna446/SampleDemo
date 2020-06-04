@tag
Feature: Login Test

Scenario Outline: Login application with valid credintionals
	Given navigate to the application
		And enter <unsername> and <password>
		Then click on Ok button
		
		Examples:
		|unsername| |password|
		|saikrishna.v225||123456|