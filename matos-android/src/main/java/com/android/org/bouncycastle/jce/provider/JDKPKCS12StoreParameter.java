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
public class JDKPKCS12StoreParameter
  implements java.security.KeyStore.LoadStoreParameter
{
  // Constructors

  public JDKPKCS12StoreParameter(){
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.FieldGet("mOutputStream")
  public java.io.OutputStream getOutputStream(){
    return (java.io.OutputStream) null;
  }
  public void setOutputStream(@com.francetelecom.rd.stubs.annotation.FieldSet("mOutputStream") java.io.OutputStream arg1){
  }
  public void setPassword(char [] arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mProtectionParameter")
  public java.security.KeyStore.ProtectionParameter getProtectionParameter(){
    return (java.security.KeyStore.ProtectionParameter) null;
  }
  public boolean isUseDEREncoding(){
    return false;
  }
  public void setProtectionParameter(@com.francetelecom.rd.stubs.annotation.FieldSet("mProtectionParameter") java.security.KeyStore.ProtectionParameter arg1){
  }
  public void setUseDEREncoding(boolean arg1){
  }
}
