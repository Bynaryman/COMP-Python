/**
 * generated by Xtext 2.10.0
 */
package org.xtext.comp.wh;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Affect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.comp.wh.Affect#getVars <em>Vars</em>}</li>
 *   <li>{@link org.xtext.comp.wh.Affect#getExp <em>Exp</em>}</li>
 * </ul>
 *
 * @see org.xtext.comp.wh.WhPackage#getAffect()
 * @model
 * @generated
 */
public interface Affect extends EObject
{
  /**
   * Returns the value of the '<em><b>Vars</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vars</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vars</em>' containment reference.
   * @see #setVars(Vars)
   * @see org.xtext.comp.wh.WhPackage#getAffect_Vars()
   * @model containment="true"
   * @generated
   */
  Vars getVars();

  /**
   * Sets the value of the '{@link org.xtext.comp.wh.Affect#getVars <em>Vars</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Vars</em>' containment reference.
   * @see #getVars()
   * @generated
   */
  void setVars(Vars value);

  /**
   * Returns the value of the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp</em>' containment reference.
   * @see #setExp(Exprs)
   * @see org.xtext.comp.wh.WhPackage#getAffect_Exp()
   * @model containment="true"
   * @generated
   */
  Exprs getExp();

  /**
   * Sets the value of the '{@link org.xtext.comp.wh.Affect#getExp <em>Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp</em>' containment reference.
   * @see #getExp()
   * @generated
   */
  void setExp(Exprs value);

} // Affect
