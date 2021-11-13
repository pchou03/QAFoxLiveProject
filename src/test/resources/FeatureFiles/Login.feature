Feature: Login functionality scenarios

  @Login @One
  Scenario: Verify whether the user is able to login with valid credentials
    Given I launch the application
    And I navigate to Account Login page
    When I login to the Application using Username "prashant7538@gmail.com" and Password "Kalyani@123"
    Then I should see that the user is able to login successfully

  @Login @Two
  Scenario: Verify whether the user is not able to login with invalid credentials
    Given I launch the application
    And I navigate to Account Login page
    When I login to the Application using Username "prashant7538@gmail.com" and Password "Wrong@123"
    Then I should see a error message that the credentials invalid

  @Login @Three
  Scenario: Verify whether the user is not able to login with without credentials
    Given I launch the application
    And I navigate to Account Login page
    When I login to the Application using Username "" and Password ""
    Then I should see a error message that the credentials invalid

  @Login @Four
  Scenario: Verify whether the user is able to reset the forgotten password
    Given I launch the application
    And I navigate to Account Login page
    When I reset the forgotten password for email "prashant7538@gmail.com"
    Then I should see a message informing the User that information related to ressetting password have been sent to email address
