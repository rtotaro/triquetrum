/*******************************************************************************
 * Copyright (c) 2012-2016 Diamond Light Source Ltd.,
 *                         Kichwa Coders & iSencia Belgium NV.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    DLS, Kichwa Coders - initial API and implementation and/or initial documentation
 *    Erwin De Ley - extraction from DAWN to ease reuse in other contexts
 *******************************************************************************/

package org.eclipse.triquetrum.scisoft.analysis.rpc.instancedispatcher;

public class SingleArgumentBoxedPrimitiveArrays {
  public Class<Boolean[]> call(Boolean[] param) {
    return Boolean[].class;
  }

  public Class<Byte[]> call(Byte[] param) {
    return Byte[].class;
  }

  public Class<Character[]> call(Character[] param) {
    return Character[].class;
  }

  public Class<Double[]> call(Double[] param) {
    return Double[].class;
  }

  public Class<Float[]> call(Float[] param) {
    return Float[].class;
  }

  public Class<Integer[]> call(Integer[] param) {
    return Integer[].class;
  }

  public Class<Long[]> call(Long[] param) {
    return Long[].class;
  }

  public Class<Short[]> call(Short[] param) {
    return Short[].class;
  }
}
