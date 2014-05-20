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

import com.francetelecom.rd.stubs.annotation.Real;

@Real("com.francetelecom.rd.fakeandroid.IntPropertyImpl")
public abstract class IntProperty<T>
  extends Property<T, java.lang.Integer>{
  // Constructors

  public IntProperty(java.lang.String arg1){
    super((java.lang.Class) null, (java.lang.String) null);
  }
  // Methods

  public final void set(T arg1, java.lang.Integer arg2){
  }
  public abstract void setValue(T arg1, int arg2);
}
