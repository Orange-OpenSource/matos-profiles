package android.filterfw.core;

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


public class ProgramPort
  extends FieldPort{
  // Fields

  protected java.lang.String mVarName;

  // Constructors

  public ProgramPort(Filter arg1, java.lang.String arg2, java.lang.String arg3, java.lang.reflect.Field arg4, boolean arg5){
    super((Filter) null, (java.lang.String) null, (java.lang.reflect.Field) null, false);
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public synchronized void transfer(FilterContext arg1){
  }
}
