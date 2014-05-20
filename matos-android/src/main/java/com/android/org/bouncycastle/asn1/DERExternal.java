package com.android.org.bouncycastle.asn1;

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


public class DERExternal
  extends ASN1Object{
  // Constructors

  public DERExternal(ASN1EncodableVector arg1){
    super();
  }
  public DERExternal(DERObjectIdentifier arg1, DERInteger arg2, ASN1Object arg3, DERTaggedObject arg4){
    super();
  }
  public DERExternal(DERObjectIdentifier arg1, DERInteger arg2, ASN1Object arg3, int arg4, DERObject arg5){
    super();
  }
  // Methods

  public int hashCode(){
    return 0;
  }
  public int getEncoding(){
    return 0;
  }
  public DERObjectIdentifier getDirectReference(){
    return (DERObjectIdentifier) null;
  }
  public DERInteger getIndirectReference(){
    return (DERInteger) null;
  }
  public ASN1Object getDataValueDescriptor(){
    return (ASN1Object) null;
  }
  public DERObject getExternalContent(){
    return (DERObject) null;
  }
}
