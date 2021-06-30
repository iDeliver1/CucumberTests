Feature: Guest should be able to log in

  @SmokeTest
  Scenario Outline: skiedo login as Tutor
    Given I am at the login form
    When I enter "<email>", "<password>"
    Then I should see the confirm email message on screen


    Examples: 
      | email                     | password |
      | rpatestuser34@yopmail.com | tester@1 |
     
