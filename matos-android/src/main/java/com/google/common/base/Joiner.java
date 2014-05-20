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


public class Joiner
{
  // Classes

  public static class MapJoiner
  {
    // Constructors

    private MapJoiner(Joiner arg1, java.lang.String arg2){
    }
    // Methods

    public java.lang.String join(java.util.Map<?, ?> arg1){
      return (java.lang.String) null;
    }
    public <A extends java.lang.Appendable>A appendTo(A arg1, java.util.Map<?, ?> arg2) throws java.io.IOException{
      return null;
    }
    public java.lang.StringBuilder appendTo(java.lang.StringBuilder arg1, java.util.Map<?, ?> arg2){
      return (java.lang.StringBuilder) null;
    }
    public Joiner.MapJoiner useForNull(java.lang.String arg1){
      return (Joiner.MapJoiner) null;
    }
  }
  // Constructors

  private Joiner(java.lang.String arg1){
  }
  private Joiner(Joiner arg1){
  }
  // Methods

  public final java.lang.String join(java.lang.Iterable<?> arg1){
    return (java.lang.String) null;
  }
  public final java.lang.String join(java.lang.Object [] arg1){
    return (java.lang.String) null;
  }
  public final java.lang.String join(@javax.annotation.Nullable java.lang.Object arg1, @javax.annotation.Nullable java.lang.Object arg2, java.lang.Object [] arg3){
    return (java.lang.String) null;
  }
  public <A extends java.lang.Appendable>A appendTo(A arg1, java.lang.Iterable<?> arg2) throws java.io.IOException{
    return null;
  }
  public final <A extends java.lang.Appendable>A appendTo(A arg1, java.lang.Object [] arg2) throws java.io.IOException{
    return null;
  }
  public final <A extends java.lang.Appendable>A appendTo(A arg1, @javax.annotation.Nullable java.lang.Object arg2, @javax.annotation.Nullable java.lang.Object arg3, java.lang.Object [] arg4) throws java.io.IOException{
    return null;
  }
  public final java.lang.StringBuilder appendTo(java.lang.StringBuilder arg1, java.lang.Iterable<?> arg2){
    return (java.lang.StringBuilder) null;
  }
  public final java.lang.StringBuilder appendTo(java.lang.StringBuilder arg1, java.lang.Object [] arg2){
    return (java.lang.StringBuilder) null;
  }
  public final java.lang.StringBuilder appendTo(java.lang.StringBuilder arg1, @javax.annotation.Nullable java.lang.Object arg2, @javax.annotation.Nullable java.lang.Object arg3, java.lang.Object [] arg4){
    return (java.lang.StringBuilder) null;
  }
  public static Joiner on(java.lang.String arg1){
    return (Joiner) null;
  }
  public static Joiner on(char arg1){
    return (Joiner) null;
  }
  public Joiner.MapJoiner withKeyValueSeparator(java.lang.String arg1){
    return (Joiner.MapJoiner) null;
  }
  public Joiner useForNull(java.lang.String arg1){
    return (Joiner) null;
  }
  public Joiner skipNulls(){
    return (Joiner) null;
  }
}
