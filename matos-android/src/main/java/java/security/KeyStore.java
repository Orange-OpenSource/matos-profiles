package java.security;

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

import com.francetelecom.rd.stubs.annotation.ArgsRule;
import com.francetelecom.rd.stubs.annotation.Code;

@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public class KeyStore
{
	// Added
	  static class BuilderImplem extends Builder {

		BuilderImplem(@com.francetelecom.rd.stubs.annotation.FieldSet("store") KeyStore arg1,@com.francetelecom.rd.stubs.annotation.FieldSet("param") ProtectionParameter arg2) { }
		@com.francetelecom.rd.stubs.annotation.FieldGet("store")
		public KeyStore getKeyStore() throws KeyStoreException { 
			return null;
		}

		@com.francetelecom.rd.stubs.annotation.FieldGet("param")
		public ProtectionParameter getProtectionParameter(String arg1)
				throws KeyStoreException { 
			return null;
		}
		  
	  }

  // Classes

  public abstract static class Builder
  {
    // Constructors

    protected Builder(){
    }
    // Methods

    @com.francetelecom.rd.stubs.annotation.Code("return new BuilderImplem(arg1, arg2);")
    public static KeyStore.Builder newInstance(KeyStore arg1, KeyStore.ProtectionParameter arg2){
      return (KeyStore.Builder) null;
    }
    @com.francetelecom.rd.stubs.annotation.Code("return new BuilderImplem(new KeyStore(null,null,null), arg4);")
    public static KeyStore.Builder newInstance(java.lang.String arg1, Provider arg2, java.io.File arg3, KeyStore.ProtectionParameter arg4){
      return (KeyStore.Builder) null;
    }
    @com.francetelecom.rd.stubs.annotation.Code("return new BuilderImplem(new KeyStore(null,null,null), arg3);")
    public static KeyStore.Builder newInstance(java.lang.String arg1, Provider arg2, KeyStore.ProtectionParameter arg3){
      return (KeyStore.Builder) null;
    }
    public abstract KeyStore getKeyStore() throws KeyStoreException;
    public abstract KeyStore.ProtectionParameter getProtectionParameter(java.lang.String arg1) throws KeyStoreException;
  }
  public static class CallbackHandlerProtection
    implements KeyStore.ProtectionParameter
  {
    // Constructors

    public CallbackHandlerProtection(@com.francetelecom.rd.stubs.annotation.CallBackRegister("handle") javax.security.auth.callback.CallbackHandler arg1){
    }
    // Methods

    public javax.security.auth.callback.CallbackHandler getCallbackHandler(){
      return (javax.security.auth.callback.CallbackHandler) null;
    }
  }
  public static interface Entry
  {
  }
  public static interface LoadStoreParameter
  {
    // Methods

    public KeyStore.ProtectionParameter getProtectionParameter();
  }
  public static class PasswordProtection
    implements KeyStore.ProtectionParameter, javax.security.auth.Destroyable
  {
    // Constructors

    public PasswordProtection(@com.francetelecom.rd.stubs.annotation.FieldSet("mPassword") char [] arg1){
    }
    // Methods

    public synchronized void destroy() throws javax.security.auth.DestroyFailedException{
    }
    public synchronized boolean isDestroyed(){
      return false;
    }
    @com.francetelecom.rd.stubs.annotation.FieldGet("mPassword")
	  public synchronized char [] getPassword(){
      return (char []) null;
    }
  }
  public static interface ProtectionParameter
  {
  }
  public static final class PrivateKeyEntry
    implements KeyStore.Entry
  {
    // Constructors

    public PrivateKeyEntry(@com.francetelecom.rd.stubs.annotation.FieldSet("mPrivateKey") PrivateKey arg1, @com.francetelecom.rd.stubs.annotation.FieldSet("mCertificateChain") java.security.cert.Certificate [] arg2){
    }
    // Methods

    public java.lang.String toString(){
      return (java.lang.String) null;
    }
    @com.francetelecom.rd.stubs.annotation.FieldGet("mCertificateChain")
	  public java.security.cert.Certificate [] getCertificateChain(){
      return (java.security.cert.Certificate []) null;
    }
    @com.francetelecom.rd.stubs.annotation.Code("return mCertificateChain[0];")
    public java.security.cert.Certificate getCertificate(){
      return (java.security.cert.Certificate) null;
    }
    @com.francetelecom.rd.stubs.annotation.FieldGet("mPrivateKey")
	  public PrivateKey getPrivateKey(){
      return (PrivateKey) null;
    }
  }
  public static final class SecretKeyEntry
    implements KeyStore.Entry
  {
    // Constructors

    public SecretKeyEntry(@com.francetelecom.rd.stubs.annotation.FieldSet("mSecretKey") javax.crypto.SecretKey arg1){
    }
    // Methods

    public java.lang.String toString(){
      return (java.lang.String) null;
    }
    @com.francetelecom.rd.stubs.annotation.FieldGet("mSecretKey")
	  public javax.crypto.SecretKey getSecretKey(){
      return (javax.crypto.SecretKey) null;
    }
  }
  public static final class TrustedCertificateEntry
    implements KeyStore.Entry
  {
    // Constructors

    public TrustedCertificateEntry(@com.francetelecom.rd.stubs.annotation.FieldSet("mTrustedCertificate") java.security.cert.Certificate arg1){
    }
    // Methods

    public java.lang.String toString(){
      return (java.lang.String) null;
    }
    @com.francetelecom.rd.stubs.annotation.FieldGet("mTrustedCertificate")
	  public java.security.cert.Certificate getTrustedCertificate(){
      return (java.security.cert.Certificate) null;
    }
  }
  // Constructors

  protected KeyStore(KeyStoreSpi arg1, @com.francetelecom.rd.stubs.annotation.FieldSet("mProvider") Provider arg2, @com.francetelecom.rd.stubs.annotation.FieldSet("mType") java.lang.String arg3){
  }
  // Methods

  @Code("return new KeyStore(null,null,arg1);")
  @ArgsRule(value="Keystore.getInstance-1", pos=1)
  public static KeyStore getInstance(java.lang.String arg1) throws KeyStoreException{
    return (KeyStore) null;
  }
  @ArgsRule(value="Keystore.getInstance-2", pos={1,2})
  @Code("return new KeyStore(null,null,arg1);")
  public static KeyStore getInstance(java.lang.String arg1, java.lang.String arg2) throws KeyStoreException, NoSuchProviderException{
    return (KeyStore) null;
  }
  @ArgsRule(value="Keystore.getInstance-3", pos={1,2})
  @Code("return new KeyStore(null,arg2,arg1);")
  public static KeyStore getInstance(java.lang.String arg1, Provider arg2) throws KeyStoreException{
    return (KeyStore) null;
  }
  
  @ArgsRule(value="Keystore.getKey", pos={1,2})
  public final Key getKey(java.lang.String arg1, char [] arg2) throws KeyStoreException, NoSuchAlgorithmException, UnrecoverableKeyException{
    return (Key) null;
  }
  public final int size() throws KeyStoreException{
    return 0;
  }
  public final void load(java.io.InputStream arg1, char [] arg2) throws java.io.IOException, NoSuchAlgorithmException, java.security.cert.CertificateException{
  }
  public final void load(KeyStore.LoadStoreParameter arg1) throws java.io.IOException, NoSuchAlgorithmException, java.security.cert.CertificateException{
  }
  public final void store(java.io.OutputStream arg1, char [] arg2) throws KeyStoreException, java.io.IOException, NoSuchAlgorithmException, java.security.cert.CertificateException{
  }
  public final void store(KeyStore.LoadStoreParameter arg1) throws KeyStoreException, java.io.IOException, NoSuchAlgorithmException, java.security.cert.CertificateException{
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mType")
  public final java.lang.String getType(){
    return (java.lang.String) null;
  }
  @ArgsRule(value="Keystore.getEntry", pos={1})
  public final KeyStore.Entry getEntry(java.lang.String arg1, KeyStore.ProtectionParameter arg2) throws NoSuchAlgorithmException, UnrecoverableEntryException, KeyStoreException{
    return (KeyStore.Entry) null;
  }
  public final java.util.Enumeration<java.lang.String> aliases() throws KeyStoreException{
    return (java.util.Enumeration) null;
  }
  public final void setEntry(java.lang.String arg1, KeyStore.Entry arg2, KeyStore.ProtectionParameter arg3) throws KeyStoreException{
  }
  
  public final java.security.cert.Certificate [] getCertificateChain(java.lang.String arg1) throws KeyStoreException{
    return (java.security.cert.Certificate []) null;
  }
  
  public final java.security.cert.Certificate getCertificate(java.lang.String arg1) throws KeyStoreException{
    return (java.security.cert.Certificate) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mProvider")
  public final Provider getProvider(){
    return (Provider) null;
  }
  public final java.util.Date getCreationDate(java.lang.String arg1) throws KeyStoreException{
    return (java.util.Date) null;
  }
  public final boolean containsAlias(java.lang.String arg1) throws KeyStoreException{
    return false;
  }
  public final java.lang.String getCertificateAlias(java.security.cert.Certificate arg1) throws KeyStoreException{
    return (java.lang.String) null;
  }
  public final void deleteEntry(java.lang.String arg1) throws KeyStoreException{
  }
  public static final java.lang.String getDefaultType(){
    return (java.lang.String) null;
  }
  public final boolean isCertificateEntry(java.lang.String arg1) throws KeyStoreException{
    return false;
  }
  public final boolean entryInstanceOf(java.lang.String arg1, java.lang.Class<? extends KeyStore.Entry> arg2) throws KeyStoreException{
    return false;
  }
  public final void setKeyEntry(java.lang.String arg1, Key arg2, char [] arg3, java.security.cert.Certificate [] arg4) throws KeyStoreException{
  }
  public final void setKeyEntry(java.lang.String arg1, byte [] arg2, java.security.cert.Certificate [] arg3) throws KeyStoreException{
  }
  public final void setCertificateEntry(java.lang.String arg1, java.security.cert.Certificate arg2) throws KeyStoreException{
  }
  public final boolean isKeyEntry(java.lang.String arg1) throws KeyStoreException{
    return false;
  }
}
