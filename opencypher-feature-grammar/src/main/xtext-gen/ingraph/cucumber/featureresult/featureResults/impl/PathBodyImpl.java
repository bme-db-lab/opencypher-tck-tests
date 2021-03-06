/**
 * generated by Xtext 2.10.0
 */
package ingraph.cucumber.featureresult.featureResults.impl;

import ingraph.cucumber.featureresult.featureResults.FeatureResultsPackage;
import ingraph.cucumber.featureresult.featureResults.NodeDesc;
import ingraph.cucumber.featureresult.featureResults.PathBody;
import ingraph.cucumber.featureresult.featureResults.PathLink;

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
 * An implementation of the model object '<em><b>Path Body</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ingraph.cucumber.featureresult.featureResults.impl.PathBodyImpl#getNode <em>Node</em>}</li>
 *   <li>{@link ingraph.cucumber.featureresult.featureResults.impl.PathBodyImpl#getPathLinks <em>Path Links</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PathBodyImpl extends PathImpl implements PathBody
{
  /**
   * The cached value of the '{@link #getNode() <em>Node</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNode()
   * @generated
   * @ordered
   */
  protected NodeDesc node;

  /**
   * The cached value of the '{@link #getPathLinks() <em>Path Links</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPathLinks()
   * @generated
   * @ordered
   */
  protected EList<PathLink> pathLinks;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PathBodyImpl()
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
    return FeatureResultsPackage.Literals.PATH_BODY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NodeDesc getNode()
  {
    return node;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNode(NodeDesc newNode, NotificationChain msgs)
  {
    NodeDesc oldNode = node;
    node = newNode;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FeatureResultsPackage.PATH_BODY__NODE, oldNode, newNode);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNode(NodeDesc newNode)
  {
    if (newNode != node)
    {
      NotificationChain msgs = null;
      if (node != null)
        msgs = ((InternalEObject)node).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FeatureResultsPackage.PATH_BODY__NODE, null, msgs);
      if (newNode != null)
        msgs = ((InternalEObject)newNode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FeatureResultsPackage.PATH_BODY__NODE, null, msgs);
      msgs = basicSetNode(newNode, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FeatureResultsPackage.PATH_BODY__NODE, newNode, newNode));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PathLink> getPathLinks()
  {
    if (pathLinks == null)
    {
      pathLinks = new EObjectContainmentEList<PathLink>(PathLink.class, this, FeatureResultsPackage.PATH_BODY__PATH_LINKS);
    }
    return pathLinks;
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
      case FeatureResultsPackage.PATH_BODY__NODE:
        return basicSetNode(null, msgs);
      case FeatureResultsPackage.PATH_BODY__PATH_LINKS:
        return ((InternalEList<?>)getPathLinks()).basicRemove(otherEnd, msgs);
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
      case FeatureResultsPackage.PATH_BODY__NODE:
        return getNode();
      case FeatureResultsPackage.PATH_BODY__PATH_LINKS:
        return getPathLinks();
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
      case FeatureResultsPackage.PATH_BODY__NODE:
        setNode((NodeDesc)newValue);
        return;
      case FeatureResultsPackage.PATH_BODY__PATH_LINKS:
        getPathLinks().clear();
        getPathLinks().addAll((Collection<? extends PathLink>)newValue);
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
      case FeatureResultsPackage.PATH_BODY__NODE:
        setNode((NodeDesc)null);
        return;
      case FeatureResultsPackage.PATH_BODY__PATH_LINKS:
        getPathLinks().clear();
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
      case FeatureResultsPackage.PATH_BODY__NODE:
        return node != null;
      case FeatureResultsPackage.PATH_BODY__PATH_LINKS:
        return pathLinks != null && !pathLinks.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //PathBodyImpl
