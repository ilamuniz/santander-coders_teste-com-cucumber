Feature: Register new tasks

  Scenario: I want to register a new task with status OPEN
    Given I want to register a new task
      | title               | status | user    |
      | Medical appointment | OPEN   | Michael |
    When I register the task
    Then found the task in database
    And The response should have status equals 201

  Scenario: I want to register a new task with status CLOSE
    Given I want to register a new task
      | title                | status | user  |
      | Take cat to pet shop | CLOSE  | Aimee |
    When I register the task
    Then not found the task in database
    And The response should have status equals 400

  Scenario: I want to register a new task without user
    Given I want to register a new task
      | title               | status | user  |
      | Pay the light bill  | OPEN   |       |
    When I register the task
    Then not found the task in database
    And The response should have status equals 400

  Scenario: I want to register a new task without title
    Given I want to register a new task
      | title   | status | user  |
      |         | OPEN   | Alice |
    When I register the task
    Then not found the task in database
    And The response should have status equals 400