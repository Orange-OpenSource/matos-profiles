package java.io;

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


public class BufferedOutputStream
  extends FilterOutputStream{
  // Fields

  protected byte [] buf;

  protected int count;

  // Constructors

  public BufferedOutputStream(OutputStream arg1){
    super((OutputStream) null);
  }
  public BufferedOutputStream(OutputStream arg1, int arg2){
    super((OutputStream) null);
  }
  // Methods

  public synchronized void write(byte [] arg1, int arg2, int arg3) throws IOException{
  }
  public synchronized void write(int arg1) throws IOException{
  }
  public synchronized void close() throws IOException{
  }
  public synchronized void flush() throws IOException{
  }
}
