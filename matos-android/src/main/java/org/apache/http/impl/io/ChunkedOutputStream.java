package org.apache.http.impl.io;

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
public class ChunkedOutputStream
  extends java.io.OutputStream{
  // Constructors

  public ChunkedOutputStream(org.apache.http.io.SessionOutputBuffer arg1, int arg2) throws java.io.IOException{
    super();
  }
  public ChunkedOutputStream(org.apache.http.io.SessionOutputBuffer arg1) throws java.io.IOException{
    super();
  }
  // Methods

  public void write(int arg1) throws java.io.IOException{
  }
  public void write(byte [] arg1) throws java.io.IOException{
  }
  public void write(byte [] arg1, int arg2, int arg3) throws java.io.IOException{
  }
  public void close() throws java.io.IOException{
  }
  public void flush() throws java.io.IOException{
  }
  public void finish() throws java.io.IOException{
  }
  protected void flushCache() throws java.io.IOException{
  }
  protected void flushCacheWithAppend(byte [] arg1, int arg2, int arg3) throws java.io.IOException{
  }
  protected void writeClosingChunk() throws java.io.IOException{
  }
}