Feature: Google search functionality test

@Smoke
Scenario: Search Selenium interview questions
Given user is already in google search page
When user types "Selenium" in the search input field and press enter button
Then user should be able to see google search page with title having "Selenium"
And user close the browser