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


public class ServerKeyExchange
  extends Message{
  // Constructors

  public ServerKeyExchange(java.math.BigInteger arg1, java.math.BigInteger arg2, java.math.BigInteger arg3, byte [] arg4){
    super();
  }
  public ServerKeyExchange(HandshakeIODataStream arg1, int arg2, int arg3) throws java.io.IOException{
    super();
  }
  // Methods

  public int getType(){
    return 0;
  }
  public void send(HandshakeIODataStream arg1){
  }
  public static byte [] toUnsignedByteArray(java.math.BigInteger arg1){
    return (byte []) null;
  }
  public java.security.interfaces.RSAPublicKey getRSAPublicKey(){
    return (java.security.interfaces.RSAPublicKey) null;
  }
}
