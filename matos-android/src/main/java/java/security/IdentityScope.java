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
public abstract class IdentityScope
  extends Identity{
  // Constructors

  protected IdentityScope(){
    super();
  }
  public IdentityScope(java.lang.String arg1){
    super();
  }
  public IdentityScope(java.lang.String arg1, @com.francetelecom.rd.stubs.annotation.FieldSet("mSystemScope") IdentityScope arg2) throws KeyManagementException{
    super();
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public abstract int size();
  @com.francetelecom.rd.stubs.annotation.FieldGet("mSystemScope")
  public static IdentityScope getSystemScope(){
    return (IdentityScope) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mIdentity")
  public abstract Identity getIdentity(java.lang.String arg1);
  @com.francetelecom.rd.stubs.annotation.FieldGet("mIdentity")
  public Identity getIdentity(Principal arg1){
    return (Identity) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mIdentity")
  public abstract Identity getIdentity(PublicKey arg1);
  public abstract void addIdentity(@com.francetelecom.rd.stubs.annotation.FieldSet("mIdentity") Identity arg1) throws KeyManagementException;
  public abstract void removeIdentity(Identity arg1) throws KeyManagementException;
  public abstract java.util.Enumeration<Identity> identities();
  protected static void setSystemScope(@com.francetelecom.rd.stubs.annotation.FieldSet("mSystemScope") IdentityScope arg1){
  }
}
