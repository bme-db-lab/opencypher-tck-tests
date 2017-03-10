$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/Create.feature");
formatter.feature({
  "line": 1,
  "name": "UnionAcceptance",
  "description": "",
  "id": "unionacceptance",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Two elements, both unique, distinct",
  "description": "",
  "id": "unionacceptance;two-elements,-both-unique,-distinct",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "an empty graph",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "executing query:",
  "keyword": "When ",
  "doc_string": {
    "content_type": "",
    "line": 6,
    "value": "RETURN 1 AS x\r\nUNION\r\nRETURN 2 AS x"
  }
});
formatter.step({
  "line": 11,
  "name": "the result should be:",
  "rows": [
    {
      "cells": [
        "x"
      ],
      "line": 12
    },
    {
      "cells": [
        "1"
      ],
      "line": 13
    },
    {
      "cells": [
        "2"
      ],
      "line": 14
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "no side effects",
  "keyword": "And "
});
formatter.match({
  "location": "CreateStepDefinitions.scala:18"
});
formatter.result({
  "duration": 2659620091,
  "status": "passed"
});
formatter.match({
  "location": "CreateStepDefinitions.scala:24"
});
formatter.result({
  "duration": 2776762720,
  "status": "passed"
});
formatter.match({
  "location": "CreateStepDefinitions.scala:34"
});
formatter.result({
  "duration": 6907874,
  "status": "passed"
});
formatter.match({
  "location": "CreateStepDefinitions.scala:37"
});
formatter.result({
  "duration": 769347,
  "status": "passed"
});
});