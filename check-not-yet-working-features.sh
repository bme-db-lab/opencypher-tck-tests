#!/bin/bash

for f in AggregationAcceptance.feature CreateAcceptance.feature DeleteAcceptance.feature EqualsAcceptance.feature ExpressionAcceptance.feature FunctionsAcceptance.feature JoinAcceptance.feature KeysAcceptance.feature LabelsAcceptance.feature LargeCreateQuery.feature ListComprehension.feature MatchAcceptance2.feature MatchAcceptance.feature MatchingSelfRelationships.feature MergeIntoAcceptance.feature MergeNodeAcceptance.feature MergeRelationshipAcceptance.feature MiscellaneousErrorAcceptance.feature NullAcceptance.feature OptionalMatchAcceptance.feature OptionalMatch.feature OrderByAcceptance.feature PathEquality.feature PatternComprehension.feature ReturnAcceptance2.feature ReturnAcceptance.feature SemanticErrorAcceptance.feature SetAcceptance.feature SkipLimitAcceptance.feature StartingPointAcceptance.feature StartsWithAcceptance.feature SyntaxErrorAcceptance.feature TernaryLogicAcceptance.feature TriadicSelection.feature TypeConversionFunctions.feature UnionAcceptance.feature UnwindAcceptance.feature VarLengthAcceptance2.feature VarLengthAcceptance.feature WhereAcceptance.feature WithAcceptance.feature; do

  cp opencypher-tests/src/cucumberTest/resources/features-not-yet-working/$f opencypher-tests/src/cucumberTest/resources/features

  rm -rf opencypher-tests/build/reports/cucumberTest/
  ./gradlew cucumberT
  if [[ -z "opencypher-tests/build/reports/cucumberTest" ]]; then
    # it was working
    rm opencypher-tests/src/cucumberTest/resources/features-not-yet-working/$f
  else
    # it wasn't working after all
    rm opencypher-tests/src/cucumberTest/resources/features/$f
  fi
done;
