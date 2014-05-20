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
public abstract class ConnectionState
{
  // Fields

  protected javax.crypto.Cipher encCipher;

  protected javax.crypto.Cipher decCipher;

  protected int block_size;

  protected int hash_size;

  protected final byte [] write_seq_num = (byte []) null;

  protected final byte [] read_seq_num = (byte []) null;

  protected Logger.Stream logger;

  // Constructors

  public ConnectionState(){
  }
  // Methods

  protected void shutdown(){
  }
  protected byte [] encrypt(byte arg1, byte [] arg2){
    return (byte []) null;
  }
  protected abstract byte [] encrypt(byte arg1, byte [] arg2, int arg3, int arg4);
  protected byte [] decrypt(byte arg1, byte [] arg2){
    return (byte []) null;
  }
  protected abstract byte [] decrypt(byte arg1, byte [] arg2, int arg3, int arg4);
  protected int getMinFragmentSize(){
    return 0;
  }
  protected int getFragmentSize(int arg1){
    return 0;
  }
  protected int getContentSize(int arg1){
    return 0;
  }
  protected int getPaddingSize(int arg1){
    return 0;
  }
  protected static void incSequenceNumber(byte [] arg1){
  }
}
