#
# Copyright 2017 "Neo Technology",
# Network Engine for Objects in Lund AB (http://neotechnology.com)
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
# http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
#

Feature: DeleteAcceptance


  Scenario: Should support updates while merging
    Given an empty graph
    And having executed:
      """
      UNWIND [0, 1, 2] AS x
      UNWIND [0, 1, 2] AS y
      CREATE ({x: x, y: y})
      """
    When executing query:
      """
      MATCH (foo)
      WITH foo.x AS x, foo.y AS y
      MERGE (:N {x: x, y: y + 1})
      MERGE (:N {x: x, y: y})
      MERGE (:N {x: x + 1, y: y})
      RETURN x, y
      """
    Then the result should be:
      | x | y |
      | 0 | 0 |
      | 0 | 1 |
      | 0 | 2 |
      | 1 | 0 |
      | 1 | 1 |
      | 1 | 2 |
      | 2 | 0 |
      | 2 | 1 |
      | 2 | 2 |
    And the side effects should be:
      | +nodes      | 15 |
      | +labels     | 15 |
      | +properties | 30 |

  Scenario: Create a relationship with a property
    Given any graph
    When executing query:
      """
      CREATE ()-[:R {prop: 42}]->()
      """
    Then the result should be empty
    And the side effects should be:
      | +nodes         | 2 |
      | +relationships | 1 |
      | +properties    | 1 |

  Scenario: Creating a node with a property
    Given any graph
    When executing query:
      """
      CREATE ({created: true})
      """
    Then the result should be empty
    And the side effects should be:
      | +nodes      | 1 |
      | +properties | 1 |

  Scenario: Merges should not be able to match on deleted nodes
    Given an empty graph
    And having executed:
      """
      CREATE (:A {value: 1}),
        (:A {value: 2})
      """
    When executing query:
      """
      MATCH (a:A)
      DELETE a
      MERGE (a2:A)
      RETURN a2.value
      """
    Then the result should be:
      | a2.value |
      | null     |
      | null     |
    And the side effects should be:
      | +nodes  | 1 |
      | -nodes  | 2 |
      | +labels | 1 |

  Scenario: Non-existent values in a property map are removed with SET =
    Given any graph
    And having executed:
      """
      CREATE (:X {foo: 'A', bar: 'B'})
      """
    When executing query:
      """
      MATCH (n:X {foo: 'A'})
      SET n = {foo: 'B', baz: 'C'}
      RETURN n
      """
    Then the result should be:
      | n                         |
      | (:X {foo: 'B', baz: 'C'}) |
    And the side effects should be:
      | +properties | 2 |
      | -properties | 1 |

  Scenario: Using list properties via variable
    Given an empty graph
    When executing query:
      """
      CREATE (a:Foo), (b:Bar)
      WITH a, b
      UNWIND ['a,b', 'a,b'] AS str
      WITH a, b, split(str, ',') AS roles
      MERGE (a)-[r:FB {foobar: roles}]->(b)
      RETURN count(*)
      """
    Then the result should be:
      | count(*) |
      | 2        |
    And the side effects should be:
      | +nodes         | 2 |
      | +relationships | 1 |
      | +labels        | 2 |
      | +properties    | 1 |

  Scenario: Create and delete in same query
    Given an empty graph
    And having executed:
      """
      CREATE ()
      """
    When executing query:
      """
      MATCH ()
      CREATE (n)
      DELETE n
      """
    Then the result should be empty
    And the side effects should be:
      | +nodes | 1 |
      | -nodes | 1 |

