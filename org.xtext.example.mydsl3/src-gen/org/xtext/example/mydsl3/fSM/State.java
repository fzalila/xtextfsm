/**
 * generated by Xtext 2.11.0
 */
package org.xtext.example.mydsl3.fSM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl3.fSM.State#getLiteral <em>Literal</em>}</li>
 *   <li>{@link org.xtext.example.mydsl3.fSM.State#getOutgoingTransition <em>Outgoing Transition</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl3.fSM.FSMPackage#getState()
 * @model
 * @generated
 */
public interface State extends EObject
{
  /**
   * Returns the value of the '<em><b>Literal</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Literal</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Literal</em>' reference.
   * @see #setLiteral(EnumerationLiteral)
   * @see org.xtext.example.mydsl3.fSM.FSMPackage#getState_Literal()
   * @model
   * @generated
   */
  EnumerationLiteral getLiteral();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl3.fSM.State#getLiteral <em>Literal</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Literal</em>' reference.
   * @see #getLiteral()
   * @generated
   */
  void setLiteral(EnumerationLiteral value);

  /**
   * Returns the value of the '<em><b>Outgoing Transition</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl3.fSM.Transition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Outgoing Transition</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Outgoing Transition</em>' containment reference list.
   * @see org.xtext.example.mydsl3.fSM.FSMPackage#getState_OutgoingTransition()
   * @model containment="true"
   * @generated
   */
  EList<Transition> getOutgoingTransition();

} // State
