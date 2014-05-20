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
public class ProtectionDomain
{
  // Constructors

  public ProtectionDomain(@com.francetelecom.rd.stubs.annotation.FieldSet("mCodeSource") CodeSource arg1, @com.francetelecom.rd.stubs.annotation.FieldSet("mPermissions") PermissionCollection arg2){
  }
  public ProtectionDomain(@com.francetelecom.rd.stubs.annotation.FieldSet("mCodeSource") CodeSource arg1, @com.francetelecom.rd.stubs.annotation.FieldSet("mPermissions") PermissionCollection arg2, @com.francetelecom.rd.stubs.annotation.FieldSet("mClassLoader") java.lang.ClassLoader arg3, @com.francetelecom.rd.stubs.annotation.FieldSet("mPrincipals") Principal [] arg4){
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.FieldGet("mClassLoader")
  public final java.lang.ClassLoader getClassLoader(){
    return (java.lang.ClassLoader) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mCodeSource")
  public final CodeSource getCodeSource(){
    return (CodeSource) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mPermissions")
  public final PermissionCollection getPermissions(){
    return (PermissionCollection) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mPrincipals")
  public final Principal [] getPrincipals(){
    return (Principal []) null;
  }
  public boolean implies(Permission arg1){
    return false;
  }
}
