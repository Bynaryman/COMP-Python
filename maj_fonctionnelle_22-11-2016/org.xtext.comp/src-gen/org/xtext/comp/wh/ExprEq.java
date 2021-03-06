/**
 * generated by Xtext 2.10.0
 */
package org.xtext.comp.wh;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expr Eq</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.comp.wh.ExprEq#getExprSimp1 <em>Expr Simp1</em>}</li>
 *   <li>{@link org.xtext.comp.wh.ExprEq#getExprSimp2 <em>Expr Simp2</em>}</li>
 *   <li>{@link org.xtext.comp.wh.ExprEq#getExpr <em>Expr</em>}</li>
 * </ul>
 *
 * @see org.xtext.comp.wh.WhPackage#getExprEq()
 * @model
 * @generated
 */
public interface ExprEq extends EObject
{
  /**
   * Returns the value of the '<em><b>Expr Simp1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr Simp1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr Simp1</em>' containment reference.
   * @see #setExprSimp1(ExprSimple)
   * @see org.xtext.comp.wh.WhPackage#getExprEq_ExprSimp1()
   * @model containment="true"
   * @generated
   */
  ExprSimple getExprSimp1();

  /**
   * Sets the value of the '{@link org.xtext.comp.wh.ExprEq#getExprSimp1 <em>Expr Simp1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr Simp1</em>' containment reference.
   * @see #getExprSimp1()
   * @generated
   */
  void setExprSimp1(ExprSimple value);

  /**
   * Returns the value of the '<em><b>Expr Simp2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr Simp2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr Simp2</em>' containment reference.
   * @see #setExprSimp2(ExprSimple)
   * @see org.xtext.comp.wh.WhPackage#getExprEq_ExprSimp2()
   * @model containment="true"
   * @generated
   */
  ExprSimple getExprSimp2();

  /**
   * Sets the value of the '{@link org.xtext.comp.wh.ExprEq#getExprSimp2 <em>Expr Simp2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr Simp2</em>' containment reference.
   * @see #getExprSimp2()
   * @generated
   */
  void setExprSimp2(ExprSimple value);

  /**
   * Returns the value of the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr</em>' containment reference.
   * @see #setExpr(Expr)
   * @see org.xtext.comp.wh.WhPackage#getExprEq_Expr()
   * @model containment="true"
   * @generated
   */
  Expr getExpr();

  /**
   * Sets the value of the '{@link org.xtext.comp.wh.ExprEq#getExpr <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' containment reference.
   * @see #getExpr()
   * @generated
   */
  void setExpr(Expr value);

} // ExprEq
