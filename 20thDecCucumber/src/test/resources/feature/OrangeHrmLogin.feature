Feature: Testing OrangeHRM login flow

  Scenario Outline: Test OrangeHRM with <flow>
    Given user is already in OrnageHRM login page
    When user enters username as <username>
    And user enters password as <password>
    And user clicks on login button
    Then user should reach to required page having url as <target>
    And user close the browser

    Examples: 
      | flow    | username | password | target    |
      | valid   | Admin    | admin123 | dashboard |
      | invalid | Admin    | admin    | login     |
      | invalid | dmin     | admin123 | login     |
