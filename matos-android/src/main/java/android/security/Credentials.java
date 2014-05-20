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


@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public class Credentials
{
  // Fields

  public static final java.lang.String INSTALL_ACTION = "android.credentials.INSTALL";

  public static final java.lang.String UNLOCK_ACTION = "com.android.credentials.UNLOCK";

  public static final java.lang.String CA_CERTIFICATE = "CACERT_";

  public static final java.lang.String USER_CERTIFICATE = "USRCERT_";

  public static final java.lang.String USER_PRIVATE_KEY = "USRPKEY_";

  public static final java.lang.String VPN = "VPN_";

  public static final java.lang.String WIFI = "WIFI_";

  public static final java.lang.String EXTRA_PUBLIC_KEY = "KEY";

  public static final java.lang.String EXTRA_PRIVATE_KEY = "PKEY";

  public static final java.lang.String EXTENSION_CRT = ".crt";

  public static final java.lang.String EXTENSION_P12 = ".p12";

  public static final java.lang.String EXTENSION_CER = ".cer";

  public static final java.lang.String EXTENSION_PFX = ".pfx";

  // Constructors

  public Credentials(){
  }
  // Methods

  public static Credentials getInstance(){
    return (Credentials) null;
  }
  public void install(android.content.Context arg1){
  }
  public void install(android.content.Context arg1, java.security.KeyPair arg2){
  }
  public void install(android.content.Context arg1, java.lang.String arg2, byte [] arg3){
  }
  public void unlock(android.content.Context arg1){
  }
  public static java.util.List<java.lang.Object> convertFromPem(byte [] arg1) throws java.io.IOException{
    return (java.util.List) null;
  }
  public static byte [] convertToPem(java.lang.Object [] arg1) throws java.io.IOException{
    return (byte []) null;
  }
}
