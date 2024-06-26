**README.md**

# Testing Approach for Orange HRM Open Source Frontend

This document outlines the approach to testing the Orange HRM open-source frontend. 

https://opensource-demo.orangehrmlive.com/


      Cucumber BDD Framework
      features: Test suit in gherkin language. Each feature consists of test cases.
      stepDefintion: Step Definition in cucumber, ie. Given When And Then
      cucumberOptions: TestRunner, run features file, glue between your feature and cucumbersteps
      reports: The Cucumber BDD framework will generate an HTML, JSON and/or XML report

## Technologies Used:
- Selenium WebDriver - v4.21.0 (Open Source)
- JDK 22 (Java Development Kit)
- JUnit (Test Unit Framework)
- Cucumber/Gherkin (BDD Framework)
- Maven (Build Automation Tool)
- IDE - IntelliJ (Java Editor)
- GitHub
- Browsers (Firefox, Chrome, Edge)


## Software Testing Lifecycle Steps:

1. **Requirement Analysis:**
   - Understand the functional and non-functional requirements of the Orange HRM frontend website.
   - Identify the target audience and their expectations.
   
2. **Test Planning:**
   - Define the scope of testing including features, browsers, and devices to be tested.
   - Create a test plan outlining test objectives, strategies, and timelines.
   
3. **Test Case Design:**
   - Develop test cases covering all functionalities of the Orange HRM frontend website.
   - Test cases should include positive and negative scenarios.
   - Prioritize test cases based on risk and importance.
   
4. **Test Environment Setup:**
   - Set up the test environment with necessary hardware, software, and network configurations.
   - Install required browsers and devices for testing.
   
5. **Test Execution:**
   - Execute test cases according to the test plan.
   - Report defects using a defect tracking tool, providing detailed information and steps to reproduce.
   - Perform regression testing after fixing defects or implementing new features.
   - The project will leverage data-driven testing techniques to enhance test coverage and efficiency.
   - This approach allows for scalability.
   
6. **Defect Tracking and Management:**
   - Track defects throughout their lifecycle from discovery to resolution.
   - Prioritize defects based on severity and impact on the system.
   
7. **Test Reporting:**
   - Generate test reports summarizing test execution results, defect metrics, and test coverage.
   - The Cucumber BDD framework will be employed for organizing, executing, and managing the tests.
   - Additionally, the Cucumber BDD framework will generate an HTML, JSON and/or XML report summarizing the test results, making it easy to analyze and share the test outcomes.
   - Share reports with stakeholders, in the necessary format, to provide insights into the quality of the Orange HRM frontend website.
   
8. **Continuous Improvement:**
   - Gather feedback from testing activities to improve future test planning and execution.
   - Update test cases and test plans based on lessons learned and changes in requirements.
   
## Testing the Orange HRM Open Source Frontend: 
## Generic types of testing that may apply to the Application Under Test (AUT).
### Effort will be placed on Functional Testing through automation

1. **Functional Testing:**
   - Validate all functionalities such as user authentication, employee management, leave management, etc.
   - Verify that the website behaves as expected under different user roles and permissions.

2. **Test Automation**
   - The Selenium framework will be utilized for automating web browsers and interacting with the OrangeHRM Demo 
   platform. It provides a powerful set of tools for simulating user actions, validating web elements, and performing assertions.

3. **Compatibility Testing:**
   - Test the website on different browsers (Chrome, Firefox, Safari, Edge) and versions to ensure cross-browser compatibility.
   - Validate responsiveness across various devices (desktops, laptops, tablets, smartphones) and screen resolutions.
   
3. **Usability Testing:**
   - Evaluate the user interface for intuitiveness, ease of navigation, and overall user experience.
   - Solicit feedback from real users to identify any usability issues and areas for improvement.
   
4. **Performance Testing:**
   - Measure website performance under normal and peak load conditions.
   - Conduct load testing to assess the system's ability to handle concurrent user interactions.
   
5. **Security Testing:**
   - Identify and mitigate security vulnerabilities such as XSS (Cross-Site Scripting), CSRF (Cross-Site Request Forgery), SQL injection, etc.
   - Ensure data encryption and secure communication protocols are implemented.
   
6. **Accessibility Testing:**
   - Verify that the website complies with accessibility standards (WCAG) to ensure it is usable by people with disabilities.
   - Test screen reader compatibility, keyboard navigation, and color contrast.
   
7. **Localization Testing:**
   - Validate language translations and cultural adaptations for international users.
   - Ensure date, time, and currency formats are displayed correctly based on user locale.
   
8. **Integration Testing:**
   - Verify seamless integration with backend systems, APIs, and third-party services.
   - Test data synchronization and consistency across different modules.
   
## Contributors

- Devon McBain(https://github.com/Devon-McBain)

