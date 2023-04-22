Feature: Edit movie

  Scenario: I need update title of the movie already registered
    Given I have movie registered
      | title        | genre    | rating |
      | Let`s code   | The best | 8      |
    When I apply update on movie
      | rating | 10  |
      | title  | Ada |
    Then found the movie in database
    And the rating equals to 10
    And The response should have status equals 200
    And the response should have rating field equals 10