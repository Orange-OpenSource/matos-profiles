package org.apache.harmony.security.pkcs7;

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
public final class ContentInfo
{
  // Fields

  public static final int [] DATA = null;

  public static final int [] SIGNED_DATA = null;

  public static final int [] ENVELOPED_DATA = null;

  public static final int [] SIGNED_AND_ENVELOPED_DATA = null;

  public static final int [] DIGESTED_DATA = null;

  public static final int [] ENCRYPTED_DATA = null;

  public static final org.apache.harmony.security.asn1.ASN1Sequence ASN1 = null;

  // Constructors

  private ContentInfo(int [] arg1, java.lang.Object arg2, byte [] arg3){
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public java.lang.Object getContent(){
    return (java.lang.Object) null;
  }
  public byte [] getEncoded(){
    return (byte []) null;
  }
  public int [] getContentType(){
    return (int []) null;
  }
  public SignedData getSignedData(){
    return (SignedData) null;
  }
}
