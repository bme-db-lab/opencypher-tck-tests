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

Feature: SemanticErrorAcceptance

  Background:
    Given any graph

   Scenario: Handling property access on the Any type
    When executing query:
      """
      WITH [{prop: 0}, 1] AS list
      RETURN (list[0]).prop
      """
    Then the result should be:
      | (list[0]).prop |
      | 0              |
    And no side effects
