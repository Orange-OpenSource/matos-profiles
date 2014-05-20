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
public class DdmServer
{
  // Fields

  public static final int CLIENT_PROTOCOL_VERSION = 1;

  // Constructors

  private DdmServer(){
  }
  // Methods

  public static void registerHandler(int arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("handleChunk") ChunkHandler arg2){
  }
  public static ChunkHandler unregisterHandler(int arg1){
    return (ChunkHandler) null;
  }
  public static void sendChunk(Chunk arg1){
  }
  public static void registrationComplete(){
  }
}
