package com.android.org.bouncycastle.jce.provider.asymmetric.ec;

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
public class Signature
  extends com.android.org.bouncycastle.jce.provider.DSABase{
  // Classes

  public static class ecDSA
    extends Signature  {
    // Constructors

    public ecDSA(){
      super((com.android.org.bouncycastle.crypto.Digest) null, (com.android.org.bouncycastle.crypto.DSA) null, (com.android.org.bouncycastle.jce.provider.DSAEncoder) null);
    }
  }
  public static class ecDSAnone
    extends Signature  {
    // Constructors

    public ecDSAnone(){
      super((com.android.org.bouncycastle.crypto.Digest) null, (com.android.org.bouncycastle.crypto.DSA) null, (com.android.org.bouncycastle.jce.provider.DSAEncoder) null);
    }
  }
  public static class ecDSA256
    extends Signature  {
    // Constructors

    public ecDSA256(){
      super((com.android.org.bouncycastle.crypto.Digest) null, (com.android.org.bouncycastle.crypto.DSA) null, (com.android.org.bouncycastle.jce.provider.DSAEncoder) null);
    }
  }
  public static class ecDSA384
    extends Signature  {
    // Constructors

    public ecDSA384(){
      super((com.android.org.bouncycastle.crypto.Digest) null, (com.android.org.bouncycastle.crypto.DSA) null, (com.android.org.bouncycastle.jce.provider.DSAEncoder) null);
    }
  }
  public static class ecDSA512
    extends Signature  {
    // Constructors

    public ecDSA512(){
      super((com.android.org.bouncycastle.crypto.Digest) null, (com.android.org.bouncycastle.crypto.DSA) null, (com.android.org.bouncycastle.jce.provider.DSAEncoder) null);
    }
  }
  // Constructors

  Signature(com.android.org.bouncycastle.crypto.Digest arg1, com.android.org.bouncycastle.crypto.DSA arg2, com.android.org.bouncycastle.jce.provider.DSAEncoder arg3){
    super((com.android.org.bouncycastle.crypto.Digest) null, (com.android.org.bouncycastle.crypto.DSA) null, (com.android.org.bouncycastle.jce.provider.DSAEncoder) null);
  }
  // Methods

  protected void engineInitSign(java.security.PrivateKey arg1, java.security.SecureRandom arg2) throws java.security.InvalidKeyException{
  }
  protected void engineInitVerify(java.security.PublicKey arg1) throws java.security.InvalidKeyException{
  }
}
