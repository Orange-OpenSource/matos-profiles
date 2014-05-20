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


public class StringBufferInputStream
  extends InputStream{
  // Fields

  protected java.lang.String buffer;

  protected int count;

  protected int pos;

  // Constructors

  public StringBufferInputStream(java.lang.String arg1){
    super();
  }
  // Methods

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
}
