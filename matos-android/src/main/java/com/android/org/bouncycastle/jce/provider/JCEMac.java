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
public class JCEMac
  extends javax.crypto.MacSpi  implements PBE
{
  // Classes

  public static class MD5
    extends JCEMac  {
    // Constructors

    public MD5(){
      super((com.android.org.bouncycastle.crypto.Mac) null);
    }
  }
  public static class SHA1
    extends JCEMac  {
    // Constructors

    public SHA1(){
      super((com.android.org.bouncycastle.crypto.Mac) null);
    }
  }
  public static class SHA256
    extends JCEMac  {
    // Constructors

    public SHA256(){
      super((com.android.org.bouncycastle.crypto.Mac) null);
    }
  }
  public static class SHA384
    extends JCEMac  {
    // Constructors

    public SHA384(){
      super((com.android.org.bouncycastle.crypto.Mac) null);
    }
  }
  public static class SHA512
    extends JCEMac  {
    // Constructors

    public SHA512(){
      super((com.android.org.bouncycastle.crypto.Mac) null);
    }
  }
  public static class PBEWithSHA
    extends JCEMac  {
    // Constructors

    public PBEWithSHA(){
      super((com.android.org.bouncycastle.crypto.Mac) null);
    }
  }
  // Constructors

  protected JCEMac(com.android.org.bouncycastle.crypto.Mac arg1){
    super();
  }
  protected JCEMac(com.android.org.bouncycastle.crypto.Mac arg1, int arg2, int arg3, int arg4){
    super();
  }
  // Methods

  protected void engineInit(java.security.Key arg1, java.security.spec.AlgorithmParameterSpec arg2) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException{
  }
  protected void engineUpdate(byte arg1){
  }
  protected void engineUpdate(byte [] arg1, int arg2, int arg3){
  }
  protected byte [] engineDoFinal(){
    return (byte []) null;
  }
  protected void engineReset(){
  }
  protected int engineGetMacLength(){
    return 0;
  }
}
