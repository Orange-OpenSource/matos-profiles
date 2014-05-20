package java.lang.reflect;

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


public class Modifier
{
  // Fields

  public static final int PUBLIC = 1;

  public static final int PRIVATE = 2;

  public static final int PROTECTED = 4;

  public static final int STATIC = 8;

  public static final int FINAL = 16;

  public static final int SYNCHRONIZED = 32;

  public static final int VOLATILE = 64;

  public static final int TRANSIENT = 128;

  public static final int NATIVE = 256;

  public static final int INTERFACE = 512;

  public static final int ABSTRACT = 1024;

  public static final int STRICT = 2048;

  // Constructors

  public Modifier(){
  }
  // Methods

  public static java.lang.String toString(int arg1){
    return (java.lang.String) null;
  }
  public static boolean isInterface(int arg1){
    return false;
  }
  public static boolean isAbstract(int arg1){
    return false;
  }
  public static boolean isProtected(int arg1){
    return false;
  }
  public static boolean isFinal(int arg1){
    return false;
  }
  public static boolean isStatic(int arg1){
    return false;
  }
  public static boolean isPrivate(int arg1){
    return false;
  }
  public static boolean isPublic(int arg1){
    return false;
  }
  public static boolean isNative(int arg1){
    return false;
  }
  public static boolean isStrict(int arg1){
    return false;
  }
  public static boolean isSynchronized(int arg1){
    return false;
  }
  public static boolean isTransient(int arg1){
    return false;
  }
  public static boolean isVolatile(int arg1){
    return false;
  }
  public static int classModifiers(){
    return 0;
  }
  public static int constructorModifiers(){
    return 0;
  }
  public static int fieldModifiers(){
    return 0;
  }
  public static int interfaceModifiers(){
    return 0;
  }
  public static int methodModifiers(){
    return 0;
  }
}
