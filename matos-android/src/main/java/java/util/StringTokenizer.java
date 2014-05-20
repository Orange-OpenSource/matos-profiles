package java.util;

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


public class StringTokenizer
  implements Enumeration<java.lang.Object>
{
  // Constructors

  public StringTokenizer(@com.francetelecom.rd.stubs.annotation.FieldSet("string") java.lang.String arg1){
  }
  public StringTokenizer(@com.francetelecom.rd.stubs.annotation.FieldSet("string") java.lang.String arg1, java.lang.String arg2){
  }
  public StringTokenizer(@com.francetelecom.rd.stubs.annotation.FieldSet("string") java.lang.String arg1, java.lang.String arg2, boolean arg3){
  }
  // Methods

  public boolean hasMoreElements(){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return nextToken();")
  public java.lang.Object nextElement(){
    return (java.lang.Object) null;
  }
  public int countTokens(){
    return 0;
  }
  public boolean hasMoreTokens(){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return \"StringTokenizer.nextToken \" + string;")
  public java.lang.String nextToken(){
    return (java.lang.String) null;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return \"StringTokenizer.nextToken \" + string;")
  public java.lang.String nextToken(java.lang.String arg1){
    return (java.lang.String) null;
  }
}
