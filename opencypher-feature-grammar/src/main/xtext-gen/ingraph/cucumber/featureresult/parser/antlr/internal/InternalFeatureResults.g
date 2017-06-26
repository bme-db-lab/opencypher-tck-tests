/*
 * generated by Xtext 2.10.0
 */
grammar InternalFeatureResults;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package ingraph.cucumber.featureresult.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package ingraph.cucumber.featureresult.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import ingraph.cucumber.featureresult.services.FeatureResultsGrammarAccess;

}

@parser::members {

 	private FeatureResultsGrammarAccess grammarAccess;

    public InternalFeatureResultsParser(TokenStream input, FeatureResultsGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "FeatureValue";
   	}

   	@Override
   	protected FeatureResultsGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleFeatureValue
entryRuleFeatureValue returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFeatureValueRule()); }
	iv_ruleFeatureValue=ruleFeatureValue
	{ $current=$iv_ruleFeatureValue.current; }
	EOF;

// Rule FeatureValue
ruleFeatureValue returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getFeatureValueAccess().getNodeParserRuleCall_0());
		}
		this_Node_0=ruleNode
		{
			$current = $this_Node_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getFeatureValueAccess().getRelationshipParserRuleCall_1());
		}
		this_Relationship_1=ruleRelationship
		{
			$current = $this_Relationship_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getFeatureValueAccess().getPathParserRuleCall_2());
		}
		this_Path_2=rulePath
		{
			$current = $this_Path_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getFeatureValueAccess().getIntegerParserRuleCall_3());
		}
		this_Integer_3=ruleInteger
		{
			$current = $this_Integer_3.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getFeatureValueAccess().getFloatingPointParserRuleCall_4());
		}
		this_FloatingPoint_4=ruleFloatingPoint
		{
			$current = $this_FloatingPoint_4.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getFeatureValueAccess().getMyStringParserRuleCall_5());
		}
		this_MyString_5=ruleMyString
		{
			$current = $this_MyString_5.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getFeatureValueAccess().getBoolParserRuleCall_6());
		}
		this_Bool_6=ruleBool
		{
			$current = $this_Bool_6.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getFeatureValueAccess().getNullValueParserRuleCall_7());
		}
		this_NullValue_7=ruleNullValue
		{
			$current = $this_NullValue_7.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getFeatureValueAccess().getListParserRuleCall_8());
		}
		this_List_8=ruleList
		{
			$current = $this_List_8.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getFeatureValueAccess().getMapParserRuleCall_9());
		}
		this_Map_9=ruleMap
		{
			$current = $this_Map_9.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleNode
entryRuleNode returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNodeRule()); }
	iv_ruleNode=ruleNode
	{ $current=$iv_ruleNode.current; }
	EOF;

// Rule Node
ruleNode returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	{
		newCompositeNode(grammarAccess.getNodeAccess().getNodeDescParserRuleCall());
	}
	this_NodeDesc_0=ruleNodeDesc
	{
		$current = $this_NodeDesc_0.current;
		afterParserOrEnumRuleCall();
	}
;

// Entry rule entryRuleNodeDesc
entryRuleNodeDesc returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNodeDescRule()); }
	iv_ruleNodeDesc=ruleNodeDesc
	{ $current=$iv_ruleNodeDesc.current; }
	EOF;

// Rule NodeDesc
ruleNodeDesc returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getNodeDescAccess().getNodeDescAction_0(),
					$current);
			}
		)
		otherlv_1='('
		{
			newLeafNode(otherlv_1, grammarAccess.getNodeDescAccess().getLeftParenthesisKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getNodeDescAccess().getLabelsLabelParserRuleCall_2_0());
				}
				lv_labels_2_0=ruleLabel
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getNodeDescRule());
					}
					add(
						$current,
						"labels",
						lv_labels_2_0,
						"ingraph.cucumber.featureresult.FeatureResults.Label");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getNodeDescAccess().getPropertyMapPropertyMapParserRuleCall_3_0());
				}
				lv_propertyMap_3_0=rulePropertyMap
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getNodeDescRule());
					}
					set(
						$current,
						"propertyMap",
						lv_propertyMap_3_0,
						"ingraph.cucumber.featureresult.FeatureResults.PropertyMap");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		otherlv_4=')'
		{
			newLeafNode(otherlv_4, grammarAccess.getNodeDescAccess().getRightParenthesisKeyword_4());
		}
	)
;

// Entry rule entryRuleRelationship
entryRuleRelationship returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRelationshipRule()); }
	iv_ruleRelationship=ruleRelationship
	{ $current=$iv_ruleRelationship.current; }
	EOF;

// Rule Relationship
ruleRelationship returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	{
		newCompositeNode(grammarAccess.getRelationshipAccess().getRelationshipDescParserRuleCall());
	}
	this_RelationshipDesc_0=ruleRelationshipDesc
	{
		$current = $this_RelationshipDesc_0.current;
		afterParserOrEnumRuleCall();
	}
;

// Entry rule entryRuleRelationshipDesc
entryRuleRelationshipDesc returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRelationshipDescRule()); }
	iv_ruleRelationshipDesc=ruleRelationshipDesc
	{ $current=$iv_ruleRelationshipDesc.current; }
	EOF;

// Rule RelationshipDesc
ruleRelationshipDesc returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getRelationshipDescAccess().getRelationshipDescAction_0(),
					$current);
			}
		)
		otherlv_1='['
		{
			newLeafNode(otherlv_1, grammarAccess.getRelationshipDescAccess().getLeftSquareBracketKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getRelationshipDescAccess().getTypeRelationshipTypeParserRuleCall_2_0());
				}
				lv_type_2_0=ruleRelationshipType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRelationshipDescRule());
					}
					set(
						$current,
						"type",
						lv_type_2_0,
						"ingraph.cucumber.featureresult.FeatureResults.RelationshipType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getRelationshipDescAccess().getPropertyMapPropertyMapParserRuleCall_3_0());
				}
				lv_propertyMap_3_0=rulePropertyMap
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRelationshipDescRule());
					}
					set(
						$current,
						"propertyMap",
						lv_propertyMap_3_0,
						"ingraph.cucumber.featureresult.FeatureResults.PropertyMap");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		otherlv_4=']'
		{
			newLeafNode(otherlv_4, grammarAccess.getRelationshipDescAccess().getRightSquareBracketKeyword_4());
		}
	)
;

// Entry rule entryRulePath
entryRulePath returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPathRule()); }
	iv_rulePath=rulePath
	{ $current=$iv_rulePath.current; }
	EOF;

// Rule Path
rulePath returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<'
		{
			newLeafNode(otherlv_0, grammarAccess.getPathAccess().getLessThanSignKeyword_0());
		}
		{
			newCompositeNode(grammarAccess.getPathAccess().getPathBodyParserRuleCall_1());
		}
		this_PathBody_1=rulePathBody
		{
			$current = $this_PathBody_1.current;
			afterParserOrEnumRuleCall();
		}
		otherlv_2='>'
		{
			newLeafNode(otherlv_2, grammarAccess.getPathAccess().getGreaterThanSignKeyword_2());
		}
	)
;

// Entry rule entryRulePathBody
entryRulePathBody returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPathBodyRule()); }
	iv_rulePathBody=rulePathBody
	{ $current=$iv_rulePathBody.current; }
	EOF;

// Rule PathBody
rulePathBody returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getPathBodyAccess().getNodeNodeDescParserRuleCall_0_0());
				}
				lv_node_0_0=ruleNodeDesc
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPathBodyRule());
					}
					set(
						$current,
						"node",
						lv_node_0_0,
						"ingraph.cucumber.featureresult.FeatureResults.NodeDesc");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getPathBodyAccess().getPathLinksPathLinkParserRuleCall_1_0());
				}
				lv_pathLinks_1_0=rulePathLink
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPathBodyRule());
					}
					add(
						$current,
						"pathLinks",
						lv_pathLinks_1_0,
						"ingraph.cucumber.featureresult.FeatureResults.PathLink");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRulePathLink
entryRulePathLink returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPathLinkRule()); }
	iv_rulePathLink=rulePathLink
	{ $current=$iv_rulePathLink.current; }
	EOF;

// Rule PathLink
rulePathLink returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getPathLinkAccess().getPathLinkAction_0(),
					$current);
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getPathLinkAccess().getRelationshipDirectedRelationshipParserRuleCall_1_0());
				}
				lv_relationship_1_0=ruleDirectedRelationship
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPathLinkRule());
					}
					set(
						$current,
						"relationship",
						lv_relationship_1_0,
						"ingraph.cucumber.featureresult.FeatureResults.DirectedRelationship");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getPathLinkAccess().getNodeNodeDescParserRuleCall_2_0());
				}
				lv_node_2_0=ruleNodeDesc
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPathLinkRule());
					}
					set(
						$current,
						"node",
						lv_node_2_0,
						"ingraph.cucumber.featureresult.FeatureResults.NodeDesc");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleDirectedRelationship
entryRuleDirectedRelationship returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDirectedRelationshipRule()); }
	iv_ruleDirectedRelationship=ruleDirectedRelationship
	{ $current=$iv_ruleDirectedRelationship.current; }
	EOF;

// Rule DirectedRelationship
ruleDirectedRelationship returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getDirectedRelationshipAccess().getForwardsRelationshipParserRuleCall_0());
		}
		this_ForwardsRelationship_0=ruleForwardsRelationship
		{
			$current = $this_ForwardsRelationship_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getDirectedRelationshipAccess().getBackwardsRelationshipParserRuleCall_1());
		}
		this_BackwardsRelationship_1=ruleBackwardsRelationship
		{
			$current = $this_BackwardsRelationship_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleForwardsRelationship
entryRuleForwardsRelationship returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getForwardsRelationshipRule()); }
	iv_ruleForwardsRelationship=ruleForwardsRelationship
	{ $current=$iv_ruleForwardsRelationship.current; }
	EOF;

// Rule ForwardsRelationship
ruleForwardsRelationship returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getForwardsRelationshipAccess().getForwardsRelationshipAction_0(),
					$current);
			}
		)
		otherlv_1='-'
		{
			newLeafNode(otherlv_1, grammarAccess.getForwardsRelationshipAccess().getHyphenMinusKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getForwardsRelationshipAccess().getRelationshipDescRelationshipDescParserRuleCall_2_0());
				}
				lv_relationshipDesc_2_0=ruleRelationshipDesc
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getForwardsRelationshipRule());
					}
					set(
						$current,
						"relationshipDesc",
						lv_relationshipDesc_2_0,
						"ingraph.cucumber.featureresult.FeatureResults.RelationshipDesc");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='->'
		{
			newLeafNode(otherlv_3, grammarAccess.getForwardsRelationshipAccess().getHyphenMinusGreaterThanSignKeyword_3());
		}
	)
;

// Entry rule entryRuleBackwardsRelationship
entryRuleBackwardsRelationship returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBackwardsRelationshipRule()); }
	iv_ruleBackwardsRelationship=ruleBackwardsRelationship
	{ $current=$iv_ruleBackwardsRelationship.current; }
	EOF;

// Rule BackwardsRelationship
ruleBackwardsRelationship returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getBackwardsRelationshipAccess().getBackwardsRelationshipAction_0(),
					$current);
			}
		)
		otherlv_1='<-'
		{
			newLeafNode(otherlv_1, grammarAccess.getBackwardsRelationshipAccess().getLessThanSignHyphenMinusKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getBackwardsRelationshipAccess().getRelationshipDescRelationshipDescParserRuleCall_2_0());
				}
				lv_relationshipDesc_2_0=ruleRelationshipDesc
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getBackwardsRelationshipRule());
					}
					set(
						$current,
						"relationshipDesc",
						lv_relationshipDesc_2_0,
						"ingraph.cucumber.featureresult.FeatureResults.RelationshipDesc");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='-'
		{
			newLeafNode(otherlv_3, grammarAccess.getBackwardsRelationshipAccess().getHyphenMinusKeyword_3());
		}
	)
;

// Entry rule entryRuleFloatingPoint
entryRuleFloatingPoint returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFloatingPointRule()); }
	iv_ruleFloatingPoint=ruleFloatingPoint
	{ $current=$iv_ruleFloatingPoint.current; }
	EOF;

// Rule FloatingPoint
ruleFloatingPoint returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_value_0_0=RULE_FLOAT
				{
					newLeafNode(lv_value_0_0, grammarAccess.getFloatingPointAccess().getValueFLOATTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFloatingPointRule());
					}
					setWithLastConsumed(
						$current,
						"value",
						lv_value_0_0,
						"ingraph.cucumber.featureresult.FeatureResults.FLOAT");
				}
			)
		)
		    |
		(
			(
				lv_isInfinity_1_0=RULE_INFINITY
				{
					newLeafNode(lv_isInfinity_1_0, grammarAccess.getFloatingPointAccess().getIsInfinityINFINITYTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFloatingPointRule());
					}
					setWithLastConsumed(
						$current,
						"isInfinity",
						true,
						"ingraph.cucumber.featureresult.FeatureResults.INFINITY");
				}
			)
		)
	)
;

// Entry rule entryRuleBool
entryRuleBool returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBoolRule()); }
	iv_ruleBool=ruleBool
	{ $current=$iv_ruleBool.current; }
	EOF;

// Rule Bool
ruleBool returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getBoolAccess().getBoolAction_0(),
					$current);
			}
		)
		(
			(
				(
					lv_value_1_1='true'
					{
						newLeafNode(lv_value_1_1, grammarAccess.getBoolAccess().getValueTrueKeyword_1_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getBoolRule());
						}
						setWithLastConsumed($current, "value", lv_value_1_1, null);
					}
					    |
					lv_value_1_2='false'
					{
						newLeafNode(lv_value_1_2, grammarAccess.getBoolAccess().getValueFalseKeyword_1_0_1());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getBoolRule());
						}
						setWithLastConsumed($current, "value", lv_value_1_2, null);
					}
				)
			)
		)
	)
;

// Entry rule entryRuleNullValue
entryRuleNullValue returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNullValueRule()); }
	iv_ruleNullValue=ruleNullValue
	{ $current=$iv_ruleNullValue.current; }
	EOF;

// Rule NullValue
ruleNullValue returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getNullValueAccess().getNullValueAction_0(),
					$current);
			}
		)
		otherlv_1='null'
		{
			newLeafNode(otherlv_1, grammarAccess.getNullValueAccess().getNullKeyword_1());
		}
	)
;

// Entry rule entryRuleList
entryRuleList returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getListRule()); }
	iv_ruleList=ruleList
	{ $current=$iv_ruleList.current; }
	EOF;

// Rule List
ruleList returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getListAccess().getListAction_0(),
					$current);
			}
		)
		otherlv_1='['
		{
			newLeafNode(otherlv_1, grammarAccess.getListAccess().getLeftSquareBracketKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getListAccess().getListContentsListContentsParserRuleCall_2_0());
				}
				lv_listContents_2_0=ruleListContents
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getListRule());
					}
					set(
						$current,
						"listContents",
						lv_listContents_2_0,
						"ingraph.cucumber.featureresult.FeatureResults.ListContents");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		otherlv_3=']'
		{
			newLeafNode(otherlv_3, grammarAccess.getListAccess().getRightSquareBracketKeyword_3());
		}
	)
;

// Entry rule entryRuleListContents
entryRuleListContents returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getListContentsRule()); }
	iv_ruleListContents=ruleListContents
	{ $current=$iv_ruleListContents.current; }
	EOF;

// Rule ListContents
ruleListContents returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getListContentsAccess().getListContentsListElementParserRuleCall_0_0());
				}
				lv_listContents_0_0=ruleListElement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getListContentsRule());
					}
					add(
						$current,
						"listContents",
						lv_listContents_0_0,
						"ingraph.cucumber.featureresult.FeatureResults.ListElement");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_1=','
			{
				newLeafNode(otherlv_1, grammarAccess.getListContentsAccess().getCommaKeyword_1_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getListContentsAccess().getListContentsListElementParserRuleCall_1_1_0());
					}
					lv_listContents_2_0=ruleListElement
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getListContentsRule());
						}
						add(
							$current,
							"listContents",
							lv_listContents_2_0,
							"ingraph.cucumber.featureresult.FeatureResults.ListElement");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleListElement
entryRuleListElement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getListElementRule()); }
	iv_ruleListElement=ruleListElement
	{ $current=$iv_ruleListElement.current; }
	EOF;

// Rule ListElement
ruleListElement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	{
		newCompositeNode(grammarAccess.getListElementAccess().getFeatureValueParserRuleCall());
	}
	this_FeatureValue_0=ruleFeatureValue
	{
		$current = $this_FeatureValue_0.current;
		afterParserOrEnumRuleCall();
	}
;

// Entry rule entryRuleMap
entryRuleMap returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMapRule()); }
	iv_ruleMap=ruleMap
	{ $current=$iv_ruleMap.current; }
	EOF;

// Rule Map
ruleMap returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	{
		newCompositeNode(grammarAccess.getMapAccess().getPropertyMapParserRuleCall());
	}
	this_PropertyMap_0=rulePropertyMap
	{
		$current = $this_PropertyMap_0.current;
		afterParserOrEnumRuleCall();
	}
;

// Entry rule entryRulePropertyMap
entryRulePropertyMap returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPropertyMapRule()); }
	iv_rulePropertyMap=rulePropertyMap
	{ $current=$iv_rulePropertyMap.current; }
	EOF;

// Rule PropertyMap
rulePropertyMap returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getPropertyMapAccess().getPropertyMapAction_0(),
					$current);
			}
		)
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getPropertyMapAccess().getLeftCurlyBracketKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getPropertyMapAccess().getMapContentsMapContentsParserRuleCall_2_0());
				}
				lv_mapContents_2_0=ruleMapContents
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPropertyMapRule());
					}
					set(
						$current,
						"mapContents",
						lv_mapContents_2_0,
						"ingraph.cucumber.featureresult.FeatureResults.MapContents");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		otherlv_3='}'
		{
			newLeafNode(otherlv_3, grammarAccess.getPropertyMapAccess().getRightCurlyBracketKeyword_3());
		}
	)
;

// Entry rule entryRuleMapContents
entryRuleMapContents returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMapContentsRule()); }
	iv_ruleMapContents=ruleMapContents
	{ $current=$iv_ruleMapContents.current; }
	EOF;

// Rule MapContents
ruleMapContents returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getMapContentsAccess().getKeyValuePairsKeyValuePairParserRuleCall_0_0());
				}
				lv_keyValuePairs_0_0=ruleKeyValuePair
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMapContentsRule());
					}
					add(
						$current,
						"keyValuePairs",
						lv_keyValuePairs_0_0,
						"ingraph.cucumber.featureresult.FeatureResults.KeyValuePair");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_1=','
			{
				newLeafNode(otherlv_1, grammarAccess.getMapContentsAccess().getCommaKeyword_1_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getMapContentsAccess().getKeyValuePairsKeyValuePairParserRuleCall_1_1_0());
					}
					lv_keyValuePairs_2_0=ruleKeyValuePair
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getMapContentsRule());
						}
						add(
							$current,
							"keyValuePairs",
							lv_keyValuePairs_2_0,
							"ingraph.cucumber.featureresult.FeatureResults.KeyValuePair");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleKeyValuePair
entryRuleKeyValuePair returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getKeyValuePairRule()); }
	iv_ruleKeyValuePair=ruleKeyValuePair
	{ $current=$iv_ruleKeyValuePair.current; }
	EOF;

// Rule KeyValuePair
ruleKeyValuePair returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getKeyValuePairAccess().getKeyPropertyKeyParserRuleCall_0_0());
				}
				lv_key_0_0=rulePropertyKey
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getKeyValuePairRule());
					}
					set(
						$current,
						"key",
						lv_key_0_0,
						"ingraph.cucumber.featureresult.FeatureResults.PropertyKey");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_1=':'
		{
			newLeafNode(otherlv_1, grammarAccess.getKeyValuePairAccess().getColonKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getKeyValuePairAccess().getValuePropertyValueParserRuleCall_2_0());
				}
				lv_value_2_0=rulePropertyValue
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getKeyValuePairRule());
					}
					set(
						$current,
						"value",
						lv_value_2_0,
						"ingraph.cucumber.featureresult.FeatureResults.PropertyValue");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRulePropertyKey
entryRulePropertyKey returns [String current=null]:
	{ newCompositeNode(grammarAccess.getPropertyKeyRule()); }
	iv_rulePropertyKey=rulePropertyKey
	{ $current=$iv_rulePropertyKey.current.getText(); }
	EOF;

// Rule PropertyKey
rulePropertyKey returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	{
		newCompositeNode(grammarAccess.getPropertyKeyAccess().getSYMBOLIC_NAMEParserRuleCall());
	}
	this_SYMBOLIC_NAME_0=ruleSYMBOLIC_NAME
	{
		$current.merge(this_SYMBOLIC_NAME_0);
	}
	{
		afterParserOrEnumRuleCall();
	}
;

// Entry rule entryRulePropertyValue
entryRulePropertyValue returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPropertyValueRule()); }
	iv_rulePropertyValue=rulePropertyValue
	{ $current=$iv_rulePropertyValue.current; }
	EOF;

// Rule PropertyValue
rulePropertyValue returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	{
		newCompositeNode(grammarAccess.getPropertyValueAccess().getFeatureValueParserRuleCall());
	}
	this_FeatureValue_0=ruleFeatureValue
	{
		$current = $this_FeatureValue_0.current;
		afterParserOrEnumRuleCall();
	}
;

// Entry rule entryRuleRelationshipType
entryRuleRelationshipType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRelationshipTypeRule()); }
	iv_ruleRelationshipType=ruleRelationshipType
	{ $current=$iv_ruleRelationshipType.current; }
	EOF;

// Rule RelationshipType
ruleRelationshipType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0=':'
		{
			newLeafNode(otherlv_0, grammarAccess.getRelationshipTypeAccess().getColonKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getRelationshipTypeAccess().getNameRelationshipTypeNameParserRuleCall_1_0());
				}
				lv_name_1_0=ruleRelationshipTypeName
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRelationshipTypeRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"ingraph.cucumber.featureresult.FeatureResults.RelationshipTypeName");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleRelationshipTypeName
entryRuleRelationshipTypeName returns [String current=null]:
	{ newCompositeNode(grammarAccess.getRelationshipTypeNameRule()); }
	iv_ruleRelationshipTypeName=ruleRelationshipTypeName
	{ $current=$iv_ruleRelationshipTypeName.current.getText(); }
	EOF;

// Rule RelationshipTypeName
ruleRelationshipTypeName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	{
		newCompositeNode(grammarAccess.getRelationshipTypeNameAccess().getSYMBOLIC_NAMEParserRuleCall());
	}
	this_SYMBOLIC_NAME_0=ruleSYMBOLIC_NAME
	{
		$current.merge(this_SYMBOLIC_NAME_0);
	}
	{
		afterParserOrEnumRuleCall();
	}
;

// Entry rule entryRuleLabel
entryRuleLabel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLabelRule()); }
	iv_ruleLabel=ruleLabel
	{ $current=$iv_ruleLabel.current; }
	EOF;

// Rule Label
ruleLabel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0=':'
		{
			newLeafNode(otherlv_0, grammarAccess.getLabelAccess().getColonKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getLabelAccess().getNameLabelNameParserRuleCall_1_0());
				}
				lv_name_1_0=ruleLabelName
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getLabelRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"ingraph.cucumber.featureresult.FeatureResults.LabelName");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleLabelName
entryRuleLabelName returns [String current=null]:
	{ newCompositeNode(grammarAccess.getLabelNameRule()); }
	iv_ruleLabelName=ruleLabelName
	{ $current=$iv_ruleLabelName.current.getText(); }
	EOF;

// Rule LabelName
ruleLabelName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	{
		newCompositeNode(grammarAccess.getLabelNameAccess().getSYMBOLIC_NAMEParserRuleCall());
	}
	this_SYMBOLIC_NAME_0=ruleSYMBOLIC_NAME
	{
		$current.merge(this_SYMBOLIC_NAME_0);
	}
	{
		afterParserOrEnumRuleCall();
	}
;

// Entry rule entryRuleInteger
entryRuleInteger returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getIntegerRule()); }
	iv_ruleInteger=ruleInteger
	{ $current=$iv_ruleInteger.current; }
	EOF;

// Rule Integer
ruleInteger returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_value_0_0=RULE_INT
			{
				newLeafNode(lv_value_0_0, grammarAccess.getIntegerAccess().getValueINTTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getIntegerRule());
				}
				setWithLastConsumed(
					$current,
					"value",
					lv_value_0_0,
					"org.eclipse.xtext.common.Terminals.INT");
			}
		)
	)
;

// Entry rule entryRuleSYMBOLIC_NAME
entryRuleSYMBOLIC_NAME returns [String current=null]:
	{ newCompositeNode(grammarAccess.getSYMBOLIC_NAMERule()); }
	iv_ruleSYMBOLIC_NAME=ruleSYMBOLIC_NAME
	{ $current=$iv_ruleSYMBOLIC_NAME.current.getText(); }
	EOF;

// Rule SYMBOLIC_NAME
ruleSYMBOLIC_NAME returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	this_IDENTIFIER_0=RULE_IDENTIFIER
	{
		$current.merge(this_IDENTIFIER_0);
	}
	{
		newLeafNode(this_IDENTIFIER_0, grammarAccess.getSYMBOLIC_NAMEAccess().getIDENTIFIERTerminalRuleCall());
	}
;

// Entry rule entryRuleMyString
entryRuleMyString returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMyStringRule()); }
	iv_ruleMyString=ruleMyString
	{ $current=$iv_ruleMyString.current; }
	EOF;

// Rule MyString
ruleMyString returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_value_0_0=RULE_STRING_LITERAL
			{
				newLeafNode(lv_value_0_0, grammarAccess.getMyStringAccess().getValueSTRING_LITERALTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getMyStringRule());
				}
				setWithLastConsumed(
					$current,
					"value",
					lv_value_0_0,
					"ingraph.cucumber.featureresult.FeatureResults.STRING_LITERAL");
			}
		)
	)
;

RULE_FLOAT : RULE_INT? '.' RULE_INT;

RULE_INFINITY : '-'? 'Inf';

RULE_IDENTIFIER : RULE_ID;

RULE_STRING_LITERAL : '\'' RULE_STRING_BODY* '\'';

fragment RULE_STRING_BODY : ('\u0000'..'&'|'('..'\u01FF'|RULE_ESCAPED_APOSTROPHE);

fragment RULE_ESCAPED_APOSTROPHE : '\\\'';

fragment RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;