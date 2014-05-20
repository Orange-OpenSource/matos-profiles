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
public final class TBSCertList
{
  // Classes

  public static class RevokedCertificate
  {
    // Fields

    public static final org.apache.harmony.security.asn1.ASN1Sequence ASN1 = null;

    // Constructors

    public RevokedCertificate(java.math.BigInteger arg1, java.util.Date arg2, Extensions arg3){
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
    public javax.security.auth.x500.X500Principal getIssuer(){
      return (javax.security.auth.x500.X500Principal) null;
    }
    public java.util.Date getRevocationDate(){
      return (java.util.Date) null;
    }
    public java.math.BigInteger getUserCertificate(){
      return (java.math.BigInteger) null;
    }
    public Extensions getCrlEntryExtensions(){
      return (Extensions) null;
    }
  }
  // Fields

  public static final org.apache.harmony.security.asn1.ASN1Sequence ASN1 = null;

  // Constructors

  private TBSCertList(int arg1, AlgorithmIdentifier arg2, org.apache.harmony.security.x501.Name arg3, java.util.Date arg4, java.util.Date arg5, java.util.List<TBSCertList.RevokedCertificate> arg6, Extensions arg7, byte [] arg8){
  }
  // Methods

  public boolean equals(java.lang.Object arg1){
    return false;
  }
  public int hashCode(){
    return 0;
  }
  public AlgorithmIdentifier getSignature(){
    return (AlgorithmIdentifier) null;
  }
  public byte [] getEncoded(){
    return (byte []) null;
  }
  public void dumpValue(java.lang.StringBuilder arg1){
  }
  public int getVersion(){
    return 0;
  }
  public org.apache.harmony.security.x501.Name getIssuer(){
    return (org.apache.harmony.security.x501.Name) null;
  }
  public java.util.Date getThisUpdate(){
    return (java.util.Date) null;
  }
  public java.util.Date getNextUpdate(){
    return (java.util.Date) null;
  }
  public java.util.List<TBSCertList.RevokedCertificate> getRevokedCertificates(){
    return (java.util.List) null;
  }
  public Extensions getCrlExtensions(){
    return (Extensions) null;
  }
}
