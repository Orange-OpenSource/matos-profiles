package com.android.org.bouncycastle.crypto.digests;

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
public class OpenSSLDigest
  implements com.android.org.bouncycastle.crypto.ExtendedDigest
{
  // Classes

  public static class MD5
    extends OpenSSLDigest  {
    // Constructors

    public MD5(){
      super((java.lang.String) null, 0, 0, 0);
    }
  }
  public static class SHA1
    extends OpenSSLDigest  {
    // Constructors

    public SHA1(){
      super((java.lang.String) null, 0, 0, 0);
    }
  }
  public static class SHA256
    extends OpenSSLDigest  {
    // Constructors

    public SHA256(){
      super((java.lang.String) null, 0, 0, 0);
    }
  }
  public static class SHA384
    extends OpenSSLDigest  {
    // Constructors

    public SHA384(){
      super((java.lang.String) null, 0, 0, 0);
    }
  }
  public static class SHA512
    extends OpenSSLDigest  {
    // Constructors

    public SHA512(){
      super((java.lang.String) null, 0, 0, 0);
    }
  }
  // Constructors

  private OpenSSLDigest(java.lang.String arg1, int arg2, int arg3, int arg4){
  }
  // Methods

  protected void finalize() throws java.lang.Throwable{
  }
  public void reset(){
  }
  public void update(byte arg1){
  }
  public void update(byte [] arg1, int arg2, int arg3){
  }
  public java.lang.String getAlgorithmName(){
    return (java.lang.String) null;
  }
  public int getByteLength(){
    return 0;
  }
  public int doFinal(byte [] arg1, int arg2){
    return 0;
  }
  public int getDigestSize(){
    return 0;
  }
}
