/**
 * generated by Xtext 2.11.0
 */
package org.xtext.example.mydsl3.fSM.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl3.fSM.EnumerationLiteral;
import org.xtext.example.mydsl3.fSM.FSMPackage;
import org.xtext.example.mydsl3.fSM.State;
import org.xtext.example.mydsl3.fSM.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl3.fSM.impl.StateImpl#getLiteral <em>Literal</em>}</li>
 *   <li>{@link org.xtext.example.mydsl3.fSM.impl.StateImpl#getOutgoingTransition <em>Outgoing Transition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateImpl extends MinimalEObjectImpl.Container implements State
{
  /**
   * The cached value of the '{@link #getLiteral() <em>Literal</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLiteral()
   * @generated
   * @ordered
   */
  protected EnumerationLiteral literal;

  /**
   * The cached value of the '{@link #getOutgoingTransition() <em>Outgoing Transition</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutgoingTransition()
   * @generated
   * @ordered
   */
  protected EList<Transition> outgoingTransition;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StateImpl()
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
    return FSMPackage.Literals.STATE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumerationLiteral getLiteral()
  {
    if (literal != null && literal.eIsProxy())
    {
      InternalEObject oldLiteral = (InternalEObject)literal;
      literal = (EnumerationLiteral)eResolveProxy(oldLiteral);
      if (literal != oldLiteral)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, FSMPackage.STATE__LITERAL, oldLiteral, literal));
      }
    }
    return literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumerationLiteral basicGetLiteral()
  {
    return literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLiteral(EnumerationLiteral newLiteral)
  {
    EnumerationLiteral oldLiteral = literal;
    literal = newLiteral;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FSMPackage.STATE__LITERAL, oldLiteral, literal));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Transition> getOutgoingTransition()
  {
    if (outgoingTransition == null)
    {
      outgoingTransition = new EObjectContainmentEList<Transition>(Transition.class, this, FSMPackage.STATE__OUTGOING_TRANSITION);
    }
    return outgoingTransition;
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
      case FSMPackage.STATE__OUTGOING_TRANSITION:
        return ((InternalEList<?>)getOutgoingTransition()).basicRemove(otherEnd, msgs);
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
      case FSMPackage.STATE__LITERAL:
        if (resolve) return getLiteral();
        return basicGetLiteral();
      case FSMPackage.STATE__OUTGOING_TRANSITION:
        return getOutgoingTransition();
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
      case FSMPackage.STATE__LITERAL:
        setLiteral((EnumerationLiteral)newValue);
        return;
      case FSMPackage.STATE__OUTGOING_TRANSITION:
        getOutgoingTransition().clear();
        getOutgoingTransition().addAll((Collection<? extends Transition>)newValue);
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
      case FSMPackage.STATE__LITERAL:
        setLiteral((EnumerationLiteral)null);
        return;
      case FSMPackage.STATE__OUTGOING_TRANSITION:
        getOutgoingTransition().clear();
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
      case FSMPackage.STATE__LITERAL:
        return literal != null;
      case FSMPackage.STATE__OUTGOING_TRANSITION:
        return outgoingTransition != null && !outgoingTransition.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //StateImpl
