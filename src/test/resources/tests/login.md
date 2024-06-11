# Login Tests
- Testing Orange HRM Open Source Frontend user interface
- File Name: loginTests.md
- Version: 1
- Environment: QA
- Date: 2024/06/07
- Author: Devon McBain-Charles
- Requirement: User must be able to log into the system
- Source: Requirement Documentation
- Description: Functional tests for the login page

## Scenarios 
- 1  =  Correct input
- 0  =  Incorrect Input
- -1 =  Blank Input.
 
          Test   |    Username   | Password  | Expected Output
           1     |        1      |     1     | Login successful - Login successful
           2     |        1      |     0     | Error Message Invalid credentials
           3     |        1      |    -1     | Error Password "Required"
           4     |        0      |     1     | Error Message Invalid credentials
           5     |        0      |     0     | Error Message Invalid credentials
           6     |        0      |    -1     | Error Password "Required"
           7     |       -1      |     1     | Error Username "Required"
           8     |       -1      |     0     | Error Username "Required"
           9     |       -1      |    -1     | Error Username and Password "Required"

## Test cases:
- Detailed test cases for each UI feature/module
- Positive and negative scenarios
- Test Steps
- Expected results
- Actual results (after test execution)
- Defect tracking (if any)

1. **Test1 - Login successful**
   - Scenario: A user logs into the orangeHRM portal
   - Given The user accesses the portal using the url
   - When The Username and Password are captured
   - Then The user selects the login button
   - And The homepage is displayed
   - And The user closes the webpage
   - LOGIN is successful


2. **Test2 - Error Message Invalid credentials**
   - Scenario: A user logs into the orangeHRM portal
   - Given The user accesses the portal using the url
   - When The incorrect Password details are captured
   - Then The user selects the login button
   - And ERROR! The Error Message Invalid credentials is displayed
   - And The user closes the webpage

    
3. **Test3 - Error Password cannot be empty**
   - Scenario: A user logs into the orangeHRM portal
   - Given The user accesses the portal using the url
   - When The Username is captured
   - Then The user selects the login button
   - And ERROR! "Required" is displayed below Password textbox
   - And The user closes the webpage

4. **Test4 - Error Username "Required"**
   - Scenario: A user logs into the orangeHRM portal
   - Given The user accesses the portal using the url
   - When A Password is captured
   - Then The user selects the login button
   - And ERROR! "Required" is displayed below Username textbox
   - And The user closes the webpage
   

5. **Test5 - Error Message Invalid credentials**
   - Scenario: A user logs into the orangeHRM portal
   - Given The user accesses the portal using the url
   - When Incorrect Username and Password are captured
   - Then The user selects the login button
   - And ERROR! The Error Message Invalid credentials is displayed
   - And The user closes the webpage

6. **Test6 - Error Password cannot be empty**
   - Scenario: A user logs into the orangeHRM portal
   - Given The user accesses the portal using the url
   - When A Username is captured
   - Then The user selects the login button
   - And ERROR! "Required" is displayed below Password textbox
   - And The user closes the webpage

7. **Test7 - Error Username cannot be empty**
   - Scenario: A user logs into the orangeHRM portal
   - Given The user accesses the portal using the url
   - When A Password is captured
   - Then The user selects the login button
   - And ERROR! "Required" is displayed below Username textbox
   - And The user closes the webpage

8. **Test8 - Error Username cannot be empty**
   - Scenario: A user logs into the orangeHRM portal
   - Given The user accesses the portal using the url
   - When A Password is captured
   - Then The user selects the login button
   - And ERROR! "Required" is displayed below Username textbox
   - And The user closes the webpage

9. **Test9 - Error Username and Password cannot be empty**
   - Scenario: A user logs into the orangeHRM portal
   - Given The user accesses the portal using the url
   - Then The user selects the login button
   - And ERROR! "Required" is displayed below Username and Password textbox
   - And The user closes the webpage
   

