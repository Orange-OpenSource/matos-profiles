package org.w3c.dom;

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


public interface DOMError
{
  // Fields

  public static final short SEVERITY_WARNING = 1;

  public static final short SEVERITY_ERROR = 2;

  public static final short SEVERITY_FATAL_ERROR = 3;

  // Methods

  public DOMLocator getLocation();
  public java.lang.String getMessage();
  public java.lang.String getType();
  public short getSeverity();
  public java.lang.Object getRelatedData();
  public java.lang.Object getRelatedException();
}
