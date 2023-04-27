Feature: Edit tasks

  Scenario: I want to add a description in an existing task
    Given I have a task registered
      | title               | status | user    |
      | Medical appointment | OPEN   | Michael |
    When I edit the task
      | description      | Medical care |
    Then The task is found in database
    And The task description should be "Medical care"
    And The response status is 200

  Scenario: I want to edit the user of an existing task
    Given I have a task registered
      | title                | description   | status    | userId    |
      | Medical appointment  | Medical care  | OPEN      | Michael   |
    When I edit the task
      | userId    | Emile  |
    Then The task is found in database
    And The userId should be Emile
    And The response status is 200

  Scenario: I want to finish a task
    Given I have a task registered
      | title                | description   | status    | userId  |
      | Medical appointment  | Medical care  | OPEN      | Emile   |
    When I edit the task
      | status    | CLOSE  |
    Then The task is found in database
    And The task status should be "CLOSE"
    And The response status is 200

  Scenario: I want to reopen a closed task
    Given I have a task registered
      | title                | description   | status    | userId  |
      | Medical appointment  | Medical care  | CLOSE     | Emile   |
    When I edit the task
      | status      | OPEN        |
    Then The task is found in database
    And The task status should be "CLOSE"
    And The close date should be found
    And The response status is 422
    And The error message should be "Task already close"