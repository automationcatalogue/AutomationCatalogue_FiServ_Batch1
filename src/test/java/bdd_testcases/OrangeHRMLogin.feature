@All @OrangeHRM
Feature: Testing of OrangeHRM Login functionality

  Background: Open the browser and launch URL
    Given User is opened the "Chrome" browser
    Given User launches "OrangeHRM" application URL

  @OrangeHRM_ValidData @OrangeHRM_Login
  Scenario: OrangeHRM Login with Valid Data
    When User is entered the "Amanda" as UserName
    And User is entered the "Admin@123" as Password
    And User is clicked on Login button
    Then User verifies the HomePage title
    #And User clicks on Logout button
    #And User closes the browser

  @OrangeHRM_InValidData @OrangeHRM_Login
  Scenario: OrangeHRM Login with InValid Data
    When User is entered the "Admin" as UserName
    And User is entered the Invalid Password
    And User is clicked on Login button
    Then User verifies Invalid Credentials message
    #And User clicks on Logout button
    #And User closes the browser
