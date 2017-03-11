Feature: Create

  Scenario: Combine MATCH, WITH and CREATE
    Given an empty graph
    And having executed:
      """
      CREATE (), ()
      """
    When executing query:
      """
      MATCH ()
      CREATE ()
      WITH *
      MATCH ()
      CREATE ()
      """
    Then the result should be empty
    And the side effects should be:
      | +nodes  | 10 |