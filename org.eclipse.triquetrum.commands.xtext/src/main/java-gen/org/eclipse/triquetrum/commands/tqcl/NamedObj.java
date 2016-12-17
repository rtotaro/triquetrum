/**
 * generated by Xtext 2.10.0
 */
package org.eclipse.triquetrum.commands.tqcl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Obj</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.triquetrum.commands.tqcl.NamedObj#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.triquetrum.commands.tqcl.NamedObj#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.eclipse.triquetrum.commands.tqcl.TqclPackage#getNamedObj()
 * @model
 * @generated
 */
public interface NamedObj extends Parameter
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see org.eclipse.triquetrum.commands.tqcl.TqclPackage#getNamedObj_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link org.eclipse.triquetrum.commands.tqcl.NamedObj#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.eclipse.triquetrum.commands.tqcl.TqclPackage#getNamedObj_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipse.triquetrum.commands.tqcl.NamedObj#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // NamedObj
