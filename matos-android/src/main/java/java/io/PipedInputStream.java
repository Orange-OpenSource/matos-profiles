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


public class PipedInputStream
  extends InputStream{
  // Fields

  protected byte [] buffer;

  protected int in;

  protected int out;

  protected static final int PIPE_SIZE = 0;

  // Constructors

  public PipedInputStream(){
    super();
  }
  public PipedInputStream(PipedOutputStream arg1) throws IOException{
    super();
  }
  public PipedInputStream(int arg1){
    super();
  }
  public PipedInputStream(PipedOutputStream arg1, int arg2) throws IOException{
    super();
  }
  // Methods

  public synchronized void close() throws IOException{
  }
  public synchronized int read() throws IOException{
    return 0;
  }
  public synchronized int read(byte [] arg1, int arg2, int arg3) throws IOException{
    return 0;
  }
  public synchronized int available() throws IOException{
    return 0;
  }
  public void connect(PipedOutputStream arg1) throws IOException{
  }
  protected synchronized void receive(int arg1) throws IOException{
  }
}
