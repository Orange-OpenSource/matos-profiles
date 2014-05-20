package android.net.http;

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
public class SslError
{
  // Fields

  public static final int SSL_NOTYETVALID = 0;

  public static final int SSL_EXPIRED = 1;

  public static final int SSL_IDMISMATCH = 2;

  public static final int SSL_UNTRUSTED = 3;

  public static final int SSL_DATE_INVALID = 4;

  public static final int SSL_INVALID = 5;

  public static final int SSL_MAX_ERROR = 6;

  // Constructors

  public SslError(int arg1, SslCertificate arg2){
  }
  public SslError(int arg1, java.security.cert.X509Certificate arg2){
  }
  public SslError(int arg1, SslCertificate arg2, java.lang.String arg3){
  }
  public SslError(int arg1, java.security.cert.X509Certificate arg2, java.lang.String arg3){
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public SslCertificate getCertificate(){
    return (SslCertificate) null;
  }
  public java.lang.String getUrl(){
    return (java.lang.String) null;
  }
  public boolean addError(int arg1){
    return false;
  }
  public int getPrimaryError(){
    return 0;
  }
  public static SslError SslErrorFromChromiumErrorCode(int arg1, SslCertificate arg2, java.lang.String arg3){
    return (SslError) null;
  }
  public boolean hasError(int arg1){
    return false;
  }
}
