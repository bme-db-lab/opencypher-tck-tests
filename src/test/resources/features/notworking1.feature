Feature: Create


  Background:
    Given an empty graph
    And having executed:
      """
      CREATE (:Label {name: 'ABCDEF'}), (:Label {name: 'AB'}),
             (:Label {name: 'abcdef'}), (:Label {name: 'ab'}),
             (:Label {name: ''}), (:Label)
      """

  Scenario: Finding exact matches
    When executing query:
      """
      MATCH (a)
      WHERE a.name STARTS WITH 'ABCDEF'
      RETURN a
      """
    Then the result should be:
      | a                         |
      | (:Label {name: 'ABCDEF'}) |
    And no side effects