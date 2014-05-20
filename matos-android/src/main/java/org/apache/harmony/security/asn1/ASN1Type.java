package org.apache.harmony.security.asn1;

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
public abstract class ASN1Type
  implements ASN1Constants
{
  // Fields

  public final int id = 0;

  public final int constrId = 0;

  // Constructors

  public ASN1Type(int arg1){
  }
  public ASN1Type(int arg1, int arg2){
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public final java.lang.Object decode(byte [] arg1) throws java.io.IOException{
    return (java.lang.Object) null;
  }
  public final java.lang.Object decode(byte [] arg1, int arg2, int arg3) throws java.io.IOException{
    return (java.lang.Object) null;
  }
  public final java.lang.Object decode(java.io.InputStream arg1) throws java.io.IOException{
    return (java.lang.Object) null;
  }
  public abstract java.lang.Object decode(BerInputStream arg1) throws java.io.IOException;
  public final byte [] encode(java.lang.Object arg1){
    return (byte []) null;
  }
  public final void verify(byte [] arg1) throws java.io.IOException{
  }
  public final void verify(java.io.InputStream arg1) throws java.io.IOException{
  }
  protected java.lang.Object getDecodedObject(BerInputStream arg1) throws java.io.IOException{
    return (java.lang.Object) null;
  }
  public abstract void encodeContent(BerOutputStream arg1);
  public abstract void setEncodingContent(BerOutputStream arg1);
  public abstract boolean checkTag(int arg1);
  public abstract void encodeASN(BerOutputStream arg1);
  public int getEncodedLength(BerOutputStream arg1){
    return 0;
  }
}
