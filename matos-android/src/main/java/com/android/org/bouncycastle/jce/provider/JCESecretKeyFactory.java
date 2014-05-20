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
public class JCESecretKeyFactory
  extends javax.crypto.SecretKeyFactorySpi  implements PBE
{
  // Classes

  public static class PBEKeyFactory
    extends JCESecretKeyFactory  {
    // Constructors

    public PBEKeyFactory(java.lang.String arg1, com.android.org.bouncycastle.asn1.DERObjectIdentifier arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7){
      super((java.lang.String) null, (com.android.org.bouncycastle.asn1.DERObjectIdentifier) null);
    }
    // Methods

    protected javax.crypto.SecretKey engineGenerateSecret(java.security.spec.KeySpec arg1) throws java.security.spec.InvalidKeySpecException{
      return (javax.crypto.SecretKey) null;
    }
  }
  public static class DESPBEKeyFactory
    extends JCESecretKeyFactory  {
    // Constructors

    public DESPBEKeyFactory(java.lang.String arg1, com.android.org.bouncycastle.asn1.DERObjectIdentifier arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7){
      super((java.lang.String) null, (com.android.org.bouncycastle.asn1.DERObjectIdentifier) null);
    }
    // Methods

    protected javax.crypto.SecretKey engineGenerateSecret(java.security.spec.KeySpec arg1) throws java.security.spec.InvalidKeySpecException{
      return (javax.crypto.SecretKey) null;
    }
  }
  public static class DES
    extends JCESecretKeyFactory  {
    // Constructors

    public DES(){
      super((java.lang.String) null, (com.android.org.bouncycastle.asn1.DERObjectIdentifier) null);
    }
    // Methods

    protected javax.crypto.SecretKey engineGenerateSecret(java.security.spec.KeySpec arg1) throws java.security.spec.InvalidKeySpecException{
      return (javax.crypto.SecretKey) null;
    }
  }
  public static class PBEWithMD5AndDES
    extends JCESecretKeyFactory.DESPBEKeyFactory  {
    // Constructors

    public PBEWithMD5AndDES(){
      super((java.lang.String) null, (com.android.org.bouncycastle.asn1.DERObjectIdentifier) null, false, 0, 0, 0, 0);
    }
  }
  public static class PBEWithMD5AndRC2
    extends JCESecretKeyFactory.PBEKeyFactory  {
    // Constructors

    public PBEWithMD5AndRC2(){
      super((java.lang.String) null, (com.android.org.bouncycastle.asn1.DERObjectIdentifier) null, false, 0, 0, 0, 0);
    }
  }
  public static class PBEWithSHA1AndDES
    extends JCESecretKeyFactory.DESPBEKeyFactory  {
    // Constructors

    public PBEWithSHA1AndDES(){
      super((java.lang.String) null, (com.android.org.bouncycastle.asn1.DERObjectIdentifier) null, false, 0, 0, 0, 0);
    }
  }
  public static class PBEWithSHA1AndRC2
    extends JCESecretKeyFactory.PBEKeyFactory  {
    // Constructors

    public PBEWithSHA1AndRC2(){
      super((java.lang.String) null, (com.android.org.bouncycastle.asn1.DERObjectIdentifier) null, false, 0, 0, 0, 0);
    }
  }
  public static class PBEWithSHAAndDES3Key
    extends JCESecretKeyFactory.DESPBEKeyFactory  {
    // Constructors

    public PBEWithSHAAndDES3Key(){
      super((java.lang.String) null, (com.android.org.bouncycastle.asn1.DERObjectIdentifier) null, false, 0, 0, 0, 0);
    }
  }
  public static class PBEWithSHAAndDES2Key
    extends JCESecretKeyFactory.DESPBEKeyFactory  {
    // Constructors

    public PBEWithSHAAndDES2Key(){
      super((java.lang.String) null, (com.android.org.bouncycastle.asn1.DERObjectIdentifier) null, false, 0, 0, 0, 0);
    }
  }
  public static class PBEWithSHAAnd128BitRC2
    extends JCESecretKeyFactory.PBEKeyFactory  {
    // Constructors

    public PBEWithSHAAnd128BitRC2(){
      super((java.lang.String) null, (com.android.org.bouncycastle.asn1.DERObjectIdentifier) null, false, 0, 0, 0, 0);
    }
  }
  public static class PBEWithSHAAnd40BitRC2
    extends JCESecretKeyFactory.PBEKeyFactory  {
    // Constructors

    public PBEWithSHAAnd40BitRC2(){
      super((java.lang.String) null, (com.android.org.bouncycastle.asn1.DERObjectIdentifier) null, false, 0, 0, 0, 0);
    }
  }
  public static class PBEWithSHAAndTwofish
    extends JCESecretKeyFactory.PBEKeyFactory  {
    // Constructors

    public PBEWithSHAAndTwofish(){
      super((java.lang.String) null, (com.android.org.bouncycastle.asn1.DERObjectIdentifier) null, false, 0, 0, 0, 0);
    }
  }
  public static class PBEWithSHAAnd128BitRC4
    extends JCESecretKeyFactory.PBEKeyFactory  {
    // Constructors

    public PBEWithSHAAnd128BitRC4(){
      super((java.lang.String) null, (com.android.org.bouncycastle.asn1.DERObjectIdentifier) null, false, 0, 0, 0, 0);
    }
  }
  public static class PBEWithSHAAnd40BitRC4
    extends JCESecretKeyFactory.PBEKeyFactory  {
    // Constructors

    public PBEWithSHAAnd40BitRC4(){
      super((java.lang.String) null, (com.android.org.bouncycastle.asn1.DERObjectIdentifier) null, false, 0, 0, 0, 0);
    }
  }
  public static class PBEWithSHA
    extends JCESecretKeyFactory.PBEKeyFactory  {
    // Constructors

    public PBEWithSHA(){
      super((java.lang.String) null, (com.android.org.bouncycastle.asn1.DERObjectIdentifier) null, false, 0, 0, 0, 0);
    }
  }
  public static class PBEWithSHAAnd128BitAESBC
    extends JCESecretKeyFactory.PBEKeyFactory  {
    // Constructors

    public PBEWithSHAAnd128BitAESBC(){
      super((java.lang.String) null, (com.android.org.bouncycastle.asn1.DERObjectIdentifier) null, false, 0, 0, 0, 0);
    }
  }
  public static class PBEWithSHAAnd192BitAESBC
    extends JCESecretKeyFactory.PBEKeyFactory  {
    // Constructors

    public PBEWithSHAAnd192BitAESBC(){
      super((java.lang.String) null, (com.android.org.bouncycastle.asn1.DERObjectIdentifier) null, false, 0, 0, 0, 0);
    }
  }
  public static class PBEWithSHAAnd256BitAESBC
    extends JCESecretKeyFactory.PBEKeyFactory  {
    // Constructors

    public PBEWithSHAAnd256BitAESBC(){
      super((java.lang.String) null, (com.android.org.bouncycastle.asn1.DERObjectIdentifier) null, false, 0, 0, 0, 0);
    }
  }
  public static class PBEWithSHA256And128BitAESBC
    extends JCESecretKeyFactory.PBEKeyFactory  {
    // Constructors

    public PBEWithSHA256And128BitAESBC(){
      super((java.lang.String) null, (com.android.org.bouncycastle.asn1.DERObjectIdentifier) null, false, 0, 0, 0, 0);
    }
  }
  public static class PBEWithSHA256And192BitAESBC
    extends JCESecretKeyFactory.PBEKeyFactory  {
    // Constructors

    public PBEWithSHA256And192BitAESBC(){
      super((java.lang.String) null, (com.android.org.bouncycastle.asn1.DERObjectIdentifier) null, false, 0, 0, 0, 0);
    }
  }
  public static class PBEWithSHA256And256BitAESBC
    extends JCESecretKeyFactory.PBEKeyFactory  {
    // Constructors

    public PBEWithSHA256And256BitAESBC(){
      super((java.lang.String) null, (com.android.org.bouncycastle.asn1.DERObjectIdentifier) null, false, 0, 0, 0, 0);
    }
  }
  public static class PBEWithMD5And128BitAESCBCOpenSSL
    extends JCESecretKeyFactory.PBEKeyFactory  {
    // Constructors

    public PBEWithMD5And128BitAESCBCOpenSSL(){
      super((java.lang.String) null, (com.android.org.bouncycastle.asn1.DERObjectIdentifier) null, false, 0, 0, 0, 0);
    }
  }
  public static class PBEWithMD5And192BitAESCBCOpenSSL
    extends JCESecretKeyFactory.PBEKeyFactory  {
    // Constructors

    public PBEWithMD5And192BitAESCBCOpenSSL(){
      super((java.lang.String) null, (com.android.org.bouncycastle.asn1.DERObjectIdentifier) null, false, 0, 0, 0, 0);
    }
  }
  public static class PBEWithMD5And256BitAESCBCOpenSSL
    extends JCESecretKeyFactory.PBEKeyFactory  {
    // Constructors

    public PBEWithMD5And256BitAESCBCOpenSSL(){
      super((java.lang.String) null, (com.android.org.bouncycastle.asn1.DERObjectIdentifier) null, false, 0, 0, 0, 0);
    }
  }
  public static class PBKDF2WithHmacSHA1
    extends JCESecretKeyFactory  {
    // Constructors

    public PBKDF2WithHmacSHA1(){
      super((java.lang.String) null, (com.android.org.bouncycastle.asn1.DERObjectIdentifier) null);
    }
    // Methods

    protected javax.crypto.SecretKey engineGenerateSecret(java.security.spec.KeySpec arg1) throws java.security.spec.InvalidKeySpecException{
      return (javax.crypto.SecretKey) null;
    }
  }
  // Fields

  protected java.lang.String algName;

  protected com.android.org.bouncycastle.asn1.DERObjectIdentifier algOid;

  // Constructors

  protected JCESecretKeyFactory(@com.francetelecom.rd.stubs.annotation.FieldSet("this.algName") java.lang.String arg1, @com.francetelecom.rd.stubs.annotation.FieldSet("this.algOid") com.android.org.bouncycastle.asn1.DERObjectIdentifier arg2){
    super();
  }
  // Methods

  protected java.security.spec.KeySpec engineGetKeySpec(javax.crypto.SecretKey arg1, java.lang.Class arg2) throws java.security.spec.InvalidKeySpecException{
    return (java.security.spec.KeySpec) null;
  }
  protected javax.crypto.SecretKey engineTranslateKey(javax.crypto.SecretKey arg1) throws java.security.InvalidKeyException{
    return (javax.crypto.SecretKey) null;
  }
  protected javax.crypto.SecretKey engineGenerateSecret(java.security.spec.KeySpec arg1) throws java.security.spec.InvalidKeySpecException{
    return (javax.crypto.SecretKey) null;
  }
}
