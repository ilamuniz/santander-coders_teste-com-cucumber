Feature: I'm already had aet
  Scenario: After eat
    Given After eat my dinner
    When I find my dessert
    And I found "Ice cream pot"
    And I open pot and the content was "ice cream"
    Then I'm very happy now

  Scenario: After eat my dinner I need a ice cream
    Given After eat my dinner
    When I find my dessert
    And  I found "Ice cream pot"
    And I open pot and the content was "bean"
    Then I'm very sad now

  Scenario: After eat - I need a dessert
    Given After eat my dinner
    When I find my dessert
    And I found "Pie"
    Then I aet "Pie"