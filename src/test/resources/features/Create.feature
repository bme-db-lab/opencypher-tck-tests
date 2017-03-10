Feature: UnionAcceptance

  Scenario: Two elements, both unique, distinct
    Given an empty graph
    When executing query:
      """
      RETURN 1 AS x
      UNION
      RETURN 2 AS x
      """
    Then the result should be:
      | x |
      | 1 |
      | 2 |
    And no side effects