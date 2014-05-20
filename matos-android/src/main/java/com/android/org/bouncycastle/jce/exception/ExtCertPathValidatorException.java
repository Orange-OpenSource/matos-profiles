package com.android.org.bouncycastle.jce.exception;

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


public class ExtCertPathValidatorException
  extends java.security.cert.CertPathValidatorException  implements ExtException
{
  // Constructors

  public ExtCertPathValidatorException(java.lang.String arg1, @com.francetelecom.rd.stubs.annotation.FieldSet("mCause") java.lang.Throwable arg2){
    super((java.lang.String) null, (java.lang.Throwable) null, (java.security.cert.CertPath) null, 0);
  }
  public ExtCertPathValidatorException(java.lang.String arg1, @com.francetelecom.rd.stubs.annotation.FieldSet("mCause") java.lang.Throwable arg2, java.security.cert.CertPath arg3, int arg4){
    super((java.lang.String) null, (java.lang.Throwable) null, (java.security.cert.CertPath) null, 0);
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.FieldGet("mCause") 
  public java.lang.Throwable getCause(){
    return (java.lang.Throwable) null;
  }
}
