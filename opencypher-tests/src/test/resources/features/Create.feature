Feature: Create

  Scenario: Unwinding a list
    Given any graph
    When executing query:
      """
      UNWIND [1, 2, 3] AS x
      RETURN x
      """
    Then the result should be:
      | x |
      | 1 |
      | 2 |
      | 3 |
    And no side effects