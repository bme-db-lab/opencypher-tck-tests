Feature: Create

  Scenario: Creating a node
    Given any graph
    When executing query:
      """
       CREATE (n {prop: 'foo'})
       RETURN n.prop AS p
      """
    Then the result should be empty
    And the side effects should be:
          | +nodes      | 1 |
          | +properties | 1 |
