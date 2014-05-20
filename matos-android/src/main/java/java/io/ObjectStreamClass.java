package java.io;

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


public class ObjectStreamClass
  implements Serializable
{
  // Fields

  public static final ObjectStreamField [] NO_FIELDS = null;

  // Constructors

  ObjectStreamClass(){
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public java.lang.String getName(){
    return (java.lang.String) null;
  }
  public ObjectStreamField getField(java.lang.String arg1){
    return (ObjectStreamField) null;
  }
  public ObjectStreamField [] getFields(){
    return (ObjectStreamField []) null;
  }
  public static ObjectStreamClass lookup(java.lang.Class<?> arg1){
    return (ObjectStreamClass) null;
  }
  public java.lang.Class<?> forClass(){
    return (java.lang.Class) null;
  }
  public long getSerialVersionUID(){
    return 0l;
  }
  public static ObjectStreamClass lookupAny(java.lang.Class<?> arg1){
    return (ObjectStreamClass) null;
  }
}
