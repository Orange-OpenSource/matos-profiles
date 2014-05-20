package org.apache.xml.dtm.ref;

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


public class ExpandedNameTable
{
  // Fields

  public static final int ELEMENT = 1;

  public static final int ATTRIBUTE = 2;

  public static final int TEXT = 3;

  public static final int CDATA_SECTION = 4;

  public static final int ENTITY_REFERENCE = 5;

  public static final int ENTITY = 6;

  public static final int PROCESSING_INSTRUCTION = 7;

  public static final int COMMENT = 8;

  public static final int DOCUMENT = 9;

  public static final int DOCUMENT_TYPE = 10;

  public static final int DOCUMENT_FRAGMENT = 11;

  public static final int NOTATION = 12;

  public static final int NAMESPACE = 13;

  // Constructors

  public ExpandedNameTable(){
  }
  // Methods

  public final short getType(int arg1){
    return (short) 0;
  }
  public int getSize(){
    return 0;
  }
  public java.lang.String getLocalName(int arg1){
    return (java.lang.String) null;
  }
  public java.lang.String getNamespace(int arg1){
    return (java.lang.String) null;
  }
  public int getExpandedTypeID(java.lang.String arg1, java.lang.String arg2, int arg3){
    return 0;
  }
  public int getExpandedTypeID(java.lang.String arg1, java.lang.String arg2, int arg3, boolean arg4){
    return 0;
  }
  public int getExpandedTypeID(int arg1){
    return 0;
  }
  public final int getNamespaceID(int arg1){
    return 0;
  }
  public final int getLocalNameID(int arg1){
    return 0;
  }
  public ExtendedType [] getExtendedTypes(){
    return (ExtendedType []) null;
  }
}
