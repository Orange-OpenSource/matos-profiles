package org.apache.harmony.xnet.provider.jsse;

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


public class OpenSSLMessageDigestJDK
  extends java.security.MessageDigest  implements java.lang.Cloneable
{
  // Classes

  public static class MD5
    extends OpenSSLMessageDigestJDK  {
    // Constructors

    public MD5() throws java.security.NoSuchAlgorithmException{
      super((java.lang.String) null, 0, 0);
    }
  }
  public static class SHA1
    extends OpenSSLMessageDigestJDK  {
    // Constructors

    public SHA1() throws java.security.NoSuchAlgorithmException{
      super((java.lang.String) null, 0, 0);
    }
  }
  public static class SHA256
    extends OpenSSLMessageDigestJDK  {
    // Constructors

    public SHA256() throws java.security.NoSuchAlgorithmException{
      super((java.lang.String) null, 0, 0);
    }
  }
  public static class SHA384
    extends OpenSSLMessageDigestJDK  {
    // Constructors

    public SHA384() throws java.security.NoSuchAlgorithmException{
      super((java.lang.String) null, 0, 0);
    }
  }
  public static class SHA512
    extends OpenSSLMessageDigestJDK  {
    // Constructors

    public SHA512() throws java.security.NoSuchAlgorithmException{
      super((java.lang.String) null, 0, 0);
    }
  }
  // Constructors

  private OpenSSLMessageDigestJDK(java.lang.String arg1, int arg2, int arg3) throws java.security.NoSuchAlgorithmException{
    super((java.lang.String) null);
  }
  // Methods

  protected void finalize() throws java.lang.Throwable{
  }
  public java.lang.Object clone() throws java.lang.CloneNotSupportedException{
    return (java.lang.Object) null;
  }
  protected void engineUpdate(byte arg1){
  }
  protected void engineUpdate(byte [] arg1, int arg2, int arg3){
  }
  protected void engineReset(){
  }
  protected int engineGetDigestLength(){
    return 0;
  }
  protected byte [] engineDigest(){
    return (byte []) null;
  }
}
