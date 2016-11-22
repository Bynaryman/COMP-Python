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

import org.xtext.comp.wh.Expr;
import org.xtext.comp.wh.ExprEq;
import org.xtext.comp.wh.ExprSimple;
import org.xtext.comp.wh.WhPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expr Eq</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.comp.wh.impl.ExprEqImpl#getExprSimp1 <em>Expr Simp1</em>}</li>
 *   <li>{@link org.xtext.comp.wh.impl.ExprEqImpl#getExprSimp2 <em>Expr Simp2</em>}</li>
 *   <li>{@link org.xtext.comp.wh.impl.ExprEqImpl#getExpr <em>Expr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExprEqImpl extends MinimalEObjectImpl.Container implements ExprEq
{
  /**
   * The cached value of the '{@link #getExprSimp1() <em>Expr Simp1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExprSimp1()
   * @generated
   * @ordered
   */
  protected ExprSimple exprSimp1;

  /**
   * The cached value of the '{@link #getExprSimp2() <em>Expr Simp2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExprSimp2()
   * @generated
   * @ordered
   */
  protected ExprSimple exprSimp2;

  /**
   * The cached value of the '{@link #getExpr() <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpr()
   * @generated
   * @ordered
   */
  protected Expr expr;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExprEqImpl()
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
    return WhPackage.Literals.EXPR_EQ;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprSimple getExprSimp1()
  {
    return exprSimp1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExprSimp1(ExprSimple newExprSimp1, NotificationChain msgs)
  {
    ExprSimple oldExprSimp1 = exprSimp1;
    exprSimp1 = newExprSimp1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WhPackage.EXPR_EQ__EXPR_SIMP1, oldExprSimp1, newExprSimp1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExprSimp1(ExprSimple newExprSimp1)
  {
    if (newExprSimp1 != exprSimp1)
    {
      NotificationChain msgs = null;
      if (exprSimp1 != null)
        msgs = ((InternalEObject)exprSimp1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WhPackage.EXPR_EQ__EXPR_SIMP1, null, msgs);
      if (newExprSimp1 != null)
        msgs = ((InternalEObject)newExprSimp1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WhPackage.EXPR_EQ__EXPR_SIMP1, null, msgs);
      msgs = basicSetExprSimp1(newExprSimp1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WhPackage.EXPR_EQ__EXPR_SIMP1, newExprSimp1, newExprSimp1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprSimple getExprSimp2()
  {
    return exprSimp2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExprSimp2(ExprSimple newExprSimp2, NotificationChain msgs)
  {
    ExprSimple oldExprSimp2 = exprSimp2;
    exprSimp2 = newExprSimp2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WhPackage.EXPR_EQ__EXPR_SIMP2, oldExprSimp2, newExprSimp2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExprSimp2(ExprSimple newExprSimp2)
  {
    if (newExprSimp2 != exprSimp2)
    {
      NotificationChain msgs = null;
      if (exprSimp2 != null)
        msgs = ((InternalEObject)exprSimp2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WhPackage.EXPR_EQ__EXPR_SIMP2, null, msgs);
      if (newExprSimp2 != null)
        msgs = ((InternalEObject)newExprSimp2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WhPackage.EXPR_EQ__EXPR_SIMP2, null, msgs);
      msgs = basicSetExprSimp2(newExprSimp2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WhPackage.EXPR_EQ__EXPR_SIMP2, newExprSimp2, newExprSimp2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr getExpr()
  {
    return expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpr(Expr newExpr, NotificationChain msgs)
  {
    Expr oldExpr = expr;
    expr = newExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WhPackage.EXPR_EQ__EXPR, oldExpr, newExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpr(Expr newExpr)
  {
    if (newExpr != expr)
    {
      NotificationChain msgs = null;
      if (expr != null)
        msgs = ((InternalEObject)expr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WhPackage.EXPR_EQ__EXPR, null, msgs);
      if (newExpr != null)
        msgs = ((InternalEObject)newExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WhPackage.EXPR_EQ__EXPR, null, msgs);
      msgs = basicSetExpr(newExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WhPackage.EXPR_EQ__EXPR, newExpr, newExpr));
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
      case WhPackage.EXPR_EQ__EXPR_SIMP1:
        return basicSetExprSimp1(null, msgs);
      case WhPackage.EXPR_EQ__EXPR_SIMP2:
        return basicSetExprSimp2(null, msgs);
      case WhPackage.EXPR_EQ__EXPR:
        return basicSetExpr(null, msgs);
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
      case WhPackage.EXPR_EQ__EXPR_SIMP1:
        return getExprSimp1();
      case WhPackage.EXPR_EQ__EXPR_SIMP2:
        return getExprSimp2();
      case WhPackage.EXPR_EQ__EXPR:
        return getExpr();
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
      case WhPackage.EXPR_EQ__EXPR_SIMP1:
        setExprSimp1((ExprSimple)newValue);
        return;
      case WhPackage.EXPR_EQ__EXPR_SIMP2:
        setExprSimp2((ExprSimple)newValue);
        return;
      case WhPackage.EXPR_EQ__EXPR:
        setExpr((Expr)newValue);
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
      case WhPackage.EXPR_EQ__EXPR_SIMP1:
        setExprSimp1((ExprSimple)null);
        return;
      case WhPackage.EXPR_EQ__EXPR_SIMP2:
        setExprSimp2((ExprSimple)null);
        return;
      case WhPackage.EXPR_EQ__EXPR:
        setExpr((Expr)null);
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
      case WhPackage.EXPR_EQ__EXPR_SIMP1:
        return exprSimp1 != null;
      case WhPackage.EXPR_EQ__EXPR_SIMP2:
        return exprSimp2 != null;
      case WhPackage.EXPR_EQ__EXPR:
        return expr != null;
    }
    return super.eIsSet(featureID);
  }

} //ExprEqImpl
