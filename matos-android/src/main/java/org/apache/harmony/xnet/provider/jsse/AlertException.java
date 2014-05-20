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
public class AlertException
  extends java.lang.RuntimeException{
  // Constructors

  protected AlertException(byte arg1, javax.net.ssl.SSLException arg2){
    super();
  }
  // Methods

  protected javax.net.ssl.SSLException getReason(){
    return (javax.net.ssl.SSLException) null;
  }
  protected byte getDescriptionCode(){
    return (byte) 0;
  }
}
