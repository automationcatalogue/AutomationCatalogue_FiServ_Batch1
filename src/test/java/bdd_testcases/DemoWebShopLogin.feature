@All @DemoWebShop
Feature: Testing DemoWebShop Login Feature

  @DemoWebShop_Login
  Scenario Outline: DemoWebShopLogin
    Given User is opened the "Chrome" browser
    Given User launches "DemoWebShop" application URL
    When User enters "<UserName>" and "<Password>" in DemoWebShop Application
    And User clicks on Login button in DemoWebShop
    Then User validates email address in DemoWebShop
    And User clicks on Logout in DemoWebShop

    Examples:
    | UserName | Password |
    | aarosagarch@gmail.com | Admin@123 |
    | Deepanshu@gmail.com | Test@123    |
    | Shreya@gmail.com | Admin@123      |