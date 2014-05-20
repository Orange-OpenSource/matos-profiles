package org.apache.xml.serializer.dom3;

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


public class NamespaceSupport
{
  // Classes

  protected final class Prefixes
    implements java.util.Enumeration
  {
    // Fields

    // Constructors

    public Prefixes(java.lang.String [] arg1, int arg2){
    }
    // Methods

    public java.lang.String toString(){
      return (java.lang.String) null;
    }
    public boolean hasMoreElements(){
      return false;
    }
    public java.lang.Object nextElement(){
      return (java.lang.Object) null;
    }
  }
  // Fields

  public static final java.lang.String XML_URI = null;

  public static final java.lang.String XMLNS_URI = null;

  protected java.lang.String [] fNamespace;

  protected int fNamespaceSize;

  protected int [] fContext;

  protected int fCurrentContext;

  protected java.lang.String [] fPrefixes;

  // Constructors

  public NamespaceSupport(){
  }
  // Methods

  public void reset(){
  }
  public java.lang.String getPrefix(java.lang.String arg1){
    return (java.lang.String) null;
  }
  public java.lang.String getURI(java.lang.String arg1){
    return (java.lang.String) null;
  }
  public boolean declarePrefix(java.lang.String arg1, java.lang.String arg2){
    return false;
  }
  public void pushContext(){
  }
  public void popContext(){
  }
  public int getDeclaredPrefixCount(){
    return 0;
  }
  public java.lang.String getDeclaredPrefixAt(int arg1){
    return (java.lang.String) null;
  }
  public java.util.Enumeration getAllPrefixes(){
    return (java.util.Enumeration) null;
  }
}
