package org.apache.harmony.xnet.provider.jsse;

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
public class CertificateRequest
  extends Message{
  // Constructors

  public CertificateRequest(byte [] arg1, java.security.cert.X509Certificate [] arg2){
    super();
  }
  public CertificateRequest(HandshakeIODataStream arg1, int arg2) throws java.io.IOException{
    super();
  }
  // Methods

  public int getType(){
    return 0;
  }
  public void send(HandshakeIODataStream arg1){
  }
  public java.lang.String [] getTypesAsString(){
    return (java.lang.String []) null;
  }
}
