Feature: Create

  Background:
    Given an empty graph
    And having executed:
      """
      CREATE ()
      """

  Scenario: Keeping used expression 1
    When executing query:
      """
      MATCH (n)
      RETURN cOuNt( * )
      """
    Then the result should be:
      | cOuNt( * ) |
      | 1          |
    And no side effects