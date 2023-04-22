Feature: List movies

  Scenario: I have registered movie
    Given I have movie registered
      | title          |
      | The terminator |
    When I search the movie by title
    Then I should found "The terminator" movie
    And The response should have status equals 200

  Scenario: I don't have movie registered
    Given that I don't have the movie registered
      | title                       | rating |
      | Xuxa - Rainha dos baixinhos | 10     |
    When I search the movie by title
    Then I shouldn't found any movie
    And The response should have status equals 200