Feature: User Authentication for LeafTaps Application

Scenario: Login using Valid Credential

Given the user is on the login page
When the user enters the username as demosalesmanager
And the user enters the passwaord as crmfsa
And the user clicks the login button
Then the user should be redirected to welcome page
And the user should be able to view the welcome page
