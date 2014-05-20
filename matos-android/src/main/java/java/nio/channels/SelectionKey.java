package java.nio.channels;

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


public abstract class SelectionKey
{
  // Fields

  public static final int OP_ACCEPT = 16;

  public static final int OP_CONNECT = 8;

  public static final int OP_READ = 1;

  public static final int OP_WRITE = 4;

  // Constructors

  protected SelectionKey(){
  }
  // Methods

  public abstract SelectableChannel channel();
  public abstract boolean isValid();
  public abstract void cancel();
  public final java.lang.Object attach(java.lang.Object arg1){
    return (java.lang.Object) null;
  }
  public final boolean isWritable(){
    return false;
  }
  public abstract Selector selector();
  public final java.lang.Object attachment(){
    return (java.lang.Object) null;
  }
  public abstract int interestOps();
  public abstract SelectionKey interestOps(int arg1);
  public final boolean isAcceptable(){
    return false;
  }
  public abstract int readyOps();
  public final boolean isConnectable(){
    return false;
  }
  public final boolean isReadable(){
    return false;
  }
}
