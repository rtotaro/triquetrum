/*******************************************************************************
 * Copyright (c) 2015, 2016 iSencia Belgium NV.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Erwin De Ley - initial API and implementation and/or initial documentation
 *******************************************************************************/
package org.eclipse.triquetrum.workflow.editor.features;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.IReason;
import org.eclipse.graphiti.features.context.IUpdateContext;
import org.eclipse.graphiti.features.impl.AbstractUpdateFeature;
import org.eclipse.graphiti.features.impl.Reason;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.util.IColorConstant;
import org.eclipse.triquetrum.workflow.editor.BoCategory;
import org.eclipse.triquetrum.workflow.model.Port;

/**
 *
 */
public class PortUpdateFeature extends AbstractUpdateFeature {

  private static final String PORT_CHANGED_MULTI = "PORT_CHANGED_MULTI";
// this is not yet allowed in Triq
// private static final String PORT_CHANGED_IO = "PORT_CHANGED_IO";
  private static final String PORT_CHANGED = "PORT_CHANGED";

  public PortUpdateFeature(IFeatureProvider fp) {
    super(fp);
  }

  @Override
  public boolean canUpdate(IUpdateContext context) {
    BoCategory boCategory = BoCategory.retrieveFrom(context.getPictogramElement());
    return (BoCategory.Output.equals(boCategory) || BoCategory.Input.equals(boCategory));
  }

  @Override
  public IReason updateNeeded(IUpdateContext context) {
    PictogramElement pictogramElement = context.getPictogramElement();
    Object bo = getBusinessObjectForPictogramElement(pictogramElement);
    Port p = null;
    if (bo instanceof Port && pictogramElement instanceof Anchor) {
      p = (Port) bo;
      Anchor anchor = (Anchor) pictogramElement;
//      BoCategory boCategory = BoCategory.retrieveFrom(anchor);
//      boolean portInputOutputChange = (BoCategory.Input.equals(boCategory) && !p.isInput()) || (BoCategory.Output.equals(boCategory) && !p.isOutput());
      // a bit more complex : check port colour and compare it to multiport property
      GraphicsAlgorithm portGA = anchor.getGraphicsAlgorithm();
      IColorConstant expectedPortBackgroundColor = p.isMultiPort() ? ActorAddFeature.PORT_BACKGROUND_MULTIPORT : ActorAddFeature.PORT_BACKGROUND_SINGLEPORT;
      boolean portMultiPortChange = !portGA.getBackground().equals(manageColor(expectedPortBackgroundColor));

      if (/*portInputOutputChange ||*/ portMultiPortChange) {
        context.putProperty(PORT_CHANGED, p.getName());
//        context.putProperty(PORT_CHANGED_IO, Boolean.toString(portInputOutputChange));
        context.putProperty(PORT_CHANGED_MULTI, Boolean.toString(portMultiPortChange));
        return Reason.createTrueReason("Port change");
      }
    }
    return Reason.createFalseReason();
  }

  @Override
  public boolean update(IUpdateContext context) {
    boolean result = false;
    PictogramElement pictogramElement = context.getPictogramElement();
    Object bo = getBusinessObjectForPictogramElement(pictogramElement);
    if (bo instanceof Port && pictogramElement instanceof Anchor) {
      Port p = (Port) bo;
      Anchor anchor = (Anchor) pictogramElement;
      GraphicsAlgorithm portGA = anchor.getGraphicsAlgorithm();
      boolean portMultiPortChange = Boolean.valueOf((String)context.getProperty(PORT_CHANGED_MULTI));
      if (portMultiPortChange) {
        IColorConstant portColour = p.isMultiPort() ? ActorAddFeature.PORT_BACKGROUND_MULTIPORT : ActorAddFeature.PORT_BACKGROUND_SINGLEPORT;
        portGA.setBackground(manageColor(portColour));
      }
    }
    return result;
  }
}
