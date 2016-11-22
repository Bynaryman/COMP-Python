/**
 * generated by Xtext 2.10.0
 */
package org.xtext.comp.wh.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.comp.wh.Cons;
import org.xtext.comp.wh.ExprSimple;
import org.xtext.comp.wh.WhPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expr Simple</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.comp.wh.impl.ExprSimpleImpl#getStr <em>Str</em>}</li>
 *   <li>{@link org.xtext.comp.wh.impl.ExprSimpleImpl#getCons <em>Cons</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExprSimpleImpl extends MinimalEObjectImpl.Container implements ExprSimple
{
  /**
   * The default value of the '{@link #getStr() <em>Str</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStr()
   * @generated
   * @ordered
   */
  protected static final String STR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStr() <em>Str</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStr()
   * @generated
   * @ordered
   */
  protected String str = STR_EDEFAULT;

  /**
   * The cached value of the '{@link #getCons() <em>Cons</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCons()
   * @generated
   * @ordered
   */
  protected Cons cons;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExprSimpleImpl()
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
    return WhPackage.Literals.EXPR_SIMPLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getStr()
  {
    return str;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStr(String newStr)
  {
    String oldStr = str;
    str = newStr;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WhPackage.EXPR_SIMPLE__STR, oldStr, str));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Cons getCons()
  {
    return cons;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCons(Cons newCons, NotificationChain msgs)
  {
    Cons oldCons = cons;
    cons = newCons;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WhPackage.EXPR_SIMPLE__CONS, oldCons, newCons);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCons(Cons newCons)
  {
    if (newCons != cons)
    {
      NotificationChain msgs = null;
      if (cons != null)
        msgs = ((InternalEObject)cons).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WhPackage.EXPR_SIMPLE__CONS, null, msgs);
      if (newCons != null)
        msgs = ((InternalEObject)newCons).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WhPackage.EXPR_SIMPLE__CONS, null, msgs);
      msgs = basicSetCons(newCons, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WhPackage.EXPR_SIMPLE__CONS, newCons, newCons));
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
      case WhPackage.EXPR_SIMPLE__CONS:
        return basicSetCons(null, msgs);
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
      case WhPackage.EXPR_SIMPLE__STR:
        return getStr();
      case WhPackage.EXPR_SIMPLE__CONS:
        return getCons();
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
      case WhPackage.EXPR_SIMPLE__STR:
        setStr((String)newValue);
        return;
      case WhPackage.EXPR_SIMPLE__CONS:
        setCons((Cons)newValue);
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
      case WhPackage.EXPR_SIMPLE__STR:
        setStr(STR_EDEFAULT);
        return;
      case WhPackage.EXPR_SIMPLE__CONS:
        setCons((Cons)null);
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
      case WhPackage.EXPR_SIMPLE__STR:
        return STR_EDEFAULT == null ? str != null : !STR_EDEFAULT.equals(str);
      case WhPackage.EXPR_SIMPLE__CONS:
        return cons != null;
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
    result.append(" (str: ");
    result.append(str);
    result.append(')');
    return result.toString();
  }

} //ExprSimpleImpl
