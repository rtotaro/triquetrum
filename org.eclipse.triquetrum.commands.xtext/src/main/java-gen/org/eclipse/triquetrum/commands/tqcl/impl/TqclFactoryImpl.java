/*******************************************************************************
 * Copyright (c)  2016 Totaro Rodolfo
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    Rodolfo Totaro - initial API and implementation and/or initial documentation
 *******************************************************************************/
/**
 * generated by Xtext 2.10.0
 */
package org.eclipse.triquetrum.commands.tqcl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.triquetrum.commands.tqcl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TqclFactoryImpl extends EFactoryImpl implements TqclFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static TqclFactory init()
  {
    try
    {
      TqclFactory theTqclFactory = (TqclFactory)EPackage.Registry.INSTANCE.getEFactory(TqclPackage.eNS_URI);
      if (theTqclFactory != null)
      {
        return theTqclFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new TqclFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TqclFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case TqclPackage.TRIQUETRUM_SCRIPT: return createTriquetrumScript();
      case TqclPackage.COMMAND: return createCommand();
      case TqclPackage.INSERT: return createInsert();
      case TqclPackage.PARAMETER: return createParameter();
      case TqclPackage.NAMED_OBJ: return createNamedObj();
      case TqclPackage.CONNECT: return createConnect();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TriquetrumScript createTriquetrumScript()
  {
    TriquetrumScriptImpl triquetrumScript = new TriquetrumScriptImpl();
    return triquetrumScript;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Command createCommand()
  {
    CommandImpl command = new CommandImpl();
    return command;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Insert createInsert()
  {
    InsertImpl insert = new InsertImpl();
    return insert;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameter createParameter()
  {
    ParameterImpl parameter = new ParameterImpl();
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NamedObj createNamedObj()
  {
    NamedObjImpl namedObj = new NamedObjImpl();
    return namedObj;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Connect createConnect()
  {
    ConnectImpl connect = new ConnectImpl();
    return connect;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TqclPackage getTqclPackage()
  {
    return (TqclPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static TqclPackage getPackage()
  {
    return TqclPackage.eINSTANCE;
  }

} //TqclFactoryImpl
