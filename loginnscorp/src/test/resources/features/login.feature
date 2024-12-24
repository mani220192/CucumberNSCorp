Feature: Login page of craft portal of nscorp
Scenario: Check login is successful with valid credentials
Given user is on login page 
When user enters valid username and password
And Clicks on Login Button
Then navigate to home page  
And close the browser