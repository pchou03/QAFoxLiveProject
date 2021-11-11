Feature: Registration functionality scenario


@Register @One
	Scenario: Verify whether the user is able to register into the application by providing all the fields
		Given I launch the application
		And I navigate to Account Registarion page
		When I provide all the below valid details
				| FirstName	| Prashant								|
				| LastName	| Chougale								|
				| Email			| prashant7538@gmail.com	|
				| Telephone	| 9527106034							|
				| Password	| Prashant@123						|
		And I select the Privacy Policy
		And I cick on continue button
		Then I should see that the User Account has successfully created