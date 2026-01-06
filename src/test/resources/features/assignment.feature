Feature: Assignment Functionality

  Background: Login with valid data
    When Navigate to the webpage.
    Then Enter username and password
    Then Click login button
    Then  Verify Home page opened

  @Assignment20
  Scenario: Assignment verification process
    Then The student clicks the assignments button on the hamburger menu
    Then The student clicks the i button to the right of the assignments on the assignment list
    Then The student clicks the favorite button to the right of the assignments on the assignment list

  @Assignment21
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

  @Assignment22
    Scenario: search button visibility
      When The student clicks the assignments button on the hamburger menu.
      Then The student sees the search button on the Assign page and clicks on it.
      When the student performs a search without applying any filters (Default Search), all assigned tasks are listed.
      Then The student filters the search (Course, Status, Semester).
      Then The student accesses a dropdown menu (Display Format ...) on the Assignment page to sort the search results.
      Then The student sorts the results by course, type, date, and table using the dropdown menu (Display Format ...).


