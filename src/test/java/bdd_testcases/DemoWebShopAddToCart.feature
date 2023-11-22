@All @DemoWebShop
Feature: DemoWebShop Add To Cart functionality multiple products

  @DemoWebShop_PlaceOrder
  Scenario Outline: DemoWebShop Add To Cart
    Given User is opened the "Chrome" browser
    Given User launches "DemoWebShop" application URL
    When User enters "<UserName>" and "<Password>" in DemoWebShop Application
    And User clicks on Login button in DemoWebShop
    Then User validates email address in DemoWebShop
    When User selects productCategory and Product into Shopping Cart
        | ProductCategory | ProductName |
        | Books           | Computing and Internet |
        | Apparel & Shoes | Blue Jeans |
        | Digital downloads | 3rd Album |
    And User clicks on Shopping Cart link in DemoWebShop
    And User Clicks on checkout button by accepting terms
    And User place the Order with Default values in DemoWebShop
    Then User clicks on Logout in DemoWebShop

    Examples:
      | UserName | Password |
      | aarosagarch@gmail.com | Admin@123 |
      | Deepanshu@gmail.com | Test@123    |
      | Shreya@gmail.com | Admin@123      |