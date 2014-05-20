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


public class PropertyChangeSupport
  implements java.io.Serializable
{
  // Constructors

  public PropertyChangeSupport(java.lang.Object arg1){
  }
  // Methods

  public void addPropertyChangeListener(java.lang.String arg1,@com.francetelecom.rd.stubs.annotation.CallBackRegister("propertyChange")  PropertyChangeListener arg2){
  }
  public void addPropertyChangeListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("propertyChange") PropertyChangeListener arg1){
  }
  public void removePropertyChangeListener(java.lang.String arg1, PropertyChangeListener arg2){
  }
  public void removePropertyChangeListener(PropertyChangeListener arg1){
  }
  public boolean hasListeners(java.lang.String arg1){
    return false;
  }
  public void firePropertyChange(java.lang.String arg1, java.lang.Object arg2, java.lang.Object arg3){
  }
  public void firePropertyChange(java.lang.String arg1, boolean arg2, boolean arg3){
  }
  public void firePropertyChange(java.lang.String arg1, int arg2, int arg3){
  }
  public void firePropertyChange(PropertyChangeEvent arg1){
  }
  public void fireIndexedPropertyChange(java.lang.String arg1, int arg2, java.lang.Object arg3, java.lang.Object arg4){
  }
  public void fireIndexedPropertyChange(java.lang.String arg1, int arg2, boolean arg3, boolean arg4){
  }
  public void fireIndexedPropertyChange(java.lang.String arg1, int arg2, int arg3, int arg4){
  }
  public PropertyChangeListener [] getPropertyChangeListeners(java.lang.String arg1){
    return (PropertyChangeListener []) null;
  }
  public PropertyChangeListener [] getPropertyChangeListeners(){
    return (PropertyChangeListener []) null;
  }
}
