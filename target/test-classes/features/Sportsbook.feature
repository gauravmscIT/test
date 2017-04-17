@acceptance_test
Feature: William Hill Sports Book

  Scenario Outline: User can place a bet on an event
    Given I am on sports book page
    And I login with username "WHATA_FOG2" and password "F0gUaTtest"
    When I select a "<event>" event
    And I select the first active selection
    And I place a bet of "0.05"
    Then the bet should be successfully placed
    Examples: Events for selection
      | event    |
      | Football |
      | Tennis   |


#    Used CommonSteps.java for logging out after every scenario



