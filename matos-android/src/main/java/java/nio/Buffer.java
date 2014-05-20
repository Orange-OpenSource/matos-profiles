package java.nio;

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


public abstract class Buffer
{
  // Constructors

  public Buffer(){
  }
  // Methods

  public final int limit(){
    return 0;
  }
  public final Buffer limit(int arg1){
    return (Buffer) null;
  }
  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public final Buffer clear(){
    return (Buffer) null;
  }
  public abstract java.lang.Object array();
  public abstract int arrayOffset();
  public abstract boolean hasArray();
  public abstract boolean isDirect();
  public final int position(){
    return 0;
  }
  public final Buffer position(int arg1){
    return (Buffer) null;
  }
  public final int remaining(){
    return 0;
  }
  public final int capacity(){
    return 0;
  }
  public final Buffer flip(){
    return (Buffer) null;
  }
  public final boolean hasRemaining(){
    return false;
  }
  public abstract boolean isReadOnly();
  public final Buffer mark(){
    return (Buffer) null;
  }
  public final Buffer reset(){
    return (Buffer) null;
  }
  public final Buffer rewind(){
    return (Buffer) null;
  }
}
