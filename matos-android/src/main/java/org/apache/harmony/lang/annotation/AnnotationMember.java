package org.apache.harmony.lang.annotation;

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


@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public class AnnotationMember
  implements java.io.Serializable
{
  // Fields

  protected static final char ERROR = '\u0000';

  protected static final char ARRAY = '\u0000';

  protected static final char OTHER = '\u0000';

  protected static final java.lang.Object NO_VALUE = null;

  protected final java.lang.String name = (java.lang.String) null;

  protected final java.lang.Object value = (java.lang.Object) null;

  protected final char tag = '\u0000';

  protected java.lang.Class<?> elementType;

  protected java.lang.reflect.Method definingMethod;

  // Constructors

  public AnnotationMember(java.lang.String arg1, java.lang.Object arg2){
  }
  public AnnotationMember(java.lang.String arg1, java.lang.Object arg2, java.lang.Class arg3, java.lang.reflect.Method arg4){
  }
  // Methods

  public boolean equals(java.lang.Object arg1){
    return false;
  }
  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public int hashCode(){
    return 0;
  }
  protected AnnotationMember setDefinition(AnnotationMember arg1){
    return (AnnotationMember) null;
  }
  public boolean equalArrayValue(java.lang.Object arg1){
    return false;
  }
  public void rethrowError() throws java.lang.Throwable{
  }
  public java.lang.Object validateValue() throws java.lang.Throwable{
    return (java.lang.Object) null;
  }
  public java.lang.Object copyValue() throws java.lang.Throwable{
    return (java.lang.Object) null;
  }
}
