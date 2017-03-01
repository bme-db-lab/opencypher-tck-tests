Feature: Create

  Scenario: Creating a node
    Given any graph
    When executing query:
      """
      CREATE ()
      """
    Then the result should be empty
    And the side effects should be:
      | +nodes | 1 |