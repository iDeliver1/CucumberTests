Feature: Tutor should be able to navigate different pages from dahsboard

  Background: 
    Given Tutor at the dashboard page

  @SmokeTest
  Scenario Outline: Tutor should be able to view notifications page
   
    When Tutor should click   "<TabValue>"
    Then Tutor should see the notifications Page
    And Tutuor is on Notification Page

    Examples: 
      | Link                                   | TabValue      |
      | https://skiedo.com/tutor/notifications | Notifications |

  @SmokeTest
  Scenario Outline: Tutor should be able to view chats page
    
    When Tutor should click Chat Page  "<TabValue>"
    Then Tutor should see the chats Page

    Examples: 
      | TabValue |
      | Chats    |

  @SmokeTest
  Scenario Outline: Tutor should be able to view my earnings page
   
    When Tutor should click   my earnings Page "<TabValue>"
    Then Tutor should see the my earnings Page

    Examples: 
      | TabValue    |
      | My Earnings |

  @SmokeTest
  Scenario Outline: Tutor should be able to view my basic information page
  
    When Tutor should click  my basic information Page "<TabValue>"
    Then Tutor should see the my basic information Page

    Examples: 
      | TabValue             |
      | My Basic Information |

  @SmokeTest
  Scenario Outline: Tutor should be able to view tutoring preferences page

    When Tutor should click  my tutoring preferences Page "<TabValue>"
    Then Tutor should see the my tutoring preferences Page

    Examples: 
      | TabValue             |
      | Tutoring Preferences |
