package com.google.common.base;

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


public final class Preconditions
{
  // Constructors

  private Preconditions(){
  }
  // Methods

  public static void checkState(boolean arg1){
  }
  public static void checkState(boolean arg1, java.lang.Object arg2){
  }
  public static void checkState(boolean arg1, java.lang.String arg2, java.lang.Object [] arg3){
  }
  public static void checkArgument(boolean arg1){
  }
  public static void checkArgument(boolean arg1, java.lang.Object arg2){
  }
  public static void checkArgument(boolean arg1, java.lang.String arg2, java.lang.Object [] arg3){
  }
  public static <T>T checkNotNull(T arg1){
    return null;
  }
  public static <T>T checkNotNull(T arg1, java.lang.Object arg2){
    return null;
  }
  public static <T>T checkNotNull(T arg1, java.lang.String arg2, java.lang.Object [] arg3){
    return null;
  }
  public static int checkElementIndex(int arg1, int arg2){
    return 0;
  }
  public static int checkElementIndex(int arg1, int arg2, java.lang.String arg3){
    return 0;
  }
  public static void checkPositionIndexes(int arg1, int arg2, int arg3){
  }
  public static int checkPositionIndex(int arg1, int arg2){
    return 0;
  }
  public static int checkPositionIndex(int arg1, int arg2, java.lang.String arg3){
    return 0;
  }
}
