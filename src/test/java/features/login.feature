# Testing Orange HRM Open Source Frontend user interface
# File Name: Login.feature
# Author: Devon McBain-Charles
# Description: BDD Framework using Cucumber/Gherkin keyword syntax to define requirements.
# This allows requirements to be captured in the form of a feature file.
# The common syntax => Feature, Background, Scenario, Given, When, Then.
# The Step Data table and Cucumber data table are used as a list of inputs


Feature:  Application login

  @TC_LOGIN_001 @SmokeTest
  Scenario: Home page default login
    Given User is on landing page
    When User tries to login into application
    |username |password        |
    |Admin    |admin123        |
    |NotAdmin |blandtester     |
    |Test     |Test            |
    |Admin    |admin123        |
    |@#$%^&*  |@#!~$%^&*       |
    |123456   |9874563210      |
    And Logs in "Admin" and "admin123"
    Then The homepage is displayed

  @TC_LOGIN_002
  Scenario: A user logs into the orangeHRM portal
    Given The user accesses the portal using the url
    When The Username and Password are captured
    Then The user selects the login button
    And The homepage is displayed2
    And The user closes the webpage