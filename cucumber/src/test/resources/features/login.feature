Feature: User Login Functionality
	As a registered user
	I want to be able to login to the application
	So that I can access my account
	
Scenario: Successful Login with Valid Credentials
	Given I am on the login page
	When I enter "alex@abc" as username and "P@ssword123" as password
	And I click the login button
	Then I should see the success message "Welcome, Alex!"