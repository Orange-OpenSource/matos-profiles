package javax.security.auth.x500;

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


public final class X500Principal
  implements java.security.Principal, java.io.Serializable
{
  // Fields

  public static final java.lang.String CANONICAL = "CANONICAL";

  public static final java.lang.String RFC1779 = "RFC1779";

  public static final java.lang.String RFC2253 = "RFC2253";

  // Constructors

  public X500Principal(byte [] arg1){
  }
  public X500Principal(java.io.InputStream arg1){
  }
  public X500Principal(java.lang.String arg1){
  }
  public X500Principal(java.lang.String arg1, java.util.Map<java.lang.String, java.lang.String> arg2){
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
  public java.lang.String getName(){
    return (java.lang.String) null;
  }
  public java.lang.String getName(java.lang.String arg1){
    return (java.lang.String) null;
  }
  public java.lang.String getName(java.lang.String arg1, java.util.Map<java.lang.String, java.lang.String> arg2){
    return (java.lang.String) null;
  }
  public byte [] getEncoded(){
    return (byte []) null;
  }
}
