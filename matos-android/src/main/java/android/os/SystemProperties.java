package android.os;

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

import com.francetelecom.rd.stubs.annotation.ArgsRule;


@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public class SystemProperties
{
  // Fields

  public static final int PROP_NAME_MAX = 31;

  public static final int PROP_VALUE_MAX = 91;

  // Constructors

  public SystemProperties(){
  }
  // Methods

  @ArgsRule(value="SystemProperties.get-1",pos={1})
  public static java.lang.String get(java.lang.String arg1){
    return (java.lang.String) null;
  }
  @ArgsRule(value="SystemProperties.get-2",pos={1})
  public static java.lang.String get(java.lang.String arg1, java.lang.String arg2){
    return (java.lang.String) null;
  }
  @ArgsRule(value="SystemProperties.getBoolean",pos={1})
  public static boolean getBoolean(java.lang.String arg1, boolean arg2){
    return false;
  }
  @ArgsRule(value="SystemProperties.getInt",pos={1})
  public static int getInt(java.lang.String arg1, int arg2){
    return 0;
  }
  @ArgsRule(value="SystemProperties.getLong",pos={1})
  public static long getLong(java.lang.String arg1, long arg2){
    return 0l;
  }
  @ArgsRule(value="SystemProperties.set",pos={1,2})
  public static void set(java.lang.String arg1, java.lang.String arg2){
  }
}
