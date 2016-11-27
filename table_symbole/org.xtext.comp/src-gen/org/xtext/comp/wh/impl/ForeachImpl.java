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

import org.xtext.comp.wh.Commands;
import org.xtext.comp.wh.Expr;
import org.xtext.comp.wh.Foreach;
import org.xtext.comp.wh.WhPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Foreach</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.comp.wh.impl.ForeachImpl#getExpr1 <em>Expr1</em>}</li>
 *   <li>{@link org.xtext.comp.wh.impl.ForeachImpl#getExpr2 <em>Expr2</em>}</li>
 *   <li>{@link org.xtext.comp.wh.impl.ForeachImpl#getCmds <em>Cmds</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ForeachImpl extends MinimalEObjectImpl.Container implements Foreach
{
  /**
   * The cached value of the '{@link #getExpr1() <em>Expr1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpr1()
   * @generated
   * @ordered
   */
  protected Expr expr1;

  /**
   * The cached value of the '{@link #getExpr2() <em>Expr2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpr2()
   * @generated
   * @ordered
   */
  protected Expr expr2;

  /**
   * The cached value of the '{@link #getCmds() <em>Cmds</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCmds()
   * @generated
   * @ordered
   */
  protected Commands cmds;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ForeachImpl()
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
    return WhPackage.Literals.FOREACH;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr getExpr1()
  {
    return expr1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpr1(Expr newExpr1, NotificationChain msgs)
  {
    Expr oldExpr1 = expr1;
    expr1 = newExpr1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WhPackage.FOREACH__EXPR1, oldExpr1, newExpr1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpr1(Expr newExpr1)
  {
    if (newExpr1 != expr1)
    {
      NotificationChain msgs = null;
      if (expr1 != null)
        msgs = ((InternalEObject)expr1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WhPackage.FOREACH__EXPR1, null, msgs);
      if (newExpr1 != null)
        msgs = ((InternalEObject)newExpr1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WhPackage.FOREACH__EXPR1, null, msgs);
      msgs = basicSetExpr1(newExpr1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WhPackage.FOREACH__EXPR1, newExpr1, newExpr1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr getExpr2()
  {
    return expr2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpr2(Expr newExpr2, NotificationChain msgs)
  {
    Expr oldExpr2 = expr2;
    expr2 = newExpr2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WhPackage.FOREACH__EXPR2, oldExpr2, newExpr2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpr2(Expr newExpr2)
  {
    if (newExpr2 != expr2)
    {
      NotificationChain msgs = null;
      if (expr2 != null)
        msgs = ((InternalEObject)expr2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WhPackage.FOREACH__EXPR2, null, msgs);
      if (newExpr2 != null)
        msgs = ((InternalEObject)newExpr2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WhPackage.FOREACH__EXPR2, null, msgs);
      msgs = basicSetExpr2(newExpr2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WhPackage.FOREACH__EXPR2, newExpr2, newExpr2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Commands getCmds()
  {
    return cmds;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCmds(Commands newCmds, NotificationChain msgs)
  {
    Commands oldCmds = cmds;
    cmds = newCmds;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WhPackage.FOREACH__CMDS, oldCmds, newCmds);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCmds(Commands newCmds)
  {
    if (newCmds != cmds)
    {
      NotificationChain msgs = null;
      if (cmds != null)
        msgs = ((InternalEObject)cmds).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WhPackage.FOREACH__CMDS, null, msgs);
      if (newCmds != null)
        msgs = ((InternalEObject)newCmds).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WhPackage.FOREACH__CMDS, null, msgs);
      msgs = basicSetCmds(newCmds, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WhPackage.FOREACH__CMDS, newCmds, newCmds));
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
      case WhPackage.FOREACH__EXPR1:
        return basicSetExpr1(null, msgs);
      case WhPackage.FOREACH__EXPR2:
        return basicSetExpr2(null, msgs);
      case WhPackage.FOREACH__CMDS:
        return basicSetCmds(null, msgs);
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
      case WhPackage.FOREACH__EXPR1:
        return getExpr1();
      case WhPackage.FOREACH__EXPR2:
        return getExpr2();
      case WhPackage.FOREACH__CMDS:
        return getCmds();
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
      case WhPackage.FOREACH__EXPR1:
        setExpr1((Expr)newValue);
        return;
      case WhPackage.FOREACH__EXPR2:
        setExpr2((Expr)newValue);
        return;
      case WhPackage.FOREACH__CMDS:
        setCmds((Commands)newValue);
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
      case WhPackage.FOREACH__EXPR1:
        setExpr1((Expr)null);
        return;
      case WhPackage.FOREACH__EXPR2:
        setExpr2((Expr)null);
        return;
      case WhPackage.FOREACH__CMDS:
        setCmds((Commands)null);
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
      case WhPackage.FOREACH__EXPR1:
        return expr1 != null;
      case WhPackage.FOREACH__EXPR2:
        return expr2 != null;
      case WhPackage.FOREACH__CMDS:
        return cmds != null;
    }
    return super.eIsSet(featureID);
  }

} //ForeachImpl
