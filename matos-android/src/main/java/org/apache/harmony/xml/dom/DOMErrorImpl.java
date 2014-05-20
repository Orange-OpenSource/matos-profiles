package org.apache.harmony.xml.dom;

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


public final class DOMErrorImpl
  implements org.w3c.dom.DOMError
{
  // Constructors

  public DOMErrorImpl(short arg1, java.lang.String arg2){
  }
  // Methods

  public org.w3c.dom.DOMLocator getLocation(){
    return (org.w3c.dom.DOMLocator) null;
  }
  public java.lang.String getMessage(){
    return (java.lang.String) null;
  }
  public java.lang.String getType(){
    return (java.lang.String) null;
  }
  public short getSeverity(){
    return (short) 0;
  }
  public java.lang.Object getRelatedData(){
    return (java.lang.Object) null;
  }
  public java.lang.Object getRelatedException(){
    return (java.lang.Object) null;
  }
}
