package org.apache.http.auth;

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
public class AuthScope
{
  // Fields

  public static final java.lang.String ANY_HOST = null;

  public static final int ANY_PORT = -1;

  public static final java.lang.String ANY_REALM = null;

  public static final java.lang.String ANY_SCHEME = null;

  public static final AuthScope ANY = null;

  // Constructors

  public AuthScope(java.lang.String arg1, int arg2, java.lang.String arg3, java.lang.String arg4){
  }
  public AuthScope(java.lang.String arg1, int arg2, java.lang.String arg3){
  }
  public AuthScope(java.lang.String arg1, int arg2){
  }
  public AuthScope(AuthScope arg1){
  }
  // Methods

  public boolean equals(java.lang.Object arg1){
    return false;
  }
  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public int hashCode(){
    return 0;
  }
  public java.lang.String getScheme(){
    return (java.lang.String) null;
  }
  public java.lang.String getHost(){
    return (java.lang.String) null;
  }
  public int getPort(){
    return 0;
  }
  public int match(AuthScope arg1){
    return 0;
  }
  public java.lang.String getRealm(){
    return (java.lang.String) null;
  }
}
