@OrangeHRM
Feature: To Test the OrangeHRM Add Employee functionality

  @OrangeHRM_AddEmployee
  Scenario: OrangeHRM AddEmployee
    Given User launches OrangeHRM application in "Chrome" browser
    When User is entered "Admin" and "Admin@123" credentials
    And User is clicked on Login button
    Then User verifies the HomePage title
    When User clicked on Employee Management link
    And User is clicked on Add Employee button
    And User is entered "Automation" and "Testing" and "India Office" and clicks Next button
    And User is entered "married" and "Female" and clicks Next button
    And User is entered "Region-2" and "0.5" and "Sub Unit-2" and clicks on Save button
    Then User verifies New employee Name and Employee Id
