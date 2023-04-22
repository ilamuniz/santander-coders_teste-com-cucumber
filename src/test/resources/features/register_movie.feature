Feature: Register new movies

  Scenario: The movie was not registered
    Given that I don't have the movie registered
      | title           | rating |
      | The good father | 10     |
    When I register de the movie
    Then found the movie in database
    And The response should have status equals 201

  Scenario: Try register movie with rating equals 15
    Given that I don't have the movie registered
      | title              | rating |
      | The good father II | 15     |
    When I register de the movie
    Then the movie was not found in database
    And The response should have status equals 400