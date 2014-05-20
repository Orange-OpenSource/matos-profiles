package android.security;

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


public final class KeyChain
{
  // Classes

  public static final class KeyChainConnection
    implements java.io.Closeable
  {
    // Constructors

    private KeyChainConnection(android.content.Context arg1, android.content.ServiceConnection arg2, IKeyChainService arg3){
    }
    // Methods

    public void close(){
    }
    public IKeyChainService getService(){
      return (IKeyChainService) null;
    }
  }
  // Fields

  public static final java.lang.String ACCOUNT_TYPE = "com.android.keychain";

  public static final java.lang.String EXTRA_RESPONSE = "response";

  public static final java.lang.String EXTRA_HOST = "host";

  public static final java.lang.String EXTRA_PORT = "port";

  public static final java.lang.String EXTRA_ALIAS = "alias";

  public static final java.lang.String EXTRA_SENDER = "sender";

  public static final java.lang.String EXTRA_NAME = "name";

  public static final java.lang.String EXTRA_CERTIFICATE = "CERT";

  public static final java.lang.String EXTRA_PKCS12 = "PKCS12";

  // Constructors

  public KeyChain(){
  }
  // Methods

  public static java.security.cert.X509Certificate [] getCertificateChain(android.content.Context arg1, java.lang.String arg2) throws KeyChainException, java.lang.InterruptedException{
    return (java.security.cert.X509Certificate []) null;
  }
  public static KeyChain.KeyChainConnection bind(android.content.Context arg1) throws java.lang.InterruptedException{
    return (KeyChain.KeyChainConnection) null;
  }
  public static java.security.PrivateKey getPrivateKey(android.content.Context arg1, java.lang.String arg2) throws KeyChainException, java.lang.InterruptedException{
    return (java.security.PrivateKey) null;
  }
  public static android.content.Intent createInstallIntent(){
    return (android.content.Intent) null;
  }
  public static void choosePrivateKeyAlias(android.app.Activity arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("KeyChainAliasCallback") KeyChainAliasCallback arg2, java.lang.String [] arg3, java.security.Principal [] arg4, java.lang.String arg5, int arg6, java.lang.String arg7){
  }
}
