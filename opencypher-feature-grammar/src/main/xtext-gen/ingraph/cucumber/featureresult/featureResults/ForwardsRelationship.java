/**
 * generated by Xtext 2.10.0
 */
package ingraph.cucumber.featureresult.featureResults;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Forwards Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ingraph.cucumber.featureresult.featureResults.ForwardsRelationship#getRelationshipDesc <em>Relationship Desc</em>}</li>
 * </ul>
 *
 * @see ingraph.cucumber.featureresult.featureResults.FeatureResultsPackage#getForwardsRelationship()
 * @model
 * @generated
 */
public interface ForwardsRelationship extends EObject
{
  /**
   * Returns the value of the '<em><b>Relationship Desc</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Relationship Desc</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Relationship Desc</em>' containment reference.
   * @see #setRelationshipDesc(RelationshipDesc)
   * @see ingraph.cucumber.featureresult.featureResults.FeatureResultsPackage#getForwardsRelationship_RelationshipDesc()
   * @model containment="true"
   * @generated
   */
  RelationshipDesc getRelationshipDesc();

  /**
   * Sets the value of the '{@link ingraph.cucumber.featureresult.featureResults.ForwardsRelationship#getRelationshipDesc <em>Relationship Desc</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Relationship Desc</em>' containment reference.
   * @see #getRelationshipDesc()
   * @generated
   */
  void setRelationshipDesc(RelationshipDesc value);

} // ForwardsRelationship
