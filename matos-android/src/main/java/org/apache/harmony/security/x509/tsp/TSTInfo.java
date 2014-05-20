package org.apache.harmony.security.x509.tsp;

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
public class TSTInfo
{
  // Fields

  public static final org.apache.harmony.security.asn1.ASN1Sequence ACCURACY = null;

  public static final org.apache.harmony.security.asn1.ASN1Sequence ASN1 = null;

  // Constructors

  public TSTInfo(int arg1, java.lang.String arg2, MessageImprint arg3, java.math.BigInteger arg4, java.util.Date arg5, int [] arg6, java.lang.Boolean arg7, java.math.BigInteger arg8, org.apache.harmony.security.x509.GeneralName arg9, org.apache.harmony.security.x509.Extensions arg10){
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public java.lang.String getPolicy(){
    return (java.lang.String) null;
  }
  public int getVersion(){
    return 0;
  }
  public java.math.BigInteger getSerialNumber(){
    return (java.math.BigInteger) null;
  }
  public java.math.BigInteger getNonce(){
    return (java.math.BigInteger) null;
  }
  public java.lang.Boolean getOrdering(){
    return (java.lang.Boolean) null;
  }
  public int [] getAccuracy(){
    return (int []) null;
  }
  public org.apache.harmony.security.x509.Extensions getExtensions(){
    return (org.apache.harmony.security.x509.Extensions) null;
  }
  public java.util.Date getGenTime(){
    return (java.util.Date) null;
  }
  public MessageImprint getMessageImprint(){
    return (MessageImprint) null;
  }
  public org.apache.harmony.security.x509.GeneralName getTsa(){
    return (org.apache.harmony.security.x509.GeneralName) null;
  }
}
