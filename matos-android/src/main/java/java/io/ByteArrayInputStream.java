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


public class ByteArrayInputStream
  extends InputStream{
  // Fields

  protected byte [] buf;

  protected int pos;

  protected int mark;

  protected int count;

  // Constructors

  public ByteArrayInputStream(byte [] arg1){
    super();
  }
  public ByteArrayInputStream(byte [] arg1, int arg2, int arg3){
    super();
  }
  // Methods

  public void close() throws IOException{
  }
  public synchronized void mark(int arg1){
  }
  public synchronized void reset(){
  }
  public synchronized int read(){
    return 0;
  }
  public synchronized int read(byte [] arg1, int arg2, int arg3){
    return 0;
  }
  public synchronized int available(){
    return 0;
  }
  public synchronized long skip(long arg1){
    return 0l;
  }
  public boolean markSupported(){
    return false;
  }
}
