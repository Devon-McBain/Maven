# Testing Orange HRM Open Source Frontend user interface
# File Name: loginScenarioOutline.feature
# Author: Devon McBain-Charles
# Description: BDD Framework using Cucumber/Gherkin keyword syntax to define requirements.
# This allows requirements to be captured in the form of a feature file.
# The common syntax => Feature, Scenario, Given, When, Then.
# Scenario Outline used in data driven testing, allowing for multiple executions of the script.

@Regression
Feature: Application login

  @TC_LOGINTESTS
  Scenario Outline: Login tests
    Given Access the portal to achieve '<Test>' using the '<URL>'
    When The '<Username>' and '<Password>' are captured
    Then Select the login button
    And Verify credentials '<Username>' and '<Password>'
    And Display the homepage

    Examples:
    |Test                                             | URL                                                                | Username | Password  |
    |Test 1 - A Successful login                      | https://opensource-demo.orangehrmlive.com/web/index.php/auth/login | Admin    | admin123  |
    |Test 2 - Error Message Invalid credentials       | https://opensource-demo.orangehrmlive.com/web/index.php/auth/login | Admin    | 1234      |
    |Test 3 - Error Password "Required"               | https://opensource-demo.orangehrmlive.com/web/index.php/auth/login | Admin    |           |
    |Test 4 - Error Message Invalid credentials       | https://opensource-demo.orangehrmlive.com/web/index.php/auth/login | NotAdmin | admin123  |
    |Test 5 - Error Message Invalid credentials       | https://opensource-demo.orangehrmlive.com/web/index.php/auth/login | NotAdmin | 1234      |
    |Test 6 - Error Password "Required"               | https://opensource-demo.orangehrmlive.com/web/index.php/auth/login | NotAdmin |           |
    |Test 7 - Error Username "Required"               | https://opensource-demo.orangehrmlive.com/web/index.php/auth/login |          | admin123       |
    |Test 8 - Error Username "Required"               | https://opensource-demo.orangehrmlive.com/web/index.php/auth/login |          | 1234      |
    |Test 9 - Error Username and Password "Required"  | https://opensource-demo.orangehrmlive.com/web/index.php/auth/login |          |           |