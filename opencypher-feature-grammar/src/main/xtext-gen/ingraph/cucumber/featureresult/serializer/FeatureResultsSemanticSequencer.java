/*
 * generated by Xtext 2.10.0
 */
package ingraph.cucumber.featureresult.serializer;

import com.google.inject.Inject;
import ingraph.cucumber.featureresult.featureResults.BackwardsRelationship;
import ingraph.cucumber.featureresult.featureResults.Bool;
import ingraph.cucumber.featureresult.featureResults.DirectedRelationship;
import ingraph.cucumber.featureresult.featureResults.FeatureResultsPackage;
import ingraph.cucumber.featureresult.featureResults.FloatingPoint;
import ingraph.cucumber.featureresult.featureResults.ForwardsRelationship;
import ingraph.cucumber.featureresult.featureResults.List;
import ingraph.cucumber.featureresult.featureResults.ListContents;
import ingraph.cucumber.featureresult.featureResults.MapContents;
import ingraph.cucumber.featureresult.featureResults.MyString;
import ingraph.cucumber.featureresult.featureResults.NodeDesc;
import ingraph.cucumber.featureresult.featureResults.NullValue;
import ingraph.cucumber.featureresult.featureResults.PathBody;
import ingraph.cucumber.featureresult.featureResults.PathLink;
import ingraph.cucumber.featureresult.featureResults.PropertyMap;
import ingraph.cucumber.featureresult.featureResults.RelationshipDesc;
import ingraph.cucumber.featureresult.services.FeatureResultsGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class FeatureResultsSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private FeatureResultsGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == FeatureResultsPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case FeatureResultsPackage.BACKWARDS_RELATIONSHIP:
				sequence_BackwardsRelationship(context, (BackwardsRelationship) semanticObject); 
				return; 
			case FeatureResultsPackage.BOOL:
				sequence_Bool(context, (Bool) semanticObject); 
				return; 
			case FeatureResultsPackage.DIRECTED_RELATIONSHIP:
				sequence_DirectedRelationship(context, (DirectedRelationship) semanticObject); 
				return; 
			case FeatureResultsPackage.FLOATING_POINT:
				sequence_FloatingPoint(context, (FloatingPoint) semanticObject); 
				return; 
			case FeatureResultsPackage.FORWARDS_RELATIONSHIP:
				sequence_ForwardsRelationship(context, (ForwardsRelationship) semanticObject); 
				return; 
			case FeatureResultsPackage.INTEGER:
				sequence_Integer(context, (ingraph.cucumber.featureresult.featureResults.Integer) semanticObject); 
				return; 
			case FeatureResultsPackage.LIST:
				sequence_List(context, (List) semanticObject); 
				return; 
			case FeatureResultsPackage.LIST_CONTENTS:
				sequence_ListContents(context, (ListContents) semanticObject); 
				return; 
			case FeatureResultsPackage.MAP_CONTENTS:
				sequence_MapContents(context, (MapContents) semanticObject); 
				return; 
			case FeatureResultsPackage.MY_STRING:
				sequence_MyString(context, (MyString) semanticObject); 
				return; 
			case FeatureResultsPackage.NODE_DESC:
				sequence_NodeDesc(context, (NodeDesc) semanticObject); 
				return; 
			case FeatureResultsPackage.NULL_VALUE:
				sequence_NullValue(context, (NullValue) semanticObject); 
				return; 
			case FeatureResultsPackage.PATH_BODY:
				sequence_PathBody(context, (PathBody) semanticObject); 
				return; 
			case FeatureResultsPackage.PATH_LINK:
				sequence_PathLink(context, (PathLink) semanticObject); 
				return; 
			case FeatureResultsPackage.PROPERTY_MAP:
				sequence_PropertyMap(context, (PropertyMap) semanticObject); 
				return; 
			case FeatureResultsPackage.RELATIONSHIP_DESC:
				sequence_RelationshipDesc(context, (RelationshipDesc) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     BackwardsRelationship returns BackwardsRelationship
	 *
	 * Constraint:
	 *     relationshipDesc=RelationshipDesc
	 */
	protected void sequence_BackwardsRelationship(ISerializationContext context, BackwardsRelationship semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, FeatureResultsPackage.Literals.BACKWARDS_RELATIONSHIP__RELATIONSHIP_DESC) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FeatureResultsPackage.Literals.BACKWARDS_RELATIONSHIP__RELATIONSHIP_DESC));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBackwardsRelationshipAccess().getRelationshipDescRelationshipDescParserRuleCall_2_0(), semanticObject.getRelationshipDesc());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Value returns Bool
	 *     Bool returns Bool
	 *     ListElement returns Bool
	 *     KeyValuePair returns Bool
	 *     PropertyValue returns Bool
	 *
	 * Constraint:
	 *     {Bool}
	 */
	protected void sequence_Bool(ISerializationContext context, Bool semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DirectedRelationship returns DirectedRelationship
	 *
	 * Constraint:
	 *     (relationship=ForwardsRelationship | relationship=BackwardsRelationship)
	 */
	protected void sequence_DirectedRelationship(ISerializationContext context, DirectedRelationship semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Value returns FloatingPoint
	 *     FloatingPoint returns FloatingPoint
	 *     ListElement returns FloatingPoint
	 *     KeyValuePair returns FloatingPoint
	 *     PropertyValue returns FloatingPoint
	 *
	 * Constraint:
	 *     {FloatingPoint}
	 */
	protected void sequence_FloatingPoint(ISerializationContext context, FloatingPoint semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ForwardsRelationship returns ForwardsRelationship
	 *
	 * Constraint:
	 *     relationshipDesc=RelationshipDesc
	 */
	protected void sequence_ForwardsRelationship(ISerializationContext context, ForwardsRelationship semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, FeatureResultsPackage.Literals.FORWARDS_RELATIONSHIP__RELATIONSHIP_DESC) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FeatureResultsPackage.Literals.FORWARDS_RELATIONSHIP__RELATIONSHIP_DESC));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getForwardsRelationshipAccess().getRelationshipDescRelationshipDescParserRuleCall_2_0(), semanticObject.getRelationshipDesc());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Value returns Integer
	 *     Integer returns Integer
	 *     ListElement returns Integer
	 *     KeyValuePair returns Integer
	 *     PropertyValue returns Integer
	 *
	 * Constraint:
	 *     {Integer}
	 */
	protected void sequence_Integer(ISerializationContext context, ingraph.cucumber.featureresult.featureResults.Integer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ListContents returns ListContents
	 *
	 * Constraint:
	 *     (listContents+=ListElement listContents+=ListElement*)
	 */
	protected void sequence_ListContents(ISerializationContext context, ListContents semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Value returns List
	 *     List returns List
	 *     ListElement returns List
	 *     KeyValuePair returns List
	 *     PropertyValue returns List
	 *
	 * Constraint:
	 *     listContents+=ListContents?
	 */
	protected void sequence_List(ISerializationContext context, List semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MapContents returns MapContents
	 *
	 * Constraint:
	 *     (keyValuePairs+=KeyValuePair keyValuePairs+=KeyValuePair*)
	 */
	protected void sequence_MapContents(ISerializationContext context, MapContents semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Value returns MyString
	 *     ListElement returns MyString
	 *     KeyValuePair returns MyString
	 *     PropertyValue returns MyString
	 *     MyString returns MyString
	 *
	 * Constraint:
	 *     {MyString}
	 */
	protected void sequence_MyString(ISerializationContext context, MyString semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Value returns NodeDesc
	 *     Node returns NodeDesc
	 *     NodeDesc returns NodeDesc
	 *     ListElement returns NodeDesc
	 *     KeyValuePair returns NodeDesc
	 *     PropertyValue returns NodeDesc
	 *
	 * Constraint:
	 *     (labels+=Label* propertyMap=PropertyMap?)
	 */
	protected void sequence_NodeDesc(ISerializationContext context, NodeDesc semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Value returns NullValue
	 *     NullValue returns NullValue
	 *     ListElement returns NullValue
	 *     KeyValuePair returns NullValue
	 *     PropertyValue returns NullValue
	 *
	 * Constraint:
	 *     {NullValue}
	 */
	protected void sequence_NullValue(ISerializationContext context, NullValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Value returns PathBody
	 *     Path returns PathBody
	 *     PathBody returns PathBody
	 *     ListElement returns PathBody
	 *     KeyValuePair returns PathBody
	 *     PropertyValue returns PathBody
	 *
	 * Constraint:
	 *     (node=NodeDesc pathLinks+=PathLink*)
	 */
	protected void sequence_PathBody(ISerializationContext context, PathBody semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PathLink returns PathLink
	 *
	 * Constraint:
	 *     (relationship=DirectedRelationship node=NodeDesc)
	 */
	protected void sequence_PathLink(ISerializationContext context, PathLink semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, FeatureResultsPackage.Literals.PATH_LINK__RELATIONSHIP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FeatureResultsPackage.Literals.PATH_LINK__RELATIONSHIP));
			if (transientValues.isValueTransient(semanticObject, FeatureResultsPackage.Literals.PATH_LINK__NODE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FeatureResultsPackage.Literals.PATH_LINK__NODE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPathLinkAccess().getRelationshipDirectedRelationshipParserRuleCall_1_0(), semanticObject.getRelationship());
		feeder.accept(grammarAccess.getPathLinkAccess().getNodeNodeDescParserRuleCall_2_0(), semanticObject.getNode());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Value returns PropertyMap
	 *     ListElement returns PropertyMap
	 *     Map returns PropertyMap
	 *     PropertyMap returns PropertyMap
	 *     KeyValuePair returns PropertyMap
	 *     PropertyValue returns PropertyMap
	 *
	 * Constraint:
	 *     mapContents=MapContents?
	 */
	protected void sequence_PropertyMap(ISerializationContext context, PropertyMap semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Value returns RelationshipDesc
	 *     Relationship returns RelationshipDesc
	 *     RelationshipDesc returns RelationshipDesc
	 *     ListElement returns RelationshipDesc
	 *     KeyValuePair returns RelationshipDesc
	 *     PropertyValue returns RelationshipDesc
	 *
	 * Constraint:
	 *     (type=RelationshipType propertyMap=PropertyMap?)
	 */
	protected void sequence_RelationshipDesc(ISerializationContext context, RelationshipDesc semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
