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
  "name": "Creating a node",
  "description": "",
  "id": "create;creating-a-node",
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
    "value": " CREATE (n {prop: \u0027foo\u0027})\r\n RETURN n.prop AS p"
  }
});
formatter.step({
  "line": 10,
  "name": "the result should be empty",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "the side effects should be:",
  "rows": [
    {
      "cells": [
        "+nodes",
        "1"
      ],
      "line": 12
    },
    {
      "cells": [
        "+properties",
        "1"
      ],
      "line": 13
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "CreateStepDefinitions.scala:14"
});
formatter.result({
  "duration": 2626094576,
  "status": "passed"
});
formatter.match({
  "location": "CreateStepDefinitions.scala:18"
});
formatter.result({
  "duration": 3243506955,
  "status": "passed"
});
formatter.match({
  "location": "CreateStepDefinitions.scala:21"
});
formatter.result({
  "duration": 117177,
  "status": "passed"
});
formatter.match({
  "location": "CreateStepDefinitions.scala:24"
});
formatter.result({
  "duration": 33147841125,
  "status": "passed"
});
});