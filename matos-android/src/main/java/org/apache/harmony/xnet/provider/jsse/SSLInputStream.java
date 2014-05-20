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


public abstract class SSLInputStream
  extends java.io.InputStream{
  // Constructors

  public SSLInputStream(){
    super();
  }
  // Methods

  public abstract int read() throws java.io.IOException;
  public byte [] read(int arg1) throws java.io.IOException{
    return (byte []) null;
  }
  public int read(byte [] arg1, int arg2, int arg3) throws java.io.IOException{
    return 0;
  }
  public abstract int available() throws java.io.IOException;
  public int readUint16() throws java.io.IOException{
    return 0;
  }
  public int readUint8() throws java.io.IOException{
    return 0;
  }
  public int readUint24() throws java.io.IOException{
    return 0;
  }
  public long readUint32() throws java.io.IOException{
    return 0l;
  }
  public long readUint64() throws java.io.IOException{
    return 0l;
  }
}
