package org.apache.harmony.xnet.provider.jsse;

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
public class CipherSuite
{
  // Constructors

  private CipherSuite(java.lang.String arg1, boolean arg2, int arg3, java.lang.String arg4, java.lang.String arg5, java.lang.String arg6, byte [] arg7){
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public java.lang.String getName(){
    return (java.lang.String) null;
  }
  public static CipherSuite getByName(java.lang.String arg1){
    return (CipherSuite) null;
  }
  public int getBlockSize(){
    return 0;
  }
  public boolean isExportable(){
    return false;
  }
  public static CipherSuite getByCode(byte arg1, byte arg2){
    return (CipherSuite) null;
  }
  public static CipherSuite getByCode(byte arg1, byte arg2, byte arg3){
    return (CipherSuite) null;
  }
  public boolean isAnonymous(){
    return false;
  }
  public static CipherSuite [] getSupported(){
    return (CipherSuite []) null;
  }
  public static java.lang.String [] getSupportedCipherSuiteNames(){
    return (java.lang.String []) null;
  }
  public byte [] toBytes(){
    return (byte []) null;
  }
  public java.lang.String getBulkEncryptionAlgorithm(){
    return (java.lang.String) null;
  }
  public java.lang.String getHmacName(){
    return (java.lang.String) null;
  }
  public java.lang.String getHashName(){
    return (java.lang.String) null;
  }
  public int getMACLength(){
    return 0;
  }
  public java.lang.String getServerKeyType(){
    return (java.lang.String) null;
  }
  public static java.lang.String getClientKeyType(byte arg1){
    return (java.lang.String) null;
  }
  public java.lang.String getAuthType(boolean arg1){
    return (java.lang.String) null;
  }
}
