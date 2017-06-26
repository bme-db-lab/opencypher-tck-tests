/**
 * generated by Xtext 2.10.0
 */
package ingraph.cucumber.featureresult.featureResults.impl;

import ingraph.cucumber.featureresult.featureResults.FeatureResultsPackage;
import ingraph.cucumber.featureresult.featureResults.PropertyMap;
import ingraph.cucumber.featureresult.featureResults.RelationshipDesc;
import ingraph.cucumber.featureresult.featureResults.RelationshipType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relationship Desc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ingraph.cucumber.featureresult.featureResults.impl.RelationshipDescImpl#getType <em>Type</em>}</li>
 *   <li>{@link ingraph.cucumber.featureresult.featureResults.impl.RelationshipDescImpl#getPropertyMap <em>Property Map</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelationshipDescImpl extends RelationshipImpl implements RelationshipDesc
{
  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected RelationshipType type;

  /**
   * The cached value of the '{@link #getPropertyMap() <em>Property Map</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPropertyMap()
   * @generated
   * @ordered
   */
  protected PropertyMap propertyMap;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RelationshipDescImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return FeatureResultsPackage.Literals.RELATIONSHIP_DESC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelationshipType getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(RelationshipType newType, NotificationChain msgs)
  {
    RelationshipType oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FeatureResultsPackage.RELATIONSHIP_DESC__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(RelationshipType newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FeatureResultsPackage.RELATIONSHIP_DESC__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FeatureResultsPackage.RELATIONSHIP_DESC__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FeatureResultsPackage.RELATIONSHIP_DESC__TYPE, newType, newType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropertyMap getPropertyMap()
  {
    return propertyMap;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPropertyMap(PropertyMap newPropertyMap, NotificationChain msgs)
  {
    PropertyMap oldPropertyMap = propertyMap;
    propertyMap = newPropertyMap;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FeatureResultsPackage.RELATIONSHIP_DESC__PROPERTY_MAP, oldPropertyMap, newPropertyMap);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPropertyMap(PropertyMap newPropertyMap)
  {
    if (newPropertyMap != propertyMap)
    {
      NotificationChain msgs = null;
      if (propertyMap != null)
        msgs = ((InternalEObject)propertyMap).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FeatureResultsPackage.RELATIONSHIP_DESC__PROPERTY_MAP, null, msgs);
      if (newPropertyMap != null)
        msgs = ((InternalEObject)newPropertyMap).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FeatureResultsPackage.RELATIONSHIP_DESC__PROPERTY_MAP, null, msgs);
      msgs = basicSetPropertyMap(newPropertyMap, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FeatureResultsPackage.RELATIONSHIP_DESC__PROPERTY_MAP, newPropertyMap, newPropertyMap));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case FeatureResultsPackage.RELATIONSHIP_DESC__TYPE:
        return basicSetType(null, msgs);
      case FeatureResultsPackage.RELATIONSHIP_DESC__PROPERTY_MAP:
        return basicSetPropertyMap(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case FeatureResultsPackage.RELATIONSHIP_DESC__TYPE:
        return getType();
      case FeatureResultsPackage.RELATIONSHIP_DESC__PROPERTY_MAP:
        return getPropertyMap();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case FeatureResultsPackage.RELATIONSHIP_DESC__TYPE:
        setType((RelationshipType)newValue);
        return;
      case FeatureResultsPackage.RELATIONSHIP_DESC__PROPERTY_MAP:
        setPropertyMap((PropertyMap)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case FeatureResultsPackage.RELATIONSHIP_DESC__TYPE:
        setType((RelationshipType)null);
        return;
      case FeatureResultsPackage.RELATIONSHIP_DESC__PROPERTY_MAP:
        setPropertyMap((PropertyMap)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case FeatureResultsPackage.RELATIONSHIP_DESC__TYPE:
        return type != null;
      case FeatureResultsPackage.RELATIONSHIP_DESC__PROPERTY_MAP:
        return propertyMap != null;
    }
    return super.eIsSet(featureID);
  }

} //RelationshipDescImpl