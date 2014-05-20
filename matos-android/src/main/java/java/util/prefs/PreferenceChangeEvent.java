package java.util.prefs;

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


public class PreferenceChangeEvent
  extends java.util.EventObject  implements java.io.Serializable
{
  // Constructors

  public PreferenceChangeEvent(Preferences arg1, java.lang.String arg2, java.lang.String arg3){
    super((java.lang.Object) null);
  }
  // Methods

  public java.lang.String getKey(){
    return (java.lang.String) null;
  }
  public java.lang.String getNewValue(){
    return (java.lang.String) null;
  }
  public Preferences getNode(){
    return (Preferences) null;
  }
}
