# Known errors
### Comparability 
`org.neo4j.graphdb.QueryExecutionException: Don't know how to compare that. Left: 0 (Long); Right: "x" (String)`
### LargeIntegerEquality
`java.lang.RuntimeException: Error during cypher parse, the first error was: For input string: "4611686018427387905"`
### Literals
`scala.MatchError: ingraph.cucumber.featureresult.featureResults.impl.FloatingPointImpl@3cee89dc (value: 1.0, isInfinity: false) (of class ingraph.cucumber.featureresult.featureResults.impl.FloatingPointImpl)`

`java.lang.RuntimeException: Error during cypher parse, the first error was: no viable alternative at input '-'`

`java.lang.NullPointerException`
### MatchingSelfRelationships
Different result at Scenario: Counting directed self-relationships
Expected: 1
Actual: 2
### MergeIntoAcceptance
Different result at Scenario: Null-setting one property with ON CREATE

Expected: []

Actual: 

`java.lang.NullPointerException`
### MergeNodeAcceptance
Different side effects at Scenario: Should be able to use properties from match in ON MATCH and ON CREATE

Expected: + properties 2

Actual: + properties 1
### OptionalMatchAcceptance
`java.lang.NullPointerException`
### PatternComprehension
`org.neo4j.driver.v1.exceptions.ClientException: Unable to convert org.neo4j.kernel.impl.core.NodeProxy to Neo4j Value.`

`java.lang.NullPointerException`
