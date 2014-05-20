package org.ccil.cowan.tagsoup;

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
public abstract class Schema
{
  // Fields

  public static final int M_ANY = -1;

  public static final int M_EMPTY = 0;

  public static final int M_PCDATA = 1073741824;

  public static final int M_ROOT = -2147483648;

  public static final int F_RESTART = 1;

  public static final int F_CDATA = 2;

  public static final int F_NOFORCE = 4;

  // Constructors

  public Schema(){
  }
  // Methods

  public void parent(java.lang.String arg1, java.lang.String arg2){
  }
  public java.lang.String getPrefix(){
    return (java.lang.String) null;
  }
  public void setPrefix(java.lang.String arg1){
  }
  public java.lang.String getURI(){
    return (java.lang.String) null;
  }
  public void setURI(java.lang.String arg1){
  }
  public int getEntity(java.lang.String arg1){
    return 0;
  }
  public void entity(java.lang.String arg1, int arg2){
  }
  public void attribute(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4){
  }
  public void elementType(java.lang.String arg1, int arg2, int arg3, int arg4){
  }
  public ElementType rootElementType(){
    return (ElementType) null;
  }
  public ElementType getElementType(java.lang.String arg1){
    return (ElementType) null;
  }
}
