/**
 * generated by Xtext 2.10.0
 */
package ingraph.cucumber.featureresult.featureResults.util;

import ingraph.cucumber.featureresult.featureResults.BackwardsRelationship;
import ingraph.cucumber.featureresult.featureResults.Bool;
import ingraph.cucumber.featureresult.featureResults.DirectedRelationship;
import ingraph.cucumber.featureresult.featureResults.FeatureResultsPackage;
import ingraph.cucumber.featureresult.featureResults.FloatingPoint;
import ingraph.cucumber.featureresult.featureResults.ForwardsRelationship;
import ingraph.cucumber.featureresult.featureResults.KeyValuePair;
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
import ingraph.cucumber.featureresult.featureResults.Value;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ingraph.cucumber.featureresult.featureResults.FeatureResultsPackage
 * @generated
 */
public class FeatureResultsAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static FeatureResultsPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureResultsAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = FeatureResultsPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FeatureResultsSwitch<Adapter> modelSwitch =
    new FeatureResultsSwitch<Adapter>()
    {
      @Override
      public Adapter caseValue(Value object)
      {
        return createValueAdapter();
      }
      @Override
      public Adapter caseNode(Node object)
      {
        return createNodeAdapter();
      }
      @Override
      public Adapter caseNodeDesc(NodeDesc object)
      {
        return createNodeDescAdapter();
      }
      @Override
      public Adapter caseRelationship(Relationship object)
      {
        return createRelationshipAdapter();
      }
      @Override
      public Adapter caseRelationshipDesc(RelationshipDesc object)
      {
        return createRelationshipDescAdapter();
      }
      @Override
      public Adapter casePath(Path object)
      {
        return createPathAdapter();
      }
      @Override
      public Adapter casePathBody(PathBody object)
      {
        return createPathBodyAdapter();
      }
      @Override
      public Adapter casePathLink(PathLink object)
      {
        return createPathLinkAdapter();
      }
      @Override
      public Adapter caseDirectedRelationship(DirectedRelationship object)
      {
        return createDirectedRelationshipAdapter();
      }
      @Override
      public Adapter caseForwardsRelationship(ForwardsRelationship object)
      {
        return createForwardsRelationshipAdapter();
      }
      @Override
      public Adapter caseBackwardsRelationship(BackwardsRelationship object)
      {
        return createBackwardsRelationshipAdapter();
      }
      @Override
      public Adapter caseInteger(ingraph.cucumber.featureresult.featureResults.Integer object)
      {
        return createIntegerAdapter();
      }
      @Override
      public Adapter caseFloatingPoint(FloatingPoint object)
      {
        return createFloatingPointAdapter();
      }
      @Override
      public Adapter caseBool(Bool object)
      {
        return createBoolAdapter();
      }
      @Override
      public Adapter caseNullValue(NullValue object)
      {
        return createNullValueAdapter();
      }
      @Override
      public Adapter caseList(List object)
      {
        return createListAdapter();
      }
      @Override
      public Adapter caseListContents(ListContents object)
      {
        return createListContentsAdapter();
      }
      @Override
      public Adapter caseListElement(ListElement object)
      {
        return createListElementAdapter();
      }
      @Override
      public Adapter caseMap(Map object)
      {
        return createMapAdapter();
      }
      @Override
      public Adapter casePropertyMap(PropertyMap object)
      {
        return createPropertyMapAdapter();
      }
      @Override
      public Adapter caseMapContents(MapContents object)
      {
        return createMapContentsAdapter();
      }
      @Override
      public Adapter caseKeyValuePair(KeyValuePair object)
      {
        return createKeyValuePairAdapter();
      }
      @Override
      public Adapter casePropertyValue(PropertyValue object)
      {
        return createPropertyValueAdapter();
      }
      @Override
      public Adapter caseMyString(MyString object)
      {
        return createMyStringAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link ingraph.cucumber.featureresult.featureResults.Value <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ingraph.cucumber.featureresult.featureResults.Value
   * @generated
   */
  public Adapter createValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ingraph.cucumber.featureresult.featureResults.Node <em>Node</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ingraph.cucumber.featureresult.featureResults.Node
   * @generated
   */
  public Adapter createNodeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ingraph.cucumber.featureresult.featureResults.NodeDesc <em>Node Desc</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ingraph.cucumber.featureresult.featureResults.NodeDesc
   * @generated
   */
  public Adapter createNodeDescAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ingraph.cucumber.featureresult.featureResults.Relationship <em>Relationship</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ingraph.cucumber.featureresult.featureResults.Relationship
   * @generated
   */
  public Adapter createRelationshipAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ingraph.cucumber.featureresult.featureResults.RelationshipDesc <em>Relationship Desc</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ingraph.cucumber.featureresult.featureResults.RelationshipDesc
   * @generated
   */
  public Adapter createRelationshipDescAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ingraph.cucumber.featureresult.featureResults.Path <em>Path</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ingraph.cucumber.featureresult.featureResults.Path
   * @generated
   */
  public Adapter createPathAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ingraph.cucumber.featureresult.featureResults.PathBody <em>Path Body</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ingraph.cucumber.featureresult.featureResults.PathBody
   * @generated
   */
  public Adapter createPathBodyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ingraph.cucumber.featureresult.featureResults.PathLink <em>Path Link</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ingraph.cucumber.featureresult.featureResults.PathLink
   * @generated
   */
  public Adapter createPathLinkAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ingraph.cucumber.featureresult.featureResults.DirectedRelationship <em>Directed Relationship</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ingraph.cucumber.featureresult.featureResults.DirectedRelationship
   * @generated
   */
  public Adapter createDirectedRelationshipAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ingraph.cucumber.featureresult.featureResults.ForwardsRelationship <em>Forwards Relationship</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ingraph.cucumber.featureresult.featureResults.ForwardsRelationship
   * @generated
   */
  public Adapter createForwardsRelationshipAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ingraph.cucumber.featureresult.featureResults.BackwardsRelationship <em>Backwards Relationship</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ingraph.cucumber.featureresult.featureResults.BackwardsRelationship
   * @generated
   */
  public Adapter createBackwardsRelationshipAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ingraph.cucumber.featureresult.featureResults.Integer <em>Integer</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ingraph.cucumber.featureresult.featureResults.Integer
   * @generated
   */
  public Adapter createIntegerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ingraph.cucumber.featureresult.featureResults.FloatingPoint <em>Floating Point</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ingraph.cucumber.featureresult.featureResults.FloatingPoint
   * @generated
   */
  public Adapter createFloatingPointAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ingraph.cucumber.featureresult.featureResults.Bool <em>Bool</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ingraph.cucumber.featureresult.featureResults.Bool
   * @generated
   */
  public Adapter createBoolAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ingraph.cucumber.featureresult.featureResults.NullValue <em>Null Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ingraph.cucumber.featureresult.featureResults.NullValue
   * @generated
   */
  public Adapter createNullValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ingraph.cucumber.featureresult.featureResults.List <em>List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ingraph.cucumber.featureresult.featureResults.List
   * @generated
   */
  public Adapter createListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ingraph.cucumber.featureresult.featureResults.ListContents <em>List Contents</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ingraph.cucumber.featureresult.featureResults.ListContents
   * @generated
   */
  public Adapter createListContentsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ingraph.cucumber.featureresult.featureResults.ListElement <em>List Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ingraph.cucumber.featureresult.featureResults.ListElement
   * @generated
   */
  public Adapter createListElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ingraph.cucumber.featureresult.featureResults.Map <em>Map</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ingraph.cucumber.featureresult.featureResults.Map
   * @generated
   */
  public Adapter createMapAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ingraph.cucumber.featureresult.featureResults.PropertyMap <em>Property Map</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ingraph.cucumber.featureresult.featureResults.PropertyMap
   * @generated
   */
  public Adapter createPropertyMapAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ingraph.cucumber.featureresult.featureResults.MapContents <em>Map Contents</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ingraph.cucumber.featureresult.featureResults.MapContents
   * @generated
   */
  public Adapter createMapContentsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ingraph.cucumber.featureresult.featureResults.KeyValuePair <em>Key Value Pair</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ingraph.cucumber.featureresult.featureResults.KeyValuePair
   * @generated
   */
  public Adapter createKeyValuePairAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ingraph.cucumber.featureresult.featureResults.PropertyValue <em>Property Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ingraph.cucumber.featureresult.featureResults.PropertyValue
   * @generated
   */
  public Adapter createPropertyValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ingraph.cucumber.featureresult.featureResults.MyString <em>My String</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ingraph.cucumber.featureresult.featureResults.MyString
   * @generated
   */
  public Adapter createMyStringAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //FeatureResultsAdapterFactory
