Feature: I'm hungry
  Scenario: Eating a few pasta is no problem
    Given William is hungry
    When  William eats pasta
    Then William will be full

  Scenario: Don't eating anything
    Given William is hungry
    When William don't eats anything
    Then William will be hungry tonight