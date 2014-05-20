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


public class PropertyChangeListenerProxy
  extends java.util.EventListenerProxy  implements PropertyChangeListener
{
  // Constructors

  public PropertyChangeListenerProxy(java.lang.String arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("propertyChange") PropertyChangeListener arg2){
    super((java.util.EventListener) null);
  }
  // Methods

  public java.lang.String getPropertyName(){
    return (java.lang.String) null;
  }
  public void propertyChange(PropertyChangeEvent arg1){
  }
}
