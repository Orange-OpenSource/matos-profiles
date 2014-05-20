package java.security;

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
public final class UnresolvedPermission
  extends Permission  implements java.io.Serializable
{
  // Constructors

  public UnresolvedPermission(@com.francetelecom.rd.stubs.annotation.FieldSet("mUnresolvedType") java.lang.String arg1, @com.francetelecom.rd.stubs.annotation.FieldSet("mUnresolvedName") java.lang.String arg2, @com.francetelecom.rd.stubs.annotation.FieldSet("mUnresolvedActions") java.lang.String arg3, java.security.cert.Certificate [] arg4){
    super((java.lang.String) null);
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.Code("return \"\";")
  public java.lang.String getActions(){
    return (java.lang.String) null;
  }
  public boolean implies(Permission arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mUnresolvedActions")
  public java.lang.String getUnresolvedActions(){
    return (java.lang.String) null;
  }
  public java.security.cert.Certificate [] getUnresolvedCerts(){
    return (java.security.cert.Certificate []) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mUnresolvedName")
  public java.lang.String getUnresolvedName(){
    return (java.lang.String) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mUnresolvedType")
  public java.lang.String getUnresolvedType(){
    return (java.lang.String) null;
  }
}
