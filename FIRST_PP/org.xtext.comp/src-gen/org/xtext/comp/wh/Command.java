/**
 * generated by Xtext 2.10.0
 */
package org.xtext.comp.wh;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.comp.wh.Command#getCmd <em>Cmd</em>}</li>
 * </ul>
 *
 * @see org.xtext.comp.wh.WhPackage#getCommand()
 * @model
 * @generated
 */
public interface Command extends EObject
{
  /**
   * Returns the value of the '<em><b>Cmd</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cmd</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cmd</em>' attribute.
   * @see #setCmd(String)
   * @see org.xtext.comp.wh.WhPackage#getCommand_Cmd()
   * @model
   * @generated
   */
  String getCmd();

  /**
   * Sets the value of the '{@link org.xtext.comp.wh.Command#getCmd <em>Cmd</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cmd</em>' attribute.
   * @see #getCmd()
   * @generated
   */
  void setCmd(String value);

} // Command