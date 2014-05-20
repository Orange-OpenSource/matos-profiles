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

import com.francetelecom.rd.stubs.annotation.Code;
import com.francetelecom.rd.stubs.annotation.FieldSet;
import com.francetelecom.rd.stubs.annotation.Real;


@com.francetelecom.rd.stubs.annotation.ClassDone(0)
@Real("com.francetelecom.rd.fakeandroid.SecurityPolicyImpl")
public abstract class Policy
{
  // Classes

  @com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.PolicyParametersImplem", superClass = "")
  public static interface Parameters
  {
  }
  // Fields

  public static final PermissionCollection UNSUPPORTED_EMPTY_COLLECTION = null;

  // Constructors

  public Policy(){
  }
  
  protected Policy(@FieldSet("mType") String arg1, @FieldSet("mParameters")Policy.Parameters arg2) {}
  // Methods

  @Code("return new com.francetelecom.rd.fakeandroid.SecurityPolicyImpl(arg1,arg2);")
  public static Policy getInstance( java.lang.String arg1,  Policy.Parameters arg2) throws NoSuchAlgorithmException{
    return (Policy) null;
  }
  @Code("return new com.francetelecom.rd.fakeandroid.SecurityPolicyImpl(arg1,arg2);")
  public static Policy getInstance( java.lang.String arg1,  Policy.Parameters arg2, java.lang.String arg3) throws NoSuchProviderException, NoSuchAlgorithmException{
    return (Policy) null;
  }
  @Code("return new com.francetelecom.rd.fakeandroid.SecurityPolicyImpl(arg1,arg2);")
  public static Policy getInstance( java.lang.String arg1,  Policy.Parameters arg2, Provider arg3) throws NoSuchAlgorithmException{
    return (Policy) null;
  }
  public PermissionCollection getPermissions(CodeSource arg1){
    return (PermissionCollection) null;
  }
  public PermissionCollection getPermissions(ProtectionDomain arg1){
    return (PermissionCollection) null;
  }
  public boolean implies(ProtectionDomain arg1, Permission arg2){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mType")
  public java.lang.String getType(){
    return (java.lang.String) null;
  }
  public void refresh(){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mParameters")
  public Policy.Parameters getParameters(){
    return (Policy.Parameters) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mPolicy")
  public static Policy getPolicy(){
    return (Policy) null;
  }
  
  public Provider getProvider(){
    return (Provider) null;
  }
  public static void setPolicy(@com.francetelecom.rd.stubs.annotation.FieldSet("mPolicy") Policy arg1){
  }
}
