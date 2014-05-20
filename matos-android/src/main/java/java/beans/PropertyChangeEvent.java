package java.beans;

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


public class PropertyChangeEvent
  extends java.util.EventObject{
  // Constructors

  public PropertyChangeEvent(java.lang.Object arg1, java.lang.String arg2, java.lang.Object arg3, java.lang.Object arg4){
    super((java.lang.Object) null);
  }
  // Methods

  public java.lang.String getPropertyName(){
    return (java.lang.String) null;
  }
  public void setPropagationId(java.lang.Object arg1){
  }
  public java.lang.Object getPropagationId(){
    return (java.lang.Object) null;
  }
  public java.lang.Object getOldValue(){
    return (java.lang.Object) null;
  }
  public java.lang.Object getNewValue(){
    return (java.lang.Object) null;
  }
}
