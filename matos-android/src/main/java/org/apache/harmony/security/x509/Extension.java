package org.apache.harmony.security.x509;

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
public final class Extension
{
  // Fields

  public static final boolean CRITICAL = true;

  public static final boolean NON_CRITICAL = false;

  protected ExtensionValue extnValueObject;

  public static final org.apache.harmony.security.asn1.ASN1Sequence ASN1 = null;

  // Constructors

  public Extension(java.lang.String arg1, boolean arg2, ExtensionValue arg3){
  }
  public Extension(java.lang.String arg1, boolean arg2, byte [] arg3){
  }
  public Extension(int [] arg1, boolean arg2, byte [] arg3){
  }
  public Extension(java.lang.String arg1, byte [] arg2){
  }
  public Extension(int [] arg1, byte [] arg2){
  }
  private Extension(int [] arg1, boolean arg2, byte [] arg3, byte [] arg4, byte [] arg5, ExtensionValue arg6){
  }
  // Methods

  public boolean equals(java.lang.Object arg1){
    return false;
  }
  public int hashCode(){
    return 0;
  }
  public byte [] getEncoded(){
    return (byte []) null;
  }
  public void dumpValue(java.lang.StringBuilder arg1, java.lang.String arg2){
  }
  public java.lang.String getExtnID(){
    return (java.lang.String) null;
  }
  public boolean getCritical(){
    return false;
  }
  public byte [] getExtnValue(){
    return (byte []) null;
  }
  public byte [] getRawExtnValue(){
    return (byte []) null;
  }
  public ExtensionValue getDecodedExtensionValue() throws java.io.IOException{
    return (ExtensionValue) null;
  }
  public KeyUsage getKeyUsageValue(){
    return (KeyUsage) null;
  }
  public BasicConstraints getBasicConstraintsValue(){
    return (BasicConstraints) null;
  }
}
