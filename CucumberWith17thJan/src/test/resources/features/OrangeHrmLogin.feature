Feature: This will cover Orange HRM login functionality

Scenario: Validate login with valid data in Orange HRM
Given user already opened Web browser and having login page opened
When user enters valid username as "Admin"
And user enters valid password as "admin123"
And user clicks on login button
Then user should navigate to Orange HRM home page having "dashboard" in URL
And user closed the browser