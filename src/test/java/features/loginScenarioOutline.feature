# Testing Orange HRM Open Source Frontend user interface
# File Name: loginScenarioOutline.feature
# Author: Devon McBain-Charles
# Description: BDD Framework using Cucumber/Gherkin keyword syntax to define requirements.
# This allows requirements to be captured in the form of a feature file.
# The common syntax => Feature, Scenario, Given, When, Then.

Feature: Application login 2

  @LoginTests
  Scenario Outline: Login successful
    Given The user accesses the portal using the '<URL>'
    When The '<Username>' and '<Password>' are captured
    Then Select the login button
    And Display the homepage
    And Close the webpage

    Examples:
      | URL                                                                | Username | Password
      | https://opensource-demo.orangehrmlive.com/web/index.php/auth/login | Admin    | 123

