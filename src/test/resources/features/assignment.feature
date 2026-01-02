Feature: Assignment Functionality

  Background:
  @Smoke
  Scenario: Login with valid data
    When Navigate to the webpage.
    Then Enter username and password
    Then Click login button
    Then  Verify Home page opened

  @Assignment
  Scenario: Student submits assignment successfully

    Then Click assignments button from hamburger menu
    And Verify assignments page opened

    Then Verify submit button is visible next to assignment
    And Click assignment submit icon

    Then Verify assignment submission popup opened
    And Write text in assignment editor

    And Paste text into editor
    And Add image or table into editor

    Then Attach file to assignment
    And Save assignment as draft

    Then Verify success message displayed for draft save

    And Click submit assignment button
    Then Verify confirmation popup opened

    When Approve assignment submission
    Then Verify success message displayed for submission