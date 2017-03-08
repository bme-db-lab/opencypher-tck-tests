$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/Create.feature");
formatter.feature({
  "line": 1,
  "name": "Create",
  "description": "",
  "id": "create",
  "keyword": "Feature"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "an empty graph",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "having executed:",
  "keyword": "And ",
  "doc_string": {
    "content_type": "",
    "line": 6,
    "value": "CREATE ()"
  }
});
formatter.match({
  "location": "CreateStepDefinitions.scala:18"
});
formatter.result({
  "duration": 1970265684,
  "status": "passed"
});
formatter.match({
  "location": "CreateStepDefinitions.scala:21"
});
formatter.result({
  "duration": 2114377623,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Keeping used expression 1",
  "description": "",
  "id": "create;keeping-used-expression-1",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "executing query:",
  "keyword": "When ",
  "doc_string": {
    "content_type": "",
    "line": 12,
    "value": "MATCH (n)\r\nRETURN cOuNt( * )"
  }
});
formatter.step({
  "line": 16,
  "name": "the result should be:",
  "rows": [
    {
      "cells": [
        "cOuNt( * )"
      ],
      "line": 17
    },
    {
      "cells": [
        "1"
      ],
      "line": 18
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "no side effects",
  "keyword": "And "
});
formatter.match({
  "location": "CreateStepDefinitions.scala:24"
});
formatter.result({
  "duration": 786436715,
  "status": "passed"
});
formatter.match({
  "location": "CreateStepDefinitions.scala:34"
});
formatter.result({
  "duration": 20654378,
  "status": "passed"
});
formatter.match({
  "location": "CreateStepDefinitions.scala:37"
});
formatter.result({
  "duration": 147968,
  "status": "passed"
});
formatter.uri("features/notworking1.feature");
formatter.feature({
  "line": 1,
  "name": "Create",
  "description": "",
  "id": "create",
  "keyword": "Feature"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "an empty graph",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "having executed:",
  "keyword": "And ",
  "doc_string": {
    "content_type": "",
    "line": 7,
    "value": "CREATE (:Label {name: \u0027ABCDEF\u0027}), (:Label {name: \u0027AB\u0027}),\r\n       (:Label {name: \u0027abcdef\u0027}), (:Label {name: \u0027ab\u0027}),\r\n       (:Label {name: \u0027\u0027}), (:Label)"
  }
});
formatter.match({
  "location": "CreateStepDefinitions.scala:18"
});
formatter.result({
  "duration": 208260383,
  "status": "passed"
});
formatter.match({
  "location": "CreateStepDefinitions.scala:21"
});
formatter.result({
  "duration": 266194166,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Finding exact matches",
  "description": "",
  "id": "create;finding-exact-matches",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 14,
  "name": "executing query:",
  "keyword": "When ",
  "doc_string": {
    "content_type": "",
    "line": 15,
    "value": "MATCH (a)\r\nWHERE a.name STARTS WITH \u0027ABCDEF\u0027\r\nRETURN a"
  }
});
formatter.step({
  "line": 20,
  "name": "the result should be:",
  "rows": [
    {
      "cells": [
        "a"
      ],
      "line": 21
    },
    {
      "cells": [
        "(:Label {name: \u0027ABCDEF\u0027})"
      ],
      "line": 22
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "no side effects",
  "keyword": "And "
});
formatter.match({
  "location": "CreateStepDefinitions.scala:24"
});
formatter.result({
  "duration": 308693510,
  "status": "passed"
});
formatter.match({
  "location": "CreateStepDefinitions.scala:34"
});
formatter.result({
  "duration": 14527387,
  "error_message": "java.lang.AssertionError: assertion failed\r\n\tat scala.Predef$.assert(Predef.scala:156)\r\n\tat steps.CreateStepDefinitions$$anonfun$8.apply(CreateStepDefinitions.scala:35)\r\n\tat steps.CreateStepDefinitions$$anonfun$8.apply(CreateStepDefinitions.scala:34)\r\n\tat cucumber.api.scala.ScalaDsl$StepBody$$anonfun$apply$2.applyOrElse(ScalaDsl.scala:98)\r\n\tat cucumber.api.scala.ScalaDsl$StepBody$$anonfun$apply$2.applyOrElse(ScalaDsl.scala:96)\r\n\tat scala.runtime.AbstractPartialFunction.apply(AbstractPartialFunction.scala:36)\r\n\tat cucumber.runtime.scala.ScalaStepDefinition.execute(ScalaStepDefinition.scala:71)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\r\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:299)\r\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:91)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:93)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:37)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:98)\r\n\tat org.gradle.api.internal.tasks.testing.junit.JUnitTestClassExecuter.runTestClass(JUnitTestClassExecuter.java:114)\r\n\tat org.gradle.api.internal.tasks.testing.junit.JUnitTestClassExecuter.execute(JUnitTestClassExecuter.java:57)\r\n\tat org.gradle.api.internal.tasks.testing.junit.JUnitTestClassProcessor.processTestClass(JUnitTestClassProcessor.java:66)\r\n\tat org.gradle.api.internal.tasks.testing.SuiteTestClassProcessor.processTestClass(SuiteTestClassProcessor.java:51)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat org.gradle.internal.dispatch.ReflectionDispatch.dispatch(ReflectionDispatch.java:35)\r\n\tat org.gradle.internal.dispatch.ReflectionDispatch.dispatch(ReflectionDispatch.java:24)\r\n\tat org.gradle.internal.dispatch.ContextClassLoaderDispatch.dispatch(ContextClassLoaderDispatch.java:32)\r\n\tat org.gradle.internal.dispatch.ProxyDispatchAdapter$DispatchingInvocationHandler.invoke(ProxyDispatchAdapter.java:93)\r\n\tat com.sun.proxy.$Proxy2.processTestClass(Unknown Source)\r\n\tat org.gradle.api.internal.tasks.testing.worker.TestWorker.processTestClass(TestWorker.java:109)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat org.gradle.internal.dispatch.ReflectionDispatch.dispatch(ReflectionDispatch.java:35)\r\n\tat org.gradle.internal.dispatch.ReflectionDispatch.dispatch(ReflectionDispatch.java:24)\r\n\tat org.gradle.internal.remote.internal.hub.MessageHub$Handler.run(MessageHub.java:377)\r\n\tat org.gradle.internal.concurrent.ExecutorPolicy$CatchAndRecordFailures.onExecute(ExecutorPolicy.java:54)\r\n\tat org.gradle.internal.concurrent.StoppableExecutorImpl$1.run(StoppableExecutorImpl.java:40)\r\n\tat java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142)\r\n\tat java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617)\r\n\tat java.lang.Thread.run(Thread.java:745)\r\n\tat ✽.Then the result should be:(features/notworking1.feature:20)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "CreateStepDefinitions.scala:37"
});
formatter.result({
  "status": "skipped"
});
});