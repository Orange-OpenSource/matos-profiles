package org.apache.harmony.luni.lang.reflect;

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
public class GenericSignatureParser
{
  // Fields

  public ListOfTypes exceptionTypes;

  public ListOfTypes parameterTypes;

  public java.lang.reflect.TypeVariable [] formalTypeParameters;

  public java.lang.reflect.Type returnType;

  public java.lang.reflect.Type fieldType;

  public ListOfTypes interfaceTypes;

  public java.lang.reflect.Type superclassType;

  public java.lang.ClassLoader loader;

  // Constructors

  public GenericSignatureParser(java.lang.ClassLoader arg1){
  }
  // Methods

  public void parseForConstructor(java.lang.reflect.GenericDeclaration arg1, java.lang.String arg2, java.lang.Class<?> [] arg3){
  }
  public void parseForField(java.lang.reflect.GenericDeclaration arg1, java.lang.String arg2){
  }
  public void parseForMethod(java.lang.reflect.GenericDeclaration arg1, java.lang.String arg2, java.lang.Class<?> [] arg3){
  }
  public void parseForClass(java.lang.reflect.GenericDeclaration arg1, java.lang.String arg2){
  }
}
