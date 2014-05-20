package org.apache.http.conn.ssl;

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
public abstract class AbstractVerifier
  implements X509HostnameVerifier
{
  // Constructors

  public AbstractVerifier(){
  }
  // Methods

  public final void verify(java.lang.String arg1, javax.net.ssl.SSLSocket arg2) throws java.io.IOException{
  }
  public final boolean verify(java.lang.String arg1, javax.net.ssl.SSLSession arg2){
    return false;
  }
  public final void verify(java.lang.String arg1, java.security.cert.X509Certificate arg2) throws javax.net.ssl.SSLException{
  }
  public final void verify(java.lang.String arg1, java.lang.String [] arg2, java.lang.String [] arg3, boolean arg4) throws javax.net.ssl.SSLException{
  }
  public static boolean acceptableCountryWildcard(java.lang.String arg1){
    return false;
  }
  public static java.lang.String [] getDNSSubjectAlts(java.security.cert.X509Certificate arg1){
    return (java.lang.String []) null;
  }
  public static java.lang.String [] getCNs(java.security.cert.X509Certificate arg1){
    return (java.lang.String []) null;
  }
  public static int countDots(java.lang.String arg1){
    return 0;
  }
}
