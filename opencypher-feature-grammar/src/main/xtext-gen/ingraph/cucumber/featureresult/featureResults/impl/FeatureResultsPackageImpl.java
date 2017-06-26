/**
 * generated by Xtext 2.10.0
 */
package ingraph.cucumber.featureresult.featureResults.impl;

import ingraph.cucumber.featureresult.featureResults.BackwardsRelationship;
import ingraph.cucumber.featureresult.featureResults.Bool;
import ingraph.cucumber.featureresult.featureResults.DirectedRelationship;
import ingraph.cucumber.featureresult.featureResults.FeatureResultsFactory;
import ingraph.cucumber.featureresult.featureResults.FeatureResultsPackage;
import ingraph.cucumber.featureresult.featureResults.FeatureValue;
import ingraph.cucumber.featureresult.featureResults.FloatingPoint;
import ingraph.cucumber.featureresult.featureResults.ForwardsRelationship;
import ingraph.cucumber.featureresult.featureResults.KeyValuePair;
import ingraph.cucumber.featureresult.featureResults.Label;
import ingraph.cucumber.featureresult.featureResults.List;
import ingraph.cucumber.featureresult.featureResults.ListContents;
import ingraph.cucumber.featureresult.featureResults.ListElement;
import ingraph.cucumber.featureresult.featureResults.Map;
import ingraph.cucumber.featureresult.featureResults.MapContents;
import ingraph.cucumber.featureresult.featureResults.MyString;
import ingraph.cucumber.featureresult.featureResults.Node;
import ingraph.cucumber.featureresult.featureResults.NodeDesc;
import ingraph.cucumber.featureresult.featureResults.NullValue;
import ingraph.cucumber.featureresult.featureResults.Path;
import ingraph.cucumber.featureresult.featureResults.PathBody;
import ingraph.cucumber.featureresult.featureResults.PathLink;
import ingraph.cucumber.featureresult.featureResults.PropertyMap;
import ingraph.cucumber.featureresult.featureResults.PropertyValue;
import ingraph.cucumber.featureresult.featureResults.Relationship;
import ingraph.cucumber.featureresult.featureResults.RelationshipDesc;
import ingraph.cucumber.featureresult.featureResults.RelationshipType;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FeatureResultsPackageImpl extends EPackageImpl implements FeatureResultsPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass featureValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nodeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nodeDescEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass relationshipEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass relationshipDescEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pathEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pathBodyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pathLinkEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass directedRelationshipEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass forwardsRelationshipEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass backwardsRelationshipEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass floatingPointEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass boolEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nullValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass listEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass listContentsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass listElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mapEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass propertyMapEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mapContentsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass keyValuePairEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass propertyValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass relationshipTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass labelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass integerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass myStringEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see ingraph.cucumber.featureresult.featureResults.FeatureResultsPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private FeatureResultsPackageImpl()
  {
    super(eNS_URI, FeatureResultsFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link FeatureResultsPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static FeatureResultsPackage init()
  {
    if (isInited) return (FeatureResultsPackage)EPackage.Registry.INSTANCE.getEPackage(FeatureResultsPackage.eNS_URI);

    // Obtain or create and register package
    FeatureResultsPackageImpl theFeatureResultsPackage = (FeatureResultsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FeatureResultsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FeatureResultsPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theFeatureResultsPackage.createPackageContents();

    // Initialize created meta-data
    theFeatureResultsPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theFeatureResultsPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(FeatureResultsPackage.eNS_URI, theFeatureResultsPackage);
    return theFeatureResultsPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFeatureValue()
  {
    return featureValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNode()
  {
    return nodeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNodeDesc()
  {
    return nodeDescEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNodeDesc_Labels()
  {
    return (EReference)nodeDescEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNodeDesc_PropertyMap()
  {
    return (EReference)nodeDescEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRelationship()
  {
    return relationshipEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRelationshipDesc()
  {
    return relationshipDescEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRelationshipDesc_Type()
  {
    return (EReference)relationshipDescEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRelationshipDesc_PropertyMap()
  {
    return (EReference)relationshipDescEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPath()
  {
    return pathEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPathBody()
  {
    return pathBodyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPathBody_Node()
  {
    return (EReference)pathBodyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPathBody_PathLinks()
  {
    return (EReference)pathBodyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPathLink()
  {
    return pathLinkEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPathLink_Relationship()
  {
    return (EReference)pathLinkEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPathLink_Node()
  {
    return (EReference)pathLinkEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDirectedRelationship()
  {
    return directedRelationshipEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDirectedRelationship_RelationshipDesc()
  {
    return (EReference)directedRelationshipEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getForwardsRelationship()
  {
    return forwardsRelationshipEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBackwardsRelationship()
  {
    return backwardsRelationshipEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFloatingPoint()
  {
    return floatingPointEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFloatingPoint_Value()
  {
    return (EAttribute)floatingPointEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFloatingPoint_IsInfinity()
  {
    return (EAttribute)floatingPointEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBool()
  {
    return boolEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBool_Value()
  {
    return (EAttribute)boolEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNullValue()
  {
    return nullValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getList()
  {
    return listEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getList_ListContents()
  {
    return (EReference)listEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getListContents()
  {
    return listContentsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getListContents_ListContents()
  {
    return (EReference)listContentsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getListElement()
  {
    return listElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMap()
  {
    return mapEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPropertyMap()
  {
    return propertyMapEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPropertyMap_MapContents()
  {
    return (EReference)propertyMapEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMapContents()
  {
    return mapContentsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMapContents_KeyValuePairs()
  {
    return (EReference)mapContentsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getKeyValuePair()
  {
    return keyValuePairEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getKeyValuePair_Key()
  {
    return (EAttribute)keyValuePairEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getKeyValuePair_Value()
  {
    return (EReference)keyValuePairEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPropertyValue()
  {
    return propertyValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRelationshipType()
  {
    return relationshipTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRelationshipType_Name()
  {
    return (EAttribute)relationshipTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLabel()
  {
    return labelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLabel_Name()
  {
    return (EAttribute)labelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInteger()
  {
    return integerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInteger_Value()
  {
    return (EAttribute)integerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMyString()
  {
    return myStringEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMyString_Value()
  {
    return (EAttribute)myStringEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureResultsFactory getFeatureResultsFactory()
  {
    return (FeatureResultsFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    featureValueEClass = createEClass(FEATURE_VALUE);

    nodeEClass = createEClass(NODE);

    nodeDescEClass = createEClass(NODE_DESC);
    createEReference(nodeDescEClass, NODE_DESC__LABELS);
    createEReference(nodeDescEClass, NODE_DESC__PROPERTY_MAP);

    relationshipEClass = createEClass(RELATIONSHIP);

    relationshipDescEClass = createEClass(RELATIONSHIP_DESC);
    createEReference(relationshipDescEClass, RELATIONSHIP_DESC__TYPE);
    createEReference(relationshipDescEClass, RELATIONSHIP_DESC__PROPERTY_MAP);

    pathEClass = createEClass(PATH);

    pathBodyEClass = createEClass(PATH_BODY);
    createEReference(pathBodyEClass, PATH_BODY__NODE);
    createEReference(pathBodyEClass, PATH_BODY__PATH_LINKS);

    pathLinkEClass = createEClass(PATH_LINK);
    createEReference(pathLinkEClass, PATH_LINK__RELATIONSHIP);
    createEReference(pathLinkEClass, PATH_LINK__NODE);

    directedRelationshipEClass = createEClass(DIRECTED_RELATIONSHIP);
    createEReference(directedRelationshipEClass, DIRECTED_RELATIONSHIP__RELATIONSHIP_DESC);

    forwardsRelationshipEClass = createEClass(FORWARDS_RELATIONSHIP);

    backwardsRelationshipEClass = createEClass(BACKWARDS_RELATIONSHIP);

    floatingPointEClass = createEClass(FLOATING_POINT);
    createEAttribute(floatingPointEClass, FLOATING_POINT__VALUE);
    createEAttribute(floatingPointEClass, FLOATING_POINT__IS_INFINITY);

    boolEClass = createEClass(BOOL);
    createEAttribute(boolEClass, BOOL__VALUE);

    nullValueEClass = createEClass(NULL_VALUE);

    listEClass = createEClass(LIST);
    createEReference(listEClass, LIST__LIST_CONTENTS);

    listContentsEClass = createEClass(LIST_CONTENTS);
    createEReference(listContentsEClass, LIST_CONTENTS__LIST_CONTENTS);

    listElementEClass = createEClass(LIST_ELEMENT);

    mapEClass = createEClass(MAP);

    propertyMapEClass = createEClass(PROPERTY_MAP);
    createEReference(propertyMapEClass, PROPERTY_MAP__MAP_CONTENTS);

    mapContentsEClass = createEClass(MAP_CONTENTS);
    createEReference(mapContentsEClass, MAP_CONTENTS__KEY_VALUE_PAIRS);

    keyValuePairEClass = createEClass(KEY_VALUE_PAIR);
    createEAttribute(keyValuePairEClass, KEY_VALUE_PAIR__KEY);
    createEReference(keyValuePairEClass, KEY_VALUE_PAIR__VALUE);

    propertyValueEClass = createEClass(PROPERTY_VALUE);

    relationshipTypeEClass = createEClass(RELATIONSHIP_TYPE);
    createEAttribute(relationshipTypeEClass, RELATIONSHIP_TYPE__NAME);

    labelEClass = createEClass(LABEL);
    createEAttribute(labelEClass, LABEL__NAME);

    integerEClass = createEClass(INTEGER);
    createEAttribute(integerEClass, INTEGER__VALUE);

    myStringEClass = createEClass(MY_STRING);
    createEAttribute(myStringEClass, MY_STRING__VALUE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    featureValueEClass.getESuperTypes().add(this.getListElement());
    featureValueEClass.getESuperTypes().add(this.getPropertyValue());
    nodeEClass.getESuperTypes().add(this.getFeatureValue());
    nodeDescEClass.getESuperTypes().add(this.getNode());
    relationshipEClass.getESuperTypes().add(this.getFeatureValue());
    relationshipDescEClass.getESuperTypes().add(this.getRelationship());
    pathEClass.getESuperTypes().add(this.getFeatureValue());
    pathBodyEClass.getESuperTypes().add(this.getPath());
    forwardsRelationshipEClass.getESuperTypes().add(this.getDirectedRelationship());
    backwardsRelationshipEClass.getESuperTypes().add(this.getDirectedRelationship());
    floatingPointEClass.getESuperTypes().add(this.getFeatureValue());
    boolEClass.getESuperTypes().add(this.getFeatureValue());
    nullValueEClass.getESuperTypes().add(this.getFeatureValue());
    listEClass.getESuperTypes().add(this.getFeatureValue());
    mapEClass.getESuperTypes().add(this.getFeatureValue());
    propertyMapEClass.getESuperTypes().add(this.getMap());
    integerEClass.getESuperTypes().add(this.getFeatureValue());
    myStringEClass.getESuperTypes().add(this.getFeatureValue());

    // Initialize classes and features; add operations and parameters
    initEClass(featureValueEClass, FeatureValue.class, "FeatureValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(nodeEClass, Node.class, "Node", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(nodeDescEClass, NodeDesc.class, "NodeDesc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNodeDesc_Labels(), this.getLabel(), null, "labels", null, 0, -1, NodeDesc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNodeDesc_PropertyMap(), this.getPropertyMap(), null, "propertyMap", null, 0, 1, NodeDesc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(relationshipEClass, Relationship.class, "Relationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(relationshipDescEClass, RelationshipDesc.class, "RelationshipDesc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRelationshipDesc_Type(), this.getRelationshipType(), null, "type", null, 0, 1, RelationshipDesc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRelationshipDesc_PropertyMap(), this.getPropertyMap(), null, "propertyMap", null, 0, 1, RelationshipDesc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pathEClass, Path.class, "Path", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(pathBodyEClass, PathBody.class, "PathBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPathBody_Node(), this.getNodeDesc(), null, "node", null, 0, 1, PathBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPathBody_PathLinks(), this.getPathLink(), null, "pathLinks", null, 0, -1, PathBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pathLinkEClass, PathLink.class, "PathLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPathLink_Relationship(), this.getDirectedRelationship(), null, "relationship", null, 0, 1, PathLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPathLink_Node(), this.getNodeDesc(), null, "node", null, 0, 1, PathLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(directedRelationshipEClass, DirectedRelationship.class, "DirectedRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDirectedRelationship_RelationshipDesc(), this.getRelationshipDesc(), null, "relationshipDesc", null, 0, 1, DirectedRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(forwardsRelationshipEClass, ForwardsRelationship.class, "ForwardsRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(backwardsRelationshipEClass, BackwardsRelationship.class, "BackwardsRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(floatingPointEClass, FloatingPoint.class, "FloatingPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFloatingPoint_Value(), ecorePackage.getEBigDecimal(), "value", null, 0, 1, FloatingPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFloatingPoint_IsInfinity(), ecorePackage.getEBoolean(), "isInfinity", null, 0, 1, FloatingPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(boolEClass, Bool.class, "Bool", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBool_Value(), ecorePackage.getEString(), "value", null, 0, 1, Bool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nullValueEClass, NullValue.class, "NullValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(listEClass, List.class, "List", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getList_ListContents(), this.getListContents(), null, "listContents", null, 0, 1, List.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(listContentsEClass, ListContents.class, "ListContents", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getListContents_ListContents(), this.getListElement(), null, "listContents", null, 0, -1, ListContents.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(listElementEClass, ListElement.class, "ListElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(mapEClass, Map.class, "Map", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(propertyMapEClass, PropertyMap.class, "PropertyMap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPropertyMap_MapContents(), this.getMapContents(), null, "mapContents", null, 0, 1, PropertyMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mapContentsEClass, MapContents.class, "MapContents", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMapContents_KeyValuePairs(), this.getKeyValuePair(), null, "keyValuePairs", null, 0, -1, MapContents.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(keyValuePairEClass, KeyValuePair.class, "KeyValuePair", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getKeyValuePair_Key(), ecorePackage.getEString(), "key", null, 0, 1, KeyValuePair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getKeyValuePair_Value(), this.getPropertyValue(), null, "value", null, 0, 1, KeyValuePair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(propertyValueEClass, PropertyValue.class, "PropertyValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(relationshipTypeEClass, RelationshipType.class, "RelationshipType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRelationshipType_Name(), ecorePackage.getEString(), "name", null, 0, 1, RelationshipType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(labelEClass, Label.class, "Label", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLabel_Name(), ecorePackage.getEString(), "name", null, 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(integerEClass, ingraph.cucumber.featureresult.featureResults.Integer.class, "Integer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInteger_Value(), ecorePackage.getEInt(), "value", null, 0, 1, ingraph.cucumber.featureresult.featureResults.Integer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(myStringEClass, MyString.class, "MyString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMyString_Value(), ecorePackage.getEString(), "value", null, 0, 1, MyString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //FeatureResultsPackageImpl