Feature: User applys filter and add products in cart


Background:
  Given  User Logins with visual_user and secret_sauce
  Then User lands on Product menu Page


  Scenario: Filtering and verifying products with prices low to high
    When user clicks on filter
    Then user will select filter as low to high
    Then verifies that the product prices are in correct order
