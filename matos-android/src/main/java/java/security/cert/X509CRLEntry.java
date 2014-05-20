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


public abstract class X509CRLEntry
  implements X509Extension
{
  // Constructors

  public X509CRLEntry(){
  }
  // Methods

  public boolean equals(java.lang.Object arg1){
    return false;
  }
  public abstract java.lang.String toString();
  public int hashCode(){
    return 0;
  }
  public abstract byte [] getEncoded() throws CRLException;
  public abstract java.math.BigInteger getSerialNumber();
  public javax.security.auth.x500.X500Principal getCertificateIssuer(){
    return (javax.security.auth.x500.X500Principal) null;
  }
  public abstract boolean hasExtensions();
  public abstract java.util.Date getRevocationDate();
}
