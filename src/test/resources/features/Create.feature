Feature: Create

      Scenario: `toBoolean()` on valid literal string
            Given any graph
            When executing query:
      """
      RETURN toBoolean('true') AS b
      """
            Then the result should be:
                  | foo  | empty |
                  | null | null  |
            And no side effects
