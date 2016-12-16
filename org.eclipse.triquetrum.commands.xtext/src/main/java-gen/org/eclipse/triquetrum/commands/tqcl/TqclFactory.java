/**
 * generated by Xtext 2.10.0
 */
package org.eclipse.triquetrum.commands.tqcl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.triquetrum.commands.tqcl.TqclPackage
 * @generated
 */
public interface TqclFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  TqclFactory eINSTANCE = org.eclipse.triquetrum.commands.tqcl.impl.TqclFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Triquetrum Script</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Triquetrum Script</em>'.
   * @generated
   */
  TriquetrumScript createTriquetrumScript();

  /**
   * Returns a new object of class '<em>Command</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Command</em>'.
   * @generated
   */
  Command createCommand();

  /**
   * Returns a new object of class '<em>Insert</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Insert</em>'.
   * @generated
   */
  Insert createInsert();

  /**
   * Returns a new object of class '<em>Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parameter</em>'.
   * @generated
   */
  Parameter createParameter();

  /**
   * Returns a new object of class '<em>Named Obj</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Named Obj</em>'.
   * @generated
   */
  NamedObj createNamedObj();

  /**
   * Returns a new object of class '<em>Connect</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Connect</em>'.
   * @generated
   */
  Connect createConnect();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  TqclPackage getTqclPackage();

} //TqclFactory