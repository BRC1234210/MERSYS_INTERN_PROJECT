Feature: Attendance Functionality

  Background:
    Given Navigate to WebSite
    When Enter username and password and click login button

    Scenario:Attendance check excuses
      Then click the attendance button
      Then click the attendance excuses
      Then click the add excuse button
      Then select type of excuse
      Then select date range
      Then write massage to teacher
      Then upload file
      Then click the send button
Feature: Login functionality




  @Smoke
  Scenario: Login with valid data
    When Navigate to the webpage.
    Then Enter username and password
    Then Click login button
    Then  Verify Home page opened