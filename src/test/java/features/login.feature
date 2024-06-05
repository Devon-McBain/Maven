Feature:  Application login

  @EasyLogin
  Scenario: Home page default login
    Given User is on landing page
    When User login into application with username and password
    Then The homepage is displayed

    @LongerLogin
  Scenario: A user logs into the orangeHRM portal
    Given The user accesses the portal using the url
    When The Username and Password are captured
    Then The user selects the login button
    And The homepage is displayed2
    And The user closes the webpage