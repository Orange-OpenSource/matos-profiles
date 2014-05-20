package com.android.org.bouncycastle.asn1.x509;

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
public class IssuingDistributionPoint
  extends com.android.org.bouncycastle.asn1.ASN1Encodable{
  // Constructors

  public IssuingDistributionPoint(DistributionPointName arg1, boolean arg2, boolean arg3, ReasonFlags arg4, boolean arg5, boolean arg6){
    super();
  }
  public IssuingDistributionPoint(com.android.org.bouncycastle.asn1.ASN1Sequence arg1){
    super();
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public static IssuingDistributionPoint getInstance(com.android.org.bouncycastle.asn1.ASN1TaggedObject arg1, boolean arg2){
    return (IssuingDistributionPoint) null;
  }
  public static IssuingDistributionPoint getInstance(java.lang.Object arg1){
    return (IssuingDistributionPoint) null;
  }
  public com.android.org.bouncycastle.asn1.DERObject toASN1Object(){
    return (com.android.org.bouncycastle.asn1.DERObject) null;
  }
  public DistributionPointName getDistributionPoint(){
    return (DistributionPointName) null;
  }
  public boolean isIndirectCRL(){
    return false;
  }
  public boolean onlyContainsUserCerts(){
    return false;
  }
  public boolean onlyContainsCACerts(){
    return false;
  }
  public boolean onlyContainsAttributeCerts(){
    return false;
  }
  public ReasonFlags getOnlySomeReasons(){
    return (ReasonFlags) null;
  }
}
