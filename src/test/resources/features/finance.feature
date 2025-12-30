Feature: Finance Functionality

  Background:



    Scenario: US_08 HamburgerMenu_Finance
      When Click on the Hamburger Menu
      Then Click on the Finance button
      Then Click on the My Finance button
      Then Verify Finance page opened



      Scenario: US_09 HamburgerMenu_Finance
        When Click on the Hamburger Menu
        Then Click on the Finance button
        Then Click on the My Finance button
        Then Verify Finance page opened
        Then Click on the Student's Name
        Then Click on the Fee_Balance Detail
        Then Verify Installment Table is visible


        Scenario: US_12 HamburgerMenu_Finance
          When Click on the Hamburger Menu
          Then Click on the Finance button
          Then Click on the My Finance button
          Then Click on Three Dots on Finance Page
          Then Click on Excel Export
          Then Verify Excel Report was successful



