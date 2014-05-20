package org.apache.xml.utils;

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


public class NSInfo
{
  // Fields

  public java.lang.String m_namespace;

  public boolean m_hasXMLNSAttrs;

  public boolean m_hasProcessedNS;

  public int m_ancestorHasXMLNSAttrs;

  public static final int ANCESTORXMLNSUNPROCESSED = 0;

  public static final int ANCESTORHASXMLNS = 1;

  public static final int ANCESTORNOXMLNS = 2;

  // Constructors

  public NSInfo(boolean arg1, boolean arg2){
  }
  public NSInfo(boolean arg1, boolean arg2, int arg3){
  }
  public NSInfo(java.lang.String arg1, boolean arg2){
  }
}
