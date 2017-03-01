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
    "value": "CREATE ()"
  }
});
formatter.step({
  "line": 9,
  "name": "the result should be empty",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "the side effects should be:",
  "rows": [
    {
      "cells": [
        "+nodes",
        "1"
      ],
      "line": 11
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "CreateStepDefinitions.scala:17"
});
formatter.result({
  "duration": 3016552312,
  "status": "passed"
});
formatter.match({
  "location": "CreateStepDefinitions.scala:21"
});
formatter.result({
  "duration": 2899198749,
  "status": "passed"
});
formatter.match({
  "location": "CreateStepDefinitions.scala:31"
});
formatter.result({
  "duration": 15233858,
  "status": "passed"
});
formatter.match({
  "location": "CreateStepDefinitions.scala:34"
});
