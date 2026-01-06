Feature: Profile Settings Tests

  Background:
    Given Navigate to WebSite
    When Enter username and password and click login button

    Scenario: Profile settings check
      Then click the profile settings button
      Then click the settings button
      Then click avatar to upload profile picture
      Then click the box for upload profile picture
      Then select picture from local PC and click open button
      Then click the upload button
      Then click the save button
      Then verify that all changes with success message
      Then click the settings button again and change the theme for UI



