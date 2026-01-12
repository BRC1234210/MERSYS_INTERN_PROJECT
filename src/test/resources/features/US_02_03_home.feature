Feature: Home functionality

  Background: Login with valid data
    When Navigate to the webpage.
    Then Enter username and password
    Then Click login button
    Then  Verify Home page opened


  Scenario: Student should see and use the company logo after login
    Given The user should see the company logo on the top left
    When The user clicks on the company logo
    Then The user should be redirected to "https://techno.study"