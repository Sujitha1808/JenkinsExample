Feature: Login Test

@LoginTest
Scenario: User logs in with valid credentials.
Given I am on the login page
When I enter valid credentials
And I click on the login button
Then Redirecting to secure area





