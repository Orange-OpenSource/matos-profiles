package com.android.org.bouncycastle.jce.provider;

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
public class PKIXPolicyNode
  implements java.security.cert.PolicyNode
{
  // Fields

  protected java.util.List children;

  protected int depth;

  protected java.util.Set expectedPolicies;

  protected java.security.cert.PolicyNode parent;

  protected java.util.Set policyQualifiers;

  protected java.lang.String validPolicy;

  protected boolean critical;

  // Constructors

  public PKIXPolicyNode(@com.francetelecom.rd.stubs.annotation.FieldSet("this.children") java.util.List arg1, int arg2, @com.francetelecom.rd.stubs.annotation.FieldSet("this.expectedPolicies") java.util.Set arg3, @com.francetelecom.rd.stubs.annotation.FieldSet("this.parent") java.security.cert.PolicyNode arg4, @com.francetelecom.rd.stubs.annotation.FieldSet("this.policyQualifiers") java.util.Set arg5, @com.francetelecom.rd.stubs.annotation.FieldSet("this.validPolicy") java.lang.String arg6, boolean arg7){
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public java.lang.String toString(java.lang.String arg1){
    return (java.lang.String) null;
  }
  public java.lang.Object clone(){
    return (java.lang.Object) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("parent")
  public java.security.cert.PolicyNode getParent(){
    return (java.security.cert.PolicyNode) null;
  }
  public PKIXPolicyNode copy(){
    return (PKIXPolicyNode) null;
  }
  public void setParent(@com.francetelecom.rd.stubs.annotation.FieldSet("this.parent") PKIXPolicyNode arg1){
  }
  public void removeChild(PKIXPolicyNode arg1){
  }
  public int getDepth(){
    return 0;
  }
  public void addChild(PKIXPolicyNode arg1){
  }
  public boolean hasChildren(){
    return false;
  }
  public java.util.Iterator getChildren(){
    return (java.util.Iterator) null;
  }
  public boolean isCritical(){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("expectedPolicies")
  public java.util.Set getExpectedPolicies(){
    return (java.util.Set) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("validPolicy")
  public java.lang.String getValidPolicy(){
    return (java.lang.String) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("policyQualifiers")
  public java.util.Set getPolicyQualifiers(){
    return (java.util.Set) null;
  }
  public void setCritical(boolean arg1){
  }
}
