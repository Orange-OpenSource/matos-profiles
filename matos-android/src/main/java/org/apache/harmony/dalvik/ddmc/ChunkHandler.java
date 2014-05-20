package org.apache.harmony.dalvik.ddmc;

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
public abstract class ChunkHandler
{
  // Fields

  public static final java.nio.ByteOrder CHUNK_ORDER = null;

  public static final int CHUNK_FAIL = 0;

  // Constructors

  public ChunkHandler(){
  }
  // Methods

  public static java.lang.String name(int arg1){
    return (java.lang.String) null;
  }
  public static int type(java.lang.String arg1){
    return 0;
  }
  public static java.lang.String getString(java.nio.ByteBuffer arg1, int arg2){
    return (java.lang.String) null;
  }
  public abstract void connected();
  public abstract void disconnected();
  @com.francetelecom.rd.stubs.annotation.CallBack("handleChunk")
  public abstract Chunk handleChunk(Chunk arg1);
  public static java.nio.ByteBuffer wrapChunk(Chunk arg1){
    return (java.nio.ByteBuffer) null;
  }
  public static Chunk createFailChunk(int arg1, java.lang.String arg2){
    return (Chunk) null;
  }
  public static void putString(java.nio.ByteBuffer arg1, java.lang.String arg2){
  }
}
