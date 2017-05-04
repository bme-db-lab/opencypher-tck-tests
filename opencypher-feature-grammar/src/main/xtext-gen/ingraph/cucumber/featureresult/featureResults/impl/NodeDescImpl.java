/**
 * generated by Xtext 2.10.0
 */
package ingraph.cucumber.featureresult.featureResults.impl;

import ingraph.cucumber.featureresult.featureResults.FeatureResultsPackage;
import ingraph.cucumber.featureresult.featureResults.Label;
import ingraph.cucumber.featureresult.featureResults.NodeDesc;
import ingraph.cucumber.featureresult.featureResults.PropertyMap;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node Desc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ingraph.cucumber.featureresult.featureResults.impl.NodeDescImpl#getLabels <em>Labels</em>}</li>
 *   <li>{@link ingraph.cucumber.featureresult.featureResults.impl.NodeDescImpl#getPropertyMap <em>Property Map</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeDescImpl extends NodeImpl implements NodeDesc
{
  /**
   * The cached value of the '{@link #getLabels() <em>Labels</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabels()
   * @generated
   * @ordered
   */
  protected EList<Label> labels;

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
  protected NodeDescImpl()
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
    return FeatureResultsPackage.Literals.NODE_DESC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Label> getLabels()
  {
    if (labels == null)
    {
      labels = new EObjectContainmentEList<Label>(Label.class, this, FeatureResultsPackage.NODE_DESC__LABELS);
    }
    return labels;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FeatureResultsPackage.NODE_DESC__PROPERTY_MAP, oldPropertyMap, newPropertyMap);
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
        msgs = ((InternalEObject)propertyMap).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FeatureResultsPackage.NODE_DESC__PROPERTY_MAP, null, msgs);
      if (newPropertyMap != null)
        msgs = ((InternalEObject)newPropertyMap).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FeatureResultsPackage.NODE_DESC__PROPERTY_MAP, null, msgs);
      msgs = basicSetPropertyMap(newPropertyMap, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FeatureResultsPackage.NODE_DESC__PROPERTY_MAP, newPropertyMap, newPropertyMap));
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
      case FeatureResultsPackage.NODE_DESC__LABELS:
        return ((InternalEList<?>)getLabels()).basicRemove(otherEnd, msgs);
      case FeatureResultsPackage.NODE_DESC__PROPERTY_MAP:
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
      case FeatureResultsPackage.NODE_DESC__LABELS:
        return getLabels();
      case FeatureResultsPackage.NODE_DESC__PROPERTY_MAP:
        return getPropertyMap();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case FeatureResultsPackage.NODE_DESC__LABELS:
        getLabels().clear();
        getLabels().addAll((Collection<? extends Label>)newValue);
        return;
      case FeatureResultsPackage.NODE_DESC__PROPERTY_MAP:
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
      case FeatureResultsPackage.NODE_DESC__LABELS:
        getLabels().clear();
        return;
      case FeatureResultsPackage.NODE_DESC__PROPERTY_MAP:
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
      case FeatureResultsPackage.NODE_DESC__LABELS:
        return labels != null && !labels.isEmpty();
      case FeatureResultsPackage.NODE_DESC__PROPERTY_MAP:
        return propertyMap != null;
    }
    return super.eIsSet(featureID);
  }

} //NodeDescImpl
