package java.security.cert;

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


public class TrustAnchor
{
  // Constructors

  public TrustAnchor(X509Certificate arg1, byte [] arg2){
  }
  public TrustAnchor(java.lang.String arg1, java.security.PublicKey arg2, byte [] arg3){
  }
  public TrustAnchor(javax.security.auth.x500.X500Principal arg1, java.security.PublicKey arg2, byte [] arg3){
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public final X509Certificate getTrustedCert(){
    return (X509Certificate) null;
  }
  public final java.lang.String getCAName(){
    return (java.lang.String) null;
  }
  public final java.security.PublicKey getCAPublicKey(){
    return (java.security.PublicKey) null;
  }
  public final byte [] getNameConstraints(){
    return (byte []) null;
  }
  public final javax.security.auth.x500.X500Principal getCA(){
    return (javax.security.auth.x500.X500Principal) null;
  }
}
