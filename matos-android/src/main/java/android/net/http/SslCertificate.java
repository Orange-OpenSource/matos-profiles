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
public class SslCertificate
{
  // Classes

  public class DName
  {
    // Fields

    // Constructors

    public DName(java.lang.String arg1){
    }
    // Methods

    public java.lang.String getDName(){
      return (java.lang.String) null;
    }
    public java.lang.String getCName(){
      return (java.lang.String) null;
    }
    public java.lang.String getOName(){
      return (java.lang.String) null;
    }
    public java.lang.String getUName(){
      return (java.lang.String) null;
    }
  }
  // Constructors

  public SslCertificate(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4){
  }
  public SslCertificate(java.lang.String arg1, java.lang.String arg2, java.util.Date arg3, java.util.Date arg4){
  }
  public SslCertificate(java.security.cert.X509Certificate arg1){
  }
  private SslCertificate(java.lang.String arg1, java.lang.String arg2, java.util.Date arg3, java.util.Date arg4, java.security.cert.X509Certificate arg5){
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public static android.os.Bundle saveState(SslCertificate arg1){
    return (android.os.Bundle) null;
  }
  public static SslCertificate restoreState(android.os.Bundle arg1){
    return (SslCertificate) null;
  }
  public java.util.Date getValidNotBeforeDate(){
    return (java.util.Date) null;
  }
  public java.lang.String getValidNotBefore(){
    return (java.lang.String) null;
  }
  public java.util.Date getValidNotAfterDate(){
    return (java.util.Date) null;
  }
  public java.lang.String getValidNotAfter(){
    return (java.lang.String) null;
  }
  public SslCertificate.DName getIssuedTo(){
    return (SslCertificate.DName) null;
  }
  public SslCertificate.DName getIssuedBy(){
    return (SslCertificate.DName) null;
  }
  public android.view.View inflateCertificateView(android.content.Context arg1){
    return (android.view.View) null;
  }
}
