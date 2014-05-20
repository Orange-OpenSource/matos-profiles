package org.apache.harmony.security.pkcs8;

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
public final class PrivateKeyInfo
{
  // Fields

  public static final org.apache.harmony.security.asn1.ASN1Sequence ASN1 = null;

  // Constructors

  public PrivateKeyInfo(int arg1, org.apache.harmony.security.x509.AlgorithmIdentifier arg2, byte [] arg3, java.util.List arg4){
  }
  private PrivateKeyInfo(int arg1, org.apache.harmony.security.x509.AlgorithmIdentifier arg2, byte [] arg3, java.util.List arg4, byte [] arg5){
  }
  // Methods

  public java.util.List getAttributes(){
    return (java.util.List) null;
  }
  public byte [] getEncoded(){
    return (byte []) null;
  }
  public int getVersion(){
    return 0;
  }
  public org.apache.harmony.security.x509.AlgorithmIdentifier getAlgorithmIdentifier(){
    return (org.apache.harmony.security.x509.AlgorithmIdentifier) null;
  }
  public byte [] getPrivateKey(){
    return (byte []) null;
  }
}
