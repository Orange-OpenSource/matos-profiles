package org.apache.xml.dtm.ref;

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


public class NodeLocator
  implements javax.xml.transform.SourceLocator
{
  // Fields

  protected java.lang.String m_publicId;

  protected java.lang.String m_systemId;

  protected int m_lineNumber;

  protected int m_columnNumber;

  // Constructors

  public NodeLocator(java.lang.String arg1, java.lang.String arg2, int arg3, int arg4){
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public int getLineNumber(){
    return 0;
  }
  public java.lang.String getPublicId(){
    return (java.lang.String) null;
  }
  public java.lang.String getSystemId(){
    return (java.lang.String) null;
  }
  public int getColumnNumber(){
    return 0;
  }
}
