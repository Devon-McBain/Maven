# Testing Orange HRM Open Source Frontend user interface
# File Name: Login.feature
# Author: Devon McBain-Charles
# Description: BDD Framework using Cucumber/Gherkin keyword syntax to define requirements.
# This allows requirements to be captured in the form of a feature file.
# The common syntax => Feature, Scenario, Given, When, Then.


Feature:  Application login

  @TC_LOGIN_001 @SmokeTest
  Scenario: Home page default login
    Given User is on landing page
    When User login into application with username and password
    Then The homepage is displayed

  @TC_LOGIN_002
  Scenario: A user logs into the orangeHRM portal
    Given The user accesses the portal using the url
    When The Username and Password are captured
    Then The user selects the login button
    And The homepage is displayed2
    And The user closes the webpage