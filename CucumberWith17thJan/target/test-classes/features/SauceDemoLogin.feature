Feature: This will cover all login flow for SouceDemo application

  Scenario Outline: Validate login functionality of SouceDemo with <flow>
    Given user is already in login page of SouceDemo
    When user enters a username as <username> in SouceDemo
    And user enters a password as <password> in SouceDemo
    And user clicks on login button of SouceDemo
    Then user should navigate to SouceDemo home page having URL as <expectedURL>
    And user closed the browser

    Examples: 
      | flow    | username        | password     | expectedURL   |
      | valid   | standard_user   | secret_sauce | inventory     |
      | invalid | locked_out_user | secret_sauce | saucedemo.com |
      | invalid | problem_user    | secret_sauce | saucedemo.com |
