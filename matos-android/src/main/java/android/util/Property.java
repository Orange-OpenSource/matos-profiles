package android.util;

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

import com.francetelecom.rd.stubs.annotation.FieldGet;
import com.francetelecom.rd.stubs.annotation.FieldSet;

@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public abstract class Property<T, V>
{
  // Constructors
	
  public Property(@FieldSet("clazz")java.lang.Class<V> arg1, java.lang.String arg2){
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.FieldGet("val")
  public abstract V get(T arg1);
  public java.lang.String getName(){
    return (java.lang.String) null;
  }
  @FieldGet("clazz")
  public java.lang.Class<V> getType(){
    return (java.lang.Class) null;
  }
  public void set(T arg1, @com.francetelecom.rd.stubs.annotation.FieldSet("val") V arg2){
  }
  public boolean isReadOnly(){
    return false;
  }
  public static <T, V>Property<T, V> of(java.lang.Class<T> arg1, java.lang.Class<V> arg2, java.lang.String arg3){
    return (Property) null;
  }
}
