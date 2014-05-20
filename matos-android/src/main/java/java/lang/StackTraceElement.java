package java.lang;

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


public final class StackTraceElement
  implements java.io.Serializable
{
  // Constructors

  public StackTraceElement(String arg1, String arg2, String arg3, int arg4){
  }
  private StackTraceElement(){
  }
  // Methods

  public boolean equals(Object arg1){
    return false;
  }
  public String toString(){
    return (String) null;
  }
  public int hashCode(){
    return 0;
  }
  public String getClassName(){
    return (String) null;
  }
  public String getFileName(){
    return (String) null;
  }
  public int getLineNumber(){
    return 0;
  }
  public String getMethodName(){
    return (String) null;
  }
  public boolean isNativeMethod(){
    return false;
  }
}
