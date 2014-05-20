package org.w3c.dom.ls;

/*
 * #%L
 * Matos
 * $Id:$
 * $HeadURL:$
 * %%
 * Copyright (C) 2010 - 2014 Orange SA
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */


public interface LSParserFilter
{
  // Fields

  public static final short FILTER_ACCEPT = 1;

  public static final short FILTER_REJECT = 2;

  public static final short FILTER_SKIP = 3;

  public static final short FILTER_INTERRUPT = 4;

  // Methods

  public int getWhatToShow();
  public short acceptNode(org.w3c.dom.Node arg1);
  public short startElement(org.w3c.dom.Element arg1);
}
