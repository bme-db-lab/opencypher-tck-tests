/**
 * generated by Xtext 2.10.0
 */
package ingraph.cucumber.featureresult.featureResults.impl;

import ingraph.cucumber.featureresult.featureResults.FeatureResultsPackage;
import ingraph.cucumber.featureresult.featureResults.FloatingPoint;

import java.math.BigDecimal;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Floating Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ingraph.cucumber.featureresult.featureResults.impl.FloatingPointImpl#getValue <em>Value</em>}</li>
 *   <li>{@link ingraph.cucumber.featureresult.featureResults.impl.FloatingPointImpl#isIsInfinity <em>Is Infinity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FloatingPointImpl extends FeatureValueImpl implements FloatingPoint
{
  /**
   * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected static final BigDecimal VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected BigDecimal value = VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #isIsInfinity() <em>Is Infinity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsInfinity()
   * @generated
   * @ordered
   */
  protected static final boolean IS_INFINITY_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsInfinity() <em>Is Infinity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsInfinity()
   * @generated
   * @ordered
   */
  protected boolean isInfinity = IS_INFINITY_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FloatingPointImpl()
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
    return FeatureResultsPackage.Literals.FLOATING_POINT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BigDecimal getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(BigDecimal newValue)
  {
    BigDecimal oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FeatureResultsPackage.FLOATING_POINT__VALUE, oldValue, value));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsInfinity()
  {
    return isInfinity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsInfinity(boolean newIsInfinity)
  {
    boolean oldIsInfinity = isInfinity;
    isInfinity = newIsInfinity;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FeatureResultsPackage.FLOATING_POINT__IS_INFINITY, oldIsInfinity, isInfinity));
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
      case FeatureResultsPackage.FLOATING_POINT__VALUE:
        return getValue();
      case FeatureResultsPackage.FLOATING_POINT__IS_INFINITY:
        return isIsInfinity();
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
      case FeatureResultsPackage.FLOATING_POINT__VALUE:
        setValue((BigDecimal)newValue);
        return;
      case FeatureResultsPackage.FLOATING_POINT__IS_INFINITY:
        setIsInfinity((Boolean)newValue);
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
      case FeatureResultsPackage.FLOATING_POINT__VALUE:
        setValue(VALUE_EDEFAULT);
        return;
      case FeatureResultsPackage.FLOATING_POINT__IS_INFINITY:
        setIsInfinity(IS_INFINITY_EDEFAULT);
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
      case FeatureResultsPackage.FLOATING_POINT__VALUE:
        return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
      case FeatureResultsPackage.FLOATING_POINT__IS_INFINITY:
        return isInfinity != IS_INFINITY_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (value: ");
    result.append(value);
    result.append(", isInfinity: ");
    result.append(isInfinity);
    result.append(')');
    return result.toString();
  }

} //FloatingPointImpl