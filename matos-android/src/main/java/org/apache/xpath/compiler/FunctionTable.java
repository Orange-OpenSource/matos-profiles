package org.apache.xpath.compiler;

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


public class FunctionTable
{
  // Fields

  public static final int FUNC_CURRENT = 0;

  public static final int FUNC_LAST = 1;

  public static final int FUNC_POSITION = 2;

  public static final int FUNC_COUNT = 3;

  public static final int FUNC_ID = 4;

  public static final int FUNC_KEY = 5;

  public static final int FUNC_LOCAL_PART = 7;

  public static final int FUNC_NAMESPACE = 8;

  public static final int FUNC_QNAME = 9;

  public static final int FUNC_GENERATE_ID = 10;

  public static final int FUNC_NOT = 11;

  public static final int FUNC_TRUE = 12;

  public static final int FUNC_FALSE = 13;

  public static final int FUNC_BOOLEAN = 14;

  public static final int FUNC_NUMBER = 15;

  public static final int FUNC_FLOOR = 16;

  public static final int FUNC_CEILING = 17;

  public static final int FUNC_ROUND = 18;

  public static final int FUNC_SUM = 19;

  public static final int FUNC_STRING = 20;

  public static final int FUNC_STARTS_WITH = 21;

  public static final int FUNC_CONTAINS = 22;

  public static final int FUNC_SUBSTRING_BEFORE = 23;

  public static final int FUNC_SUBSTRING_AFTER = 24;

  public static final int FUNC_NORMALIZE_SPACE = 25;

  public static final int FUNC_TRANSLATE = 26;

  public static final int FUNC_CONCAT = 27;

  public static final int FUNC_SUBSTRING = 29;

  public static final int FUNC_STRING_LENGTH = 30;

  public static final int FUNC_SYSTEM_PROPERTY = 31;

  public static final int FUNC_LANG = 32;

  public static final int FUNC_EXT_FUNCTION_AVAILABLE = 33;

  public static final int FUNC_EXT_ELEM_AVAILABLE = 34;

  public static final int FUNC_UNPARSED_ENTITY_URI = 36;

  public static final int FUNC_DOCLOCATION = 35;

  // Constructors

  public FunctionTable(){
  }
  // Methods

  public boolean functionAvailable(java.lang.String arg1){
    return false;
  }
  public int installFunction(java.lang.String arg1, java.lang.Class arg2){
    return 0;
  }
}
