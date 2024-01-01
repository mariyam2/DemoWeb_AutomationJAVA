Feature: User logins into saucedemo website
  Scenario Outline: user logins with credentials
    Given User Logins with <uname> and <password>
    Then User lands on Product menu Page
    Examples:
      | uname        | password     |
      | visual_user  | secret_sauce |
      | visual_user  | visual_user1 |
      | Mariyam_Test | 12345        |
