$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/Create.feature");
formatter.feature({
  "line": 1,
  "name": "Create",
  "description": "",
  "id": "create",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "`toBoolean()` on valid literal string",
  "description": "",
  "id": "create;`toboolean()`-on-valid-literal-string",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "any graph",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "executing query:",
  "keyword": "When ",
  "doc_string": {
    "content_type": "",
    "line": 6,
    "value": "RETURN toBoolean(\u0027true\u0027) AS b"
  }
});
formatter.step({
  "line": 9,
  "name": "the result should be:",
  "rows": [
    {
      "cells": [
        "foo",
        "empty"
      ],
      "line": 10
    },
    {
      "cells": [
        "null",
        "null"
      ],
      "line": 11
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "no side effects",
  "keyword": "And "
});
formatter.match({
  "location": "CreateStepDefinitions.scala:14"
});
formatter.result({
  "duration": 2742780801,
  "status": "passed"
});
formatter.match({
  "location": "CreateStepDefinitions.scala:18"
});
formatter.result({
  "duration": 3585550996,
  "status": "passed"
});
formatter.match({
  "location": "CreateStepDefinitions.scala:28"
});
formatter.result({
  "duration": 25105331,
  "status": "passed"
});
formatter.match({
  "location": "CreateStepDefinitions.scala:32"
});
formatter.result({
  "duration": 144118,
  "status": "passed"
});
});