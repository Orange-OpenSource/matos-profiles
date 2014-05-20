package org.apache.xml.serializer;

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


public final class OutputPropertiesFactory
{
  // Fields

  public static final java.lang.String S_BUILTIN_EXTENSIONS_UNIVERSAL = "{http://xml.apache.org/xalan}";

  public static final java.lang.String S_KEY_INDENT_AMOUNT = "{http://xml.apache.org/xalan}indent-amount";

  public static final java.lang.String S_KEY_LINE_SEPARATOR = "{http://xml.apache.org/xalan}line-separator";

  public static final java.lang.String S_KEY_CONTENT_HANDLER = "{http://xml.apache.org/xalan}content-handler";

  public static final java.lang.String S_KEY_ENTITIES = "{http://xml.apache.org/xalan}entities";

  public static final java.lang.String S_USE_URL_ESCAPING = "{http://xml.apache.org/xalan}use-url-escaping";

  public static final java.lang.String S_OMIT_META_TAG = "{http://xml.apache.org/xalan}omit-meta-tag";

  public static final java.lang.String S_BUILTIN_OLD_EXTENSIONS_UNIVERSAL = "{http://xml.apache.org/xslt}";

  public static final int S_BUILTIN_OLD_EXTENSIONS_UNIVERSAL_LEN = 0;

  // Constructors

  public OutputPropertiesFactory(){
  }
  // Methods

  public static final java.util.Properties getDefaultMethodProperties(java.lang.String arg1){
    return (java.util.Properties) null;
  }
}
