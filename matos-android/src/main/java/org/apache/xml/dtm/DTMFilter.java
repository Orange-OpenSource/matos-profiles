package org.apache.xml.dtm;

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


@com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.DTMFilterImplem", superClass = "")
public interface DTMFilter
{
  // Fields

  public static final int SHOW_ALL = -1;

  public static final int SHOW_ELEMENT = 1;

  public static final int SHOW_ATTRIBUTE = 2;

  public static final int SHOW_TEXT = 4;

  public static final int SHOW_CDATA_SECTION = 8;

  public static final int SHOW_ENTITY_REFERENCE = 16;

  public static final int SHOW_ENTITY = 32;

  public static final int SHOW_PROCESSING_INSTRUCTION = 64;

  public static final int SHOW_COMMENT = 128;

  public static final int SHOW_DOCUMENT = 256;

  public static final int SHOW_DOCUMENT_TYPE = 512;

  public static final int SHOW_DOCUMENT_FRAGMENT = 1024;

  public static final int SHOW_NOTATION = 2048;

  public static final int SHOW_NAMESPACE = 4096;

  public static final int SHOW_BYFUNCTION = 65536;

  // Methods

  public short acceptNode(int arg1, int arg2);
  public short acceptNode(int arg1, int arg2, int arg3);
}
