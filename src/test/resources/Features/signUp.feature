Feature: Guest should be able to sign-up as a tutor and student

  @SmokeTest
  Scenario Outline: skiedo registration as Tutor
    Given Guest am at the Registration form of "<url>"
    When Guest enter "<Firstname>", "<Lastname>", "<email>", "<password>"
    Then Guest should see the Validate email message on screen
    And The title should be verfiy you email id

    Examples: 
      | url                                 | Firstname    | Lastname    | email                     | password |
      | https://skiedo.com/tutor/register   | FTFirstName7 | FTLastname7 | rpatestuser37@yopmail.com | tester@1 |
      | https://skiedo.com/student/register | FTFirstName8 | FTLastname8 | rpatestuser38@yopmail.com | tester@1 |
