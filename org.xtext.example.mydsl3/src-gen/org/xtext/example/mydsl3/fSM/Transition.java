/**
 * generated by Xtext 2.11.0
 */
package org.xtext.example.mydsl3.fSM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl3.fSM.Transition#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl3.fSM.FSMPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends EObject
{
  /**
   * Returns the value of the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' reference.
   * @see #setTarget(State)
   * @see org.xtext.example.mydsl3.fSM.FSMPackage#getTransition_Target()
   * @model
   * @generated
   */
  State getTarget();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl3.fSM.Transition#getTarget <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(State value);

} // Transition
